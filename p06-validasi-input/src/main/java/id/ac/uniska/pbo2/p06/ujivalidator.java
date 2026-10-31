/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

/**
 *
 * @author asus
 */
public class ujivalidator {
    
    private static int gagal = 0;
      
    private static void cek(String nama, String hasil, boolean harusValid) {
        boolean valid = (hasil == null);
        if (valid != harusValid) {
            gagal++;
        }
        String status = (valid == harusValid) ? "SESUAI " : "SALAH ";
        System.out.println(status + nama + ": " + (valid ? "valid" : hasil));
    }
    
    public static void main(String[] args) {
        cek("NPM kosong", validator.npm(""), false);
        cek("NPM 5 digit", validator.npm("12345"), false);
        cek("NPM berisi huruf", validator.npm("24100101ab"), false);
        cek("NPM benar", validator.npm("2410010123"), true);
        
        cek("Nama terlalu pendek", validator.nama("Al"), false);
        cek("Nama benar", validator.nama("Siti Rahmah"), true);
        cek("Nama berisi angka", validator.nama("Siti123"), false);
        
        cek("Email tanpa domain", validator.email("siti@"), false);
        cek("Email benar", validator.email("siti.rahmah@uniska-bjm.ac.id"), true);
        
        cek("Nomor HP terlalu pendek", validator.nomorHp("0812"), false);
        cek("Nomor HP diawali 62", validator.nomorHp("6281234567890"), false);
        cek("Nomor HP 12 digit", validator.nomorHp("081234567890"), true);
        
        System.out.println();
        if (gagal == 0) {
            System.out.println("Semua aturan bekerja sesuai harapan");
        } else {
              System.out.println(gagal + " aturan belum sesuai");
        }
    }
}
