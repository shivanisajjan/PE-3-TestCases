package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class DisplayDateTest {

    private static DisplayDate displaydate;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        displaydate=new DisplayDate();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        displaydate = null;
    }

    @Test
    public void testDisplayDate(){
        List<String> dt=new ArrayList<>();
        dt.add("Mon 09/09/2019");
        dt.add("Sun 15/09/2019");
        assertEquals(dt,displaydate.displaydate());

    }
    @Test
    public void testDisplayDateFailure(){
        List<String> dt1=new ArrayList<>();
        dt1.add("Mon 09/09/2019");
        dt1.add("Sun 16/09/2019");
        assertNotEquals(dt1,displaydate.displaydate());
        assertNotNull(displaydate.displaydate());
    }
}
