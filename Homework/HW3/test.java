package com.automation.Homework.HW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {
    public static WebDriver driver;

    @Test

    public void addtoCartTest() throws InterruptedException
    {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        EkartPage1 oekart = new EkartPage1(driver);
        oekart.AddtoCart();

    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void afterTest() {
        //driver.close();
    }
}

class EkartPage1
{
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(xpath = "//button[contains(text(),'ADDED')]")
    WebElement addedBtn;

    public EkartPage1(WebDriver driver)
    {
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void AddtoCart() throws InterruptedException
    {
        String[] additems = {"Cucumber","Beans"};
        List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));

        for(int i=0;i<list.size();i++)
        {
            String[] productname = list.get(i).getText().split("-");
            String frmtdname = productname[0].trim();
            List itemsneeded = Arrays.asList(additems);

            if(itemsneeded.contains(frmtdname))
            {

                List<WebElement> list2 =driver.findElements(By.xpath("//button[text() ='ADD TO CART']"));
                list2.get(i).click();
                System.out.println("One product added");

            }
        }

    }
}
