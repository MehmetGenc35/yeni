package AABiletRezervasyon;

import java.util.Scanner;

public class YolcuService {



    public void informationPassenger(Bus bus,Yolcu yolcu,Ticket ticket){
        Scanner inp=new Scanner(System.in);
        //8-kullanıcıdan bilgileri alalım
        System.out.println("* Bilet Rezervasyon Sistemine Hoşgeldiniz *");

        System.out.println("Lütfen adınızı giriniz: ");
        String name=inp.nextLine();

        System.out.println("Lütfen soyadınızı giriniz: ");
        String surName=inp.nextLine();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int age=inp.nextInt();

        System.out.println("Lütfen gidilecek mesafe bilgisini KM olarak giriniz: ");
        double distance=inp.nextDouble();

        System.out.println("Lütfen yolculuk tipini seçiniz :");
        System.out.println("1. Tek Yön");
        System.out.println("2. Gidiş-Dönüş");
        int type=inp.nextInt();
        inp.nextLine();

        System.out.println("Koltuk no seçiniz : ");
        System.out.println("Tekli koltuk ücreti %20 daha fazladır.");
        System.out.println(bus.seatNo);//mevcut koltuk noları:"1","2",..."32"
        String seat=inp.next();

        //seçilen koltuk no listede var mı,rezerve edilmiş mi
        boolean isReserved=!bus.seatNo.contains(seat);
        if (isReserved){
            //koltuk listede yoksa
            System.out.println("Seçilen koltuk rezerve edilmiştir.");
        }
        //girilen değerler geçerli mi
        if (age>0 && distance>0 && (type==1 || type==2) && !isReserved ){

            //koltuk no rezerve olacağı için listeden çıkaralım.
            bus.seatNo.remove(seat);
            //bileti oluşturalım
            yolcu.setName(name);
            yolcu.setSurName(surName);
            ticket.setDistance(distance);
            ticket.setTypeNo(type);
            ticket.setSeatNo(seat);


        }else{
            System.out.println("Geçersiz giriş yaptınız.");
        }

    }
}
