package com.cydeo.tests.week01_10_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void test1() {

        // 1- Setup the "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");


        // 3- Verify the URL is "https://www.selenium.dev/"
        // in order to verify expected result with actual result we will use testng methods
        String expectedURL = "https://www.selenium.dev/"; //from the user

        String actualURL = driver.getCurrentUrl();  //from the browser


        Assert.assertEquals(actualURL, expectedURL, "Verifying current url");

        driver.close();


    }
}
