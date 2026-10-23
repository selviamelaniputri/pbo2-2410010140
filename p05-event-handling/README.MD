# P05 - Event Handling

## 1. Form Anggota Perpustakaan

Project ini merupakan praktikum Pemrograman Berorientasi Objek 2 tentang penerapan event handling menggunakan Java Swing.

Form Anggota Perpustakaan digunakan untuk memasukkan data keanggotaan, mengelola persetujuan, menampilkan ringkasan data, dan mengonfirmasi penutupan aplikasi.

File form yang digunakan:

- `FormAnggotaPerpustakaan.java`
- `FormAnggotaPerpustakaan.form`

## 2. Peta Event

| Komponen | Event | Fungsi |
|---|---|---|
| Kotak centang Persetujuan | `itemStateChanged` | Mengaktifkan tombol Daftar jika persetujuan dicentang. |
| Tombol Batal | `actionPerformed` | Mengosongkan seluruh isian dan mengembalikan fokus ke kolom NPM. |
| Tombol Daftar | `actionPerformed` | Menampilkan dialog ringkasan data anggota. |
| Isian NPM | `keyReleased` | Menghitung jumlah digit NPM yang dimasukkan. |
| Form JFrame | `windowClosing` | Meminta konfirmasi sebelum aplikasi ditutup. |

## 3. Tabel Pengamatan Praktikum 2

Tabel pengamatan yang telah diisi dapat dibuka melalui tautan berikut:

[📄 Buka Tabel Pengamatan Praktikum 2](./Tabel%20Pengamatan.docx)

## 4. Jawaban Eksperimen Praktikum 3 dan Praktikum 4

Jawaban eksperimen tersedia pada file berikut:

- [Jawaban Eksperimen 3](./Jawaban%20Eksperimen%203.txt)
- [Jawaban Eksperimen 4](./Jawaban%20eksperimen%204.txt)

## 5. Dokumentasi Screenshot

### 5.1 Properties - Events Tombol Daftar

Screenshot jendela Properties bagian Events untuk tombol Daftar.

![Properties bagian Events tombol Daftar](./layar%20jendela%20Properties%20bagian%20Events.png)

### 5.2 Dialog Ringkasan Data Anggota

Screenshot dialog yang menampilkan ringkasan data anggota setelah tombol Daftar ditekan.

![Dialog ringkasan data anggota](./dialog%20ringkasan.png)

### 5.3 Dialog Konfirmasi Keluar

Screenshot dialog konfirmasi sebelum aplikasi ditutup.

![Dialog konfirmasi keluar](./dialog%20konfirmasi%20keluar.png)

## 6. Deklarasi Penggunaan AI

ChatGPT digunakan sebagai alat bantu untuk memahami materi event handling Java Swing, memperoleh panduan penggunaan Git dan GitHub, serta membantu menyusun dokumentasi dan jawaban eksperimen praktikum.

Kode program dan hasil akhir diperiksa kembali agar sesuai dengan implementasi praktikum.

## 7. Repository GitHub

**Repository utama:**

https://github.com/selviamelaniputri/pbo2-2410010140

**Folder project P05:**

https://github.com/selviamelaniputri/pbo2-2410010140/tree/main/p05-event-handling
