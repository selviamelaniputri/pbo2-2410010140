# P05 - Event Handling

## 1. Form Anggota Perpustakaan

Project ini merupakan praktikum Pemrograman Berorientasi Objek 2 tentang penerapan event handling menggunakan Java Swing.

Form Anggota Perpustakaan digunakan untuk memasukkan data keanggotaan, mengelola persetujuan, menampilkan ringkasan data, dan mengonfirmasi penutupan aplikasi.

## 2. Peta Event

| Komponen | Event | Fungsi |
|---|---|---|
| Kotak centang Persetujuan | `itemStateChanged` | Mengaktifkan tombol Daftar jika persetujuan dicentang. |
| Tombol Batal | `actionPerformed` | Mengosongkan seluruh isian dan mengembalikan fokus ke kolom NPM. |
| Tombol Daftar | `actionPerformed` | Menampilkan dialog ringkasan data anggota. |
| Isian NPM | `keyReleased` | Menghitung jumlah digit NPM yang dimasukkan. |
| Form JFrame | `windowClosing` | Meminta konfirmasi sebelum aplikasi ditutup. |

## 3. Tabel Pengamatan Praktikum 2

Tabel pengamatan Praktikum 2 yang telah diisi tersedia pada file:

- `Tabel Pengamatan.docx`

## 4. Jawaban Eksperimen Praktikum 3 dan Praktikum 4

Jawaban eksperimen tersedia pada file berikut:

- `Jawaban Eksperimen 3.txt`
- `Jawaban eksperimen 4.txt`

## 5. Dokumentasi Screenshot

Screenshot bukti pengerjaan praktikum:

1. `layar jendela Properties bagian Events.png` — Properties bagian Events untuk tombol Daftar.
2. `dialog ringkasan.png` — dialog ringkasan data anggota.
3. `dialog konfirmasi keluar.png` — dialog konfirmasi sebelum aplikasi ditutup.

## 6. Deklarasi Penggunaan AI

Dalam pengerjaan tugas ini, saya menggunakan dua alat AI: ChatGPT untuk memeriksa kode program, dan Claude untuk memperbaiki kalimat serta pembuatan isi readme.

## 7. Repository GitHub

Repository:
https://github.com/selviamelaniputri/pbo2-2410010140

Folder P05:
https://github.com/selviamelaniputri/pbo2-2410010140/tree/main/p05-event-handling
