package ex_20072024;

public class Lab093 {
    public static void main(String[] args) {
        //Jdk > 13

        int a = 010;
        switch (a){
            case 001,002,003:
                System.out.println("Group a");
                break;
            case 004,005,006:
                System.out.println("Group b");
                break;
//            case 007,008,009:
//                System.out.println("Group c");
//                break;
//            case 010,011,012:
//                System.out.println("Group d");
//                break;
            default:
                System.out.println("none");
        }
    }
}
