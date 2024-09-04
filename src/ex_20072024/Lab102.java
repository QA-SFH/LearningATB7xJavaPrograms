package ex_20072024;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        //Program to find the largest among 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter your number 2");
        int num2 = sc.nextInt();

        System.out.println("Enter your number 3");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Is Greater "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Is Greater "+num2);
        } else {
            System.out.println("Is Greater "+num3);
        }
    }
}
