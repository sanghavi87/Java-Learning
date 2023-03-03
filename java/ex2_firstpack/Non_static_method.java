package ex2_firstpack;

public class Non_static_method {

    // Non static method example:-
    void myMethod()          // for non static method you don't need to use word static and it's always create outside of main method
    {
        System.out.println("my first normal/non-static method");
        System.out.println("a + b= 10");
    }
    public static void main(String[] args) {

       Non_static_method print= new Non_static_method();   //for non static method ,you always need to create object

        print.myMethod();







    }
}
