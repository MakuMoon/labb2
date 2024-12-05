package org.example.person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    String firstName;
    String lastName;
    String dateOfBirth;
    double height;
    double weight;

    public Person(String firstName, String lastName, String dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public static String getName(Person p) {
        return p.firstName + " " + p.lastName;
    }

    public static int getAge(Person p) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String todaysDate = dtf.format(LocalDate.now());
        LocalDate personsDOB = LocalDate.parse(p.dateOfBirth);
        LocalDate today = LocalDate.parse(todaysDate);
        int year1 = personsDOB.getYear();
        int year2 = today.getYear();
        int age = Math.abs(year1 - year2);

        if (personsDOB.getDayOfYear() > today.getDayOfYear() ) {
            age -= 1;
        }
        return age;
    }

    public static void main(String[] args) throws InterruptedException {
        Person p = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        System.out.println(getAge(p));
        System.out.println(getName(p));
        System.out.println("pt2");

        for (int i = 0; i <1000000000; i++) {
            Person p1 = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        }
        for (int i = 0; i <1000000000; i++) {
            Person p1 = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        }
        for (int i = 0; i <1000000000; i++) {
            Person p1 = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        }
        for (int i = 0; i <1000000000; i++) {
            Person p1 = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        }
        for (int i = 0; i <1000000000; i++) {
            Person p1 = new Person("Adam", "Frank", "1996-02-22", 189, 90);
        }
        Thread.sleep(10000);

    }
}
