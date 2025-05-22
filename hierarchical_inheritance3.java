class Vehicle {
    public void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    public void wheel() {
        System.out.println("4 wheels in the car...");
    }
}

class Bike extends Vehicle {
    public void wheel1() {
        System.out.println("2 wheels in the bike...");
    }
}

public class hierarchical_inheritance3 {
    public static void main(String[] args) {
        Car c = new Car();
        c.wheel();
        c.move();

        Bike b = new Bike();
        b.wheel1();
        b.move();
    }
}