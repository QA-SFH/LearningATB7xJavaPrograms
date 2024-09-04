package ex_20072024;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        // max number in 2 inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();;

        System.out.println("Enter the number");
        int num2 = sc.nextInt();;

        if(num1>num2){
            System.out.println(num1+" is the max no");
        }else if (num2>num1){
            System.out.println(num2+" is the max no");
        }else{
            System.out.println("Both are equal");
        }
    }
}
