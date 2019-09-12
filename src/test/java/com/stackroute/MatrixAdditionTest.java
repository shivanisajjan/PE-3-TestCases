package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    private static MatrixAddition matrixaddition;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        matrixaddition = null;

    }

    @Test
    public void testMatrixAddition(){
        matrixaddition=new MatrixAddition(3,2,new int[][]{{1,2,3},{4,5,6}},new int[][]{{9,8,7},{6,5,4}});
        int[][] result=new int[][]{{10,10,10},{10,10,10}};
        assertEquals(result,matrixaddition.matrixAddition());
    }
    @Test
    public void testMatrixaddition1(){
        matrixaddition=new MatrixAddition(3,2,new int[][]{{1,2,3},{4,5,6}},new int[][]{{8,8,7},{6,5,4}});
        int[][] result1=new int[][]{{10,10,10},{10,10,10}};
        assertNotEquals(result1,matrixaddition.matrixAddition());
    }
    @Test
    public void testMatrixAdditionFailure(){
        matrixaddition=new MatrixAddition(0,0,new int[][]{{},{}},new int[][]{{},{}});
        assertNull(matrixaddition.matrixAddition());
    }
}

