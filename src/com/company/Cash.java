package com.company;

public class Cash implements Ipay {
    @Override
    public int getPrice(int price) {
        return price;
    }
}
