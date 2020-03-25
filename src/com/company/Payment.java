package com.company;

public class Payment {
    public void getBill(Ipay pay, int price) {
        int finish = pay.getPrice(price);
        System.out.println("to pay: " + finish + "€");

    }
}
