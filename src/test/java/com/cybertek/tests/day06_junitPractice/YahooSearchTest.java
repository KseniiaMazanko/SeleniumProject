package com.cybertek.tests.day06_junitPractice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest extends TestBase {


    @Test
    public void testYahooSearchHomePage() throws InterruptedException {
        driver.get("https://search.yahoo.com/");
        String expectedTitle = "Yahoo Search - Web Search" ;
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);



    }

    @Test
    public void testYehooSearchResultPage() throws InterruptedException {
        driver.get("https://search.yahoo.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //we can simulate keystroke using Keys.SELECTONEOFTHEOPTION
        searchBox.sendKeys("Selenium" + Keys.ENTER);
        Thread.sleep(1000);
        assertTrue(driver.getTitle().startsWith("Selenium"));


    }


}
