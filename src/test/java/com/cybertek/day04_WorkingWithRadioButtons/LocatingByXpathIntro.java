package com.cybertek.day04_WorkingWithRadioButtons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByXpathIntro {

    public static void main(String[] args) {

       //copy full Xpath
        //      /html/body/div/div[2]/div/div/div/h1/span

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());


        //relative path

        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2 = " + headerSpan2.getText());

        //providing attributes in XPath

        //    elementTag[@attributeName='attribute value']
                        // input[@name='checkbox1']


        //if you have more than 1
        //elementTag[@attributeName='attribute value' and @attribute2Name='attribute2 value']
                        //input[@name='checkbox1' and @type='checkbox']

        //you can also provide use text() xpath function
        //elementTag[text()='some text here']
                         //h3[text()='Checkboxes' ]


        //you have option to provide index
        //someElement[indexGoesHere]



        //click on checkboxes link to go to checbox page using xpath
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

        //identify header 1st checkbox (xpath)
        WebElement header = driver.findElement(By.xpath("//h3[text() = 'Checkboxes']"));
        System.out.println("header.getText() = " + header.getText());




    }


}
