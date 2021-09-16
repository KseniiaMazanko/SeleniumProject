package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");

        WebElement searchBox = driver.findElement(By.name("p"));
        searchBox.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.id("ybar-search"));

        searchButton.submit();

        driver.quit();



    }


}
