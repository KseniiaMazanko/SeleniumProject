package com.cybertek.tests.day09_explicitWait_Singleton;


/**
 * we want this class to only create 1 object
 * We want to block creation of more that 1 obj
 */

/**
 *  Singleton is a design pattern to have a class only generate one object
 *  * in order to achieve Singleton pattern
 *          * 1. private constructor
 *         * 2. private static field with data type same as class
 *  * 3. public getter method for private field
 *         *       to check if you have already created object
 *         *       if not -- create object for the first time
 *         *       if yes -- just use existing object
 */

public class Singleton {

    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton getObj(){
        if(obj==null){
            obj = new Singleton();
            System.out.println("Object has not been created yet, creating one now");
            return obj ;
        }else{
            System.out.println("You already have object , use that existing object");
            return obj ;
        }

    }
}

