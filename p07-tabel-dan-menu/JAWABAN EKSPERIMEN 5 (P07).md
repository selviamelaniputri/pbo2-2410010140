JAWABAN EKSPERIMEN 5 (P07) :



1\. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu

tambah kontak baru. Apakah tabel langsung berubah?

= tidak langsung berubah, karena method diatas meberi tahu bahwa JTable ada baris baru di model, kalau baris itu dijadikan komentar maka JTable tidak dapat pemberithuan kalau ada data yang berubah sampi tampilan table nya ga bisa diperbarui



Modul Praktikum PBO 2 Pertemuan 7, halaman 12 dari 14

2\. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata

"ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?

= yang muncul **Budi Santoso** itu karena get selected row itu mengembalikan index baris berdasarkan table, jadi kalua tabelnya disaring "ah", maka urutan baris yang ditampilkan berbeda dari ururtan asli.



3\. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka,

coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?

= jendela Utama dapat diklik meski dialog masih terbuka,jadi bisa dapat berinteraksi dengan jendela Utama sebelum menyelesaikan pengisian dialog. kontak baru akan ditambahkan apabila tombol simpan ditekan



4\. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?

= Ctrl+N tetap dapat digunakan untuk membuka dialog tambah kontak karena tidak memerlukan pemilihan baris. Sementara itu, Ctrl+E dan Ctrl+D tidak bekerja karena menu Ubah dan Hapus dinonaktifkan ketika tidak ada baris yang dipilih. Hal ini bertujuan mencegah pengguna mengubah atau menghapus data tanpa memilih kontak terlebih dahulu.



5\. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di

initComponents()?

= yang berubah dibagian, hapusItem.setAccelerator(

&#x20;   javax.swing.KeyStroke.getKeyStroke(

&#x20;       java.awt.event.KeyEvent.VK\_DELETE, 0

&#x20;   )

);

Perubahannya terletak pada tombol yang digunakan, dari Ctrl+D menjadi Delete tanpa kombinasi tombol Ctrl.



6\. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new

KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan

mengapa?

= error NullPointerException, karena saat initComponents() dijalankan, objek model belum dibuat atau masih bernilai null. Sementara itu, komponen kontakTable sudah mencoba menggunakan model melalui perintah kontakTable.setModel(model);. Akibatnya, terjadi kesalahan karena model belum diinisialisasi ketika dibutuhkan.

