package karyawan.main;

import karyawan.model.Manajer;
import karyawan.model.Karyawan;
import karyawan.model.Laptop;
import karyawan.model.Toshiba;
import karyawan.model.MacBook;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Perbaiki argumen konstruktor Manajer
        Manajer manajer = new Manajer("M001", "Yulhan Wahyudin", 10000000, 5000000, 2000000);

        // Pastikan argumen konstruktor Karyawan sesuai dengan definisi kelas Karyawan
        Karyawan karyawan = new Karyawan("K001", "Avantika Rinjani", 5000000, 10, 50000);

        // Cetak slip gaji
        manajer.cetakSlipGaji();
        karyawan.cetakSlipGaji();

        // Tambahkan menu untuk Toshiba dan MacBook
        Scanner scanner = new Scanner(System.in);
        Laptop laptop; // Ubah tipe menjadi Laptop

        System.out.println("\nChoose a laptop: 1. Toshiba  2. MacBook");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            laptop = new Toshiba();
        } else if (choice == 2) {
            laptop = new MacBook();
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        handleLaptop(laptop, scanner);
        scanner.close();
    }

    private static void handleLaptop(Laptop laptop, Scanner scanner) {
        while (true) {
            System.out.println("\nEnter command (ON, OFF, UP, DOWN, EXIT):");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    laptop.turnOn();
                    break;
                case "OFF":
                    laptop.turnOff();
                    return; // Exit loop after turning off
                case "UP":
                    laptop.volumeUp();
                    break;
                case "DOWN":
                    laptop.volumeDown();
                    break;
                case "EXIT":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}