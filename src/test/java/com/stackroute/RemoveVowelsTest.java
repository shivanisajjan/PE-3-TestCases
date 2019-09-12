package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {


    private static RemoveVowels removevowels;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        removevowels = null;

    }
    @Test
    public void testremovevowels(){
        String[] result=new String[]{"Ind","ntd Stts","Grmny","gypt","czchslvk"};
        assertEquals(result,new RemoveVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));
        assertNull(new RemoveVowels(new String[]{}));
    }
    @Test
    public void testremovevowelsFailure(){
        String[] result1=new String[]{"Indi","Untd Stts","Grmny","Egypt","czchslvk"};
        assertNotEquals(result1,new RemoveVowels(new String[]{"India","United States","Germany","Egypt","czechoslovakia"}));
    }

}
