package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        dropdownLink.click();

        WebElement dropdownMult = driver.findElement(By.name("Languages"));

        //wrap this el into Select

        Select multiItemSelect = new Select(dropdownMult);

        //check if this is multiselect list

        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        //deselect

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.deselectByVisibleText("Java");
        multiItemSelect.deselectAll();
        driver.quit();





    }

}
