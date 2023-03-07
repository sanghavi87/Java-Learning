package java_homework_2;

//we are creating child class and calling here method from parent class called (Bank of England) by using the concept of Inheritance
//We are using here "Overriding Concept"

public class HSBCbank extends BankOfEngland     //create Child-3 class called (HSBC bank)
        //here child-3 have access data on parent class + own class (HSBC bank)
        //child -3 have access on total 4 Methods of parent class called (Bank of England)

    //we are using here "Overriding concept"

{
    double OverdraftCharge()
    {
        return 10.60;          //we change the rate from 21.39 to 10.60 so we are basically making change in the body.//not in the parameter
                              //so we are using here "overriding concept"
    }


}
