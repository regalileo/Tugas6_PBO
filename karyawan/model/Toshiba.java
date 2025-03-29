package karyawan.model;

public class Toshiba {
    private int volume;

    public Toshiba() {
        this.volume = 50; // Default volume
    }

    public void turnOn() {
        System.out.println("Toshiba Laptop is ON");
    }

    public void turnOff() {
        System.out.println("Toshiba Laptop is OFF");
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
            System.out.println("Toshiba Volume: " + volume);
        } else {
            System.out.println("Volume is already at maximum!");
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("Toshiba Volume: " + volume);
        } else {
            System.out.println("Volume is already at minimum!");
        }
    }
}