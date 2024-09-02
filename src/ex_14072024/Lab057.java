package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        //increment (++) / decrement (--) operators
        //pre and post

        //pre - increment ++ operand
        //value is increment first and then stored in the result
        int a = 10;
        int b = ++a; // a = a+1;
        // exp = 11, a = 11
        System.out.println(a);
        System.out.println(b);

        //pre
        int a2 = 10;
        System.out.println(++a2);

        //post
        int a3 = 10;
        System.out.println(a3++);
        System.out.println(a3);




    }
}
