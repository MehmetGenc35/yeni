package AARestaurantAPP;
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


import java.util.Scanner;

/*
ÖDEV: Şirket büyüdü, cafe kısmı açıldı.
      Aynı uygulama cafe kısmında da kullanılsın.
      Cafede farklı menü var.
        Dish dish1=new Dish(401,"Tiramisu",35.0);
        Dish dish2=new Dish(402,"Dondurma",25.0);
        Dish dish3=new Dish(402,"Profiterol",25.0);
        Dish dish4=new Dish(403,"Kahve",17.5);
        Dish dish5=new Dish(404,"Çay",7.5);
        Dish dish6=new Dish(405,"Portakal Suyu",25.5);
      Uygulama başladığında restaurant/cafe seçeneği olsun.

*/
public class RestaurantBillGeneratorAPP {

    public static void main(String[] args) {

        start();

    }

    private static void start() {
        DishService dishService=new DishService();
        OrderService orderService=new OrderService();
        System.out.println("------- MEHM-ET RESTAURANT'a HOŞGELDİNİZ -------");
        Scanner inp=new Scanner(System.in);
        int option=-1;
        do {
            System.out.println("-".repeat(50));
            System.out.println("Hangi işlemi yapmak istiyorsunuz seçiniz: ");
            System.out.println("1-Menüyü Göster\n2-Sipariş Oluşturma\n3-Sipariş İptal\n4-Hesap Oluştur\n0-ÇIKIŞ");
            System.out.println("-".repeat(50));
            option=inp.nextInt();inp.nextLine();


            switch (option){
                case 1:
                    dishService.showMenu();
                    break;
                case 2:
                    orderService.createOrder();
                    break;
                case 3:
                    //cancelOrder();
                    break;
                case 4:
                    //printTotalPrice();
                    break;
                case 0:
                    System.out.println("Sistemden çıkılıyor...");
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız...");
                    break;

            }
        }while(option!=0);




    }


}
