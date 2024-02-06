package com.tns.assign2_1;

import java.util.Scanner;

public class VelanResortBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        Booking booking = new Booking(input);

        int totalCost = booking.calculateTotalCost();

        if (totalCost == -1) {
            System.out.println("Invalid input for number of adults");
        } else if (totalCost == -2) {
            System.out.println("Invalid input for number of children");
        } else if (totalCost == -3) {
            System.out.println("Invalid input for number of days");
        } else {
            System.out.println(booking.getCustomerName() + " your booking is confirmed and the total cost is " + totalCost);
        }
    }
}