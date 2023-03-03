package ex2_firstpack;

import java.sql.SQLOutput;

public class MethodOverloading {

    static int myMethod(int x, int y)
    {
       return x+y;

    }

    static double myMethod(double x, double y)
    {
    return x + y;
    }

    public static void main(String[] args) {

       int total= myMethod(12,20);
        System.out.println(total);

       double result= myMethod(2.5, 3.5);
        System.out.println(result);





    }
}
