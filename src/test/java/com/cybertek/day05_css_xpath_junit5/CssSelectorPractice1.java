package com.cybertek.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate 2 elements usind css selector

        /*
        input[name='email']
        input[name='email'][type='text']
        #forgot_password input[name='email']


         */

        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        /*
        button#form_submit
        #forgot_password
        button[id='form_submit'][class='radius']

         */

        WebElement retrieveButton = driver.findElement(By.cssSelector("button#form_submit"));
        retrieveButton.click();


        /*
        Possible options to identify 1 element
        h4[name='confirmation_message']
        #content h4[name='confirmation_message']
        div#content>h4[name='confirmation_message']
         */

        WebElement successMessage = driver.findElement(By.cssSelector("h4[name=\"confirmation_message\"]"));
        System.out.println("successMessage.getText() = " + successMessage.getText());



        /*if(successMessage.isDisplayed()){
            System.out.println("Success");
        }
        else{
            System.out.println("No message displayed");
        }

         */

        driver.close();




    }


}
