package com.cydeo.tests.week01_10_05_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {


    public static void main(String[] args) throws InterruptedException {

        //Set UP BROWSER
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //GO TO THE WEBSITE
        driver.get("https://www.google.com/");

        //GET TITLE
        System.out.println(driver.getTitle());

        //GET CURRENT URL
        System.out.println(driver.getCurrentUrl());

        // NAVIGATE A URL

        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);

        // REFRESH THE PAGE
        driver.navigate().refresh();

        Thread.sleep(3000);
        // GO BACK TO GOOGLE
        driver.navigate().back();

        Thread.sleep(3000);
        //GO TO ETSY AGAIN

        driver.navigate().forward();



        Thread.sleep(3000);
        // CLOSE THE CURRENT BROWSER
        driver.close();


        // DRIVER QUIT IN ORDER TO CLOSE ALL PAGES (SESSION ID WILL BE NULL)
        driver.quit();


    }
}
