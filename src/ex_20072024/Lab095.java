package ex_20072024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char,I will tell you if it's vowel or not");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a','i','e','o','u':
                System.out.println("It's a vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}
