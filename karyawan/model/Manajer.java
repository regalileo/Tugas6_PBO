package karyawan.model;
import java.text.DecimalFormat;

import karyawan.service.Penggajian;

public class Manajer extends Pegawai implements Penggajian {
    private double bonus;

    //constructor
    public Manajer(String id, String nama, double gajiDasar, double tunjangan, double bonus){
        super(id, nama, gajiDasar);
        this.bonus = bonus;
    }
    //implementasi method abstract dari Pegawai
    @Override
    public double hitungGaji(){
        return gajiDasar + bonus;
    }
    
    //implementasi method interface dari Penggajian
    public void cetakSlipGaji(){
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Slip Gaji Manajer");
        tampilkanInfo();
        System.out.println("Bonus : Rp " + df.format(bonus));
        System.out.println("Gaji Total : Rp " + df.format(hitungGaji()));
    }
} // Tambahkan kurung kurawal penutup ini