package id.ac.uniska.pbo2.p07;

import com.formdev.flatlaf.FlatLightLaf;

public class P07TabelDanMenu {

    public static void main(String[] args) {
        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(() -> {
            DialogKontak dialog = new DialogKontak(
                    null,
                    "Tambah Kontak",
                    null
            );

            dialog.setVisible(true);
        });
    }
}