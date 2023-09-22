package Sorular.kütüphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kütüphane {
    public static void main(String[] args) {

        /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */
        getStarted();



    }

    private static void getStarted() {
        Scanner input= new Scanner(System.in);
        KitapService kütüphane= new KitapService();
        int select=-1;
        do {
            System.out.println("---------------------------------");
            System.out.println("Kütüphanemize Hoşgeldiniz...");
            System.out.println("Kütüphanemizde ne yapmak istersiniz?");
            System.out.println("1-Yeni Kitap Ekleme");
            System.out.println("2-Kitapları Sıralama");
            System.out.println("3-Kitapları Silme");
            System.out.println("4-Kütüphaneyi Sıfırla");
            System.out.println("0-Çıkış");
            System.out.print("Seçiminiz: ");
            select=input.nextInt();


            switch (select){
                case 1:
                    kütüphane.kitapEkleme();
                    //kütüphane.kitapGöster();
                    //System.out.println("Kitabınız kütüphanemize başarıyla eklenmiştir..");
                    break;
                case 2:
                    kütüphane.kitaplarıAlfabetikSırala();
                    break;
                case 3:
                    kütüphane.kitapSilme();
                    break;
                case 4:
                    kütüphane.kutuphaneyiSifirla();
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız!!!");
                    break;
            }

        }while(select!=0);

    }


}



