package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTMLFile {

    public static void main(String[] args) throws InterruptedException {

        // /Users/kseniiamazanko/Desktop/HTML_Class/Day2.html


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///Users/kseniiamazanko/Desktop/HTML_Class/Day2.html");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Kseniia");

        Thread.sleep(5000);



        driver.quit();
    }

}
