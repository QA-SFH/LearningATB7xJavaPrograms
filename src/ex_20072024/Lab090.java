package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        // write a program
        // take a user input as char and tell the user if its a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char,I will tell you if it's vowel or not");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("Vowels");
                break;
            case 'e':
                System.out.println("Vowels");
                break;
            case 'i':
                System.out.println("Vowels");
                break;
            case 'o':
                System.out.println("Vowels");
                break;
            case 'u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("It's not a vowel,It's a consonant");
        }

    }
}
