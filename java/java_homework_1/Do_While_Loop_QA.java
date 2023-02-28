package java_homework_1;

public class Do_While_Loop_QA {
    public static void main(String[] args) {

//QA-1. Write a program to print 10 even numbers and 10 odd numbers.

int a= 0;   //Even Number Example

do
{
    System.out.println("A value is Even Number: "+(a));
    a+=2;
}
while(a<=20);



int b=1;   //Odd number example
do
{
    System.out.println("B value is Odd Number: "+(b));
    b+=2;
}
while(b<=20);


//------------------------------------------------------------------------------------------------------------------------------------------------

//QA-2. Write a program to generate tables of 8

int i=1;
do
{
    System.out.println("8 * "+ (i) +" = " + (8*i));
    i++;
}
while(i<=10);




    }
}
