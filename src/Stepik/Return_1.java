package Stepik;

import java.util.Scanner;

class Return_1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }
    static void area(int a, int b, int c) {
        System.out.print(2 * (a * b + b * c + a * c));
    }
}
