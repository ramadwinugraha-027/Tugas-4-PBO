package model;

public class PencatatanInventaris {
    private int kodePencatatan;     
    private Barang pencatatBarang;   
    private Lokasi pencatatLokasi;

    
    public PencatatanInventaris(int kodePencatatan, Barang pencatatBarang, Lokasi pencatatLokasi) {
        this.kodePencatatan = kodePencatatan;
        this.pencatatBarang = pencatatBarang;
        this.pencatatLokasi = pencatatLokasi;
    }

    public int getKodePencatatan() {
        return kodePencatatan;
    }

    public Barang getPencatatBarang() {
        return pencatatBarang;
    }

    public Lokasi getPencatatLokasi() {
        return pencatatLokasi;
    }
}
