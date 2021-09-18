package com.cybertek.LibraryCT.Logout;

import com.cybertek.utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutLibrarian extends TestBase {

    /*
    As a librarian, I want to logout from the library homepage.

    AC #1:
    Given user is on the homePage
    When user click username on the right top corner
    And user click Log Out
    Then verify user navigate back to login page.

     */

    @Test
    public void logout() throws InterruptedException {

        ArrayList<String> librariansCredentials = new ArrayList<>(Arrays.asList("librarian43@library", "librarian18@library"));
        for (String eachLibrarian : librariansCredentials) {


            //String librarian1 = "librarian43@library";

            driver.get("http://library2.cybertekschool.com/login.html");

            WebElement emailBox = driver.findElement(By.id("inputEmail"));
            emailBox.sendKeys(eachLibrarian);

            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");

            WebElement signInButton = driver.findElement(By.cssSelector("#login-form > button"));
            signInButton.click();

            //Given user is on the homePage
            Thread.sleep(3000);

            //When user click username on the right top corner

            WebElement usernameLink = driver.findElement(By.cssSelector("li>a[href='#']"));
            usernameLink.click();

            //    And user click Log Out

            Thread.sleep(1000);
            WebElement logOutLink = driver.findElement(By.cssSelector("div>a[href='#']"));
            logOutLink.click();

            Thread.sleep(3000);

            //Then verify user navigate back to login page.

            String expectedResult = "https://library2.cybertekschool.com/login.html";
            String actualResult = driver.getCurrentUrl();

            //THIS works yay!
            assertEquals(expectedResult,actualResult);

        }



    }
}








