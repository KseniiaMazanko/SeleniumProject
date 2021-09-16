package com.cybertek.LibraryCT.AddNewUser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNewUserLibrarian {


    //MAKE SURE TO CHANGE THE EMAIL FOR EVERY NEW TEST TO AVOID THE ERROR 'EMAIL ALREADY EXIST'

    /*
    Given librarian is on the homePage

    When librarian click Users module

    And librarian click “+Add User” button

    When librarian enter full name, password, email and address

    And librarian click save changes

    Then verify a new user is created

     */


    public static void main(String[] args) throws InterruptedException {
//

        ArrayList<String> librariansCredentials = new ArrayList<>(Arrays.asList("librarian43@library","librarian18@library"));

        for (String eachLibrarian : librariansCredentials) {

            //Given librarian is on the homePage
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://library2.cybertekschool.com/login.html");

            WebElement emailBox = driver.findElement(By.id("inputEmail"));
            emailBox.sendKeys(eachLibrarian);

            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");

            Thread.sleep(2000);

            WebElement signInButton = driver.findElement(By.cssSelector("#login-form > button"));
            signInButton.click();

            Thread.sleep(5000);


            //verifying before count
            String beforeAddingAUser = driver.findElement(By.cssSelector("#user_count")).getText();
            int numberBefore = Integer.parseInt(beforeAddingAUser);
            System.out.println("numberBefore = " + numberBefore);


            //When librarian click Books module
            WebElement usersModule = driver.findElement(By.xpath("//*[text()='Users']"));
            usersModule.click();

            Thread.sleep(2000);

            //    And librarian click “+Add User” button

            WebElement addANewUser = driver.findElement(By.xpath("//span/a"));
            addANewUser.click();

            Thread.sleep(2000);

            //When librarian enter full name, password, email and address

            WebElement fullName = driver.findElement(By.xpath("//input[@type='text' and @name='full_name']"));
            fullName.sendKeys("Parker Peter");

            WebElement passwordUser = driver.findElement(By.cssSelector("input[name='password']"));
            passwordUser.sendKeys("12345P");


            WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
            if(eachLibrarian.equals("librarian43@library")) {
                email.sendKeys("peterPark@gmail.com");
            }
            else{
                email.sendKeys("peterPark2@gmail.com");
            }

            WebElement userGroup = driver.findElement(By.id("user_group_id"));
            Select objGroup = new Select(userGroup);
            objGroup.selectByValue("3");

            WebElement status = driver.findElement(By.id("status"));
            Select objStatus = new Select(status);
            objStatus.selectByVisibleText("ACTIVE");

            WebElement address = driver.findElement(By.id("address"));
            address.sendKeys("10102 Park Ave, New York, NY, 10001");

            Thread.sleep(3000);


            //And librarian click save changes

            WebElement submitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
            submitBtn.submit();

            Thread.sleep(4000);

            driver.navigate().to("https://library2.cybertekschool.com/#dashboard");
            driver.navigate().refresh();
            Thread.sleep(5000);



            //Then verify a new user is created

            String afterAddingTheUser = driver.findElement(By.cssSelector("#user_count")).getText();
            int numberAfter = Integer.parseInt(afterAddingTheUser);
            System.out.println("numberAfter = " + numberAfter);

            if(numberAfter==numberBefore+1){
                System.out.println("Test has passed for user " + eachLibrarian);
            }
            else{
                System.out.println("Test has failed for user " + eachLibrarian);
            }


            driver.quit();















            driver.quit();

            







        }

    }


}
