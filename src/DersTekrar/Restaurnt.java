package DersTekrar;

import java.util.Scanner;

public class Restaurnt {
/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
      1-Bir restaurantın online sipariş sisteminde hesabı
      yazdıran uygulama tasarlayınız.

      2-Restauranttaki yiyecekler bir listte tutulsun.
        Yiyeceklerin kodu, ismi ve ücreti olsun.

      3-Yiyecek menüsü gösterme, sipariş oluşturma/iptal ve hesap
        oluşturma için seçim menüsü gösterilsin.

      4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
        Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                      Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                      Her bir yiyecek siparişi için tutar hesaplansın

        Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
        Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                         toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public static void main(String[] args) {
    getSelection();





}

    private static void getSelection() {
        Scanner input= new Scanner(System.in);

        DishService dishService=new DishService();


        int select=-1;

        do{
            System.out.println("-----------------------------");
            System.out.println("---- MEHM-ET -----");
            System.out.println("1-Menü");
            System.out.println("2-Sipariş Gir");
            System.out.println("3-Sipariş İptal");
            System.out.println("4-Hesap");
            System.out.println("0-ÇIKIŞ");
            System.out.print("Seçiminiz: ");
            select=input.nextInt();
            System.out.println("-----------------------------");

            switch (select){
                case 1:
                    dishService.showMenu();
                    break;
                case 2:
                    //Sipariş
                    break;
                case 3:
                    //Sipariş iptal
                    break;
                case 4:
                    //Hesap
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız...");
                    break;


            }
        }while(select!=0);









    }
}
