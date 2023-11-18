package com.ecemkoro.firstProject;

public class Insan { // scope = kapsam
  /*
  String bas;
  String govde;
  String ayak;

   */

  public static void main(String[] args) {

    String firstName = "Ecem";
    String lastName = "Koro";
    Integer kilo = 65;
    double boy = 1.77d;

    System.out.println("Ad: " + firstName);
    System.out.println("Soyad: " + lastName);
    System.out.println("Kilo: " + kilo);
    System.out.println("Boy: " + boy);

    firstName = "Ali Yağız";
    lastName = "Tar";
    kilo = 75;
    boy = 1.90d;
    System.out.println("\n\nBoy: " + boy + "\nKilo: " + kilo + "\nAd: " + firstName + " " + "Soyad: " + lastName);


  }
}
