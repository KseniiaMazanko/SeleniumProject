package com.cybertek.tests.day09_explicitWait_Singleton;

import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;




public class SingletonPractice {

    @Test
    public void testSingleton(){

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();




    }

    @Test
    public void testSingleton2(){
        Driver.getDriver().get("https://www.google.com/");
        // Driver.getDriver();
        //Driver.getDriver();
    }

}
