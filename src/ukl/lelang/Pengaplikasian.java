/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.lelang;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pengaplikasian {

    public static void main(String[] args) {
        
        Barang barang1 = new Barang();
        Masyarakat masyarakat1 = new Masyarakat();
        Petugas petugas1 = new Petugas();
        Lelang lelang1 = new Lelang();
        Laporan laporan1 = new Laporan();
        
        Scanner input = new Scanner(System.in);
        
        laporan1.laporan(petugas1);
        System.out.println("");
        System.out.println("<<<<<<<< SELAMAT DATANG DI APLIKASI LELANG >>>>>>>>");
        System.out.println("Ketik 1 jika anda mau melelang barang");
        System.out.println("Ketik 2 jika anda mau menawar barang");
        System.out.println("Ketik 3 jika anda mau melihat daftar barang lelang");
        System.out.println("Ketik 4 jika anda mau melihat laporan pemenang lelang");
        System.out.println("Ketik 0 untuk keluar");
        int pilih;
        do{
            System.out.print("Masukkan pilihan anda disini : ");
            pilih = input.nextInt();
            if(pilih == 1){
                 laporan1.laporan(masyarakat1);
                 laporan1.laporan(barang1, masyarakat1);
                lelang1.prosesLelang(masyarakat1, lelang1, barang1);
            } else if(pilih == 2){
                laporan1.laporan(masyarakat1);
                 laporan1.laporan(barang1, masyarakat1);
                lelang1.prosesPenawaran(masyarakat1, lelang1, barang1);
            }else if(pilih == 3){
                laporan1.laporan(barang1, masyarakat1);
            }else if(pilih==4){
                lelang1.pemenang(barang1);
            }
        }while(pilih != 0);
        
    }
    
}
