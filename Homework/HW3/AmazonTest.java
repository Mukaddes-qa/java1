package com.automation.Homework.HW3;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    //Used TestNG Testing tool. This Test annotation will make you method to run w/o calling main method in java
    @Test
    public static void validatePriceTest() {


        //Setting the webdriver properties, setting the location of the chromedriver
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://www.amazon.com");

        //Setting implicitly wait with a 2000 milliseconds
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        //Step 1.Navigate to amazon.com Home Page
       // driver.get("https://www.amazon.com/");

        //Step 2.Search for Book ‘qa testing for beginnners’
        WebElement categoryDropDownElement = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select categorySelect = new Select(categoryDropDownElement);
        categorySelect.selectByVisibleText("Books");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("qa testing for beginners" + Keys.ENTER);

        //Since the search result returns the product in a list, found all of them and selected the first one by getting the first element of the list .get(0)
        WebElement priceStr = driver.findElements(By.xpath("//div[@data-index and @data-uuid]//span[@data-a-color='base']/span[@class='a-offscreen']")).get(0);
        double firstBookSalePrice = Double.parseDouble(priceStr.getAttribute("innerText")
                .replaceAll("[^0-9\\.]+", ""));

        /*
        Step 3. Click first book in the list. Created a private method with JavaScriptexecuter to force to click the element. .click() method for the WebDriver
        some times does not work. Because of this used JavascriptExecuter: clickWithJavaScripExecuter(WebDriver driver, WebElement element)
        */
        clickWithJavaScripExecuter(driver, priceStr);

        /*Step 4. Before Click on add to cart Add to Cart assert price from Step3. Created another private method to make assertion in these test cases
        to avoid repeating the same line of codes: assertPrices(String actualPrice, double expectedPrice)
        */
        String priceAtProductDetailPageStr = driver.findElement(By.xpath("//div[@role='radio' and @aria-checked='true']//span[@id]"))
                .getAttribute("innerText")
                .replaceAll("[^0-9\\.]+", "");
        assertPrices(priceAtProductDetailPageStr, firstBookSalePrice);

        //Step 5. Click on Add to Cart.
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        clickWithJavaScripExecuter(driver, addToCartButton);

        //Step 6. Before Click on Proceed to Checkout assert price from Step3.
        String priceAtCartStr = driver.findElement(By.xpath("//div[@id='hlb-subcart']/div//span/span/b[contains(.,'Cart subtotal')]/../../span[2]"))
                .getAttribute("innerText")
                .replaceAll("[^0-9\\.]+", "");
        assertPrices(priceAtCartStr, firstBookSalePrice);

        //Step 7. Click on proceed to checkout
        WebElement proceedToCheckoutButton = driver.findElement(By.id("hlb-ptc-btn-native"));
        clickWithJavaScripExecuter(driver, proceedToCheckoutButton);

        //Assumed: At this point we should login the amazon account. After logging in, we need to continue the steps below to assert the price at step 3/

                //Step 8. On the checkout page assert price from Step3.
                String priceAtCheckoutSummaryStr = driver.findElement(By.xpath("//table[@id='subtotals-marketplace-table']/tbody/tr[1]/td[2]"))
                .getAttribute("innerText").replaceAll("[^0-9\\.]+", "");
        assertPrices(priceAtCheckoutSummaryStr, firstBookSalePrice);

        //Closing and quiting the Web Browser
        driver.quit();
    }

    private static void clickWithJavaScripExecuter(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    private static void assertPrices(String actualPrice, double expectedPrice){
        Assert.assertEquals(expectedPrice, Double.parseDouble(actualPrice), "Price are NOT matched!!!!!");
    }
}