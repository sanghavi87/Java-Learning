package java_homework_1;

public class If_Else_QA {
    public static void main(String[] args) {


        //QA-1. Write a program to check if a candidate is eligible for voting or not. (Hint:
        //Check age)

        int person_A_age= 14;
        int person_B_age= 20;

        if(person_A_age>=18)                                          //here "else" statement will print because "if" condition is false
        {
            System.out.println("Person A is eligible for vote");
        }
        else
        {
            System.out.println("Person A is not eligible for vote");
        }

        if(person_B_age>=18)                                          // here "if" statement will print because condition is true
        {
            System.out.println("Person B is eligible for vote");
        }
        else
        {
            System.out.println("Person B is not eligible for vote");
        }


    //----------------------------------------------------------------------------------------------------------------------------------


        //QA-2. Write a program to check if the number is positive or negative.

        int a= -5;                   //check by changing "a" value with different no. positive & negative-you will get the result according to condition meet

        if(a>0)
        {
            System.out.println("A is: Positive Number");
        }
        else
        {
            System.out.println("A is: Negative Number");
        }


    //-------------------------------------------------------------------------------------------------------------------------------------------


       // QA-3. Extend the previous program to check whether the given number is positive,
        //zero or negative. (Hint: use if-else conditions)

        int b=0;                //check by changing "b" value with different no. positive or negative or zero -you will get the result according to condition meet

        if(b>0)
        {
            System.out.println("B is: Positive Number");
        }
        else if(b<0)
        {
            System.out.println("B is: Negative Number");
        }
        else
        {
            System.out.println("B is: Zero Number");
        }


    //-----------------------------------------------------------------------------------------------------------------------------------------

       //QA-4. Write a program to check given number is even or odd.
        //(Hint: use % operator)

        int c=17;                       //keep change "c" value - you will get result according to condition

        if(c %2==0)                    //any no. divided by 2 = non fraction no. (10/2 =5) so 10 is Even no. // when any no. divided by 2= fraction no. (5/2= 2.5) so 5 is Odd number
        {
            System.out.println("C is: Even Number");
        }
        else
        {
            System.out.println("C is: Odd Number");
        }





















    }
}
