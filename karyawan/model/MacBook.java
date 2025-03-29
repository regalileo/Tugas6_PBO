package karyawan.model;

public class MacBook {
    private int volume;

    public MacBook() {
        this.volume = 50; // Default volume
    }

    public void turnOn() {
        System.out.println("MacBook Laptop is ON");
    }

    public void turnOff() {
        System.out.println("MacBook Laptop is OFF");
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
            System.out.println("MacBook Volume: " + volume);
        } else {
            System.out.println("Volume is already at maximum!");
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("MacBook Volume: " + volume);
        } else {
            System.out.println("Volume is already at minimum!");
        }
    }
}