package com.cybertek.day02_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartialLinkText {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        // click on first link  "A/B Testing"

        // navigate back to home page

        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        firstLink.click();

        Thread.sleep(3000);

        //driver.findElement(By.linkText("A/B Testing")).click();

        driver.navigate().back();

        Thread.sleep(3000);

        //maximize the screen

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // click on second link, either full linkText or PartialLinkText

        WebElement secondLink = driver.findElement(By.linkText("Add/Remove Elements"));
        secondLink.click();

        Thread.sleep(3000);

        //partial is tricky cause you might have a few links with the same names
        /*WebElement addOrRemove = driver.findElement(By.partialLinkText("Add/Remove"));
        addOrRemove.click();
         */

        Thread.sleep(3000);



        // click on "Home" link to go back to home
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        homeLink.click();

        Thread.sleep(3000);


        // click on "Redirect Link"
        WebElement redirect = driver.findElement(By.linkText("Redirect Link"));
        redirect.click();

        Thread.sleep(5000);

        driver.quit();






    }


}
