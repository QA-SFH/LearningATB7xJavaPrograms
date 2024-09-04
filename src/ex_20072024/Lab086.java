package ex_20072024;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        //grade calculator
        // write a program that calculates and displays the letter grade for a given number
        //eg (A,B,C,D,E,F)
        // A : 100-90
        // B : 90-80
        // C : 80-70
        // D : 70-60
        // E : 60-50
        // F : 50-0

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score");
        int Score = sc.nextInt();
        char Grade = 'f';
        if(Score>=90 && Score<=100){
            Grade = 'A';
        } else if (Score>=80 && Score<=89){
            Grade = 'B';
        } else if (Score>=70 && Score<=79){
            Grade = 'C';
        } else if (Score>=60 && Score<=69){
            Grade = 'D';
        } else if (Score<=0 || Score>100){
            System.out.println("Error");
        }else{
            Grade = 'f';
        }
        System.out.println("Your grade is "+Grade);

        sc.close();



    }
}
