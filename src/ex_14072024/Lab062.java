package ex_14072024;

public class Lab062 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // ++a , exp = 11, a=11
        // a++ , exp = 11, a =12
        // a++ , exp = 12, a = 13
        // exp + exp + exp = 34
        // a =  13

    }
}
