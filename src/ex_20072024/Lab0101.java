package ex_20072024;

import java.util.Scanner;

public class Lab0101 {
    public static void main(String[] args) {
        // Program to check
        // if a number is positive
        //  negative
        // zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("It's a positive number");
        } else if (num<0) {
            System.out.println("It's a negative number");
        }else{
            System.out.println("Zero");
        }
    }
}
