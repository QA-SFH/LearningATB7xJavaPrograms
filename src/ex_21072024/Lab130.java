package ex_21072024;

import javax.xml.transform.Result;

public class Lab130 {
    public static void main(String[] args) {
        // block of code which we can reuse
        // 1.pre-built  int result = Math.max(3,4);
        //        System.out.println(result);
        // 2. user created / defined

        // two component of functions
        // 1 .define
        // 2. call the function


        //without parameters and without return type
        //with parameters and without return type
        //without parameters and with return type
        //with parameters and with return type


        //call function
//        greet();
//        greet();
//        greet();
//
//        for (int i = 0; i < 10; i++) {
//            greet();
//        }
//            greet2();
//    }
//
//    //1.define
//     static void greet(){
//        System.out.println("Hello,how are you?");
//    }
//    static void greet2(){
//        System.out.println("Greet");
//    }

        function_type1();
        String name = function_type2();
        System.out.println(name);
        functionType3("Farhan");
//        System.out.println( functionType4("Farhan"));
         String name2 = functionType4("fARHAN");
        System.out.println(name2);


    }

    static void function_type1(){

          System.out.println("Without para and without return type");
    }
    static String function_type2(){
        return "Pramod"; //without para and with return type


    }

    static void functionType3(String name){
        System.out.println("With param witout returntype ::: "+name);
    }
    static String functionType4(String name){
       return "With param with returntype"+name;
    }

}
