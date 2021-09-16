package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatinAndSelectingMultiDropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //TODO: Identify language multi select dropdown
        WebElement language = driver.findElement(By.name("Languages"));
        Select langSelectObj = new Select(language);

        System.out.println("langSelectObj.isMultiple() = " + langSelectObj.isMultiple());

        langSelectObj.selectByIndex(2);
        langSelectObj.selectByValue("Python");
        langSelectObj.selectByVisibleText("Java");

        langSelectObj.deselectAll();

        driver.quit();



    }


}
