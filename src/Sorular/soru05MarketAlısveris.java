package Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru05MarketAlısveris {

    public static void main(String[] args) {
        String[] urunler= {"Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Çilek","Kavun","Üzüm","Limon"};
        Double[] fiyatlar= {2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50};
        List<String> alısverisListesi= new ArrayList<>();
        Scanner input= new Scanner(System.in);
        int secim = 1;
        double toplamOdeme=0;


        do{

            System.out.println("Ürünler: 00=Domates, 01=Patates, 02=Biber, 03=Soğan, 04=Havuç, 05=Elma, 06=Muz, 07=Çilek, 08=Kavun, 09=Üzüm, 10=Limon");
            System.out.println("Lütfen almak istediğiniz ürünün kodunu giriniz: ");
            int urun= input.nextInt();

            if(urun<11 || urun>=0){
                System.out.println("Kaç kilo almak istersiniz: ");
                int kilo=input.nextInt();
                toplamOdeme=toplamOdeme+(fiyatlar[urun]*kilo);

                alısverisListesi.add(urunler[urun]);
                System.out.println("Alışverişe devam etmek için 1'i alışverişi sonlandırmak için 0'ı tuşlayınız: ");
                if(secim==1||secim==0){
                    secim=input.nextInt();
                }else{
                    System.out.println("Lütfen 0 ya da 1 giriniz!!!");
                }


            }else{
                System.out.println("Lütfen geçerli bir ürün giriniz!!!");
            }



        }while(secim!=0);

        System.out.println("Kasaya kaç TL ödeyeceksiniz: ");
        double alınanPara=input.nextDouble();
        if(toplamOdeme<alınanPara){
            System.out.println("Alınan ürünler: "+ alısverisListesi);
            System.out.println(toplamOdeme);
            System.out.println("para üstünüz: "+(alınanPara-toplamOdeme));
        }else{
            System.out.println("Ödemeniz yeterli değildir!!!");
        }





    }
}
