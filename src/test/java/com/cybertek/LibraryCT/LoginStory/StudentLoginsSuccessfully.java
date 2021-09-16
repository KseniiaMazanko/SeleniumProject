package com.cybertek.LibraryCT.LoginStory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentLoginsSuccessfully {

    public static void main(String[] args) throws InterruptedException {

        /*
        student54@library
        student55@library
        student56@library

        Sdet2022*
         */

        /*Given student is on the loginPage

        Then verify that the URL is “https://library2.cybertekschool.com/login.html”

        When student enters valid email address and password

        And student click sign in button

        Then verify that there are 2 modules on the page

         */

        ArrayList<String> studentsCredentials = new ArrayList<>(Arrays.asList("student54@library", "student55@library",
                "student56@library"));

        for (String eachStudent : studentsCredentials) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://library2.cybertekschool.com/login.html");

            //Then verify that the URL is “https://library2.cybertekschool.com/login.html”
            String currentUrl = driver.getCurrentUrl();
            if(currentUrl.equals("https://library2.cybertekschool.com/login.html")){
                System.out.println("URL is verified");
            }
            else{
                System.out.println("URL is incorrect");
            }

            //When student enters valid email address and password
            WebElement email = driver.findElement(By.id("inputEmail"));
            email.sendKeys(eachStudent);
            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");

            //And student click sign in button
            WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
            signInButton.click();

            Thread.sleep(3000);

            //Then verify that there are 2 modules on the page
            List<WebElement> modules = driver.findElements(By.xpath("//li[@class='nav-item']"));
            if(modules.size()==2){
                WebElement firstModule = driver.findElement(By.xpath("//li[1]/a"));
                WebElement secondModule = driver.findElement(By.xpath("//li[2]/a"));
                if(firstModule.getText().equals("Books") && secondModule.getText().equals("Borrowing Books")){
                    System.out.println("Test has passed for user " + eachStudent);
                }

            }
            else{
                System.out.println("Test has failed for user " + eachStudent);
            }

            driver.quit();









        }









    }


}
