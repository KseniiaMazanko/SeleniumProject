package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locate the blue radio button
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio = " + blueRadio.isSelected());

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();

        System.out.println("redRadio.isSelected() after click = " + redRadio.isSelected());
//check blue radio button status

        System.out.println("blueRadio.isSelected() after red one is selected = " + blueRadio.isSelected());


        WebElement greenRadio = driver.findElement(By.id("green"));
        greenRadio.click();
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());
        //any element can use isEnable() to check if the element is disabled

        List<WebElement> listOfRadioButtons = driver.findElements(By.name("color"));

        //check the size

        System.out.println("listOfRadioButtons.size() = " + listOfRadioButtons.size());

        //loop over the elements to pront id, attribute, color, isSelected

        for (WebElement eachElement : listOfRadioButtons) {

            System.out.println("eachElement.getAttribute(\"id\") = " + eachElement.getAttribute("id"));
            System.out.println("eachElement.isEnabled() = " + eachElement.isEnabled());
            System.out.println("eachElement.isSelected() = " + eachElement.isSelected());
            System.out.println("______________________________________________________");

        }

        driver.quit();

    }
}
