/*
 * Ad Soyad: Aslıhan İlhan
 * Ogrenci No: 250541098
 * Tarih: 06.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
 * 
 * Bu program kullanicidan bir dairenin yaricapini alir ve
 * daire ile ayni yaricapa sahip bir kure icin cesitli geometrik hesaplamalar yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = scanner.nextDouble();

        double daireAlani = PI * Math.pow(r, 2);
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm²%n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm³%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²%n", kureYuzeyAlani);
    }
}
