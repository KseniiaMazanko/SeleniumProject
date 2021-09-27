package com.cybertek.tests.day08_upload_actions_windowWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.cybertek.utility.BrowserUtil.waitFor;

public class ActionCLassTest extends TestBase {

    @Test
    public void testHover(){
        /**
         *  (//div[@class='example']/div/img)[1]
         *  (//div[@class= 'figure']/img)[1])
         */

        driver.get("http://practice.cybertekschool.com/hovers");

        waitFor(2);

        //locate second image and hover over to the image and verify User profile 2 displayed

        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class='example']/div/img)[2]"));

        //create instance of Actions class by passing driver object
        //its coming from here: import org.openqa.selenium.interactions.Actions;
        Actions actions = new Actions(driver);
        actions.moveToElement(img2Elm).perform();
        waitFor(3);

        //and verify User profile 2 is displayed with name:user1 text
        WebElement secondProfileElm = driver.findElement(By.xpath("//h5[.='name: user2']"));
        Assertions.assertTrue(secondProfileElm.isDisplayed());


        WebElement img3Elm = driver.findElement(By.xpath("(//div[@class='example']/div/img)[3]"));
        actions.moveToElement(img3Elm).perform();
        waitFor(3);
        WebElement thirdProfileElm = driver.findElement(By.xpath("//h5[.='name: user3']"));
        Assertions.assertTrue(thirdProfileElm.isDisplayed());

        // perform these action in this sequence
        // , hover over to 1st image , pause 2 second , then second image pause 2 second
        //  then hover over to 1st image again , pause 2 second  then second image pause 2 second
        // PERFORM THE ACTION!!!
        actions.moveToElement(img2Elm).pause(2000)
                .moveToElement(img3Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .moveToElement(img3Elm).pause(2000)
                .perform();

        //GET A LIST OF ALL 3 ELEMENTS!!!!!!!!!!!!!!

        List<WebElement> listOfEl = driver.findElements(By.xpath("//div[@class='example']/div/img"));
        List<WebElement> listOfTexts = driver.findElements(By.xpath("//h5"));
        for (WebElement eachEl : listOfEl) {
            actions.moveToElement(eachEl).perform();
            for (WebElement eachText : listOfTexts) {
                System.out.println("eachText.getText() = " + eachText.getText());
            }
        }




    }

    @Test
    public void testDragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2);

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement biggerCircle = driver.findElement(By.id("droptarget"));

        //dragAndDrop method of Actions class accepts 2 parameters and drop the first one into the second one
        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle,biggerCircle).perform();

        BrowserUtil.waitFor(2);

        //verify the big circle text has changed to You did great!
        String expectedResult = "You did great!";
        Assertions.assertEquals(expectedResult,biggerCircle.getText());






    }

    @Test
    public void testKeyboardAction(){
        //navigate to google
        //hold down to shift enter text "i love selenium'
        //release the shift
        //enter text "i love selenium"
        //holddown to command on mac
        //release the command

        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        //keyDown method for holding sown to certain modifier key like Control, shift etc
        //keyUp method is for releasing what you are holding down to
        //sendKeys method of Actions class is for pressing key that is provided
        //pause method of Actions for pausing in between actions in milliseconds

        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyDown(Keys.COMMAND).sendKeys("A")//select all the text
                .keyUp(Keys.COMMAND).pause(2000)
                .sendKeys(Keys.BACK_SPACE).pause(2000)
                .perform();


    }

    @Test
    public void testDoubleClick(){
        // navigate here
        //https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick
        // double-click on paragraph with text "Double-click this paragraph to trigger a function.
        // then assert the new paragraph with text "Hello world" displayed right under
        // both of the elements are under iframe with id iframeResult
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
        // both elements are under the frame , so switch into it first
        driver.switchTo().frame("iframeResult");
        WebElement pElm1 =
                driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        // in order to double-click we will use actions class
        Actions actions = new Actions(driver) ;
        actions.doubleClick(pElm1).perform(); // this is how we double click
        BrowserUtil.waitFor(2);
        // TODO : go ahead and assert the Hello world showed up

    }

    @Test   // right click is called context click
    public void testRightClick(){
        // navigate to below url
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        // locate the yellow area : css selector div[contextmenu='mymenu']
        // first switch to the iframe
        driver.switchTo().frame("iframeResult");
        WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));

        // right-click on that area using Actions class method contextClick( pass the element here)
        Actions actions = new Actions(driver);
        actions.contextClick(yellowArea).perform();

        BrowserUtil.waitFor(1);
        // close the alert that showed up after
    }

}
