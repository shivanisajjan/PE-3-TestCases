package com.stackroute;

import java.util.Arrays;

public class MatrixAddition {
    private int noOfRows;
    private int noOfColumns;
    private int values1[][];
    private int values2[][];


    MatrixAddition(int m, int n, int[][] values, int[][] values2){
        this.noOfRows=m;
        this.noOfColumns=n;
        this.values1=new int[m][n];
        this.values1=values;
        this.values2=new int[m][n];
        this.values2=values2;
    }
    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int[][] getValues() {
        return values1;
    }

    public void setValues(int[][] values) {
        this.values1 = values;
    }
    public int[][] getValues2() {
        return values2;
    }

    public void setValues2(int[][] values2) {
        this.values2 = values2;
    }

    public int[][] matrixAddition(){
        int[][] c=new int[noOfRows][noOfColumns];
        return c;
    }

}
