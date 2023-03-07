package java_homework_2;

//we are creating child class and calling here method from parent class called (Bank of England) by using the concept of Inheritance
//we are using "Over Loading Concept" here

public class SantanderBank  extends BarclaysBank    //Create Child-2 class called (santander bank)
// Now here child-2 (santander bank) have access data on both father (barclays) + grand father (BOE) + child -2 own data
 //so now child -2 have access on total 3 + 1 + 1 = 5 Methods

        //we are using here "Overloading concept"
{
    void method3(String name, double ROI)    //we have created new method here by using the "Overloading Concept"
                                            //as we can see method-3 actually from grand father (BOE), But we have kept the same method name but we have make change in parameter
                                         //-so basically we have used here overloading concept and this (method-3) become new method of child-2
    {
        System.out.println(name+ ROI);

    }


}
