
/*Problem Statement: Travel Ticket Booking & Fare Processing System

Design a Java Program that simulates a travel ticket booking system. the program must validates passengeer details, calculate fare dynamically, apply */
import java.util.Scanner;

public class Problem20Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Id:");
        int passengerId = sc.nextInt();
        System.out.println("Enter Passenger Name:");
        String name = sc.next();
        System.out.println("Enter Passenger Age:");
        int age = sc.nextInt();
        if (age < 5) {
            System.out.println("Free Ticket - No Fare Applicable");
            return;
        }
        if (age > 80) {
            System.out.println("Medical Clearance Required");
            return;
        }
        System.out.println("Enter Travel Type: \n1. Bus \n2. Train \n3. Flight");
        int travelType = sc.nextInt(); // 1-Bus 2- Train 3-Flight
        System.out.println("Enter Base Fare:");
        double baseFare = sc.nextDouble();
        System.out.println("Is the Passenger a Government Employee? (true/false):");
        boolean isGovernmentEmployee = sc.nextBoolean();
        int reservationClass1 = 0, reservationClass2 = 0, reservationClass3 = 0;
        String reservationClassName = "";
        String travelTypeName = "";
        switch (travelType) {
            case 1:
                travelTypeName = "Bus";
                System.out.println("Please Select Class :\n 1.Sleeper \n2. Seater");
                reservationClass1 = sc.nextInt();
                if(reservationClass1 == 1){
                    reservationClassName = "Sleeper";
                }else if(reservationClass1 == 2){ 
                    reservationClassName = "Seater";
                }else{
                    System.out.println("Invalid Class Choice for Bus");
                    return;
                }
                break;
            case 2:
                travelTypeName = "Train";
                System.out.println("Please Select Class :\n 1. General \n2. Sleepers \n3. AC");
                reservationClass2 = sc.nextInt();
                if(reservationClass2 == 1){
                    reservationClassName = "General";
                }else if(reservationClass2 == 2){
                    reservationClassName = "Sleepers";
                }else if(reservationClass2 == 3){
                    reservationClassName = "AC";
                }else{
                    System.out.println("Invalid Class Choice for Train");
                    return;
                }
        
                break;
            case 3:
                travelTypeName = "Flight";
                reservationClassName = "Flight";
                System.out.println("Please Select Class :\n 1. Economy \n2. Business");
                reservationClass3 = sc.nextInt();
                if(reservationClass3 == 1){
                    reservationClassName = "Economy";
                }else if(reservationClass3 == 2){
                    reservationClassName = "Business";
                }else{
                    System.out.println("Invalid Class Choice for Flight");
                    return;
                }

                break;
        }
        double fareAfterClassMultiplier = 0.0;
        //Fare multiplier calculation
        if (travelType == 1) {
            if (reservationClass1 == 1) {
                fareAfterClassMultiplier = baseFare * 1.2;
            } else if (reservationClass1 == 2) {
                fareAfterClassMultiplier = baseFare * 1.0;
            } else {
                System.out.println("Invalid Class Choice for Bus");
                return;
            }
        } else if (travelType == 2) {
            if (reservationClass2 == 1) {
                fareAfterClassMultiplier = baseFare * 1.0;
            } else if (reservationClass2 == 2) {
                fareAfterClassMultiplier = baseFare * 1.3;
            } else if (reservationClass2 == 3) {
                fareAfterClassMultiplier = baseFare * 1.6;
            } else {
                System.out.println("Invalid Class Choice for Train");
                return;
            }
        } else if (travelType == 3) {
            if (reservationClass3 == 1) {
                fareAfterClassMultiplier = baseFare * 2.5;
            } else if (reservationClass3 == 2) {
                fareAfterClassMultiplier = baseFare * 3.5;
            } else {
                System.out.println("Invalid Class Choice for Flight");
                return;
            }
        } else {
            System.out.println("Invalid Travel Type");
            return;
        }

        //Discount Calculation
        double finalFare=0.0;

        if (age >= 60) {
            finalFare = fareAfterClassMultiplier * 0.7; //30% discount
        } else if (isGovernmentEmployee) {
            finalFare = fareAfterClassMultiplier * 0.85; //15% discount
        } else if (age >= 5 && age <= 12) {
            finalFare = fareAfterClassMultiplier * 0.5; //50% discount      }
        }else{
            finalFare = fareAfterClassMultiplier;
        }

        //Booking Status Determination
        if(finalFare >= 10000){
            if(travelType == 3){
                System.out.println("Booking Confirmed with Premium Services");
            }else{  
                System.out.println("Waiting List");
            }
        }else{
            System.out.println("Booking Confirmed");
        }

        //Ticket Summary
        System.out.println("Ticket Summary:");
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Name: " + name);
        //TravelType
        System.out.println("Travel Type: " + travelTypeName);
        //class
        System.out.println("Class: " + reservationClassName);

        //BaseFare
        System.out.println("Base Fare: " + baseFare);
        //Final Fare
        System.out.println("Final fare " + finalFare);
        System.out.println("Age: " + age);
        System.out.println("Final Fare: " + finalFare);
        //Discount applied
        if (age >= 60) {
            System.out.println("Discount Applied: Senior Citizen Discount (30%)");
        } else if (isGovernmentEmployee) {
            System.out.println("Discount Applied: Government Employee Discount (15%)");
        } else if (age >= 5 && age <= 12) {
            System.out.println("Discount Applied: Child Discount (50%)");
        } else {
            System.out.println("No Discount Applied");
        }

        //Booking Status
        if(finalFare >= 10000){
            if(travelType == 3){
                System.out.println("Booking Status: Confirmed with Premium Services");
            }else{  
                System.out.println("Booking Status: Waiting List");
            }
        }else{
            System.out.println("Booking Status: Confirmed");
        }
        
    }
}