package com.cybertek.tests.day08_upload_actions_windowWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class JavaScriptExecutor extends TestBase {

    //window.scrollBy(0,1000)

    @Test
    public void testScrollWholeWindow(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        //get JavacriptExecutor reference from driver variable

        //so we can run js script code window.scrollBy(0,1000)

        BrowserUtil.waitFor(2);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //it uses execute method to run javascript, it can accept a parameter

        jse.executeScript("window.scrollBy(0,1000)");

        for(int i=1; i<=10; i++){
            jse.executeScript("window.scrollBy(0,1000)");
            BrowserUtil.waitFor(1);
        }


        BrowserUtil.waitFor(4);




    }

    @Test
    public void testScrollElementIntoView(){
        driver.get("http://practice.cybertekschool.com/large");

        //get jse

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // locate cybertekSchoolLnk and homeLnk

        // run this javascript to scroll the element into the view
        // theElementIdentified.scrollIntoView(true)
        // in order to pass our element into above method
        // we need to use arguments[specify index here]
        // whatever we pass to executeScript method after javascipt code will be argument with index

        //try out passing argument in window.scrollBy(0,1000)
        //I want to pass this 1000 externally when i call the method

        int myScrollNumber = 1000;
        jse.executeScript("window.scrollBy(0, arguments[0] )" , myScrollNumber);

        //now call scrollIntoView(true)
        WebElement cyberteKSchoolLink = driver.findElement(By.linkText("Cybertek School"));
        jse.executeScript("arguments[0].scrollIntoView(true)", cyberteKSchoolLink);

        BrowserUtil.waitFor(4);




    }


}
