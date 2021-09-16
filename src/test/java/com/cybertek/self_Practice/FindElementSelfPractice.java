package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementSelfPractice {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Hawaii Oahu");

            WebElement searchButton = driver.findElement(By.name("btnK"));
            searchButton.submit();

            Thread.sleep(5000);

            driver.navigate().back();

            Thread.sleep(3000);

            WebElement store = driver.findElement(By.linkText("Store"));
            store.click();

            driver.quit();




    }

}
