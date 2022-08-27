package homework4_while_loop;

import java.util.Scanner;

public class PrintStringNTimes {
    /*
    Enter from the console a string and a number
    Print string n times
    using loop while
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scanner.nextLine();
        System.out.println("Enter number of repetitions");
        int n = scanner.nextInt();
        scanner.close();
        int i = 0;

        //Implement here

        while (i < n){
            System.out.println(s);
            i++;
        }
    }
}