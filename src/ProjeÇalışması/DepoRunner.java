package ProjeÇalışması;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DepoRunner {

    static DepoService ds=new DepoService();

    public static void main(String[] args) {


        start();

    }

    public static void start(){
        /*2-) methodlar olusturacagiz.
     *      urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist
     *
     *      urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
     *     ///  printf(%10)
     *      urunGirisi      ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
     *
     *      urunuRafaKoy    ==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
     *
     *      urunCikisi      ==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
                *                          urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.  ///exception
                *      ===> yaptigimiz tum degisiklikler listede de gorunsun.*/

        Scanner input= new Scanner(System.in);
        int select=-1;

            System.out.println("******DEPOMUZA HOŞGELDİNİZ******");
            System.out.println("***Yapabileceğiniz İşlemler***");
            System.out.println("1-Ürün Tanımlamak");
            System.out.println("2-Ürün Listele");
            System.out.println("3-Ürün Girişi");
            System.out.println("4-Ürünü Rafa Koy");
            System.out.println("5-Ürün Çıkışı");
            System.out.println("0-ÇIKIŞ");
            System.out.print("Depomuzda ne yapmak istersiniz, Lütfen seçiniz: ");
            select= input.nextInt();

            switch(select){
                case 1:
                    ds.productIdentification();
                    break;
                case 2:
                    //Ürün tanımlama
                    break;
                case 3:
                    //Ürün tanımlama
                    break;
                case 4:
                    //Ürün tanımlama
                    break;
                case 5:
                    //Ürün tanımlama
                    break;
                case 0:
                    System.out.println("Tekrar bekleriz, iyi günler...");
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız...");
                    break;

            }





    }

}
