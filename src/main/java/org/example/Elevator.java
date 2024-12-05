package org.example;

import java.util.Scanner;

public class Elevator {
    public int currentFloor;
    public int TOP_FLOOR;
    public int BOTTOM_FLOOR;
    boolean doorsClosed;
    public boolean inTransit;

    public Elevator (int currentFloor, int topFloor, int bottomFloor, boolean doorsClosed, boolean inTransit) {
        this.currentFloor = currentFloor;
        this.TOP_FLOOR = topFloor;
        this.BOTTOM_FLOOR = bottomFloor;
        this.doorsClosed = doorsClosed;
        this.inTransit = inTransit;
    }

    public void moveToFloor() throws InterruptedException {
        openDoors();

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor nr: \n");
        int floor = scanner.nextInt();

        closeDoors();

        this.currentFloor = floor;
        inTransit = true;
        System.out.print("\nTravelling\n");
         for (int i = 0; i < floor; i++) {
             System.out.println("floor nr " +(i+1));
             Thread.sleep(250);

         }

         System.out.println("Arrived");
         openDoors();


    }

    public void openDoors() throws InterruptedException {
        doorsClosed = false;
        System.out.print("Doors opening");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(250);
        }
    }

    public void closeDoors() throws InterruptedException {
        doorsClosed = true;
        System.out.print("Doors closeing");
        for (int i = 0; i < 3; i++) {
            Thread.sleep(250);
            System.out.print(".");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(5, 5, 5, true, false);
        elevator.moveToFloor();
    }
}
