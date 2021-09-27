package com.cybertek.tests.day07_iframe;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrameTest extends TestBase {

    /*
Selenium can not directly interact with the elements within the frame.

First need to switch to the frame
so it can start searching within than frame using 3 different way as below.

Switch to the frame by passing index
driver.switchTo().frame(frameIndexNumber);
Switch to the frame by passing iframe WebElement
driver.switchTo().frame(iframeWebElement);
Switch to the frame by passing iframe name or id
driver.switchTo().frame(frameIdOrName);
Then we can just use regular locating technic we have been using to locate the elements.

Switching out of the iFrame

Once you are done with the elements inside frame
You need to switch out of the iframe to main content to continue to work with elements in regular part of the page.

go back to top level html document
driver.switchTo().defaultContent();
go back up one level from iframe
driver.switchTo().parentFrame();

     */

    @Test
    public void testSimpleIFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");

        // locate the <p> element inside iframe
        /**
         first we need to switch to the iFrame
         -- by index (index in java starts with 0, we are calling java method here)
         driver.switchTo().frame(0);
         -- by name or id
         driver.switchTo().frame("mce_0_ifr");
         -- by passing iframe WebElement object
         locate the iframe element by it's title  "Rich Text Area. Press ALT-0 for help."
         css selector locator :
         iframe[title='Rich Text Area. Press ALT-0 for help.']
         iframe[title^='Rich Text Area']
         */
        WebElement iframeElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iframeElm);

        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));

        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());

        // 2 ways to get out of the frame
        // jump one level out of the frame
//        driver.switchTo().parentFrame();
        // jump all the way to the main content , this will get you out of any level deep inside the frame
        driver.switchTo().defaultContent();
        // click on the Home link on top left corner
        driver.findElement(By.linkText("Home")).click();

        System.out.println("THE END");
    }



}
