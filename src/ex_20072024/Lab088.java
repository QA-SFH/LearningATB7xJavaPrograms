package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //if else condition (if,else if ,else) - multiple condition

        //switch - better way to 2+condition
        // which day it is - day to from 1 to 7
        // 3 - > wednesday

        //MTWTFSS
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7,Tell what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea what day it is");
                break;


        }

        System.out.println("Outside the switch loop");
    }
}
