package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //identify the first dropdown

        WebElement yearDropdownEl = driver.findElement(By.id("year"));

        //wrap it up using Select class so we could use easy methods
        Select yearSelectObj = new Select(yearDropdownEl);

        //select items in 3 different ways

        //select 3rd item
        yearSelectObj.selectByIndex(2);
        //select item with value attribute 2019
        yearSelectObj.selectByValue("2000");
        //select item with visible text 1990
        yearSelectObj.selectByVisibleText("1990");


        //if you have a wrong item it will throw the exception
        //yearSelectObj.selectByVisibleText("Bla bla");

        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthSelectObj = new Select(monthDropdown);
        monthSelectObj.selectByIndex(5);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");




        driver.quit();






    }


}
