/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 *
 * @author asus
 */
public class Skripsi extends Koleksi {
    
    private String Penulis;
    private String programStudi;
    
    public Skripsi(String kode, String judul, int tahunTerbit, String Penulis, String programStudi){
        super(kode, judul, tahunTerbit);
        this.Penulis = Penulis;
        this.programStudi = programStudi;
    }
    
    @Override
    public int batasHariPinjam() {
        return 0;
    }
    
   @Override
    public boolean pinjam() {
        return false;
    } 
   
   @Override
    public long hitungDenda(int hariTerlambat) {
        return 0;
    }
   
   @Override
    public String keterangan() {
        return "Skripsi karya " + Penulis + ", " + programStudi;
    }
    
}
