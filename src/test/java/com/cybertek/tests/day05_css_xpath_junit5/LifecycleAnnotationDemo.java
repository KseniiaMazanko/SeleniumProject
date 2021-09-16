package com.cybertek.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifecycleAnnotationDemo {


    //the order does not matter!!!

    @Test
    public void test1(){
        System.out.println("test1 method is running");
    }

    @Test
    public void test2(){
        System.out.println("test2 method is running");
    }

    @BeforeAll
    public static void init(){
        System.out.println("@BeforeAll run once before all test");
    }

    @AfterEach
    public void teardown() {
        System.out.println("@AfterEach runs after each test");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("@AfterAll run once after all test");
    }



}
