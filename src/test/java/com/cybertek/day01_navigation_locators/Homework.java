package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    /*
1. Open Chrome and Navigate to https://facebook.com
2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the Login button and wait few seconds until error comes back
5. Navigate back to login screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
8. Click on the search button
9. Click on the cancel button
10. Quit the browser
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://facebook.com");

        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("invalid username");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("some password");

        WebElement logInButton = driver.findElement(By.name("login"));
        logInButton.submit();

        Thread.sleep(5000);

        driver.navigate().back();

        WebElement forgotPassword = driver.findElement(By.linkText("Forgot Password?"));
        forgotPassword.click();

        WebElement phoneNumber = driver.findElement(By.name("email"));
        phoneNumber.sendKeys("123456789");

        WebElement searchButton = driver.findElement(By.id("did_submit"));
        searchButton.submit();

        WebElement cancelButton = driver.findElement(By.name("reset_action"));
        cancelButton.click();

        driver.quit();










    }


}
