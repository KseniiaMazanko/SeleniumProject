package com.cybertek.utility;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class WebOrderUtility {

    public static void login(String username, String password){

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);

        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);

        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

        BrowserUtil.waitFor(4);


    }

    public static void logout(){


        Driver.getDriver().findElement(By.id("ctl00_logout")).click();


    }

   public static boolean isAtOrderPage(){
        boolean result = false ;

        // locator for the header element of all order page
        //h2[normalize-space(.)='List of All Orders']
        try{
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space(.)='List of All Orders']"))) ;
            System.out.println("ELEMENT WAS IDENTIFIED ");
            result = true ;
        }catch (TimeoutException e){
            System.out.println("NO Such element! you are not at the right page");
        }
        return result ;
    }
//        System.out.println("header.isDisplayed() = " + header.isDisplayed());


    public static void openWebOrderApp(){


        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        System.out.println("WebOrder app was opened successfully");

    }

    public static boolean verifyUserName(String username){

        boolean result = false;

        try {
            WebElement usernameDisplayed = Driver.getDriver().findElement(By.xpath("//div[@class='login_info']"));
            Assertions.assertTrue(usernameDisplayed.getText().contains(username));
            result = true;
            System.out.println("Username is verified");
            return result;
        }

        catch(TimeoutException e) {
        System.out.println("Username is not verified!");
        return result;
        }


    }

    public static void selectSideBarTab(String tabName){

        //View all orders : Default.aspx
        //View all products : Products.aspx
        //Order: Process.aspx







    }





    }

