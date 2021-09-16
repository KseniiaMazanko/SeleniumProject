package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateElementsByClassName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify the span element with class name h1y

        WebElement  element = driver.findElement(By.className("h1y"));
        System.out.println("element.getText() = " + element.getText());

        //identify first item in unordered list using class name

        WebElement firstEl = driver.findElement(By.className("list-group-item"));
        System.out.println("firstEl.getText() = " + firstEl.getText());

        List<WebElement> allLinks = driver.findElements(By.className("list-group-item"));
        System.out.println("allLinks.size() = " + allLinks.size());
        for (WebElement eachLink : allLinks) {
            System.out.println("each link = " + eachLink.getText());
        }
    }

}
