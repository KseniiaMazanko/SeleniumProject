package com.cybertek.self_Practice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FileUpload extends TestBase {

    @Test
    public void testFileUpload() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/upload");

        String filePath = "/Users/kseniiamazanko/Desktop/HTML_Class/Ocean.jpeg";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);



        driver.findElement(By.id("file-submit")).click();



        System.out.println("The End");


    }


}
