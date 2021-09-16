package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.manage().window().fullscreen();
        Thread.sleep(5000);

        driver.quit();





    }

}
