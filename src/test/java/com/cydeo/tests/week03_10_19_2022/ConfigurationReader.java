package com.cydeo.tests.week03_10_19_2022;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
 private static Properties properties=new Properties();

 //before every thing  I need t oput my keys and values from the properties file because of that we need to use
    // static block why? because static blocks are running before everything

    static{                                      //we nedd to provide path of properties file
        try {
            //read the file
            FileInputStream fileInputStream=new FileInputStream("config.properties");
            //we put the data in properties object
            //at the backend we have map structure
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("we have problem in ConfigurationReader class");
        }


    }
                         //I want to get value of key from properties file
    public  static String getValue(String key){
        String value = properties.getProperty(key);
        return value;
    }








}
