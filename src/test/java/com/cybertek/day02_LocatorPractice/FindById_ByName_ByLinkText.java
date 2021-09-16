package com.cybertek.day02_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindById_ByName_ByLinkText {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");

        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("some email here");

        WebElement passwordBod = driver.findElement(By.name("pass"));
        passwordBod.sendKeys("bla bla");

        WebElement login = driver.findElement(By.name("login"));
        login.click();

        Thread.sleep(5000);



        driver.quit();



    }

}
