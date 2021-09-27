package com.cybertek.tests.day08_upload_actions_windowWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cybertek.utility.BrowserUtil.waitFor;


public class FileUpload extends TestBase {

    @Test

    public void testUpload() {

        driver.get("http://practice.cybertekschool.com/upload");

        // locate the input filed :
        /**
         * By.id("file-upload")
         * By.xpath("//input[@id='file-upload']")  Abbos
         * By.cssSelector("input[id='file-upload']") Hande #file-upload
         *
         */

        WebElement chooseTheFile = driver.findElement(By.id("file-upload"));
        // find the full path of your file in your computer and send key into above input filed
        // you can copy the full path of file by
        // right clicking and holddown to option key and select -- copy "yourfilename" as path
        // it will copy the full path of your file
        chooseTheFile.sendKeys("/Users/kseniiamazanko/Desktop/HTML_Class/Ocean.jpeg");

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.click();

        waitFor(3);

        WebElement successMsg = driver.findElement(By.xpath("//div[@class='example']/h3"));
        Assertions.assertTrue(successMsg.isDisplayed());

        // Thread.sleep(2000); is needed sometimes , but we are forced to deal with checked exception
        // objective : have a human-readable utility method so we can call like this
        //  BrowserUtil.waitFor(2) ; === >> no exception handling just wait for 2 seconds
        //  Create a class called BrowserUtil under utility package
        //  create a static void method called waitFor accept int as second to wait





    }




    }
