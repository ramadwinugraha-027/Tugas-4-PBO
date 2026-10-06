package model;

public class BarangNonElektronik extends Barang {
    private String bahan;

    public BarangNonElektronik(String kodeBarang, String namaBarang, String kondisi, String bahan) {
        super(kodeBarang, namaBarang, kondisi);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Bahan: " + bahan;
    }
}