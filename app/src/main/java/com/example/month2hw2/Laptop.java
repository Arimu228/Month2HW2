package com.example.month2hw2;

public abstract class Laptop implements Printable {
    public Laptop(String processor, String videoCard, String sizeOfScreen) {
        this.processor = processor;
        this.videoCard = videoCard;
        this.sizeOfScreen = sizeOfScreen;
    }


    public String getProcessor() {
        return processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getSizeOfScreen() {
        return sizeOfScreen;
    }

    private String processor;
    private String videoCard;
    private String sizeOfScreen;

}
