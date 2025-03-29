package karyawan.model;
import java.text.DecimalFormat;

public abstract class Pegawai {
    protected String nama;
    protected String id;
    protected double gajiDasar;

    //contructor
    public Pegawai(String id, String nama, double gajiDasar){
        this.id = id;
        this.nama = nama;
        this.gajiDasar = gajiDasar;
    }

    //Method untuk menampilkan informasi pegawai
    public void tampilkanInfo(){
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("ID Pegawai : " + id);
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Gaji Dasar : Rp " + df.format(gajiDasar));
    }

    //Method untuk menghitung gaji total
    public abstract double hitungGaji();
}
