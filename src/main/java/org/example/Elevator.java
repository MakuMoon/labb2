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
        System.out.print("Enter elevator.");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor nr: \n");
        floor = scanner.nextInt();

        closeDoors();

        this.currentFloor = floor;
        inTransit = true;
        System.out.print("Travelling");
         for (int i = 0; i < floor; i++) {
             System.out.print(".");
             Thread.sleep(500);

         }

         System.out.println("\nArrived");
         openDoors();


    }

    public void openDoors() {
        doorsClosed = false;
        System.out.println("Doors open");
    }

    public void closeDoors() {
        doorsClosed = true;
        System.out.println("Doors close");
    }

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(5, 5, 5, true, true);
        elevator.moveToFloor(4);
    }
}
