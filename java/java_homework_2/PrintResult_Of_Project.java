package java_homework_2;

//we are calling here all our child classes into main method to print the data by using the concept of Inheritance and Polymorphism

public class PrintResult_Of_Project {
    public static void main(String[] args)
    {

 // Now call child-1 class (Barclays bank) all methods :-
 //------------------------------------------------------------
   BarclaysBank obj1=new BarclaysBank();               //create object for child class-1

      obj1.method1("Welcome to Barclays Bank");         //called method-1 from parent class (bank of england)
      obj1.method2("Open Current Account");         //called method-2 from parent class (bank of england)
      obj1.method3(6.5);                            //called method-3 from parent class (bank of england)
      System.out.println(obj1.OverdraftCharge());       //called method (overdraft charge) from parent class (BOE)
      obj1.barclaysFacility();                           // we called here child-1 class own method here






 // Now call child-2 class (Santander bank) all methods :-
 //------------------------------------------------------------
    SantanderBank obj2= new SantanderBank();        //create object for child class-2

    obj2.method1("Welcome to Santander Bank");     //called grandfater method (BOE)
    obj2.method2("Open Saving Account");               //called grand father method (BOE)
    System.out.println(obj2.OverdraftCharge());                  //called grand father method (BOE)
    obj2.method3("Our Today's Interest Rate is: ", 7.5);   //called own class method- overloading method we have called here
    obj2.barclaysFacility();                                      //called here father method







// Now call child-3 class (HSBC bank) all methods :-
//------------------------------------------------------------
    HSBCbank obj3= new HSBCbank();           //Create object for child class-3

    obj3.method1("Welcome to HSBC Bank");         //called father method (BOE)
    obj3.method2("Open Current & Saving Account");    //called father method (BOE)
    obj3.method3(5.2);                                     //called father method (BOE)


    System.out.println(obj3.OverdraftCharge());  //called father method (BOE)- but here actual overdraft rate is 21.39 but we have get here in result 10.6
                                                //that's only because we have use the "Overriding concept"






    }
}
