package ex2_firstpack;

public class MethodParameters {
    // static parameter method:-
   /* static void myMethod(String fname, int Age)
    {
        System.out.println(fname+" "+ Age);
    }
    public static void main(String[] args) {

        myMethod("tester", 24);
    }*/


    // non static method:
    void myMethod(String name, int age)
    {
        System.out.println(name +" " + age);
    }

    public static void main(String[] args) {
        MethodParameters object1=new MethodParameters();

        object1.myMethod("abhi",18 );
    }




}
