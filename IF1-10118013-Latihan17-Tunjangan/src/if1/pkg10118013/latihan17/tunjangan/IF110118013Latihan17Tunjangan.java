/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menghitung Gaji Total
 */
public class IF110118013Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("============== Program Tunjungan ==============");
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        
        float gajiPokok = scanner.nextFloat();
        float tunjangan = 0 ;


        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String statusTunjangan = scanner.next();
        if (statusTunjangan.equals ("Menikah")){
            tunjangan = (float) (gajiPokok * 0.35);
        }
        float totalGaji = (gajiPokok + tunjangan);

        System.out.println("========= Hasil Perhitungan Gaji Anda =========");
        System.out.println("Gaji Pokok\t\t\t\t: Rp. " +gajiPokok);
        System.out.println("Tunjangan\t\t\t\t: Rp. " +tunjangan);
        System.out.println("Total Gaji\t\t\t\t: Rp. " +totalGaji);
        
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
