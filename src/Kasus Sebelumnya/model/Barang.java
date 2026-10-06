package model;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String kondisi;

    public Barang(String kodeBarang, String namaBarang, String kondisi) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kondisi = kondisi;
    }

    public String getKodeBarang() { return kodeBarang; }
    public String getNamaBarang() { return namaBarang; }
    public String getKondisi() { return kondisi; }

    public void tandaiRusak() { this.kondisi = "Rusak"; }
    public void tandaiHilang() { this.kondisi = "Hilang"; }
    public void perbaiki() { this.kondisi = "Baik"; }

    public String getDetail() {
        return "Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Kondisi: " + kondisi;
    }

    @Override
    public String toString() {
        return getDetail();
    }
}