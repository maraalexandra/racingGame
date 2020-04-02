package org.fasttrackit;

public class CheatingVehicle extends Vehicle {

    public static final String TYPE = "CHEATER";

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + "is accelerating with " + speed + " for " + durationInHours + " h");

        double distance = 2 * speed * durationInHours;

        setTotalDistance((int) (getTotalDistance() + distance));

        System.out.println("Cheater!!!");
        return distance;

    }
       //access can be more permissive than in super-class
    public CheatingVehicle clone() {

        return new CheatingVehicle();

    }

    public void fly(){

        System.out.println("Flying!");

    }
}
