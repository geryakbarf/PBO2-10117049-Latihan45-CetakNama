/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan45.cetaknama;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mencetak nama sebanyak
 * yang diinginkan oleh user
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak (String nama){
        System.out.println("Nama Anda : "+nama);
    }
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for(int i=1; i<=jmlCetak;i++){
            System.out.println(i+". "+nama);
        }
    }
    
    
}
