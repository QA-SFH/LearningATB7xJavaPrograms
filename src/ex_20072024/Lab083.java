package ex_20072024;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        //Take user input and check if its even or odd

        //logic building
        //1 figure out inputs
        //2 data types
        //3 do we need conversion or directly
        //4 Rough logic
        //5 Optimize

//        int a =11;
//        if(a%2 == 0){
//            System.out.println("Even no");
//        }else{
//            System.out.println("Odd no");
//        }

        Scanner sc = new Scanner(System.in); // object of scanner class - oops
        System.out.println("Enter the number");
        int user_input = sc.nextInt(); // oops
        System.out.println(user_input);
        if(user_input%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
       }
    }
}
