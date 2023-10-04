package AAracSigortaApp;

import java.util.Scanner;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */
public class AracSigortaAplication {

    public static void main(String[] args) {

        start();

    }
    public static void start (){
        System.out.println("-----Zorunlu Arac Sigorta Hesaplama Sistemi-----");
        Arac arac=new Arac();
        boolean isExist;
        Scanner inp= new Scanner(System.in);
        do{
            System.out.println("Lütfen sigortanın hangi döneme ait olduğunu seçiniz:  ");
            System.out.println("1-Haziran 2023");
            System.out.println("2-Aralık 2023");
            int term=inp.nextInt();
            inp.nextLine();

            String termName=term==1 ? "Haziran 2023" : "Aralık 2023";

            int select;

            if(term==1||term==2){

                arac.typeOfVehicle(term);
                System.out.println("Yeni bir işlem yapmak ister misiniz?");
                System.out.println("1-EVET   2-HAYIR");
                int secim=inp.nextInt();
                    if(secim==1 || secim==2){
                    isExist=secim==1?true:false;
                }else{
                    System.out.println("hatalı bir giriş yaptınız...");
                    isExist=true;
                }

            }else{
                System.out.println("Lütfen geçerli bir seçim yapınız");
                isExist=true;
            }
        }while(isExist);
        System.out.println("İyi günler dileriz...");




    }

}
