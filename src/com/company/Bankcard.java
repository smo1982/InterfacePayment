package com.company;

public class Bankcard implements Ipay {
    @Override
    public int getPrice(int price) {
        price = price + (price / 100 *1);
        return price;
    }
}
