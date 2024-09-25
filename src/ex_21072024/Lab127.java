package ex_21072024;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any number");
//        int n = sc.nextInt();


        for (int i = 1; i <100 ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Fizz buzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
