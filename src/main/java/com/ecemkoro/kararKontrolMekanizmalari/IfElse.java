package com.ecemkoro.kararKontrolMekanizmalari;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    System.out.println("IF ELSE");

    /*
    if (1<50){
      System.out.println("EVET UYGUNDUR");
    } else {
      System.out.println("HAYIR UYGUNDUR");
    }


    System.out.println("-------OY KULLANMA-----------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen yaşınızı giriniz: ");
    int yas = sc.nextInt();

    int secmenYasi = 16;

    if (secmenYasi < yas){
      System.out.println("EVET OY KULLANABİLİRSİNİZ.");
    } else {
      System.out.println("HAYIR HENÜZ OY KULLANAMAZSINIZ.");
    }


    System.out.println("-------EHLİYET KULLANMA-----------");
    int adayYasi = 16;

    if (adayYasi == 16){
      System.out.println("Aday stajyer olabilir.");
    } else if (adayYasi > 17) {
      System.out.println("Aday reşit, ehliyet alabilir.");
    } else {
      System.out.println("Üzgünüm ehliyet için uygun değilisiniz");
    }


    //TODO: ÖDEV: Bu kodu sağlıklı ise yaş kontrolüne girecek şekilde düzelt. Sağlıksızsa kontrole sokma!
    System.out.println("-------EHLİYET KULLANMA 1.Durum-----------");
    int adayKisininYasi = 25;
    boolean saglikDurumu = false;

    if (adayKisininYasi == 16 ){

      if (saglikDurumu == true){
        System.out.println("Aday stajyer olabilir.");
        System.out.println("Sağlıklı");
      } else {
        System.out.println("Sağlıklı değil.");
      }

    } else if (adayKisininYasi > 17 ) {

      if (saglikDurumu == true){
        System.out.println("Reşit ehliyet alabilir.");
        System.out.println("Sağlıklı");

      } else {
        System.out.println("Sağlıklı değil.");
      }

    } else  {
      System.out.println("Üzgünüm ehliyet için uygun değilsiniz.");
    }
     */


    System.out.println("-------EHLİYET KULLANMA ÖDEV ÇÖZÜMÜ-----------");

    //Kullanıcı girdisini okumak için bir Scanner nesnesi oluşturulur. System.in konsoldan girdi almak için kullanılır.
    Scanner scanner = new Scanner(System.in);

    // Kullanıcıdan yaş bilgisi alınıyor
    int adayinYasi;
    while (true) {
      System.out.print("Lütfen adayın yaşını giriniz: ");
      if (scanner.hasNextInt()) {   // if (scanner.hasNextInt()) kontrolü, girilen değerin bir tamsayı (int) olup olmadığını kontrol eder.
        adayinYasi = scanner.nextInt(); // adayinYasi = scanner.nextInt(); satırı, girilen tamsayıyı adayinYasi değişkenine atar.
        if (adayinYasi >= 0) {
          break;
        } else {
          System.out.println("Yaş negatif olamaz. Lütfen geçerli bir yaş giriniz.");
        }
      } else {
        System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
        scanner.next(); // Geçersiz girişleri temizler
      }
    }

    // Kullanıcıdan sağlık durumu bilgisi alınıyor
    String saglikDurumuCevabi;

    while (true) {
      System.out.print("Adayın sağlık durumu uygun mu? (EVET/HAYIR): ");
      saglikDurumuCevabi = scanner.next().trim().toUpperCase();
      if (saglikDurumuCevabi.equals("EVET") || saglikDurumuCevabi.equals("HAYIR")) {
        break;
      } else {
        System.out.println("Lütfen 'EVET' veya 'HAYIR' olarak cevap veriniz.");
        scanner.nextLine(); // Hatalı girdiyi temizle
      }
    }
    boolean adayinSaglikDurumu = saglikDurumuCevabi.equals("EVET"); // saglikDurumuCevabi değişkeninin değeri "EVET" ise adayinSaglikDurumu true, değilse false olur.

    // Ehliyet Kontrolü
    if (adayinSaglikDurumu) {
      if (adayinYasi >= 18) {
        System.out.println("Aday sağlıklı ve reşit. Ehliyet almaya uygundur.");
      } else if (adayinYasi == 16) {
        System.out.println("Aday sağlıklı ve stajyer olmaya uygundur.");
      } else {
        System.out.println("Adayın ehliyet almak için yaşı uygun değildir.");
      }
    } else {
      System.out.println("Adayın ehliyet almak için sağlık durumu uygun değil.");
    }
    scanner.close(); // Scanner nesnesi kapatılır. Bu, kaynakların doğru şekilde serbest bırakılmasını sağlar.


  }
}
