package com.cybertek.day02_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetTextMessage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify the link using partial link text then get the full text

        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));
        //System.out.println("myLink.getText() = " + myLink.getText());

        String fullLinkText = myLink.getText();
        System.out.println("fullLinkText = " + fullLinkText);
        myLink.click();

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);


        WebElement aLink = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());

        WebElement formAuth = driver.findElement(By.partialLinkText("Form"));
        String formAuthentication = formAuth.getText();
        System.out.println("formAuthentication = " + formAuthentication);
        formAuth.click();

        Thread.sleep(3000);





    }

}
