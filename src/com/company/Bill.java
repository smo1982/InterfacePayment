package com.company;

public class Bill implements Ipay {
    @Override
    public int getPrice(int price) {
        price = price + (price / 100 *5);
        return price;
    }
}
