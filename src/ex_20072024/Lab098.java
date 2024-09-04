package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        // jdk> 13
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65; // return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
