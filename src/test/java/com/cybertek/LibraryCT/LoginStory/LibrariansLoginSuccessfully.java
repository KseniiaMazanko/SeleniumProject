package com.cybertek.LibraryCT.LoginStory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrariansLoginSuccessfully {


    public static void main(String[] args) throws InterruptedException {

        //librarian43@library
        //librarian18@library

       /* Given librarian is on the loginPage

        Then verify that the title is “Login - Library”

        When librarian enters valid email address and password

        And librarian click sign in button

        Then verify that there are 3 modules the page

        */


        ArrayList<String> librariansCredentials = new ArrayList<>(Arrays.asList("librarian43@library","librarian18@library"));
        for (String eachLibrarian : librariansCredentials) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://library2.cybertekschool.com/login.html");

            //Then verify that the title is “Login - Library”
            String title = driver.getTitle();
            System.out.println("title = " + title);
            if(title.equals("Login - Library")){
                System.out.println("Title is verified");
            }
            else{
                System.out.println("Title is not correct");
            }

           // When librarian enters valid email address and password

            WebElement emailBox = driver.findElement(By.id("inputEmail"));
            emailBox.sendKeys(eachLibrarian);

            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");


            //And librarian click sign in button
            WebElement signInButton = driver.findElement(By.cssSelector("#login-form > button"));
            signInButton.click();

            Thread.sleep(3000);


            //Then verify that there are 3 modules the page
            List<WebElement> modules = driver.findElements(By.xpath("//li[@class='nav-item']"));
            if(modules.size()==3){
                WebElement firstModule = driver.findElement(By.xpath("//li[1]/a"));

                WebElement secondModule = driver.findElement(By.xpath("//li[2]/a"));

                WebElement thirdModule = driver.findElement(By.xpath("//li[3]/a"));

                if(firstModule.getText().equals("Dashboard")&&secondModule.getText().equals("Users")
                        && thirdModule.getText().equals("Books")){
                    System.out.println("Test has passed for user " + eachLibrarian);
                }
                else{
                    System.out.println("Test has failed for user " + eachLibrarian);
                }
            }
            else{
                System.out.println("Test has failed for user " + eachLibrarian);
            }



            driver.quit();




        }



    }


}
