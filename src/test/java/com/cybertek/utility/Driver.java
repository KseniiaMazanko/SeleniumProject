package com.cybertek.utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /*
    Create a Singleton class called Driver

1. create private no arg constructor

2. create private static field with name obj
     Data type of variable should be WebDriver

3. create public static method
     name : getDriver()
     return type :WebDriver
     param : none

     check if obj is null or not
         if yes - create ChromeDriver with all set up
        if no  -- return same obj
     */

    //we wanted to have a class that only returns Single object
    //no matter how many times you asked for the object
    //so we are creating this class with a technic we learned form Singleton pattern

    private static WebDriver obj;

    private Driver(){ }

    public static WebDriver getDriver(){
        if(obj == null){
            //System.out.println("Creating the object now");
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            return obj;
        }
        else{
            //System.out.println("The object already exists");
            return obj;
        }

    }


}
