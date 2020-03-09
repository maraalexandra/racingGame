package org.fasttrackit;

public class Vehicle {

    // instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String color;
    double fuelLevel;
    double totalDistance;
    boolean damaged;

    public double accelerate(double speed, double durationInHours)  {

        if (fuelLevel <= 0 )  {

            System.out.println("Not enough fuel.");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Max speed exceded!");
            return 0;

        } else if (speed == maxSpeed) {
            System.out.println("Be careful! Max speed reached!");

        } else {
            System.out.println("Valid speed entered!");
        }

        //todo: use more fuel if speed > 120

        System.out.println(name + "is accelerating with " + speed + "km/h for" + durationInHours + "h");

        //local variable
        double traveledDistance = speed * durationInHours;
        System.out.println("Traveled distance: " + traveledDistance);

        totalDistance += traveledDistance;
        System.out.println("Total traveled distance: " + totalDistance);


        double usedFuel = traveledDistance * mileage / 100;

        fuelLevel = fuelLevel - usedFuel;
        //same result as the instruction above
 //       fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return traveledDistance;
    }

    public void decelerate()  {

        System.out.println("This is just a demo method");

    }
}
