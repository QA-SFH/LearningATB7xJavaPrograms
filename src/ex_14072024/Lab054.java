package ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        //type caSTING - source and destination conversion
        //widening - implicit and explicit - no_data_loss
        //narrowing - implicit and explicit - data_loss

        //widening
        byte b = 10;
        int i = b; //implicit casting -JVM
        int a1 = (int)b; //valid explicit casting
        //int age = +65;

        //narrowing
        int val = 300;
        //byte b1 = val; // Invalid implicit casting - jvm
        byte b1 = (byte)val; //Invalid explicit casting //loss of data
        System.out.println(b1);

    }
}
