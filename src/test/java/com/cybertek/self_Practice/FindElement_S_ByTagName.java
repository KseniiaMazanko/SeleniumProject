package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement_S_ByTagName {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify and save the first element with <a> tag

        WebElement firstLink = driver.findElement(By.tagName("a"));

        //print out the text

        System.out.println("firstLink.getText() = " + firstLink.getText());

        //identify and save all the elements with <a> tag
        //findElements method will return List<WebElement>
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        //iterate over the list and get the text of all the link elements

        for (WebElement eachEl : allLinks) {
            System.out.println("Link text is = " + eachEl.getText());
        }

        //click on HomeLink

        firstLink.click();

        Thread.sleep(5000);

        driver.quit();


    }


}
