package com.automation.Homework.HW4;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Year_Months_Days {
    /*
    1.go tohttp://practice.cybertekschool.com/dropdown
    2.select a random year under Select your date of birth
    3.select month January
    4.verify that days dropdown has current number of days
    5.repeat steps 3, 4 for all the months
    NOTE: if you randomly select a leap year, verify February has 29 days
     */
    private WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(2);
        driver.manage().window().maximize(); }
    @Test
    public void test() {
        Select year = new Select(driver.findElement(By.id("year")));
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));

        Random random = new Random();
        int yearToSelect = random.nextInt(year.getOptions().size());
        //select a year
        year.selectByIndex(yearToSelect);
        for (int i = 0; i < 12; i++) {
            //we create date object based on year and month
            LocalDate localDate = LocalDate.of(yearToSelect, i + 1, 1);
            //select a month
            month.selectByIndex(i);
            int actual = day.getOptions().size();//actual number of days
            int expected = Month.from(localDate).length(isLeapYear(yearToSelect)); //expected number of days in a month

            System.out.println("Month: " + month.getFirstSelectedOption().getText());
            System.out.println("Expected number of days: " + expected);
            System.out.println("Actual number of days: " + actual);
            System.out.println();
            Assert.assertEquals(actual, expected);
        }
        driver.quit();
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
        }
        return year % 4 == 0;
    }
}

