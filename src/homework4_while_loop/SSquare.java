package homework4_while_loop;

public class SSquare {
    /*
print to console a square 10*10 with 'S'
using loop while
 */
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            while (j <= 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
    }
}
