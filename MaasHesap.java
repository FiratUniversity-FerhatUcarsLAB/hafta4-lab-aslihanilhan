
/*
 * Ad Soyad: Aslıhan İlhan
 * Ogrenci No: 250541098
 * Tarih: 06.11.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 * 
 * Bu program kullanicidan calisan bilgilerini alir ve
 * brut maas, mesai, kesintiler ve net maas hesaplamalarini yapar.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgiler alınır
        System.out.print("Calisanin adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaati = input.nextInt();

        // Kesinti oranları (sabitler)
        final double SGK = 0.14;
        final double GELIR_VERGISI = 0.15;
        final double DAMGA_VERGISI = 0.00759;

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgk = toplamGelir * SGK;
        double gelirVergisi = toplamGelir * GELIR_VERGISI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI;

        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
        double netMaas = toplamGelir - toplamKesinti;

        // Ek bilgiler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / (haftalikSaat * 4);
        double gunlukNet = netMaas / 22;

        // Çıktı
        System.out.println("\n==============================");
        System.out.println("       MAAS BORDROSU");
        System.out.println("==============================");
        System.out.println("Calisan: " + adSoyad);
        System.out.println("(Tarih bilgisi girilmedi)");

        System.out.printf("\nBrut Maas            : %.2f TL", brutMaas);
        System.out.printf("\nMesai Ücreti (%d s)  : %.2f TL", mesaiSaati, mesaiUcreti);
        System.out.printf("\nToplam Gelir         : %.2f TL", toplamGelir);

        System.out.println("\n\n--- Kesintiler ---");
        System.out.printf("SGK (%.1f%%)           : %.2f TL\n", SGK * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL\n", GELIR_VERGISI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL\n", DAMGA_VERGISI * 100, damgaVergisi);
        System.out.printf("Toplam Kesinti        : %.2f TL\n", toplamKesinti);

        System.out.printf("\nNet Maaş             : %.2f TL\n", netMaas);

        System.out.println("\n--- İstatistikler ---");
        System.out.printf("Kesinti Oranı        : %.1f%%\n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç   : %.2f TL/saat\n", saatlikNet);
        System.out.printf("Günlük Net Kazanç    : %.2f TL/gün\n", gunlukNet);
        System.out.println("==============================");

        input.close();
    }
}
