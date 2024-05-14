package com.example.month2hw2.laptops;

import com.example.month2hw2.Laptop;

public class Acer extends Laptop {


    public Acer(String processor, String videoCard, String sizeOfScreen) {
        super(processor, videoCard, sizeOfScreen);
    }

    public String getInfo() {
        return "Size of Screen: " + getSizeOfScreen() +
                "\nprocessor: " + getProcessor() +
                "\n Video Card: " + getVideoCard();
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }
}
