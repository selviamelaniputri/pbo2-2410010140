
package id.ac.uniska.pbo2.miniproyek;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BukuTableModel extends AbstractTableModel {

    private static final String[] KOLOM = {
        "Kode", "Judul", "Penulis", "Tahun Terbit", "Status"
    };

    private final List<Buku> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Buku buku = daftar.get(baris);

        return switch (kolom) {
            case 0 -> buku.getKode();
            case 1 -> buku.getJudul();
            case 2 -> buku.getPenulis();
            case 3 -> buku.getTahunTerbit();
            case 4 -> buku.getStatus();
            default -> null;
        };
    }

    public Buku get(int baris) {
        return daftar.get(baris);
    }

    public void tambah(Buku buku) {
        daftar.add(buku);
        int baris = daftar.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public void ubah(int baris, Buku buku) {
        daftar.set(baris, buku);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        daftar.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
}
