package com.dicoding.javafundamental.controlflow;

public class ifOperator {


    public static void main(String[] args) {
        //if else scenario
        if (1==2){
            System.out.println("turns out 1 is 2");



        }
        else {
            System.out.println("smart!");


        }

        if (2>1){

            System.out.println("true");
        } else if (1<2) {
            System.out.println("sir I don't think this is a right statement");
        }


        //switch case scenario
        char input = 'B';
        switch (input){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("b");
                break;
            case 'C':
                System.out.println("c");
                break;




        }

    }
}
