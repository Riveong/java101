package com.dicoding.javafundamental.oop;

public class Class {
    String namaKucing;
    int beratBadan;


    //constructor
    public Class(String name, int berat){
        namaKucing = name;
        beratBadan = berat;
        System.out.println(name);


    }

    public static void main(String[] args) {
    Class objectClass = new Class("a",2);
        System.out.println(objectClass);
    }

}