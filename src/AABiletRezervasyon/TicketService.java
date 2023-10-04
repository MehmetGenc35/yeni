package AABiletRezervasyon;

import java.util.Scanner;

public class TicketService {



    public void getTotalPrice(Ticket ticket,Yolcu yolcu){
        double total=0;
        switch (ticket.getTypeNo()){
            case 1:
                if(Integer.valueOf(ticket.getSeatNo())%3==0){
                    total=ticket.getDistance()*(1.2);
                    System.out.println(total);
                }else{
                    total=ticket.getDistance()*1;
                    System.out.println(total);
                }
                break;

            case 2:
                if(Integer.valueOf(ticket.getSeatNo())%3==0){
                    total=ticket.getDistance()*(2.4);
                    System.out.println(total);
                }else{
                    total=ticket.getDistance()*2;
                    System.out.println(total);
                }
                break;
        }

        if(yolcu.getAge()<12){
            total=total*0.5;
            System.out.println(total);
        }else if(yolcu.getAge()>65){
            total=total*0.7;
            System.out.println(total);
        }
        ticket.setPrice(total);


    }
    public void printTicket(Bus bus,Ticket ticket,Yolcu yolcu){
        System.out.println("*".repeat(42));
        System.out.println("--- Bilet Detayı ---");
        System.out.println("Otobüs Plakası  :"+bus.getPlate());
        System.out.println("Yolcu           :"+yolcu.getName()+yolcu.getSurName());
        System.out.println("Mesafe          :"+ticket.getDistance());
        System.out.println("Yolculuk Tipi   :"+(ticket.getTypeNo()==1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Koltuk No       :"+ticket.getSeatNo());
        System.out.println("Toplam Tutar    :"+ticket.getPrice());
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));

    }







}
