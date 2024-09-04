package ex_20072024;

import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18 & age<=30){
            System.out.println("Goa");
        }else if(age>=30){
            System.out.println("Goa or maldives");
        }else{
            System.out.println("You cannot go anywhere");
        }

    }
}
