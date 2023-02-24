package homeexercise;

import java.util.Scanner;
public class Scanner_user_input {
    public static void  main (String []args){

        //how scanner can accept some user input in console window in java

        Scanner scanner= new Scanner(System.in); // this step is very important to use scanner

        System.out.println("What is your name?");
        String name= scanner.nextLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("What is your favorite food?");
        String food= scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("you are "+age+" year old");
        System.out.println("You like "+food);







    }
}
