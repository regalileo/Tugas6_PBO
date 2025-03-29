package karyawan.model;

import java.text.DecimalFormat;

import karyawan.service.Penggajian;

public class Karyawan extends Pegawai implements Penggajian { // Perbaiki implements
    private int jamLembur;
    private double tarifLembur;

    // Constructor
    public Karyawan(String id, String nama, double gajiDasar, int jamLembur, double tarifLembur) {
        super(id, nama, gajiDasar);
        this.jamLembur = jamLembur; // Gunakan nama parameter yang konsisten
        this.tarifLembur = tarifLembur;
    }

    // Implementasi method abstract dari Pegawai
    @Override
    public double hitungGaji() {
        return gajiDasar + (jamLembur * tarifLembur);
    }

    // Implementasi method interface dari Penggajian
    public void cetakSlipGaji() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Slip Gaji Karyawan");
        tampilkanInfo();
        System.out.println("Jam Lembur : " + jamLembur + " jam");
        System.out.println("Tarif Lembur : Rp " + df.format(tarifLembur));
        System.out.println("Gaji Total : Rp " + df.format(hitungGaji()));
    }
}