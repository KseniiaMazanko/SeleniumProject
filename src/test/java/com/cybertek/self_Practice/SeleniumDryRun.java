package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {

    public static void main(String[] args) {
        
        //1.setup chrome driver using webdriver manager
            //so selenium can send interaction request
        WebDriverManager.chromedriver().setup();

        //2. create webdriver instanse using Chrome Driver object
        WebDriver driver = new ChromeDriver();
        //3. navigate to https://google.com
        driver.get("https://google.com");
        
        
    }
}
