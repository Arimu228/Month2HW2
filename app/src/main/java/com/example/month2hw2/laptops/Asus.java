package com.example.month2hw2.laptops;

import com.example.month2hw2.Laptop;

public class Asus extends Laptop {


    public Asus(String processor, String videoCard, String sizeOfScreen) {
        super(processor, videoCard, sizeOfScreen);
    }

    @Override
    public void print() {
        System.out.println(getInfo());
    }


    public String getInfo() {
        return "Size of Screen: " + getSizeOfScreen() +
                "\nprocessor: " + getProcessor() +
                "\n Video Card: " + getVideoCard();
    }


}
