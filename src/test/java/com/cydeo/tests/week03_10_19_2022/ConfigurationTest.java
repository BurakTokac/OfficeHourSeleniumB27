package com.cydeo.tests.week03_10_19_2022;

import org.testng.annotations.Test;

public class ConfigurationTest {


    @Test
    public void testConfig() {

        String url = ConfigurationReader.getValueOf("url");
        System.out.println(url);


    }
}
