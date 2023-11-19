package com.ecemkoro.kararKontrolMekanizmalari;

public class If {
  public static void main(String[] args) {
    System.out.println("-------IF------");

       // ŞART / ŞARTLAR
    if (1<50){
      System.out.println("EVET");
    }

    int sayi = 10;
    if (1< sayi){
      System.out.println("EVET");
    }

    int a = 1, b = 2, c=3;
    int x, y, z;
    x = 90;
    y = 50;
    z = 100;
    if ((x+y+z) > (a+(b*c))){
      System.out.println("Sağlandı");
    }


  }

}
