**JAWABAN EKSPERIMEN 4 (P06)**



1\. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?

= huruf tidak bisa masuk ke NPM karena hanya menerima karakter angka.

if (!Character.isDigit(evt.getKeyChar()) || penuh) {

&#x20;   evt.consume();

}

perintah diatas yang membatalkan karakter yang tidak memenuhi ketentuan



2\. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?

= setelah tombol Tab ditekan lalu akan berpindah dari isi email ke komponen berikut, itu karena ada event **focuslost** yang menjalankan validasi email Ketika isian tidak kosong



3\. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?

= karena dia hanya memeriksa nama apabila isian tidak kosong, ada di kode 

if (!namaField.getText().isBlank()) {

&#x20;   periksaNama();

}

itu adalah validasi untuk isian kosong baru dilakukan Ketika tombol daftar nya di klik



4\. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?

= NPM, karena isian pertama yang diperiksa dan kosong, lalu program menyimpan komponen salah ke daftar salah, lalu ke kode

salah.get(0).requestFocusInWindow();

kode diatas untuk memindahkan focus ke isian pertama yang mengalami kesalahan



5\. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?

= fokusnya ke Nama lengkap, itu karena ada property displayedmnemonic di label nama dan labelfor yang menghubungkan dengan nama field



6\. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

= tetap ada karena pengguna memilih No, maka program akan menjalankan return hingga proses pengosongan form dibatalkan

