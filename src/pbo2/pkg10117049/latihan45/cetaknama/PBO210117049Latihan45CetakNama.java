/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mencetak nama sebanyak
 * yang diinginkan oleh user
 */
public class PBO210117049Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        ptr.setNama(baca.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        ptr.setJmlCetak(baca.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
