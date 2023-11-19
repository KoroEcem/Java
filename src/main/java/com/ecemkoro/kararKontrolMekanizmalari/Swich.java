package com.ecemkoro.kararKontrolMekanizmalari;

public class Swich {
  public static void main(String[] args) {

    /*
    if (ŞART1){

    } else if (ŞART2){

    } else if (ŞART2){

    } else {

    }
     */

    char harf = 'A';
    switch (harf){
      case 'A':
        System.out.println("Girilen harf:" + harf);
        break;

      case 'B':
        System.out.println("Girilen harf:" + harf);
        break;

      case 'C':
        System.out.println("Girilen harf:" + harf);
        break;

      default:
        System.out.println("Girilen şey bulunamadı: " + harf);
        break;
    }


    System.out.println("--------HAFTANIN GÜNLERİ--------");
    int gunSirası = 5;
    switch (gunSirası){
      case 1:
        System.out.println("Pazartesi");
        break;

      case 2:
        System.out.println("Salı");
        break;

      case 3:
        System.out.println("Çarşamba");
        break;

      case 4:
        System.out.println("Perşembe");
        break;

      case 5:
        System.out.println("Cuma");
        break;

      case 6:
        System.out.println("Cumartesi");
        break;

      case 7:
        System.out.println("Pazar");
        break;

      default:
        System.out.println("Bulunamadı");
    }

    System.out.println("----------DÖNGÜLERDE BREAK KULLANIMI--------------");
    for (int i = 0; i < 10 ; i++) {

      if (i == 3){
        System.out.println("BULUNDU: " + i);
        break; // break döngüyü kırar, continue; devam ettirir
      }

      System.out.println(i);

    }



  }
}
