package ex_14072024;

public class Lab060 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        // a = 11 + a = 12
        // exp a++ = 10 exp ++a = 12
        // = 22
    }
}
