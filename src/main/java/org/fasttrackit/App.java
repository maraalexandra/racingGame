package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        Game game = new Game();
        game.start();

         //String pool
//         String a = "test";
//         String b = "test";
//         String c = new String("test");
//
//        System.out.println(a==b);
//        System.out.println(a.equals(c));


//        // method implementation taken from object's class, not from variable's class
//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//
//        cheater.accelerate(60,1);
//
//        System.out.println("Total distance: " + cheater.getTotalDistance());
//
//
//        //variable type decides what method can be invoked
//        //TYPE CASTING
//        ((CheatingVehicle) cheater).fly();
//
//
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalVehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.totalVehicleCount = 2;
//
//        System.out.println("Total count from vehicle1: " + vehicle1.totalVehicleCount);
//        System.out.println("Total count from vehicle2: " + vehicle2.totalVehicleCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalVehicleCount);
//
//
//
//       new Autovehicle(new Engine());
//
//        System.out.println("Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String vehicleName = scanner.nextLine();
//
//        System.out.println("Entered name: " + vehicleName);
//
//        {
//
//            System.out.println("Welcome to the racing game!");
//
//            Engine engine1 = new Engine();
//            engine1.manufacturer = "Vw";
//            engine1.capacity = 2000;
//
//
//            Car carReference = new Car(engine1);
//            carReference.setName("Audi");
//            carReference.setColor("red");
//            carReference.setMaxSpeed(260);
//            carReference.setMileage(6.2);
//            carReference.setFuelLevel(100);
//            carReference.setDamaged(true);
//
//            System.out.println(carReference);
//
//            System.out.println("Name: " + carReference.getName());
//
////        carReference.engine = new Engine();
////        carReference.engine.manufacturer "VW";
////        carReference.engine.capacity = 2000;
//
//
//
//            double currentDistance = carReference.accelerate(60, 1);
//            System.out.println("Current distance: " + currentDistance);
//
//            Mechanic mechanic = new Mechanic();
//            mechanic.repair(carReference);

//            System.out.println("Is car damaged?" + carReference.isDamaged());
//
//            System.out.println("Engine details: ");
//            System.out.println(engine1.capacity);
//            System.out.println(carReference.engine.capacity);
//
//            engine1.capacity = 2100;
//
//            System.out.println("Updated engine details: ");
//            System.out.println(engine1.capacity);
//            System.out.println(carReference.engine.capacity);
//
//
//            // concatenation
//
//            System.out.println("Properties of " + carReference.name);
//            System.out.println("Color: " + carReference.getColor());
//            System.out.println("max speed: " + carReference.getMaxSpeed());
//            System.out.println("milleage: " + carReference.getMileage());
//            System.out.println("Fuel level" + carReference.getFuelLevel());
//            System.out.println("Racing number" + carReference.getRacingNumber());
//            System.out.println("Damaged: " + carReference.damaged);
//
//            Car car2 = new Car(new Engine());
//            car2.name = "Lamborghini";
//            car2.damaged = true;
//
//            System.out.println("Properties of " + car2.name);
//            System.out.println("Damaged: " + car2.damaged);
//            System.out.println("Color: " + car2.getColor());
//
//            //modulo operator// restul impartirii
////        System.out.println(4 % 2 == 0);
////        System.out.println(4 % 2 );
////        System.out.println(4 % 3);
        }


    }

