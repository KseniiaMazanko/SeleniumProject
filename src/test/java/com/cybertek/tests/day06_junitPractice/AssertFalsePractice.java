package com.cybertek.tests.day06_junitPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertFalsePractice {

    @Test
    public void check(){

        int num = 10 ;

        // write assertion to check the number is more than 9
        assertTrue( num > 9) ;

        // write assertion to check the number is not less than 5
        assertTrue(  !(num<5)  );

        assertFalse( num<5 ) ;

    }


}
