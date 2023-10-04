package BiletRezevasyon;

import java.util.Scanner;

public class YolcuService {

    public void informationPassenger(Bus bus,Yolcu yolcu,Ticket ticket){
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen mesafe giriniz: ");
        double distance=inp.nextDouble();

        System.out.println("Lütfen yolculuk tipini giriniz: ");
        System.out.println("1-Tek Yön");
        System.out.println("2-Gidiş-Geliş");
        int type=inp.nextInt();inp.nextLine();

        System.out.println("Lütfen 1-32 arası koltuk seçiniz: ");
        System.out.println("Tekli koltuklar %20 daha pahalıdır! ");
        String seatNo=inp.nextLine();

        boolean isReserved= !bus.seats.contains(seatNo);
        if(isReserved){
            System.out.println("Koltuk rezerve edilmiştir...");

        }else{
            System.out.println("Lütfen adınızı giriniz: ");
            String name=inp.nextLine();

            System.out.println("Lütfen soyadınızı giriniz: ");
            String surName=inp.nextLine();

            System.out.println("Lütfen yaşınızı giriniz: ");
            int age=inp.nextInt();

            if(age>0 && distance>0 && (type==1 || type==2) && !isReserved){


                ticket.setDistance(distance);
                ticket.setType(type);
                ticket.setSeatNo(seatNo);
                bus.seats.remove(seatNo);

                yolcu.setName(name);
                yolcu.setSurName(surName);
                yolcu.setAge(age);

            }

        }

    }
}
