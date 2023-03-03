package ex12_methods;

public class NonStaticMethod {

    void myMethod(){
        System.out.println("My first normal Method");

    }

    public static void main(String[] args) {
        NonStaticMethod geeta = new NonStaticMethod();
        geeta.myMethod();

    }
}
