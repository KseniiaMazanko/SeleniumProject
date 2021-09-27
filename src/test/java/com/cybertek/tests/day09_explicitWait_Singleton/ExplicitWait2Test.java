package com.cybertek.tests.day09_explicitWait_Singleton;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedCondition.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2Test extends TestBase {

    @Test
    public void waitUntilElementInteractive(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click in enable button and wait until the input box is enabled or clickable



        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField = " + inputField.isEnabled());

        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 7);
        //this will wait for 7 seconds max for input element located by css selector form#input-example>input
        //enabled, interactive, visible
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));

        //now enter something
        inputField.sendKeys("Hello World!");

        BrowserUtil.waitFor(5);




    }




}
