package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class WordFrequencyTest {
    private static WordFrequency wordFrequency;

    @BeforeClass
    public static void setup() throws IOException {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        FileWriter fout=new FileWriter("wordFrequency.txt");
        fout.write("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.\n");
        fout.close();
        wordFrequency=new WordFrequency("wordFrequency.txt");
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordFrequency = null;
    }
    @Test
    public void testwordFrequency(){
        Map< String,Integer> hm = new HashMap< String,Integer>();
        hm.put("i",3);
        hm.put("am",1);
        hm.put("a",2);
        hm.put("man",1);
        hm.put("like",1);
        hm.put("to",1);
        hm.put("sleep",1);
        hm.put("have",1);
        hm.put("home",1);
        assertEquals(hm,wordFrequency.wordFrequency());
    }
    @Test
    public void testwordFrequency1(){
        Map< String,Integer> hm1 = new HashMap< String,Integer>();
        hm1.put("i",3);
        hm1.put("am",1);
        hm1.put("a",2);
        hm1.put("man",1);
        hm1.put("like",1);
        hm1.put("to",1);
        hm1.put("sleep",1);
        hm1.put("have",1);
        assertEquals(hm1,wordFrequency.wordFrequency());
    }
    @Test
    public void testWordFrequencyFailure() throws IOException {
        FileWriter fout=new FileWriter("wordFrequency.txt");
        fout.write("");
        fout.close();
        wordFrequency=new WordFrequency("wordFrequency.txt");
        assertNull(wordFrequency.wordFrequency());
    }
}
