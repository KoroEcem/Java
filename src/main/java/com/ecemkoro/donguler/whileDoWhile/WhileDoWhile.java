package com.ecemkoro.donguler.whileDoWhile;

public class WhileDoWhile {
  public static void main(String[] args) {

    System.out.println("-------------FOR---------");
    for (int i=0; i<10; i++){
      System.out.println(i);
    }

    System.out.println("------------WHILE---------"); // Şart sağlanmazsa çalışmaz
    int i = 0;
    while (i<10){
      System.out.println(i);
      i++;
    }

    System.out.println("------------DO WHILE---------"); // Şart sağlanmasa bile en az 1 kere çalışır
    int a = 0;
    do {
      System.out.println(a);
      a++;
    } while (a<5);

    /*
    System.out.println("------------WHILE SONSUZ DÖNGÜ---------");
    int j = 0;
    while (true){
      System.out.println(j);
      j++;
    }

    System.out.println("------------FOR SONSUZ DÖNGÜ---------");
    for( ; ; ){
    System.out.println("Sonsuz döngü");
    }
   */

  }
}
