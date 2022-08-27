package homework4_for_loop;

public class PrintRightTriangle {
        /*
    using for loop print right triangle from 8
    with size 10*10
    Example:
    8
    88
    888
    8888
    .....
     */
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
//                  System.out.println("8");   //Or symbol "8"
                }
                    System.out.println();
            }
        }

}
