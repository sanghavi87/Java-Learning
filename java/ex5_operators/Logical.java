package ex5_operators;

public class Logical {
    public static void main(String[] args) {
        int a=84;

        System.out.println(a<80 && a>25);   // false
        System.out.println(a<90 || a>87);   // true
        System.out.println(!(a<90 && a<105)); //false
    }
}
