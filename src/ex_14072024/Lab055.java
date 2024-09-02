package ex_14072024;

public class Lab055 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no;//implicit narrowing - jvm ?
        short s = (short)phone_no;
        System.out.println(s);
    }
}
