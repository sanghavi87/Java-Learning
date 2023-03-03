package ex2_firstpack;

public class Static_Method {

  // static method example:-

    static void myMethod()        //static method always created outside of main method and this is called static method
    {
        System.out.println("my first static method");
        System.out.println("x + y = 20");
    }

    public static void main(String[] args) {

      myMethod();             // for static method you don't need to create object



    }
}
