
# P07 – Tabel, Menu, dan Aplikasi Kontak

## Deskripsi Proyek
Aplikasi Kontak merupakan aplikasi desktop berbasis Java Swing yang digunakan untuk mengelola data kontak. Aplikasi ini menerapkan JTable, AbstractTableModel, JDialog, menu, dan event handling.

## Fitur Aplikasi
1. Menampilkan data kontak menggunakan JTable.
2. Menambahkan kontak baru.
3. Mengubah data kontak.
4. Menghapus kontak dengan konfirmasi.
5. Mencari kontak berdasarkan kata kunci.
6. Menggunakan menu untuk menjalankan fitur aplikasi.
7. Menggunakan shortcut keyboard:
   - Ctrl + N : Tambah kontak.
   - Ctrl + E : Ubah kontak.
   - Ctrl + D : Hapus kontak.

## Struktur Proyek
- `AplikasiKontak.java`
- `AplikasiKontak.form`
- `DialogKontak.java`
- `DialogKontak.form`
- `Kontak.java`
- `Kategori.java`
- `KontakTableModel.java`
- `P07TabelDanMenu.java`

## Jawaban Eksperimen Praktikum 5

### 1. Pengaruh fireTableRowsInserted()
**Pertanyaan:** Jika baris `fireTableRowsInserted(baris, baris);` dijadikan komentar, apakah tabel langsung berubah?

**Jawaban:**

Tidak langsung berubah, karena method tersebut memberi tahu JTable bahwa terdapat baris baru pada model. Jika baris tersebut dijadikan komentar, JTable tidak mendapat pemberitahuan bahwa data berubah sehingga tampilan tabel tidak dapat diperbarui secara langsung.

### 2. Pengaruh getSelectedRow()
**Pertanyaan:** Ganti method barisTerpilih menjadi `return kontakTable.getSelectedRow();`. Cari kata "ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul?

**Jawaban:**

Nama yang muncul adalah **Budi Santoso**. Hal ini karena `getSelectedRow()` mengembalikan indeks baris berdasarkan tabel yang ditampilkan. Jika tabel disaring dengan kata "ah", urutan baris yang ditampilkan berbeda dari urutan data asli.

### 3. Pengaruh Dialog Nonmodal
**Pertanyaan:** Ubah `super(pemilik, judul, true)` menjadi `false`. Apa yang terjadi ketika jendela utama diklik?

**Jawaban:**

Jendela utama dapat diklik meskipun dialog masih terbuka, sehingga pengguna dapat berinteraksi dengan jendela utama sebelum menyelesaikan pengisian dialog. Kontak baru akan ditambahkan apabila tombol Simpan ditekan.

### 4. Penggunaan Pintasan Keyboard
**Pertanyaan:** Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?

**Jawaban:**

Ctrl+N tetap dapat digunakan untuk membuka dialog tambah kontak karena tidak memerlukan pemilihan baris. Sementara itu, Ctrl+E dan Ctrl+D tidak bekerja karena menu Ubah dan Hapus dinonaktifkan ketika tidak ada baris yang dipilih. Hal ini bertujuan mencegah pengguna mengubah atau menghapus data tanpa memilih kontak terlebih dahulu.

### 5. Perubahan Accelerator Menu Hapus
**Pertanyaan:** Ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di initComponents()?

**Jawaban:**

Bagian yang berubah adalah:

```java
hapusItem.setAccelerator(
    javax.swing.KeyStroke.getKeyStroke(
        java.awt.event.KeyEvent.VK_DELETE, 0
    )
);
```

Perubahannya terletak pada tombol yang digunakan, dari Ctrl+D menjadi Delete tanpa kombinasi tombol Ctrl.

### 6. Pengaruh Inisialisasi Model
**Pertanyaan:** Ubah deklarasi atribut menjadi `private KontakTableModel model;`, lalu inisialisasi setelah initComponents(). Error apa yang muncul?

**Jawaban:**

Error yang muncul adalah **NullPointerException**, karena saat `initComponents()` dijalankan, objek model belum dibuat atau masih bernilai null. Sementara itu, komponen `kontakTable` sudah mencoba menggunakan model melalui perintah `kontakTable.setModel(model);`. Akibatnya, terjadi kesalahan karena model belum diinisialisasi ketika dibutuhkan.

## Deklarasi Penggunaan AI
Dalam pengerjaan tugas ini, saya menggunakan dua alat AI: ChatGPT untuk memeriksa kode program, dan Claude untuk memperbaiki kalimat serta pembuatan isi readme.
