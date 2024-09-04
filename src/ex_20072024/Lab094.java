package ex_20072024;

public class Lab094 {
    public static void main(String[] args) {
        //jdk13

        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("Its a laptop");
            case 002 -> System.out.println("Its a pc");
            case 003 -> System.out.println("Its a mobile");
            default -> System.out.println("None");

            //-> no break is required.
        }
    }
}
