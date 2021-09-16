package com.cybertek.day03_LocateByTag_GetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        //get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        //get href attribute of the first link
        System.out.println("firstLink.getAttribute(\"href\") = "
                + firstLink.getAttribute("href"));

        driver.navigate().to("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Hawaii");

        System.out.println("searchBox.getAttribute(\"maxLength\") = "
                + searchBox.getAttribute("maxLength"));
        System.out.println("searchBox.getAttribute(\"type\") = "
                + searchBox.getAttribute("type"));


        //using value attribute of input text box to extract the text inside

        System.out.println("searchBox.getAttribute(\"value\") = "
                + searchBox.getAttribute("value"));


        driver.quit();
    }
}
