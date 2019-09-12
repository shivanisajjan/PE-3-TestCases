package com.stackroute;

public class StudentMarks {
    private int noOfStudents;
    private int stuGrades[];

    StudentMarks(int n,int[] grades){
        this.noOfStudents=n;
        this.stuGrades=new int[noOfStudents];
        this.stuGrades=grades;
    }
    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public int[] getStuGrades() {
        return stuGrades;
    }

    public void setStuGrades(int[] stuGrades) {
        this.stuGrades = stuGrades;
    }

    public String gradecheck(){
        return null;
    }
}
