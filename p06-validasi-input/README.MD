
# P06 – Validasi Input dan Kegunaan

## 1. FormAnggotaPerpustakaan

FormAnggotaPerpustakaan merupakan aplikasi yang telah diperbaiki berdasarkan hasil peer review dengan menerapkan validasi input dan peningkatan kegunaan aplikasi.

File yang disertakan:
- FormAnggota.java
- FormAnggota.form
- P06ValidasiInput.java
- validator.java
- ujivalidator.java
- pom.xml

---

## 2. Peer Review

Berikut merupakan dokumen peer review yang diterima dari teman.

**Nama Peninjau:** Siti Ekarina Septiano  
**NPM:** 2410010364

[📄 Lihat Dokumen Peer Review](peer%20review.docx)

---

## 3. Tabel Temuan, Perbaikan, dan Commit

Berikut ringkasan temuan berdasarkan hasil peer review beserta perbaikan yang telah dilakukan.

| No. | Temuan | Perbaikan yang Dilakukan | Commit |
|---|---|---|---|
| 1 | Jendela langsung tertutup ketika tombol X diklik tanpa konfirmasi. | Menambahkan WindowListener untuk konfirmasi sebelum aplikasi ditutup. | P06: perbaikan validasi input berdasarkan peer review |
| 2 | Isian Nama masih dapat menerima angka. | Menambahkan keyTyped menggunakan Character.isDigit() dan evt.consume(). | P06: perbaikan validasi input berdasarkan peer review |
| 3 | NPM dan Nomor HP dapat menerima huruf melalui Ctrl+V. | Menambahkan DocumentFilter untuk membatasi input angka dan panjang karakter. | P06: perbaikan validasi input berdasarkan peer review |
| 4 | Pesan kesalahan lama tetap muncul ketika isian diperbaiki. | Menambahkan DocumentListener untuk validasi langsung. | P06: perbaikan validasi input berdasarkan peer review |
| 5 | Jumlah isian yang perlu diperbaiki tidak langsung berubah. | Menambahkan validasiAktif dan perbaruiStatusValidasi(). | P06: perbaikan validasi input berdasarkan peer review |

Dokumentasi tabel lengkap:

[📄 Lihat Tabel Temuan, Perbaikan, dan Commit](Tabel%20Temuan%2CPerbaikan%2CCommit.docx)

---

## 4. Screenshot Form dengan Pesan Kesalahan

Berikut tangkapan layar form yang menampilkan pesan kesalahan ketika pengguna memasukkan data yang tidak sesuai dengan ketentuan validasi.

![Form Pesan Kesalahan](01_Form_Pesan_Kesalahan.png)

---

## 5. Screenshot Jendela Navigator

### 5.1 Navigator Label Pesan Atas

Berikut tampilan Navigator yang memperlihatkan komponen label pesan pada bagian atas form.

![Navigator Label Pesan Atas](02_Navigator_Label_Pesan_Atas.png)

### 5.2 Navigator Label Pesan Bawah

Berikut tampilan Navigator yang memperlihatkan komponen label pesan pada bagian bawah form.

![Navigator Label Pesan Bawah](03_Navigator_Label_Pesan_Bawah.png)

---

## 6. Jawaban Eksperimen Praktikum 4

### 1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?

Huruf tidak bisa masuk ke NPM karena hanya menerima karakter angka.

Kode yang menyebabkan hal tersebut:

```java
if (!Character.isDigit(evt.getKeyChar()) || penuh) {
    evt.consume();
}
```

Perintah tersebut membatalkan karakter yang tidak memenuhi ketentuan.

### 2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?

Pesan kesalahan muncul setelah tombol Tab ditekan dan fokus berpindah dari isian email ke komponen berikutnya. Hal ini terjadi karena event focusLost menjalankan validasi email ketika isian tidak kosong.

### 3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?

Karena program hanya memeriksa nama apabila isian tidak kosong.

Kode yang digunakan:

```java
if (!namaField.getText().isBlank()) {
    periksaNama();
}
```

Validasi untuk isian kosong baru dilakukan ketika tombol Daftar diklik.

### 4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?

NPM mendapat fokus karena merupakan isian pertama yang diperiksa dan kosong. Program menyimpan komponen yang salah ke dalam daftar salah.

Kode:

```java
salah.get(0).requestFocusInWindow();
```

Kode tersebut memindahkan fokus ke isian pertama yang mengalami kesalahan.

### 5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?

Fokus berpindah ke Nama Lengkap. Hal ini diatur oleh properti displayedMnemonic pada label Nama dan labelFor yang menghubungkan label dengan namaField.

### 6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

Data tetap ada karena pengguna memilih No. Program menjalankan return sehingga proses pengosongan form dibatalkan.

Dokumen jawaban:

[JAWABAN EKSPERIMEN 4 (P06).md](JAWABAN%20EKSPERIMEN%204%20(P06).md)

---

## 7. Deklarasi Penggunaan AI

Dalam pengerjaan praktikum ini, saya menggunakan ChatGPT sebagai alat bantu untuk:

1. Memahami konsep validasi input pada Java Swing.
2. Membantu mengidentifikasi dan memperbaiki kesalahan berdasarkan hasil peer review.
3. Memahami penggunaan DocumentFilter dan DocumentListener.
4. Membantu menyusun dokumentasi dan README proyek.

Seluruh implementasi dan pengujian aplikasi dilakukan dengan menyesuaikan kebutuhan praktikum.

---

**Pemrograman Berbasis Objek 2 – Pertemuan 6**
