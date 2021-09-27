package com.cybertek.tests.day09_explicitWait_Singleton;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ExplicitWait extends TestBase {

    @Test
    public void testWaitForTitle(){

        //1.navigate to http://practice.cybertekschool.com/dynamic_loading

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //2.click on example 7

        driver.findElement(By.partialLinkText("Example 7")).click();

        //3. the title will show loading... until certain time
        // we want to wait until the title becomes "Dynamic title"

        //this is how we create WebDriverWait obj with driver and max time to wait

        WebDriverWait wait = new WebDriverWait(driver,6);

        // then we use until method that accept expected conditions
        // ExpectedConditions helper class has a lot of pre-written conditions
        // for common scenarios, so we don't have to build our own
        // in this case we are checking for title equal Dynamic Title

        //wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //try different condition
        //wait until SpongeBob image is visible on the screen

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img")));

        System.out.println("End");



    }


    @Test
    public void testByTextToBe(){
        //1.navigate to http://practice.cybertekschool.com/dynamic_loading

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //2.click on example 7

        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea = " + alertArea);

        WebDriverWait wait = new WebDriverWait(driver, 7);
        // wait for the image show up
        wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;

        alertArea = driver.findElement(By.id("alert"));

        System.out.println("alertArea.getText() = " + alertArea.getText());

    }





}
