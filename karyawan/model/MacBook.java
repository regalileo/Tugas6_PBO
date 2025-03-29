package karyawan.model;

public class MacBook extends Laptop {
    @Override
    public void turnOn() {
        System.out.println("MacBook Laptop is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("MacBook Laptop is OFF");
    }
}