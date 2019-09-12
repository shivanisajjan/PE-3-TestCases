package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class ConvertUppercaseTest {

    private static ConvertUppercase convertUppercase;

    @BeforeClass
    public static void setup() throws IOException {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        FileWriter fout=new FileWriter("toUppercase.txt");
        fout.write("Hi,WelcOme to java");
        fout.close();
        convertUppercase=new ConvertUppercase("toUppercase.txt");
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        convertUppercase = null;
    }
    @Test
    public void testConvertUpercase() throws IOException {
        assertEquals("HI,WELCOME TO JAVA 18",convertUppercase.convertUppercae());
    }
    @Test
    public void testConvertUppercase1(){
        assertNotEquals("Hi,WelcoME tO java 18",convertUppercase.convertUppercae());
    }
    @Test
    public void testConvertUppercase2(){
        assertNotNull(convertUppercase.convertUppercae());
    }
    @Test
    public void testConvertUpercaseFailure() throws IOException {
        FileWriter fout=new FileWriter("toUppercase.txt");
        fout.write("");
        fout.close();
        convertUppercase=new ConvertUppercase("toUppercase.txt");
        assertNull(convertUppercase.convertUppercae());
    }
}
