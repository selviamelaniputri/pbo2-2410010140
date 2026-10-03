**JAWABAN PERTANYAAN REFLEKSI**



**1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing**

**satu contoh.**

* Top Level Container : Jendela Utama yang memiliki frame/bingkai dan judul seperti JFrame, contoh JFrame itu **FormTiketTravel**
* Intermediate Container : Wadah yang digunakan untuk mengelompokkan komponen seperti JPanel, contohnya ada di **catatanArea** dia disitu menggunakan JScrollPane untuk membungkusnya
* Atomic Componen : komponen yang langsung berinteraksi dengan pengguna seperti JButton, contohnya di form ini ada **JCheckBox,JTextField**





**2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?**

Karena Jradiobutton hanya bisa memilih salah satu jadinya swing bingung radio button yang saling berhubungan karena itu dibuatlah buttongroup yang membuat mereka bisa Bersatu, tanpa buttongroup yang sama radio button akan sendiri2 saja seperti misalnya pengguna bisa memilih semua kelasekonomi,bisnis dan eksekutif sekaligus.



**3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?**

**=** saat saya memiliki banyak pilihan/jumlah pilihan bertambah, karena di JComboBox itu daftarnya bisa disembunyikan dan nyaman dilihatnya disbanding JRadioButton yang kelihatan semua.



**4. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan**

**seharusnya ditulis?**

**=** karena kode didalam initcomponents() itu dibuat otomatis sama netbeans dari rancangan di tab desain, jadi kalau mau menulis kode tambahan bisa ditulis diluar blok abu abu kaya di konstruktor setelah initcomponent()



**5. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?**

= Jika FlatLightLaf.setup dipanggil setelah form dibuat, komponen sudah terlanjur memakai tampilan bawaan Swing dan tidak berubah sampai updateUI dipanggil. Karena itu setup dipanggil lebih dulu di main, sebelum new FormTiketTravel, supaya semua komponen langsung tampil dengan gaya FlatLaf sejak awal.

