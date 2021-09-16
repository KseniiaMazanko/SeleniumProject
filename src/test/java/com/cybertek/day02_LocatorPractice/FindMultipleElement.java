package com.cybertek.day02_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindMultipleElement {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");


        //get all the links that have partial text A in it by using ElementS

        driver.findElements(By.partialLinkText("A"));
        List <WebElement> allLinks = driver.findElements(By.partialLinkText("A"));
        System.out.println("allLinks.size() = " + allLinks.size());


        WebElement firstItem = allLinks.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());

        for (WebElement eachEl : allLinks) {
            System.out.println("eachEl.getText() = " + eachEl.getText());

        }

        driver.quit();

    }



}
