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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginFormPractice {

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
    public void testLogin() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/login");

        WebElement header = driver.findElement(By.xpath("//h2"));
        System.out.println("header.getText() = " + header.getText());

        driver.findElement(By.cssSelector("input[name='username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name='password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        WebElement successMsg = driver.findElement(By.cssSelector("#flash"));

        String expectedResult = "You logged into a secure area!";
        //assertEquals(expectedResult,successMsg.getText());

        assertTrue(successMsg.getText().startsWith(expectedResult));

        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

        String xpath = "//div[contains(text(),'You logged into a secure area!')]";

        WebElement successMsg2 = driver.findElement(By.xpath(xpath));

        assertTrue(successMsg2.isDisplayed());




        driver.quit();
    }







}
