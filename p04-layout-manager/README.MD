# P04 - Layout Manager

## Jawaban Pertanyaan Refleksi (Bagian G)

**1. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?**

Karena ukuran dan posisi komponen diatur secara manual, sehingga tampilan bisa berantakan saat ukuran jendela berubah atau saat program dijalankan dengan resolusi berbeda.

**2. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.**

- FlowLayout: komponen tersusun berurutan dan berpindah ke baris berikutnya jika ruang tidak cukup.
- GridLayout: komponen tersusun dalam baris dan kolom dengan ukuran sel yang sama, sehingga saat jendela dilebarkan, komponen ikut melebar.

**3. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?**

- Weight X: mengatur pembagian ruang horizontal tambahan untuk komponen. Jika nilainya 0.0, komponen tidak mendapat ruang horizontal tambahan.
- Fill: mengatur komponen agar mengisi ruang di dalam selnya, yaitu secara horizontal, vertikal, both, atau none.

**4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?**

Agar susunan komponen lebih rapi dan mudah diatur. Diletakkan di North agar form tetap berada di bagian atas saat jendela diperbesar, sehingga tampilan lebih teratur.

**5. Sebutkan dua prinsip desain yang diterapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.**

- Konsistensi (consistency): label dan kolom input disusun sejajar menggunakan GridBagLayout. Buktinya, label NPM, nama, program studi, email, dan no HP tersusun sejajar dengan kolom input masing-masing.
- Kedekatan (proximity): komponen yang berkaitan diletakkan berdekatan. Buktinya, tombol Batal dan Daftar berdekatan di bawah form, dan setiap label berdekatan dengan kolom inputnya.

## Sketsa Form dan Tabel Rancangan

![Sketsa form](<Foto sketsa form.jpeg>)

## Tangkapan Layar FormAnggotaPerpustakaan

Ukuran awal:

![Ukuran awal](<Form Anggota Perpustakaan ukuran awal.png>)

Saat dilebarkan:

![Ukuran dilebarkan](<Form Anggota Perpustakaan ukuran dilebarkan.png>)

## Tab Design (Jendela Navigator)

![Tab Design dan Navigator](<Form Anggota Perpustakaan di jendela navigator.png>)

## Jawaban Eksperimen

### Praktikum 2

**1. Pada flowPanel, ubah Alignment layout menjadi Center, lalu kecilkan jendela. Apa yang berubah? Baris mana di initComponents() yang ikut berubah?**

Tombol menjadi rata tengah, dan saat jendela dikecilkan, tombol yang tidak muat dalam satu baris pindah ke baris berikutnya. Baris yang berubah di `initComponents()`:

```java
flowPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
flowPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 8));
```

**2. Pada gridPanel, ubah Rows menjadi 0 dan Columns menjadi 2. Berapa baris yang terbentuk dan mengapa?**

Terbentuk 5 baris dengan 2 kolom. Saat Rows diatur 0, jumlah baris ditentukan otomatis berdasarkan jumlah komponen. Karena ada 9 tombol, tombol tersusun dalam 5 baris, dengan 1 tombol pada baris terakhir.

**3. Pada boxPanel, isi maximumSize keempat tombol dengan lebar 32767 dan tinggi sama dengan tinggi tombol. Bagaimana lebar tombol berubah? Tambahkan juga Vertical Strut di antara tombol.**

Tombol pada boxPanel dapat melebar secara horizontal mengikuti ruang yang tersedia di panel. Setelah Vertical Strut ditambahkan, terbentuk jarak vertikal di antara tombol sehingga susunannya lebih renggang dan rapi.

### Praktikum 4

**1. Ubah Weight X pada namaField menjadi 0.0, lalu lebarkan jendela. Apa yang terjadi pada isian?**

Isian nama tidak ikut melebar dan tetap pada ukuran awalnya. Hal ini karena Weight X mengatur pembagian ruang horizontal tambahan bagi komponen dalam GridBagLayout.

**2. Ubah Direction formPanel di dalam isiPanel dari North menjadi Center, lalu tinggikan jendela. Apa perbedaannya?**

Dengan Center, form berada di tengah secara vertikal. Dengan North, form tetap berada di bagian atas jendela.

**3. Hapus baris setMinimumSize(getSize()) di konstruktor, lalu kecilkan jendela sekecil mungkin. Bagian mana yang rusak lebih dulu?**

Field input dan label pada form rusak lebih dulu karena ruang jendela semakin sempit. Field input mengecil, teks bisa terpotong, dan susunan komponen menjadi kurang rapi sehingga form sulit dibaca.

## Saran dari Teman (Tahap 4)

**Hasil pemeriksaan:**

| No | Pemeriksaan | Ya atau Belum |
|----|-------------|---------------|
| 1 | Label singkat, jelas, dan sejajar | Ya |
| 2 | Isian dikelompokkan dengan judul bagian | Ya |
| 3 | Placeholder dipakai untuk isian yang punya format | Ya |
| 4 | Komponen sesuai jenis data | Ya |
| 5 | Tombol utama menonjol dan berada di kanan bawah | Ya |
| 6 | Jarak antar komponen konsisten | Ya |
| 7 | Form tetap rapi saat jendela dilebarkan dan ditinggikan | Belum |
| 8 | Tampilan dibuat dengan JFrame Form dan layout manager, bukan Null Layout atau Absolute Layout | Ya |

**Saran:**

Radio button Jenis Anggota (Mahasiswa, Dosen, Umum) tersebar jauh saat jendela dilebarkan. Sebaiknya ubah Weight X ketiganya jadi 0.0 atau taruh dalam satu panel FlowLayout rata kiri, supaya tetap rapat di samping label.

## Deklarasi Penggunaan AI

Dalam pengerjaan tugas ini, saya menggunakan dua alat AI: ChatGPT untuk memeriksa kode program, dan Claude untuk memperbaiki susunan kalimat pada dokumen. Ide, rancangan, serta penulisan kode berasal dari saya sendiri, dan setiap saran dari AI sudah saya periksa terlebih dahulu sebelum dipakai.
