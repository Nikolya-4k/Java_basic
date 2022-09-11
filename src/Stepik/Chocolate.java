package Stepik;

public class Chocolate {
    public static long breakChocolate(long n, long m) {
        if (n < 0 || m < 0) {
            return 0;
        }
        else {
            return n * m - 1;
        }
    }
}
