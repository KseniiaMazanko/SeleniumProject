package com.cybertek.tests.day06_junitPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsDIsplayedPractice {


    //small[.='first name must be more than 2 and less than 64 characters long']

    WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@After All, Nothing to do here");
    }

    @Test
    public void testErrorMessage(){

        driver.get("http://practice.cybertekschool.com/registration_form");

        String xpathForErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']";

        WebElement strLengthErrorElement = driver.findElement(By.xpath(xpathForErrorMsg));
        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());

        assertFalse(strLengthErrorElement.isDisplayed());
        assertTrue(   !strLengthErrorElement.isDisplayed()   );

        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("a");

        assertTrue(strLengthErrorElement.isDisplayed());

        System.out.println("strLengthErrorElement.isDisplayed() = " + strLengthErrorElement.isDisplayed());
    }



}
