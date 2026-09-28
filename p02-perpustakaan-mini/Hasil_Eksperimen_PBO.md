**NAMA 	: SELVIA MELANI PUTRI**

**NPM 	: 2410010140**

**KELAS 	: 5C REG BANJARMASIN**



**HASIL EKSPERIMEN P2 PERPUSTAKAAN MINI:**



1\. Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error

dari kompiler dan mengapa?

= Isi pesan error nya : Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project p02-perpustakaan-mini: Compilation failure

id/ac/uniska/pbo2/p02/AplikasiPerpustakaan.java:\[22,21] id.ac.uniska.pbo2.p02.Koleksi is abstract; cannot be instantiated, itu terjadi karena koleksi merupakan abstract class dan dia digunakan sebagai class dasar di buku dan majalah hingga tidak bisa dibuat objek secara langsung



2.Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi

@Override ada, dan jika dihapus?

= a. kalau nama method diubah menjadi **hitungdenda** dan **Override** masih ada yang muncul error karena nama methodnya tidak sesuai dengan method pada class induk atau interface.

b. kalau nama methodnya masih **hitungdenda** dan **Override**  nya dihapus maka tetap error karena method **hitungDenda** yang dibutuhkan belum dibuat

c. Kalau methodnya dikembalikan jadi **hitungDenda** dan **Override** nya dihapus maka program dapat dijalankan



3\. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan?

= terjadi error "IllegalArgumentException: Judul tidak boleh kosong" ini karena judul buku nya berisi **string** kosong ("") dan program menolak pembuatan objeknya.



4\. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main

menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar?

= aturan yang di langgar ada di **enkapsulasi**, itu karena status koleksi bisa diubah diluar class nya, jadi B002 yang masih dipinjam siti bisa terubah jadi **TERSEDIA** lalu dipinjam lagi oleh budi

