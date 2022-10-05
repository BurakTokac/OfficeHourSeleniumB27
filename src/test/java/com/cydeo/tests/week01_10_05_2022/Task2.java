package com.cydeo.tests.week01_10_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {


    @Test
    public void tes1() {


        //  1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2- Go to "https://www.google.com"
        driver.get("https://www.google.com");

        //  3- Verify the title contains "Google"
        Assert.assertTrue(driver.getTitle().contains("Google"));
        //  4- Navigate to "https://www.etsy.com"
        driver.navigate().to("https://www.etsy.com");


        //  5- Verify not in google page
        Assert.assertFalse(driver.getTitle().contains("Google"));

        //  6- Verify the title  contains "Etsy"

        Assert.assertTrue(driver.getTitle().contains("Etsy"));

        //close driver
        driver.close();

    }
}
