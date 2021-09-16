package com.cybertek.self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeChallenge {


    public static void main(String[] args) throws InterruptedException {

        //setup ChromeDriver and open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to https://saucedemo.com
        driver.get("https://saucedemo.com");

        //maximize window

        driver.manage().window().maximize();

        //print out the page title

        driver.getTitle();
        //Enter username provided: standart_user

        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");

        //Enter password provided: secret_sauce

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");

        //Click on Login button to login

        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.submit();;

        //Get the name and price of first product
//assuming we don't know the product name but we want the first item
        WebElement firstItem = driver.findElement(By.className("inventory_item_name"));
        WebElement firstItemPrice = driver.findElement(By.className("inventory_item_price"));
        System.out.println("Name of the first item = " + firstItem.getText());
        System.out.println("Price of the first item = " + firstItemPrice.getText());

//assuming we don't know the product name, just use link text
       /* WebElement firstProductLink = driver.findElement(By.linkText("Sauce Labs Backpack"));
        System.out.println("firstProductLink.getAttribute(\"id\") = " + firstProductLink.getAttribute("id"));
         */
        //Get all products' names into List<WebElement>


        List<WebElement> allItems = driver.findElements(By.className("inventory_item_name"));
        //get the count
        System.out.println("Size = " + allItems.size());

        //print out the text of all products
        for (WebElement eachEl : allItems) {
            System.out.println("Name of the item = " + eachEl.getText());
        }

        //CLick on the shopping cart link top right corner

        WebElement shoppingCart = driver.findElement(By.className("shopping_cart_link"));
        shoppingCart.click();

        WebElement continueShop = driver.findElement(By.id("continue-shopping"));
        continueShop.click();

        Thread.sleep(5000);

        driver.quit();






    }




}
