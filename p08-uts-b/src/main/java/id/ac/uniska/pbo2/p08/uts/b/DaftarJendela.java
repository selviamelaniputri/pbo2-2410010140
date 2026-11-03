/*
//  Nama : Selvia Melani Putri
//  NPM : 2410010140
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts.b;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author asus
 */
public class DaftarJendela extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DaftarJendela.class.getName());

    /**
     * Creates new form DaftarJendela
     */
    public DaftarJendela() {
        initComponents();
 
        pesanLabel.setText("");
        jumlahSpinner.setValue(1);
        setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel(
        new Object[]{"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"}, 0
);

jTable2.setModel(model);    
    }
    private void hitungTotal() {
    DefaultTableModel model =
        (DefaultTableModel) jTable2.getModel();

    long total = 0;

    for (int i = 0; i < model.getRowCount(); i++) {
        total += Long.parseLong(
            model.getValueAt(i, 4).toString()
        );
    }
    long diskon = total >= 100000 ? total * 10 / 100 : 0;

    totalLabel.setText("Total: Rp" + total);
    diskonLabel.setText("Diskon: Rp" + diskon);
    bayarLabel.setText("Bayar: Rp" + (total - diskon));
}  
    private void tambah() {
    String nama = barangField.getText().trim();
    if (nama.isEmpty()) {
        pesanLabel.setText("Nama barang wajib diisi");
        barangField.requestFocus();
        return;
    }
    DefaultTableModel model =
            (DefaultTableModel) jTable2.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        String namaTabel = model.getValueAt(i, 0).toString();

        if (nama.equalsIgnoreCase(namaTabel.trim())) {
            pesanLabel.setText(
                    "Barang " + nama + " sudah ada di daftar"
            );
            barangField.requestFocus();
            return;
        }
    }
    long harga;
    try {
        harga = Long.parseLong(hargaField.getText().trim());
        if (harga < 1 || harga > 1000000000) {
            pesanLabel.setText(
                "Harga harus angka 1 sampai 1000000000"
            );
            hargaField.requestFocus();
            return;
        }
    } catch (NumberFormatException e) {
        pesanLabel.setText(
                "Harga harus angka 1 sampai 1000000000"
        );
        hargaField.requestFocus();
        return;
    }
    int jumlah = (int) jumlahSpinner.getValue();
    Barang barang = new Barang(
    nama,
    kategoriCombo.getSelectedItem().toString(),
    harga,
    jumlah
    );

    long subtotal = barang.getSubtotal();
    model.addRow(new Object[]{
        nama,
        kategoriCombo.getSelectedItem(),
        harga,
        jumlah,
        subtotal
    });
    
    hitungTotal();
    
    pesanLabel.setText(" ");
    JOptionPane.showMessageDialog(
            this,
            "Barang berhasil ditambahkan"
    );
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        atasPanel = new javax.swing.JPanel();
        daftarLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        barangLabel = new javax.swing.JLabel();
        kategoriLabel = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        barangField = new javax.swing.JTextField();
        jumlahLabel = new javax.swing.JLabel();
        kategoriCombo = new javax.swing.JComboBox<>();
        hargaField = new javax.swing.JTextField();
        jumlahSpinner = new javax.swing.JSpinner();
        tambahButton = new javax.swing.JButton();
        bersihkanButton = new javax.swing.JButton();
        pesanLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bawahPanel = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        diskonLabel = new javax.swing.JLabel();
        bayarLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Belanja");

        atasPanel.setLayout(new java.awt.GridLayout());

        daftarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        daftarLabel.setText("DAFTAR BELANJA");
        atasPanel.add(daftarLabel);

        getContentPane().add(atasPanel, java.awt.BorderLayout.NORTH);

        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setLayout(new java.awt.GridBagLayout());

        barangLabel.setText("Nama Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(barangLabel, gridBagConstraints);

        kategoriLabel.setText("Kategori");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        formPanel.add(kategoriLabel, gridBagConstraints);

        hargaLabel.setText("Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        formPanel.add(hargaLabel, gridBagConstraints);

        barangField.addActionListener(this::barangFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(barangField, gridBagConstraints);

        jumlahLabel.setText("Jumlah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 12);
        formPanel.add(jumlahLabel, gridBagConstraints);

        kategoriCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alat Tulis", "Makanan", "Minuman", "Lainnya" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(kategoriCombo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(hargaField, gridBagConstraints);

        jumlahSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        formPanel.add(jumlahSpinner, gridBagConstraints);

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(this::tambahButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        formPanel.add(tambahButton, gridBagConstraints);

        bersihkanButton.setText("Bersihkan");
        bersihkanButton.addActionListener(this::bersihkanButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        formPanel.add(bersihkanButton, gridBagConstraints);

        pesanLabel.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        formPanel.add(pesanLabel, gridBagConstraints);

        isiPanel.add(formPanel, java.awt.BorderLayout.WEST);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Kategori", "Harga", "Jumlah"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        isiPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        bawahPanel.setLayout(flowLayout1);

        totalLabel.setText(" ");
        bawahPanel.add(totalLabel);

        diskonLabel.setText(" ");
        bawahPanel.add(diskonLabel);

        bayarLabel.setText(" ");
        bawahPanel.add(bayarLabel);

        getContentPane().add(bawahPanel, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barangFieldActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        tambah();
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void bersihkanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihkanButtonActionPerformed

    barangField.setText("");
    hargaField.setText("");
    kategoriCombo.setSelectedIndex(0);
    jumlahSpinner.setValue(1);
    pesanLabel.setText("");
    barangField.requestFocus();
    }//GEN-LAST:event_bersihkanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DaftarJendela().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atasPanel;
    private javax.swing.JTextField barangField;
    private javax.swing.JLabel barangLabel;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JLabel bayarLabel;
    private javax.swing.JButton bersihkanButton;
    private javax.swing.JLabel daftarLabel;
    private javax.swing.JLabel diskonLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JTextField hargaField;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jumlahLabel;
    private javax.swing.JSpinner jumlahSpinner;
    private javax.swing.JComboBox<String> kategoriCombo;
    private javax.swing.JLabel kategoriLabel;
    private javax.swing.JLabel pesanLabel;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
