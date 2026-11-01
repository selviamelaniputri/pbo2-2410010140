
package id.ac.uniska.pbo2.miniproyek;

public class Buku {

    private String kode;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String status;

    public Buku(String kode, String judul, String penulis,
                int tahunTerbit, String status) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = status;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getStatus() {
        return status;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
