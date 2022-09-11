package Stepik;

import java.util.Scanner;

class Example_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }
    //разместите свою функцию, например здесь
    static void  twoWords(String s1, String s2) {
        if (s1.length() > s2.length()) {
            System.out.println("Первая строка длиннее");
        }
        else if (s1.length() < s2.length()) {
            System.out.println("Вторая строка длиннее");
        }
        else {
            System.out.println("Равная длина");
        }
    }
}
