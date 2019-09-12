package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class InFolderSelectGivenExtensionFilenameTest {
    private static InFolderSelectGivenExtensionFilename fileContent;

    @BeforeClass
    public static void setup() throws IOException {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        File f=new File("TestFolder");
        f.mkdir();
        File f1=new File("TestFolder","txtExtension.txt");
        f1.createNewFile();
        FileWriter fout=new FileWriter("txtExtension.txt");
        fout.write("Hi,Welcome to java");
        fout.close();
        File f2=new File("TestFolder","htmlExtension.html");
        f2.createNewFile();
        FileWriter fout1=new FileWriter("htmlExtension.html");
        fout1.write("Hi,This is HTML Page");
        fout1.close();
        File f3=new File("TestFolder","cssExtension.css");
        f3.createNewFile();
        FileWriter fout2=new FileWriter("cssExtension.css");
        fout2.write("Hi,This is CSS");
        fout2.close();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        fileContent = null;
    }
    @Test
    public void testConvertUpercase() throws IOException {
        fileContent=new InFolderSelectGivenExtensionFilename("TestFolder",".txt");
        assertEquals("Hi,Welcome to java",fileContent.fileContent());
    }
    @Test
    public void testConvertUppercase1(){
        fileContent=new InFolderSelectGivenExtensionFilename("TestFolder",".html");
        assertNotEquals("Hi,Hi,This is HTML Pag",fileContent.fileContent());
    }
    @Test
    public void testConvertUppercase2(){
        assertNotNull(fileContent.fileContent());
    }
    @Test
    public void testConvertUpercaseFailure() throws IOException {
        File f=new File("TestFolder","htmlExtension.html");
        f.createNewFile();
        FileWriter fout=new FileWriter("htmlExtension.html");
        fout.write("");
        fout.close();
        fileContent=new InFolderSelectGivenExtensionFilename("TestFolder",".html");
        assertNull(fileContent.fileContent());
    }
}
