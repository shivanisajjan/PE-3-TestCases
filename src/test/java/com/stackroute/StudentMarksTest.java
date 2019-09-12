package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks studentmarks;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentmarks = null;

    }

    @Test
    public void testStudentMarks(){
        studentmarks=new StudentMarks(6, new int[]{40, 50, 10, 30, 20, 5});
        assertEquals("True",studentmarks.gradecheck());
        studentmarks=new StudentMarks(6, new int[]{40, 50, 10, 101, 20, 5});
        assertEquals("Enter valid grade",studentmarks.gradecheck());
        studentmarks=new StudentMarks(6, new int[]{40, 50, 10, 100, 20, 5});
        assertNotEquals("Enter valid grade",studentmarks.gradecheck());
        studentmarks=new StudentMarks(5, new int[]{40, 50,  -1, 100, 0});
        assertNotNull(studentmarks.gradecheck());
    }

    @Test
    public void testStudentMarksFailure(){
        studentmarks=new StudentMarks(6, new int[]{40, 50, 10, 100, 20, 5});
        assertNotEquals("Enter valid grade",studentmarks.gradecheck());
        studentmarks=new StudentMarks(5, new int[]{40, 50,  -1, 100, 0});
        assertNotNull(studentmarks.gradecheck());
    }
}
