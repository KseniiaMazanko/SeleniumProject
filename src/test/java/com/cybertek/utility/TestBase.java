package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class is meant to be superclass
 * to provide driver setup and closing browser
 * for its subclasses
 */
public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
        /*WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         */
        driver=WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@After All, Nothing to do here");
    }


}
