package ex_27072024;

public class Lab140 {
    public static void main(String[] args) {
        int [] salaries =  {7,10,45,32,23};
        int max = salaries [0];
        int min = salaries [0];
        for (int i = 0; i < salaries.length ; i++) {
            if(salaries[i]>max){
                max = salaries[i];
            }
            if (min > salaries[i]){
                min = salaries[i];
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}
