package com.company;

public class Creditcard implements Ipay {
    @Override
    public int getPrice(int price) {
        price = price + (price / 100 *3);
        return price;
    }
}
