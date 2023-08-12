package com.dicoding.javafundamental.datatype;

public class array {
    public static void main(String[] args) {
        //declaring array
        double[] arrA;
        arrA = new double[10];
        //declaring array (2)
        double[] arrB = new double[10];
        double arrC[] = new double[]{1,2,3,4,5,6,7,6,7,67,6,6,6,5};
        int[] arrInt = new int[6];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;

        //multidimensional array
        char[][] arrChar = new char[2][];
        arrChar[0] = new char[2];
        arrChar[1] = new char[3];
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';


    }


}
