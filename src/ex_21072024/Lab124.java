package ex_21072024;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        // factorial program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
