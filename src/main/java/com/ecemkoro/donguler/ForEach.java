package com.ecemkoro.donguler;

public class ForEach {
  public static void main(String[] args) {

    String ogrenci1 = "Mert";

    String ogrenci2 = "Ali";

    String ogrenci3 = "Ebru";

    String ogrenci4 = "Elçin";

                          //0       1      2      3
    String[] ogrenciler = {"Mert", "Ali", "Ebru", "Elçin"};

      //Çoklu Taraf  Tekli Taraf
    for (String ogrenci: ogrenciler) {
      System.out.println(ogrenci);
    }

    System.out.println("---------------------------");

    int[] numaralar = {15, 250, 120, 85};

    for (int numara : numaralar){
      System.out.println(numara +numara*20/100);
    }
  }



}
