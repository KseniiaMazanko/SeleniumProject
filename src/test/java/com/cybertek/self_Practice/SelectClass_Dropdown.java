package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Dropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        dropdownLink.click();

        //identify the select element

        WebElement dropdownEl = driver.findElement(By.id("dropdown"));
        //wrap this element inside Select object

        Select selectObj = new Select(dropdownEl);

        //use ready methods to select options

        selectObj.selectByIndex(1); //select 3rd item
        selectObj.selectByValue("1");//select item with value attribute
        selectObj.selectByVisibleText("Option 2");

        driver.quit();

    }
}
