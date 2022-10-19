package com.cydeo.tests.week03_10_19_2022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    //we want to control the obhject creation
    private Driver() {
    }

  private static WebDriver driver;

    public  static WebDriver getDriver(){

        if (driver==null){

            String browserType=ConfigurationReader.getValueOf("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;

            }
            return driver;
        }else {
            System.out.println("we have problem with Driver class");
            return null;
        }






    }

    public static void closeDriver(){
        if (driver!=null){
          //  driver.close();
            driver.quit(); // we are making driver null
            driver=null;
        }


    }




}
