package java_homework_2;


/* Homework - For OOPs Concept
- Write a program to implement below OOPs concept:
 -A) Class
 -B) Object
 -C) Inheritance
 -D) Polymorphism

 */

public class BankOfEngland         //Create Parent Class
{


    void method1(String welcomeMessage)             //create method1 inside the parent class
    {
        System.out.println(welcomeMessage);
    }

    void method2(String openAccount)              //create method2 inside the parent class
    {
        System.out.println(openAccount);
    }

    void method3(double ROI)                      //create method3 inside the parent class
                                                  //ROI= Rate of Interest
    {
        System.out.println("Rate Of Interest: "+ ROI);
    }

    double OverdraftCharge()                     // //create method4 called (overdraft charge) inside the parent class
    {
        return 21.39;
    }






}
