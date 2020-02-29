package org.fasttrackit;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to the racing game!");

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

        // concatenation

        System.out.println("Properties of " + carReference.name );
        System.out.println("Color: " + carReference.color);
        System.out.println("max speed: " + carReference.maxSpeed);
        System.out.println("milleage: " + carReference.mileage);
        System.out.println("Fuel level" + carReference.fuelLevel);
        System.out.println("Racing number" + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        Car car2 = new Car();
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Color: " + car2.color);









}


}

