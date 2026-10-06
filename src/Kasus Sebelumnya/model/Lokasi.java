package model;

public class Lokasi {
    private String kodeLokasi;
    private String namaLokasi;

    public Lokasi(String kodeLokasi, String namaLokasi) {
        this.kodeLokasi = kodeLokasi;
        this.namaLokasi= namaLokasi;
    }

    public String getkodeLokasi() {
        return kodeLokasi;
    }

    public String getnamaLokasi() {
        return namaLokasi;
    }
}