package karyawan.main;

import karyawan.model.Manajer;
import karyawan.model.Karyawan;
import karyawan.model.Toshiba;
import karyawan.model.MacBook;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer("M001", "Yulhan Wahyudin", 10000000, 5000000, 2000000);
        Karyawan karyawan = new Karyawan("K001", "Avantika Rinjani", 5000000, 10, 50000);
        manajer.cetakSlipGaji();
        karyawan.cetakSlipGaji();

        // Tambahan menu untuk Toshiba dan MacBook
        Scanner scanner = new Scanner(System.in);
        Toshiba toshiba = new Toshiba();
        MacBook macBook = new MacBook();

        System.out.println("Choose a laptop: 1. Toshiba  2. MacBook");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.println("You selected Toshiba.");
            handleLaptop(toshiba, scanner);
        } else if (choice == 2) {
            System.out.println("You selected MacBook.");
            handleLaptop(macBook, scanner);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    private static void handleLaptop(Object laptop, Scanner scanner) {
        while (true) {
            System.out.println("Enter command (ON, OFF, UP, DOWN, EXIT):");
            String command = scanner.nextLine().toUpperCase();

            if (command.equals("ON")) {
                if (laptop instanceof Toshiba) {
                    ((Toshiba) laptop).turnOn();
                } else if (laptop instanceof MacBook) {
                    ((MacBook) laptop).turnOn();
                }
            } else if (command.equals("OFF")) {
                if (laptop instanceof Toshiba) {
                    ((Toshiba) laptop).turnOff();
                } else if (laptop instanceof MacBook) {
                    ((MacBook) laptop).turnOff();
                }
                break; // Exit loop after turning off
            } else if (command.equals("UP")) {
                if (laptop instanceof Toshiba) {
                    ((Toshiba) laptop).volumeUp();
                } else if (laptop instanceof MacBook) {
                    ((MacBook) laptop).volumeUp();
                }
            } else if (command.equals("DOWN")) {
                if (laptop instanceof Toshiba) {
                    ((Toshiba) laptop).volumeDown();
                } else if (laptop instanceof MacBook) {
                    ((MacBook) laptop).volumeDown();
                }
            } else if (command.equals("EXIT")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
    }
}