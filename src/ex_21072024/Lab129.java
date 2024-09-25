package ex_21072024;

public class Lab129 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        int a, b;
//
//        // outer loop to handle number of rows
//        // k in this case
//        for (a = 0; a < n; a++) {
//
//            // inner loop to handle number of columns
//            // values changing acc. to outer loop
//            for (b = 0; b <= a; b++) {
//                // printing stars
//                System.out.print("* ");
//            }
//
//            // end-line
//            System.out.println();
//        }
    }
}
