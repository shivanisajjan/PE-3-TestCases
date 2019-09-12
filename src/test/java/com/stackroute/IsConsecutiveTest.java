package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsConsecutiveTest {

    private static IsConsecutive isconsecutive;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        isconsecutive= null;

    }
    @Test
    public void testIsConsecutive(){
        String[] result=new String[]{"61","62","63","64","65","66","67","92"};
        IsConsecutive isconsecutive=new IsConsecutive(result);
        assertTrue(isconsecutive.consecutiveNumbers());
    }
    @Test
    public void testIsConsecutiveFailure(){
        String[] result1=new String[]{"61","93","43","74","65","66","67","92"};
        IsConsecutive isconsecutive1=new IsConsecutive(result1);
        assertFalse(isconsecutive1.consecutiveNumbers());
        assertNotNull(isconsecutive.consecutiveNumbers());
    }
}
