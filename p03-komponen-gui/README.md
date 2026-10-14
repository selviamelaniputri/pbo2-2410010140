# P03 - Komponen GUI Swing

Tugas Pertemuan 3 mata kuliah Pemrograman Berorientasi Objek 2.
Berisi tiga program Java Swing: `HaloSwing`, `FormPendaftaran`, dan `FormTiketTravel`, dibuat dengan NetBeans dan tampilan FlatLaf.

## Screenshot

### Form Pemesanan Tiket Travel - Mode Terang
![Form Pemesanan Tiket Travel - Mode Terang](form%20pemesanan%20tiket%20travel%20MODE%20TERANG.png)

### Form Pemesanan Tiket Travel - Mode Gelap
![Form Pemesanan Tiket Travel - Mode Gelap](form%20pemesanan%20tiket%20travel%20MODE%20GELAP.png)

### Tab Design FormTiketTravel (dengan Navigator)
![Tab Design FormTiketTravel](GANTI-DENGAN-NAMA-FILE-LENGKAP.png)

## Jawaban Pertanyaan Refleksi

**1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing satu contoh.**

- **Top-level container**: jendela utama yang memiliki frame/bingkai dan judul, seperti `JFrame`. Contohnya `FormTiketTravel`.
- **Intermediate container**: wadah untuk mengelompokkan komponen, seperti `JPanel`. Contohnya `catatanArea` yang dibungkus `JScrollPane`.
- **Atomic component**: komponen yang langsung berinteraksi dengan pengguna, seperti `JButton`. Contoh di form ini: `JCheckBox` dan `JTextField`.

**2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?**

Karena `JRadioButton` hanya boleh memilih salah satu, Swing perlu tahu radio button mana yang saling berhubungan. `ButtonGroup` yang menyatukan mereka. Tanpa `ButtonGroup` yang sama, radio button berdiri sendiri-sendiri, sehingga pengguna bisa memilih kelas ekonomi, bisnis, dan eksekutif sekaligus.

**3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?**

Saat pilihan banyak atau jumlahnya bertambah. Daftar pada `JComboBox` bisa disembunyikan sehingga lebih rapi, berbeda dengan `JRadioButton` yang semua pilihannya tampil sekaligus.

**4. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan seharusnya ditulis?**

Karena kode di dalam `initComponents()` dibuat otomatis oleh NetBeans dari rancangan di tab Design, sehingga edit manual akan tertimpa. Kode tambahan ditulis di luar blok abu-abu, misalnya di konstruktor setelah pemanggilan `initComponents()`.

**5. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?**

Jika `FlatLightLaf.setup()` dipanggil setelah form dibuat, komponen sudah terlanjur memakai tampilan bawaan Swing dan tidak berubah sampai `updateUI()` dipanggil. Karena itu `setup()` dipanggil lebih dulu di `main`, sebelum `new FormTiketTravel`, supaya semua komponen langsung tampil dengan gaya FlatLaf sejak awal.
