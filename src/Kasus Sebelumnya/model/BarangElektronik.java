package model;

public class BarangElektronik extends Barang {
    private int garansiBulan;

    public BarangElektronik(String kodeBarang, String namaBarang, String kondisi, int garansiBulan) {
        super(kodeBarang, namaBarang, kondisi);
        this.garansiBulan = garansiBulan;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", Garansi: " + garansiBulan + " Bulan";
    }
}