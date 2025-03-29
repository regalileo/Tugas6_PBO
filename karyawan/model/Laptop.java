package karyawan.model;

import karyawan.service.LaptopService;

public abstract class Laptop implements LaptopService {
    protected int volume;

    public Laptop() {
        this.volume = 50; // Default volume
    }

    @Override
    public void volumeUp() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume is already at maximum!");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume is already at minimum!");
        }
    }
}