package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigationFirefox {

    public static void main(String[] args) {

        // 1.setup Firefox driver
        WebDriverManager.firefoxdriver().setup();

        //2. create WebDriver instance
        WebDriver driver = new FirefoxDriver();

        //3.navigate to website
        driver.navigate().to("https://cybertekschool.com");

        System.out.println("About to quit");
        driver.quit();





    }


}
