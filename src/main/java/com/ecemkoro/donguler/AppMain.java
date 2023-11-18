package com.ecemkoro.donguler;

public class AppMain {
  public static void main(String[] args) {
     /*
    int i = 0;

    ++i; // i = i+1;
    System.out.println(i);

    ++i;
    System.out.println(i);

    System.out.println("-------------------------------");

     */

    // BASLANGIC // SART // ARTTIRIM ya da AZALTIM
    for (int i=0; i<10; i++){ // Scope / Kapsam
      System.out.println(i);
    }

    System.out.println("--------------------------------");

    for (int i=1; i<13; i++){
      System.out.println("i" + i);
      for (int j=30; j<i; j++)
        System.out.println("\tj: " + j);
    }

    System.out.println("--------------------------------");


    for (int i=1; i<13; i=i+3){
      System.out.println("i" + i);
      for (int j=30; j<i; j=j+5)
        System.out.println("\tj: " + j);
    }
  }
}
