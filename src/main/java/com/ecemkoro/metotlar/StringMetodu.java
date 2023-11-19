package com.ecemkoro.metotlar;

public class StringMetodu {
  public static void main(String[] args) {
    System.out.println("String Metodu");

    String adi = "Ecem";
    Metot.cizgiCiz();
    System.out.println(adi.length());

    Metot.cizgiCiz();
    if (adi.length() > 5){
      System.out.println("EVET");
    } else {
      System.out.println("HAYIR");
    }

    Metot.cizgiCiz();
    String adi2 = "Ecem";
    String adi3 = "Yağız";

    if (adi2 == adi3){
      System.out.println("EŞİT");
    } else {
      System.out.println("Değil");
    }

   Metot.cizgiCiz();
    if (adi2.equals(adi3)) {
      System.out.println("EŞİT");

    } else {
      System.out.println("Değil");
    }

    Metot.cizgiCiz();
    StringMetodu obj1 = new StringMetodu();
    obj1.selamVer("Ecem Koro");
    obj1.selamVer("Ali Yağız Tar");

    Metot.cizgiCiz();
    StringMetodu obj = new StringMetodu();
    String sonuc = obj.hesabiKapat(1,"Ecem","Koro",true);
    System.out.println("Gelen Cevap: " + sonuc);

  }

  private void selamVer(String isim){

    System.out.println("SELAMLAR SAYIN " + isim + " HOŞGELDİNİZ.");
  }

  private String hesabiKapat (int uyeNo, String adi, String soyadi, boolean uyeDurumu){

    if (uyeBul(uyeNo)== true && (uyeDurumu == true)) {

      return "Tamam " + adi + " "  + soyadi +  " "  +"hesap borcu ödenmiştir.";

    }

    return "OLMADI";

  }

  private static boolean uyeBul(int uyeNo) {

    if (uyeNo>0){
      return true;
    } else {
      return false;
    }
  }

}
