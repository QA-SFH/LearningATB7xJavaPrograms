package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String Password = "Pramod@123";
        String pass_u = Password.toLowerCase();
        // pass_u == password
        System.out.println(pass_u == Password);
        System.out.println(pass_u.equalsIgnoreCase(Password));

        System.out.println(Password.substring(0,3));
        System.out.println(Password.indexOf('r' ));


    }
}
