package com.cybertek.utility;

public class BrowserUtil {

    public static void waitFor(int seconds)  {

        int milliseconds = seconds*1000;

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
