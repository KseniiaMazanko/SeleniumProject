package com.cybertek.LibraryCT.LoginStory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithInvalidCredentials {

    /*
    Given user is on the loginPage

    When user enters invalid email address or password

    And student click sign in button

    Then verify the error message “Sorry, Wrong Email or Password”
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        //When student enters invalid email address or password
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("InvalidEmail@gmail.com");
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        //And student click sign in button

        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        signInButton.click();


        //Then verify the error message “Sorry, Wrong Email or Password”
        WebElement alert = driver.findElement(By.xpath("//*[text()='Sorry, Wrong Email or Password']"));
        if(alert.getText().equals("Sorry, Wrong Email or Password")){
            System.out.println("Test has passed");
        }

        Thread.sleep(2000);

        driver.quit();





    }
}
