package ex15_inheritance;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent class Car");
        Car c = new Car();
        c.openCar();
        c.startEngine();
        c.drive();
        c.stop();
        c.lock();
        c.numbersOfWheels();
        c.speedOfVehicle();
        c.parkingCharge();

        System.out.println("Child class BMW");
        BMW b = new BMW();
        b.openCar();
        b.startEngine();
        b.drive();
        b.stop();
        b.lock();
        b.numbersOfWheels();

        System.out.println("Child class Tesla");
        Tesla t = new Tesla();
        t.openCar();
        t.startEngine();
        t.drive();
        t.stop();
        t.lock();
        t.speedOfVehicle();

        System.out.println("Child class Honda");
        Honda h = new Honda();
        h.openCar();
        h.startEngine();
        h.drive();
        h.stop();
        h.lock();
        h.parkingCharge();

        System.out.println("Child class Bike");
        Bike b1 = new Bike();
        b1.numbersOfWheels();
        b1.parkingCharge();
        b1.speedOfVehicle();
    }
}
