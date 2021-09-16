package com.cybertek.tests.day06_junitPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SlowElementTest  extends TestBase {

    @Test
    public void testWait() {

        //we can instruct WebDriver to wait maximum amount of time
        //before throwing NoSuchElement exception by using implicit wait

        driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        WebElement isGoneEl = driver.findElement(By.id("message"));
        System.out.println("isGoneEl = " + isGoneEl.getText());
        System.out.println("The end");
    }

}
