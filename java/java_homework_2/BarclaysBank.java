package java_homework_2;

//we are creating child class and calling here method from parent class called (Bank of England) by using the concept of Inheritance

public class BarclaysBank  extends BankOfEngland          //create child-1 class called (Barclays bank)
                                                //here child-1 have access data on parent class + own class (barclays bank)
                                                //child -1 have access on total 3 + 1 = 4 Methods
{
    void barclaysFacility()
    {
        System.out.println("We are providing online Banking Facility");
    }

}
