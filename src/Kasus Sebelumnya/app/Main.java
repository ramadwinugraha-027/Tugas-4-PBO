package app;

import model.Barang;
import model.BarangElektronik;
import model.BarangNonElektronik;
import model.Lokasi;
import model.PencatatanInventaris;

public class Main {
    public static void main(String[] args) {
        Barang B1 = new Barang("B35", "Buku", "Baik");
        Barang B2 = new Barang("B55", "Kabel", "Rusak");

        Lokasi L1 = new Lokasi("025", "Lembang");
        Lokasi L2 = new Lokasi("046", "Parongpong");

        PencatatanInventaris P1 = new PencatatanInventaris(1, B1, L1);
        PencatatanInventaris P2 = new PencatatanInventaris(2, B2, L2);

        System.out.println("Pencatatan inventaris barang");
        System.out.println("Kode Catat: " + P1.getKodePencatatan());
        System.out.println("Nama Barang: " + P1.getPencatatBarang().getNamaBarang());
        System.out.println("Lokasi: " + P1.getPencatatLokasi().getnamaLokasi());

        System.out.println("Pencatatan awal dari barang Inventaris");
        System.out.println("Kode Catat: " + P1.getKodePencatatan());
        System.out.println("Nama Barang: " + P1.getPencatatBarang().getNamaBarang());
        System.out.println("Kondisi : " + P1.getPencatatBarang().getKondisi());
        System.out.println("Lokasi : " + P1.getPencatatLokasi().getnamaLokasi());

        System.out.println("Kode Catat : " + P2.getKodePencatatan());
        System.out.println("Nama Barang: " + P2.getPencatatBarang().getNamaBarang());
        System.out.println("Kondisi Awal: " + P2.getPencatatBarang().getKondisi());
        System.out.println("Lokasi: " + P2.getPencatatLokasi().getnamaLokasi());

        B2.perbaiki();

        System.out.println("sesudah barang diganti");
        System.out.println("Nama Barang: " + P2.getPencatatBarang().getNamaBarang());
        System.out.println("Kondisi Terbaru: " + P2.getPencatatBarang().getKondisi());

        BarangElektronik BE1 = new BarangElektronik("E01", "Laptop ASUS", "Baik", 24);
        BarangNonElektronik BNE1 = new BarangNonElektronik("NE1", "Meja Kayu", "Rusak", "Jati");

        Lokasi L3 = new Lokasi("088", "Cisarua");
        Lokasi L4 = new Lokasi("099", "Parongpong");

        PencatatanInventaris P3 = new PencatatanInventaris(3, BE1, L3);
        PencatatanInventaris P4 = new PencatatanInventaris(4, BNE1, L4);

        System.out.println("Pencatatan Subclass Barang");
        System.out.println("Kode Catat: " + P3.getKodePencatatan());
        System.out.println("Detail Barang: " + P3.getPencatatBarang().getDetail());
        System.out.println("Lokasi: " + P3.getPencatatLokasi().getnamaLokasi());

        System.out.println("Kode Catat: " + P4.getKodePencatatan());
        System.out.println("Detail Awal: " + P4.getPencatatBarang().getDetail());
        System.out.println("Lokasi: " + P4.getPencatatLokasi().getnamaLokasi());

        BNE1.perbaiki();

        System.out.println("sesudah barang non-elektronik diperbaiki");
        System.out.println("Detail Terbaru: " + P4.getPencatatBarang().getDetail());
    }
}