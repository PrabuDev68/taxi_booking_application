package org.example.controller;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import org.example.repository.BookingRepository;
import org.example.service.BookingService;
import org.example.service.implementation.BookingServiceImpl;

import java.util.Scanner;

import static java.lang.System.exit;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int noOfTaxi;
        BookingService bookingService =  new BookingServiceImpl();
        System.out.println("***************************************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("                                   Taxi Booking Application              ");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Taxi");
        noOfTaxi = sc.nextInt();
        bookingService.setTaxi(noOfTaxi);

        while(true)
        {

            description();
            System.out.println();
            System.out.println("Enter your choice");
            int choice;
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    bookingService.bookTaxi();
                    break;
                }

                case 2:
                {
                    bookingService.displayTaxiDetails();
                    break;
                }

                case 3:
                {
                    System.out.println("***************************************************************************************************");
                    System.out.println();
                    System.out.println();
                    System.out.println("                                   Have a safe Ride              ");
                    System.out.println();
                    System.out.println();
                    System.out.println("***************************************************************************************************");
                    return;
                }
            }

        }





    }
    private static void description() {
        System.out.println();
        System.out.println("1.Book a Taxi");
        System.out.println("2.Display Taxi Details");
        System.out.println("3.Exit");
    }
}