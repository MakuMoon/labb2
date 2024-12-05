package org.example;

import javax.swing.plaf.metal.MetalIconFactory;
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

    public void moveToFloor(int floor) throws InterruptedException {
        openDoors();


        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor nr: \n");
        floor = scanner.nextInt();

        closeDoors();

        this.currentFloor = floor;
        inTransit = true;
        System.out.print("\nTravelling");
         for (int i = 0; i < floor; i++) {
             System.out.print(".");
             Thread.sleep(500);

         }

         System.out.println("\nArrived");
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
        elevator.moveToFloor(4);
    }
}
