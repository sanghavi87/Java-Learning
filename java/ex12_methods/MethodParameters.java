package ex12_methods;

public class MethodParameters {
////Static parameter method
//    static void myMethod(String fname, int age){
//        System.out.println(fname+ " " +age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("Tester",24);
//    }

//Nonstatic parameter method
    void myMethod1(String name, int year )
    {
        System.out.println(name+ " " +year);

    }

    public static void main(String[] args) {
        MethodParameters obj1 = new MethodParameters();
        obj1.myMethod1("Test",2023);
    }

}
