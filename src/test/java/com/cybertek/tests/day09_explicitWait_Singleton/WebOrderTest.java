package com.cybertek.tests.day09_explicitWait_Singleton;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderTest extends TestBase {

    @Test
    public void login(){

        //id username -> ctl00_MainContent_username
        //id password -> ctl00_MainContent_password

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        /*WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement button = driver.findElement(By.id("ctl00_MainContent_login_button"));
        button.click();
        BrowserUtil.waitFor(4);
         */

        //create a class called WebOrderUtility
        //create a static method called Login

        WebOrderUtility.login("Tester", "test");

        BrowserUtil.waitFor(2);

        System.out.println("WebOrderUtility.isAtOrderPage(driver) = " + WebOrderUtility.isAtOrderPage());

        BrowserUtil.waitFor(2);

        WebOrderUtility.logout();

        BrowserUtil.waitFor(2);

        /*WebOrderUtility.login("bla", "bla");

        System.out.println("WebOrderUtility.isAtOrderPage() = " + WebOrderUtility.isAtOrderPage());

         */

        WebOrderUtility.openWebOrderApp();

        WebOrderUtility.login("Tester", "test");
        WebOrderUtility.verifyUserName("Tester");
        WebOrderUtility.verifyUserName("Bla");












    }






}
