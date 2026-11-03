package id.ac.uniska.pbo2.p08.uts.b;

public class Barang {
    private String nama;
    private String kategori;
    private long harga;
    private int jumlah;

    public Barang(String nama, String kategori,
                  long harga, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public long getSubtotal() {
        return harga * jumlah;
    }
}