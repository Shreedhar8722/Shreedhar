package com.tns.assign2_1;

class Booking {
    private String customerName;
    private int numAdults;
    private int numChildren;
    private int numDays;

    public Booking(String details) {
        String[] tokens = details.split(":");
        this.customerName = tokens[0];
        this.numAdults = Integer.parseInt(tokens[1]);
        this.numChildren = Integer.parseInt(tokens[2]);
        this.numDays = Integer.parseInt(tokens[3]);
    }

    public String getCustomerName() {
        return customerName;
    }

    public int calculateTotalCost() {
        if (numAdults < 0) {
            return -1;
        }
        if (numChildren < 0) {
            return -2;
        }
        if (numDays <= 0) {
            return -3;
        }

        int adultCost = numAdults * 1000;
        int childCost = numChildren * 650;
        return (adultCost + childCost) * numDays;
    }
}
