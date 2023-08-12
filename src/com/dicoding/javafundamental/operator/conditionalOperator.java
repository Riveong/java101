package com.dicoding.javafundamental.operator;

public class conditionalOperator {
    /*
==	equal to
!=	not equal to
>	greater than
>=	greater than or equal to
<	less than
<=	less than or equal to */

    public static void main(String[] args) {
        int value = 1;
        int anotherValue=4;
        boolean result = value == anotherValue;
        System.out.println(result);
        boolean result2 = value != anotherValue;
        System.out.println(result2);
        boolean result3 = value > anotherValue;
        System.out.println(result3);
        boolean result4 = value >= anotherValue;
        System.out.println(result4);
        boolean result5 = value < anotherValue;
        System.out.println(result5);
        boolean result6 = value <= anotherValue;
        System.out.println(result6);

        //OR AND gate
        boolean resultOr = value == 3 && anotherValue == 3;
        System.out.println(resultOr);
        boolean resultAnd = value == 3 || anotherValue == 3;
        System.out.println(resultAnd);


    }

}
