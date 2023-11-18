package com.ecemkoro.degiskenler;

public class AppMain {
  public static void main(String[] args) {
    // 30 = a + b
    int a = 25;
    int b = 10;
    int c = (a + b); // + - * /
    System.out.println("Toplam: " + c);

    // İki tamsayı arasında işlem yaparken sayının hassasiyetine dikkat edilmelidir
    float sonuc = a / (float) b;
    System.out.println("Bölüm: " + sonuc);

    System.out.println("Mod Alma: " + (a % b));

    System.out.println(a>b); // Doğruysa true yanlışsa false basar
    System.out.println((b>a) ? "EVET" : "HAYIR"); //  Ternary Operator - Üçlü Operatör Eğer şart sağlanırsa 1.yi yap, şart sağlanmazsa ikinciyi yap

    int i = 0;
    System.out.println(i+1); // 1
    System.out.println(i); // 0

    int arttirimSonucu = i+2;
    System.out.println("i: " + i); // 0
    System.out.println("arttirimSonucu: " + arttirimSonucu); // 2

    // i = i+1;
    //System.out.println("i: " + i); //1

    System.out.println(++i); // Önce arttır sonra yazar
    System.out.println(i++); // Sonra arttır sonucu yaz

    System.out.println(--i);
    System.out.println(i--);
  }
}
