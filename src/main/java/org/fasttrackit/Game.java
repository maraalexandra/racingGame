package org.fasttrackit;

import java.util.Scanner;

public class Game {

    private Track[] tracks = new Track[3];



    public void start(){
        System.out.println("WELCOME!");

         int playerCount = getPlayerCountfromUser();

         InitializeTracks();
         displayTracks();

         Track selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track: " + selectedTrack.getName());
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

       private Track getSelectedTrackFromUser(){
           System.out.println("Please select a track:");
           Scanner scanner = new Scanner(System.in);
          int trackNumber =  scanner.nextInt();
          return tracks[trackNumber - 1];
       }


    private String getVehicleNameFromUser() {

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
         return scanner.nextLine();
    }

    private int getPlayerCountfromUser(){
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}