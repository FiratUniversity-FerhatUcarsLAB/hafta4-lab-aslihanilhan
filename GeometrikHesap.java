/*
 * Ad Soyad: Ahmet Yilmaz
 * Ogrenci No: 12345
 * Tarih: 04.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan bir dairenin yaricapini alir ve
 * daire ile ayni yaricapa sahip bir kure icin cesitli geometrik hesaplamalar yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit PI tanımlanıyor
        final double PI = 3.14159;
        
        // Scanner objesi oluşturuluyor
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan yarıçap alınıyor
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = scanner.nextDouble();
        
        // Hesaplamalar
        double alan = PI * Math.pow(r, 2);
        double cevre = 2 * PI * r;
        double cap = 2 * r;
        double kureHacim = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);
        
        // Sonuçları ekrana yazdırma
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm²\n", alan);
        System.out.printf("Daire Cevresi      : %.2f cm\n", cevre);
        System.out.printf("Daire Capi         : %.2f cm\n", cap);
        System.out.printf("Kure Hacmi         : %.2f cm³\n", kureHacim);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²\n", kureYuzeyAlani);
        
        // Scanner kapatılıyor
        scanner.close();
    }
}

