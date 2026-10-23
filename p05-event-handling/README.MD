
# P05 - Event Handling

## 1. Form Anggota Perpustakaan

Praktikum ini membahas penerapan event handling pada Java Swing menggunakan Java. Form Anggota Perpustakaan digunakan untuk memasukkan data anggota, mengelola persetujuan, menampilkan ringkasan data, dan mengonfirmasi penutupan aplikasi.

File form:
- `FormAnggotaPerpustakaan.java`
- `FormAnggotaPerpustakaan.form`

## 2. Peta Event Form Anggota Perpustakaan

| Komponen | Event | Fungsi |
|---|---|---|
| Kotak centang Persetujuan | `itemStateChanged` | Mengaktifkan tombol Daftar jika persetujuan dicentang. |
| Tombol Batal | `actionPerformed` | Mengosongkan seluruh isian dan mengembalikan fokus ke kolom NPM. |
| Tombol Daftar | `actionPerformed` | Menampilkan dialog ringkasan data anggota. |
| Isian NPM | `keyReleased` | Menghitung jumlah digit NPM yang dimasukkan. |
| Form JFrame | `windowClosing` | Meminta konfirmasi sebelum aplikasi ditutup. |

## 3. Tabel Pengamatan Praktikum 2

| No. | Tindakan | Event yang tercatat |
|---|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | `MouseEvent`: kursor masuk ke tombol; `MouseEvent`: kursor keluar dari tombol. |
| 2 | Klik tombol Klik saya | `ActionEvent`: tombol diklik. |
| 3 | Centang lalu hapus centang Aktifkan fitur | `ItemEvent`: kotak dicentang; `ItemEvent`: centang dihapus. |
| 4 | Ganti pilihan dari Pagi menjadi Malam | `ItemEvent`: memilih Malam. |
| 5 | Klik isian, lalu ketik kata "abc" | `FocusEvent`: isian mendapat fokus; `KeyEvent`: mengetik huruf a, b, dan c. |
| 6 | Klik tombol setelah mengetik di isian | `FocusEvent`: isian kehilangan fokus; `MouseEvent`: kursor masuk ke tombol; `ActionEvent`: tombol diklik. |

## 4. Jawaban Eksperimen Praktikum 3

**Pertanyaan:** Hapus pemeriksaan `if (evt.getStateChange() == ItemEvent.SELECTED)` dan tambahkan `System.out.println("item berubah");`. Berapa kali pesan tercetak setiap pilihan diganti?

**Jawaban:** Pesan tercetak dua kali setiap pilihan diganti karena event `itemStateChanged` dipanggil untuk pilihan lama yang berstatus `DESELECTED` dan pilihan baru yang berstatus `SELECTED`.

**Pertanyaan:** Mengapa hasil konversi terlambat satu karakter ketika menggunakan `keyPressed`?

**Jawaban:** Event `keyPressed` dijalankan ketika tombol keyboard ditekan, sebelum karakter baru dimasukkan ke dalam `JTextField`. Akibatnya, proses konversi membaca teks sebelum karakter terbaru ditambahkan sehingga hasilnya terlambat satu karakter.

**Pertanyaan:** Apa yang muncul di jendela Output ketika huruf diketik setelah blok `try-catch` dihapus?

**Jawaban:** Program menampilkan kesalahan `NumberFormatException` di jendela Output karena teks yang berisi huruf tidak dapat dikonversi menjadi tipe data `double`. Tanpa `try-catch`, kesalahan tersebut tidak ditangani oleh method konversi.

## 5. Jawaban Eksperimen Praktikum 4

**Pertanyaan:** Jika `actionPerformed` dibuat melalui Events tanpa menghapus lambda di konstruktor, berapa kali pesan tercetak?

**Jawaban:** Pesan `kali` tercetak dua kali karena tombol memiliki dua listener, yaitu event handler dari GUI Builder dan lambda di konstruktor. Satu tombol sebaiknya hanya menggunakan satu cara agar aksi tidak dijalankan berulang kali.

**Pertanyaan:** Apa yang diubah pada tab Design dan tab Source untuk menambahkan tombol `%`?

**Jawaban:**

- **Tab Design:** Layout `operatorPanel` diubah menjadi `GridLayout` dengan satu baris dan lima kolom agar semua tombol dapat tampil.
- **Tab Source:** Tambahkan event `actionPerformed` untuk memanggil `hitung('%')`, kemudian tambahkan operasi modulus pada method `hitung()` menggunakan `case '%' -> a % b;`. Operasi ini menghasilkan sisa pembagian dua bilangan.

**Pertanyaan:** Mengapa kursor langsung berada di isian pertama setelah tombol Hapus ditekan?

**Jawaban:** Karena method hapus memanggil `angka1Field.requestFocusInWindow()`, sehingga fokus keyboard dikembalikan ke kolom angka pertama setelah kedua kolom dikosongkan dan label hasil diatur kembali menjadi "Hasil: 0".

## 6. Dokumentasi Screenshot

### 6.1 Properties - Events Tombol Daftar

Screenshot jendela Properties bagian Events untuk tombol Daftar.

![Properties bagian Events tombol Daftar](./layar%20jendela%20Properties%20bagian%20Events.png)

### 6.2 Dialog Ringkasan Data Anggota

Screenshot dialog yang menampilkan ringkasan data anggota setelah tombol Daftar ditekan.

![Dialog ringkasan data anggota](./dialog%20ringkasan.png)

### 6.3 Dialog Konfirmasi Keluar

Screenshot dialog konfirmasi sebelum aplikasi ditutup.

![Dialog konfirmasi keluar](./dialog%20konfirmasi%20keluar.png)

## 7. Deklarasi Penggunaan AI

Dalam pengerjaan tugas ini, saya menggunakan dua alat AI: ChatGPT untuk memeriksa kode program, dan Claude untuk memperbaiki kalimat serta pembuatan isi readme.
https://github.com/selviamelaniputri/pbo2-2410010140

**Folder project P05:**

https://github.com/selviamelaniputri/pbo2-2410010140/tree/main/p05-event-handling
