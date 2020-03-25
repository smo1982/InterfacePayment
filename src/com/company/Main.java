package com.company;

public class Main {

    public static void main(String[] args) {
	Cash cash = new Cash();
	Creditcard creditcard = new Creditcard();
	Bankcard bankcard = new Bankcard();
	Bill bill = new Bill();
	Payment pay = new Payment();

	int price = 100;

	pay.getBill(cash, price);
	pay.getBill(creditcard, price);
	pay.getBill(bankcard, price);
	pay.getBill(bill, price);

    }
}
