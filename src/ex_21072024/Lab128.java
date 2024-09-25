package ex_21072024;

public class Lab128 {
    public static void main(String[] args) {
            int year = 1994;

            if(isLeapYear(year)){
                System.out.println("Leap year");
            }else {
                System.out.println("Not a Leap year");
            }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 ==0 ){
            if(year % 100 ==0){
                return  year % 400 == 0;
            }
            return true;
        }else {
            return false;
        }
    }
}
