package ex_14072024;

public class Lab071 {
    public static void main(String[] args) {
        String name = "Test";
        String name1 = "Test";

        String name2 = new String("Test");
        String name3 = new String("Test");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name2 == name3);
    }
}
