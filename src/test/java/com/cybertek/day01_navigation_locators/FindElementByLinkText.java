package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

    //set up chrome driver, open chrome

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");


        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(("Everything is awesome"));


        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();

        driver.navigate().back();

        Thread.sleep(5000);

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();

        Thread.sleep(3000);

        driver.quit();

    }




    //navigate to google

    //try to identify search box using both name and id

    //submit the search by clicking on the search button

    //navigate to google home page

    //wait for a few seconds

    //click on about link

    //waita few secons

    //close the browser

}
