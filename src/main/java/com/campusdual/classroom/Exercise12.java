package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        Car miCoche = new Car("Seat","Leon","100");
        miCoche.start();
        miCoche.accelerate();
        miCoche.turnAngleOfWheels(25);
        miCoche.accelerate();
        miCoche.turnAngleOfWheels(30);
        miCoche.setReverse(true);
        miCoche.brake();
        miCoche.setReverse(true);
        miCoche.accelerate();
    }

}