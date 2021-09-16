package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagNameSelfPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        //get tag name of the element
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());
        //get value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        WebElement searchButton = driver.findElement(By.name("btnK"));

        //get a tagname of the element , get class attribute
        System.out.println("searchButton.getTagName() = "
                + searchButton.getTagName());
        System.out.println("searchButton.getAttribute(\"class\") = "
                + searchButton.getAttribute("class"));

        searchButton.click();

        //identify the element that holds search result number

        WebElement searchResult = driver.findElement(By.id("result-stats"));

        //get the text of that element
        String resultText = searchResult.getText();
        System.out.println("resultText = " + resultText);


    }


}
