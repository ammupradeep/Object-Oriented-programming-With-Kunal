package com.OOProgramming.Enumerations;

public class Basic {


    enum Week implements A{
        Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // Week is the type
        // by default public ,static and final
        // enum constants
        // can't create child classes


        // Print for all objects inside the week
        Week() {
            System.out.println("Constructor for " + this);
        }

        // this is not public ,protected only private or default
        // why ?
        // this is not the enum concept.

        @Override
        public void hello() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Saturday;
        System.out.println(Week.valueOf("Sunday"));
        week.hello();

//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week);
//        System.out.println(week.ordinal()); // indexOf actually
    }
}
