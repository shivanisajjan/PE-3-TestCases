package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChessBaordPatternTest {
    private static ChessBoardPattern chessboard;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        chessboard=new ChessBoardPattern();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        chessboard = null;
    }

    @Test
    public void testchessBoard() {
        List<String> al = new ArrayList<>();
        al.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        assertEquals(al, chessboard.chessBoard());
    }
    @Test
    public void testchessBoardFailure(){
       List<String> al1=new ArrayList<>();
        al1.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al1.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al1.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al1.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al1.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al1.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        al1.add("BB|WW|BB|WW|BB|WW|BB|WW|");
        al1.add("WW|BB|WW|BB|WW|BB|WW|BB|");
        assertNotEquals(al1,chessboard.chessBoard());
    }
}
