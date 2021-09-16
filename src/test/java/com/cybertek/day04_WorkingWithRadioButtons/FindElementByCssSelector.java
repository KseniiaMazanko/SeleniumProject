package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        //identify search box using css selector
        //try different way by id, by name

        //alternative ways that are doing the same thing

        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));

        //WebElement searchBox = driver.findElement(By.cssSelector("input[name = 'p']"));

        //WebElement searchBox = driver.findElement(By.cssSelector("input[id = 'yschsp']"));

       // WebElement searchBox = driver.findElement(By.cssSelector("input[name = 'p'] [type = 'text'] "));

        searchBox.sendKeys("CSS Selector");

        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        //WebElement clearIcon = driver.findElement(By.className("sprite"));
        clearIcon.click();

        searchBox.sendKeys("XPATH");

        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search'"));
        searchIcon.click();


        driver.quit();




    }

}
