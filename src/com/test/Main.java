package com.test;

public class Main {
    public static final String SOME_TEXT = "Main text";

    public static void main(String[] args) {
        System.out.println(SOME_TEXT); //My comment

        String s = "Hey, How are you?";

        print(s);

        printMultiply(2, 3);
    }
    private static void print (String string){
        System.out.println(string);
    }

    private static void printMultiply(int x, int y){
        System.out.println(Math.multiplyExact(x, y));
    }
}
