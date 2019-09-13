package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TryCatchExceptionsTest {
    private static TryCatchExceptions tryCatchExceptions;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    tryCatchExceptions =new TryCatchExceptions();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        tryCatchExceptions = null;

    }
    @Test
    public void negativeArraySizeExceptionstest(){
        NegativeArraySizeException e=new NegativeArraySizeException();
        String s=e.toString();
        System.out.println(s);
        assertEquals(s, tryCatchExceptions.negativeArraySizeException(-1));
    }
    @Test
    public void negativeArraySizeExceptionstestFailure(){
        assertNotNull( tryCatchExceptions.negativeArraySizeException(-3));
    }
   @Test
    public void NullPointerExceptionstest(){
        NullPointerException e=new NullPointerException();
        String s=e.toString();
        assertEquals(s, tryCatchExceptions.nullPointerException());
   }
    @Test
    public void NullPointerExceptionstestFailure(){
        assertNotNull( tryCatchExceptions.nullPointerException());
    }
    @Test
    public void indexOutOfBoundsExceptionstest(){
        IndexOutOfBoundsException e=new IndexOutOfBoundsException();
        String s=e.toString();
        assertEquals(s, tryCatchExceptions.indexOutOfBoundsException(10,11));
    }
    @Test
    public void indexOutOfBoundstestFailure(){
        assertNotNull( tryCatchExceptions.indexOutOfBoundsException(10,21));
    }
}
