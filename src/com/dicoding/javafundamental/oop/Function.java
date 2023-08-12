package com.dicoding.javafundamental.oop;

public class Function {

    public static void main(String[] args) {
        cobaFungsi();
        System.out.println(doubleFungsi(2));
    }

    public static void cobaFungsi(){
        System.out.println("void function, have no return");
    }

    public static double doubleFungsi(double dbb){
        return dbb;
    }
    //overloading
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }





}
