package karyawan.model;

public class Toshiba extends Laptop {
    @Override
    public void turnOn() {
        System.out.println("Toshiba Laptop is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Toshiba Laptop is OFF");
    }
}