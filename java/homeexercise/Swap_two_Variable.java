package homeexercise; //swap two variables

public class Swap_two_Variable {
    public static void  main (String []args){
        //how we can swap two variable to each other by using java
        //Logic 1- swap value using third variable (z)
        String x = "blue water";
        String y = "clear water";
        String z;  //We are not adding any value in Z variable

        z=x;
        x=y;
        y=z;

        System.out.println("x:"+x); //clear water
        System.out.println("y:"+y);  // blue water

        //Logic 2- swap the value without using third variable (by using + and - operators)
        int a=10;
        int b= 20;

        a= a+b; // 10+20=30
        b= a-b; // 30-20=10
        a= a-b; // 30-10=20

        System.out.println("a :"+a);  // 20
        System.out.println("b :"+b );  //10

        //Logic 3- swap the value without using third variable (by using * and / operators)
        // o and p value should not be zero in any case to use this method
        int o=10;
        int p=20;
         o= o*p; //10 * 20= 200
         p= o/p; //200 / 20= 10
         o= o/p; //200 / 10= 20

        System.out.println("O :"+o);  //20
        System.out.println("P :"+p);  //10







    }
}
