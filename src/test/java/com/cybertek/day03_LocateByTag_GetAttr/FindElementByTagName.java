package com.cybertek.day03_LocateByTag_GetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println("firstLink.getText() = "
                + firstLink.getText());

        //find and storee all elements with <a> tag

        List<WebElement> allTags = driver.findElements(By.tagName("a"));
        System.out.println("allTags.size() = "
                + allTags.size());
        for (WebElement eachElement : allTags) {
            System.out.println("eachElement.getAttribute(\"href\") = "
                    + eachElement.getAttribute("href"));
            System.out.println("eachElement.getText() = "
                    + eachElement.getText());

            //get first element with <h1> tag and get the text out of it

            WebElement firstH1TagEl = driver.findElement(By.tagName("h1"));
            System.out.println("firstH1TagEl.getText() = "
                    + firstH1TagEl.getText());

        }


    }

}
