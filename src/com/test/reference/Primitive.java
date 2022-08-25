package com.test.reference;

public class Primitive {
    public static void main(String[] arg){
        int a = 1;
        int b = 2;

        System.out.print("a = " + a + ", b = " + b);

        swap(a, b);
    }

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
