package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");

        //locate search box and enter Selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        //enter text inside search box inout box element using sendKey("your text)

        searchBox.sendKeys("Selenium");
        //locate the search button and click(or submit)

        WebElement searchButton = driver.findElement(By.id("ybar-search"));
        searchButton.click();


        Thread.sleep(5000);
        //quit browser

        driver.quit();


    }


}
