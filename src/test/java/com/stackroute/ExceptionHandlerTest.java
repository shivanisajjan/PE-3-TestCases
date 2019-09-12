package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionHandlerTest {
    private static ExceptionHandler exceptionHandler;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        exceptionHandler =new ExceptionHandler("Throws Exception");
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        exceptionHandler = null;

    }
    @Test
    public void setExceptionHandlertest(){
        assertEquals("Throws Exception",exceptionHandler.getMessage());
    }
}
