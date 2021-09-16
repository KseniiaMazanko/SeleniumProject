package com.cybertek.LibraryCT.SelectStatus;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectStatusLibrarian extends TestBase {

    /*
    As a librarian, I want to select user status - active vs inactive.


    AC #1:
    Given librarian is on the homePage
    When librarian click Users module
    And librarian click Status dropdown
    Then verify there are 2 status options

     */

    @Test
    public void verifyStatus1() throws InterruptedException {

        /*
          ArrayList<String> librariansCredentials = new ArrayList<>(Arrays.asList("librarian43@library", "librarian18@library"));
          for (String eachLibrarian : librariansCredentials) {}
         */

            String librarian1 = "librarian43@library";

        //Given librarian is on the homePage

            driver.get("http://library2.cybertekschool.com/login.html");

            WebElement emailBox = driver.findElement(By.id("inputEmail"));
            emailBox.sendKeys(librarian1);

            WebElement password = driver.findElement(By.id("inputPassword"));
            password.sendKeys("Sdet2022*");

            WebElement signInButton = driver.findElement(By.cssSelector("#login-form > button"));
            signInButton.click();


            //When librarian click Users module
            WebElement userModule = driver.findElement(By.xpath("//li/a[@href='#users']"));
            userModule.click();


            //And librarian click Status dropdown
            WebElement statusSelect = driver.findElement(By.id("user_status"));
            statusSelect.click();


            Select statusObj = new Select(statusSelect);
            List<WebElement> listOfStatuses = statusObj.getOptions();


            //Then verify there are 2 status options
            if (listOfStatuses.size() == 2) {

                //see what statuses are there I GUESS THIS IS OPTIONAL
                for (int i = 0; i < listOfStatuses.size(); i++) {
                        boolean isActive = listOfStatuses.get(i).equals("ACTIVE");
                        boolean isInactive = listOfStatuses.get(i).equals("INACTIVE");
                        if(isActive&&isInactive){
                            System.out.println("Test has passed for librarian: " + librarian1);
                        }
                }
            }

            else {
                System.out.println("Test has failed for librarian " + librarian1);
            }

            driver.quit();

    }


    @Test
    public void verifyStatus2() throws InterruptedException {

        String librarian2 = "librarian18@library";

        driver.get("http://library2.cybertekschool.com/login.html");

        WebElement emailBox = driver.findElement(By.id("inputEmail"));
        emailBox.sendKeys(librarian2);

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        WebElement signInButton = driver.findElement(By.cssSelector("#login-form > button"));
        signInButton.click();

        //Given librarian is on the homePage

        //When librarian click Users module
        WebElement userModule = driver.findElement(By.xpath("//li/a[@href='#users']"));
        userModule.click();


        //And librarian click Status dropdown
        WebElement statusSelect = driver.findElement(By.id("user_status"));
        statusSelect.click();


        Select statusObj = new Select(statusSelect);
        List<WebElement> listOfStatuses = statusObj.getOptions();

            /*
            see what statuses are there
            for (WebElement each : listOfStatuses) {
                System.out.println("each.getText() = " + each.getText());
            }
             */

        //Then verify there are 2 status options
        //Then verify there are 2 status options
        if (listOfStatuses.size() == 2) {

            //see what statuses are there I GUESS THIS IS OPTIONAL
            for (int i = 0; i < listOfStatuses.size(); i++) {
                boolean isActive = listOfStatuses.get(i).equals("ACTIVE");
                boolean isInactive = listOfStatuses.get(i).equals("INACTIVE");
                if(isActive&&isInactive){
                    System.out.println("Test has passed for librarian: " + librarian2);
                }
            }
        }

        else {
            System.out.println("Test has failed for librarian " + librarian2);
        }

        driver.quit();

    }

}
