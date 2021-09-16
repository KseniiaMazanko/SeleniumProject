package com.cybertek.tests.day06_junitPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {

    //JavaScript alerts are pop up that show up after you click on the button
    //regulat(ok) only click on ok
    //confirm (ok and cancel)
    //prompt (enter text) and select ok and cancel


    @Test
    public void testJavaScriptAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //Alert interfaces from Selenium to work with Alerts
        //your driver object can switch to the alert and take an action on it

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        // driver first need to switch to the alert box since it's not part of html
        // using switchTo() method followed by alert() method
        // .alert() method return a type Alert from Selenium
        // and it has 4 methods :
        // - accept()   -->> click on ok button
        // - dismiss()  -->> click on cancel button
        // - sendKey(yourText) ---> Enter text into prompt
        // - getText()   --->> get the text of the alert box


        System.out.println("driver.switchTo().alert().getText() = " +
                driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


       /*
       Alert alertObj = driver.switchTo().alert();
       alertObj.accept();
        */

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        //driver.switchTo().alert().dismiss();//this will click on Cancel button
        driver.switchTo().alert().accept();//this will click on Cancel button


        driver.switchTo().alert().sendKeys("Hello");//this is how we can enter text into prompt
        driver.switchTo().alert().accept();



        System.out.println("the end");



    }



}
