package OOPAracSigortaApp;

import java.util.Scanner;

public class AracSigortaRunner {
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
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        start();

    }
    public static void start(){
        AracServis as=new AracServis();
        System.out.println("-------Sigorta Pirim Hesaplama Sistemi-------");
        System.out.println("---------------------------------------------");
        boolean isExist=true;
        do {
            System.out.println("Hangi döneme ait prim hesaplanacak:\n1-Haziran 2023\n2-Aralık 2023\n0-ÇIKIŞ");
            System.out.print("Seçiminizi giriniz: ");
            System.out.println();
            int donem=input.nextInt();
            if(donem!=0){
                System.out.println("Aracınızı giriniz: \n1-otomobil\n2-otobüs\n3-kamyon\n4-motorsiklet\n0-ÇIKIŞ");
                System.out.print("Seçiminizi giriniz: ");
                System.out.println();
                int tip=input.nextInt();input.nextLine();

                switch (tip){
                    case 1:
                        as.pirimHesapla(donem,tip);
                        break;
                    case 2:
                        as.pirimHesapla(donem,tip);
                        break;
                    case 3:
                        as.pirimHesapla(donem,tip);
                        break;
                    case 4:
                        as.pirimHesapla(donem,tip);
                        break;
                    case 0:
                        isExist=false;
                        System.out.println("Ana menüye yönlendiriliyorsunuz...");
                        break;
                    default:
                        System.out.println("Hatalı bir giriş yaptınız,tekrar deneyiniz...");
                        break;
                }
                System.out.println("Yeni işlem için 1 çıkş için 0 giriniz: ");
                int opt=input.nextInt();
                if (opt==1){
                    continue;
                }else if(opt==0){
                    isExist=false;
                    System.out.println("Çıkış işlemi yapılıyor...");
                }else{
                    System.out.println("Hatalı bir giriş yaptınız...");
                }
            }else{
                isExist=false;
            }


        }while(isExist);
        System.out.println("İyi günler dileriz...");



    }
}
