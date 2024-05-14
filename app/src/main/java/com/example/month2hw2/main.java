package com.example.month2hw2;

import android.hardware.camera2.params.BlackLevelPattern;

import com.example.month2hw2.laptops.Acer;
import com.example.month2hw2.laptops.Asus;
import com.example.month2hw2.laptops.Lenovo;

public class main {


    public static void main(String[] ars) {
        Laptop[] objects = new Laptop[3];
        objects[0] = createObject("Asus");
        objects[1] = createObject("Acer");
        objects[2] = createObject("Lenovo");

        for (Laptop obj : objects) {
            if (obj instanceof Printable) {
                ((Printable) obj).print();
            }
        }
    }

    public static Laptop createObject(String className) {
        switch (className) {
            case "Asus":
              Asus asus = new Asus("i7", "GTX2015", "28 inches");
                System.out.println(asus);
                return asus;
            case "Acer":
                Acer acer = new Acer("i3", "IrisXe", "16 inches");
                System.out.println(acer);

                return acer;
            case "Lenovo":
                Lenovo lenovo = new Lenovo("i9", "RTX4090", "14 inches");
                System.out.println(lenovo);

                return lenovo;
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }
}
