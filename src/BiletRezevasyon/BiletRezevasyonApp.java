package BiletRezevasyon;

import java.util.Scanner;

/*
Project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

    1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
    2- Kullanıcıdan     mesafe (KM),
                        yolcu yaşı ,
                        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
                        ve koltuk no bilgilerini alınır.
             NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
                  Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
                  Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

    3-Fiyat hesaplama kuralları:
       -Mesafe başına ücret:
                  Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
       -Tekli Koltuk ücreti:
                  Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
       -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
                   i)-Çift Yön indirimi:
                               "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
                   ii)-Yaş indirimi:
                                Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
                                Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

 */
public class BiletRezevasyonApp {

    public static void main(String[] args) {
        YolcuService yolcuService=new YolcuService();
        TicketService ticketService=new TicketService();
        Bus bus=new Bus("35 MD 2023");
        Yolcu yolcu=new Yolcu();
        Ticket ticket=new Ticket();



        start(yolcuService,ticketService,bus,yolcu,ticket);

    }
    public static void start(YolcuService yolcuService,TicketService ticketService,Bus bus,Yolcu yolcu,Ticket ticket){

        Scanner inp=new Scanner(System.in);
        System.out.println("Bilet Rezervasyon Sistemi");
        int select=-1;

        do{
            yolcuService.informationPassenger(bus,yolcu,ticket);

            ticketService.getPriceTicket(yolcu,ticket);

            ticketService.printTicket(bus,yolcu,ticket);

            System.out.println("Çıkış için 0 yeni işlem için 1 giriniz: ");
            select=inp.nextInt();


        }while(select!=0);

    }



}
