package ex_14072024;

public class Lab072 {
    public static void main(String[] args) {
        String name = new String("Pramod");
        String name1 = new String("Pramod");
        String name2 = new String("Pramod");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name1 == name2);
        System.out.println(name.equals(name2));
    }
}
