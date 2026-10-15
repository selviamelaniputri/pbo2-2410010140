**PERTANYAAN REFLEKSI**



1\. Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?

= karena ukuran dan posisi komponen itu diatur secara manual jadi kalo memakai null layout/absolute layout bisa membuat tampilan berantakan saat ukuran jendelanya berubah atau saat dijalankan dengan resolusi berbeda



2\. Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan.

= flowlayout : komponennya tersusun dengan beruurtan dan dia bisa berpindah ke baris berikutnya kalua ruang tidak cukup



gridlayout : komponen tersusun di baris dan kolom di ukuran sel yang sama jadi kalau jendela dilebarkan maka dia ikut melebar



3\. Apa fungsi Weight X dan Fill pada constraint GridBagLayout?

= weight x : dia mengatur di bagian horizontal untuk komponen, jadi kalua nilainya 0,0 komponen nya ga dapat ruang secara horizontal



fill : mengatur komponen untuk mengisi ruang yang ada di sel baik secara horizontal,vertikal atau both ataupun none.



4\. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?

= supaya susunan komponennya lebih rapi dan mudah diatur,diletakkan di north agar form tetap berada di bagian atas ketika jendela diperbesar, sehingga tampilan lebih teratur



5\. Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya.

= - konsisten/consistency : label dan kolom input disusun sejajar menggunakan GridBagLayout 

Buktinya di label npm,label nama, label program studi, label email, label no hp yang tersusun sejajjar di kolom input masing-masing.

**-** kedekatan/proximity : komponen nya saling berkaitan buktinya ada tombol batal dan daftar yang berdekatan dibawah form lalu ada label dan kolom input yang berkaitan dan mereka berdekatan



