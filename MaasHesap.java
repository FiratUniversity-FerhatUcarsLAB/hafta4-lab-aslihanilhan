
/*
 * Ad Soyad: Ahmet Yilmaz
 * Ogrenci No: 12345
 * Tarih: 04.11.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program kullanicidan calisan bilgilerini alir ve
 * brut maas, mesai, kesintiler ve net maas hesaplamalarini yapar.
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sabit kesinti oranlari
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Bilgi alımı
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===\n");

        System.out.print("Calisan adi soyadi: ");
        String adSoyad = scanner.nextLine();

        System.out.print("Brut maas (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = scanner.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = scanner.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        // Net maaş
        double netMaas = toplamGelir - toplamKesinti;

        // Sonuclar
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / (22 * haftalikSaat / 5.0); // 22 iş günü, haftada 5 gün
        double gunlukNet = netMaas / 22;

        // Sistem tarihi
        LocalDate bugun = LocalDate.now();
        String tarih = bugun.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        // Bordro yazdırma
        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s\n", adSoyad);
        System.out.printf("Tarih  : %s\n", tarih);

        System.out.println("\nGELIRLER:");
        System.out.printf("  Brut Maas              : %10.2f TL\n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat) : %10.2f TL\n", mesaiSaati, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %10.2f TL\n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL\n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL\n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)  : %10.2f TL\n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %10.2f TL\n", toplamKesinti);

        System.out.println("\nNET MAAS                 : " + String.format("%.2f TL", netMaas));

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f%%\n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat\n", saatlikNet);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun\n", gunlukNet);
        System.out.println("====================================");

        scanner.close();
    }
}
