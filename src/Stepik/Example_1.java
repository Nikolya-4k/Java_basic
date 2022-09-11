package Stepik;

import java.util.Scanner;

class Example_1 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            multiply(a, b, c);
        }
        //разместите свою функцию, например здесь
    static void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}
