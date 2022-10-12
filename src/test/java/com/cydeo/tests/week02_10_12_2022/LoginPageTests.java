package com.cydeo.tests.week02_10_12_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // set up browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1-go to home page
        driver.get("https://vytrack.com/");

        //  3- Click Login label
        String locator = "(//ul[@id='top-menu']/li)[6]";
        WebElement loginLabel = driver.findElement(By.xpath(locator));
        wait(1);
        loginLabel.click();
    }

    @AfterMethod
    public void tearDown() {
        wait(3);
        driver.close();
    }

/*
 ** TC003 As a user I should be able to see the login page

 1- Setup the "browser driver"
 2- Go to "https://vytrack.com"
 3- Click Login label
 3- Verify the title contains "Login"
 */

    @Test
    public void verify_login_title() {

        // 3- Verify the title contains "Login"
        String expectedTitleContains = "Login";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleContains));
    }
/*
** TC004 As a user I should be able to login with valid credentials

 1- Setup the "browser driver"
 2- Go to "https://vytrack.com"
 3- Click Login label
 4- Login to application with username as "User1" and password as "UserUser123"
 5- Verify the title contains "Dashboard"
 */

    @Test
    public void verify_title_contains_dashboard() {
        //   4- Login to application with username as "User1" and password as "UserUser123"
        WebElement username = driver.findElement(By.id("prependedInput"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        username.sendKeys("User1");
        password.sendKeys("UserUser123" + Keys.ENTER);

        wait(3);
        //   5- Verify the title contains "Dashboard"
        Assert.assertTrue(driver.getTitle().contains("Dashboard"));

    }


    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
