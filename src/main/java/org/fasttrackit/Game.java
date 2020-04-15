package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        System.out.println("WELCOME!");



        InitializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track: " + selectedTrack.getName());


        initializeCompetitors();

        playOneRound();
    }
    private void playOneRound() {
        System.out.println("New Round");
        for (Vehicle vehicle : competitors) {

            System.out.println("It's " + vehicle.getName() + "'s turn");
            double speed = getAccelerationSpeedFormUser();
            vehicle.accelerate(speed);
        }
    }
      private void initializeCompetitors(){
          int playerCount = getPlayerCountFromUser();
          for (int i = 0; i < playerCount; i++);{
              int i = 0;
              System.out.println("Creating vehicle for player " + (i + 1));
              String name = getVehicleNameFromUser();

              Vehicle vehicle = new Vehicle();
              vehicle.setName(name);
              vehicle.setFuelLevel(80);
              vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5,15));
              vehicle.setMaxSpeed(260);

            competitors.add(vehicle);

          }

      }


    private void InitializeTracks(){
      Track track1 = new Track();
      track1.setName("Imola");
      track1.setLenght(3500);

      tracks[0] = track1;

      Track track2 = new Track();
      track2.setName("Suzuka");
      track2.setLenght(4100);

      tracks[1] = track2;

    }

    public void displayTracks() {

        System.out.println("Available Tracks: ");

        //classic for Loop
        for (int i = 0; i < tracks.length; i++) {

            if (tracks[i] != null) {

                System.out.println((i+ 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLenght());

            }
        }

    }

       private Track getSelectedTrackFromUser() throws Exception {
           System.out.println("Please select a track:");

           try {
               Scanner scanner = new Scanner(System.in);
               int trackNumber = scanner.nextInt();
               return tracks[trackNumber - 1];
           }catch(InputMismatchException e){
               throw new Exception("Please enter a number");
           }catch (ArrayIndexOutOfBoundsException e){
               throw new RuntimeException("You have entered a wrong number.");
           }finally {
               System.out.println("Finally block always executed");
           }

    }



    private String getVehicleNameFromUser() {

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
         return scanner.nextLine();
    }

    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private double getAccelerationSpeedFormUser(){
        System.out.println("Please enter speed");
        Scanner scanner = new Scanner (System.in);

        try {
            return scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("You have entered an invalid value. Please try again");
            return getAccelerationSpeedFormUser();
        }
    }

}