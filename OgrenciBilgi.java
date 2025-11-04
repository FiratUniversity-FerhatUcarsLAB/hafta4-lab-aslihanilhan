/*
 * Ad Soyad: Ahmet Yilmaz
 * Ogrenci No: 12345
 * Tarih: 04.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diger java dosyalarinin basinda da bu ornek formattaki gibi kisa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner scanner = new Scanner(System.in);
        
        // Degisken tanimlamalari
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Ad: ");
        ad = scanner.nextLine();
        
        // Soyad
        System.out.print("Soyad: ");
        soyad = scanner.nextLine();
        
        // Ogrenci No
        System.out.print("Ogrenci No: ");
        ogrenciNo = scanner.nextInt();
        
        // Yas
        System.out.print("Yas: ");
        yas = scanner.nextInt();
        
        // GPA
        System.out.print("GPA (0.00 - 4.00 arasi): ");
        gpa = scanner.nextDouble();
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNo);
        System.out.printf("Yas: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);
        
        // Durumu hesapla ve yazdir
        String durum = (gpa >= 2.0) ? "Basarili Ogrenci" : "Basarisiz Ogrenci";
        System.out.println("Durum: " + durum);
        
        // Scanner'i kapatin 
        scanner.close();
    }
}
                    
