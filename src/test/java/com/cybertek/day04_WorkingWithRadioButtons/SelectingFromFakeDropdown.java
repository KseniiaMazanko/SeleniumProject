package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropdown {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        //we only use Select class when the element tag is select

        //identify the fake dropdown

        WebElement fakeDropdownEl = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropdownEl.click();

        //and select the option --- it's actually another link

        //identify and click on it

        WebElement googleLink = driver.findElement(By.linkText("Google"));
        googleLink.click();

        driver.quit();






    }

}
