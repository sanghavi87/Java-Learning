package ex15_inheritance;

/*
Open Car
Start Engine
Drive
Stop
Lock
 */
public class Car extends Vehicle{
    public void openCar(){
        System.out.println("Car_______________________Open the Door");
    }
    void startEngine(){
        System.out.println("Car________________________Start Engine");
    }
    void drive(){
        System.out.println("Car________________________Drive");
    }
    void stop(){
        System.out.println("Car________________________Stop");
    }
    void lock(){
        System.out.println("Car________________________Lock");
    }
}
