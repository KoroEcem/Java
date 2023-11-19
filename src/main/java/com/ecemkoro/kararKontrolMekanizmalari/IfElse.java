package com.ecemkoro.kararKontrolMekanizmalari;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    System.out.println("IF ELSE");

    if (1<50){
      System.out.println("EVET");
    } else {
      System.out.println("HAYIR");
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
    int adayKisininYasi = 18;
    boolean saglikDurumu = true;

    if (adayKisininYasi == 16){
      if (saglikDurumu == true){
      System.out.println("Aday stajyer olabilir.");
      System.out.println("Sağlıklı");
      } else {
        System.out.println("Sağlıklı değil");
      }
    } else if (adayKisininYasi > 17) {
      if (saglikDurumu == false) {
        System.out.println("Aday reşit, ehliyet alabilir.");
        System.out.println("Sağlıklı");
      } else {
        System.out.println("Sağlıklı değil");
      }
    } else {
      System.out.println("Üzgünüm ehliyet için uygun değilisiniz");
    }


  }
}
