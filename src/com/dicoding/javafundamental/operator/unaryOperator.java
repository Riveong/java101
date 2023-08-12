package com.dicoding.javafundamental.operator;

public class unaryOperator {

    public static void main(String[] args) {
        //unary plus operation
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);

        //unary minus operation
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 = " + nilaiAwal2);


        //unary increment operation
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);


        //unary decrement operation
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);

        //unary conditional operation
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
