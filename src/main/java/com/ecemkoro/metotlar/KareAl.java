package com.ecemkoro.metotlar;

public class KareAl {
  public static void main(String[] args) {
    System.out.println("Kare Al");
    System.out.println("Karesi: " + kareAl(5,2));
    System.out.println("Toplama: " + topla(5,2,4));
  }

  private static float topla(float sayi1, float sayi2, float sayi3) {
    return sayi1 + sayi2 + sayi3;
  }

  private static double kareAl(double taban, double üs) {
    return Math.pow(taban, üs);
  }

}
