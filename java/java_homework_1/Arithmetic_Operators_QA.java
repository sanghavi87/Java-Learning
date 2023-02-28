package java_homework_1;

public class Arithmetic_Operators_QA {
    public static void main(String[] args) {

 //QA-5. Write programs to use all the data types
 //and given arithmetic operations.

        // Arithmetic operators:- + - * / ++  --

        int a= 20, b=10;

        System.out.println("Sum of a and b is: "+(a+b));
        System.out.println("Diff. of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));


        int i= 10;
        System.out.println("I value is now: "+(i++)); // i= 10 so in next statement i value become 10+1= 11
        System.out.println("I value is now: "+(i++)); //now i= 11 so in next statement value will be 11+1=12

        System.out.println("I value is now: "+(++i)); //so i value become= 13 because initial i=12 and increment(++i) will apply first in initial value so 1+12=13
        System.out.println("I value is now: "+(++i));  //i= 1+13=14


        int p= 20;
        System.out.println("P value is now: "+(p--)); // p=20 and in next statement p value become 20-1= 19
        System.out.println("P value is now: "+(p--)); // now p value become = 19 and in next statement will go down by 1


        System.out.println("P value is now: "+(--p)); //so p=18 from previous statement now p=-1+18 =17
        System.out.printf("P value is now: "+(--p));  //so p=17 now so new value for p is= -1+17=16








    }
}
