package com.cybertek.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate 2 elements using xpath

        /*
        //h2[text() = 'Forgot Password']
        //h2[. = 'Forgot Password']
        //div/h2
         */

        WebElement forgetPasswordHeader = driver.findElement(By.xpath("//h2[text() = 'Forgot Password']"));
        System.out.println("forgetPasswordHeader = " + forgetPasswordHeader);

        /*
        //input[@name='email']
        //input[@name='email' and @type = 'text']
         */

        WebElement searBox = driver.findElement(By.xpath("//input[@name='email' and @type = 'text']"));
        searBox.sendKeys("someone@somewhere.com");

        WebElement retrieveBtn = driver.findElement(By.cssSelector("#form_submit"));
        retrieveBtn.click();
        //#form_submit

        /*
        String confirmationLocatorString = "//h4[test()=\"Your email has been sent\"]";
        System.out.println("confirmationLocatorString = " + confirmationLocatorString);

        WebElement comfirmationMsg = driver.findElement(By.xpath(confirmationLocatorString));
        System.out.println("comfirmationMsg = " + comfirmationMsg);
         */



    }


}
