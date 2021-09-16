package com.cybertek.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPageTest {

    //write 2 tests
    // testYahooSearchHomePageTitle
    //    test when you navigate to yahoo search page
    //    the title should be "Yahoo Search - Web Search"

    WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@After All, Nothing to do here");
    }

    @Test
    public void yahooSearchTest(){


        driver.get("https://search.yahoo.com/");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);

        driver.quit();

    }


    // test method name : testYahooSearchResultPageTitle
    // test navigate to yahoo page
    // and search for Selenium
    // the page title should start with selenium
    @Test
    public void testYahooSearchResultPageTitle() {


        driver.get("https://search.yahoo.com/");
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //we can simulate keystroke using Keys.SELECTONEOFTHEOPTION
        searchBox.sendKeys("Selenium" + Keys.ENTER);
        Assertions.assertTrue(driver.getTitle().startsWith("Selenium"));

        driver.quit();

    }








}
