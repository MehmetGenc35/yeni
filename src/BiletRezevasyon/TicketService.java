package BiletRezevasyon;

public class TicketService {


    //Bilet Hesaplama
    //Bileti yazdırma


    public void getPriceTicket(Yolcu yolcu,Ticket ticket){

        double toplam=0;

        switch (ticket.getType()){
            case 1:
                if(Integer.parseInt(ticket.getSeatNo())%3==0){
                    toplam=ticket.getDistance()*1.2;
                }else{
                    toplam=ticket.getDistance()*1;
                }
                break;
            case 2:
                if(Integer.parseInt(ticket.getSeatNo())%3==0){
                    toplam=ticket.getDistance()*1.2*2*0.8;
                }else{
                    toplam=ticket.getDistance()*1*2*0.8;
                }
                break;

        }
        if(yolcu.getAge()<12){
            toplam=toplam*0.5;
        }else if(yolcu.getAge()>65){
            toplam=toplam*0.7;
        }
        ticket.setPrice(toplam);


    }

    public void printTicket(Bus bus,Yolcu yolcu,Ticket ticket){

        System.out.println("*".repeat(40));
        System.out.println("Otobüsün plakası: "+ bus.getBusPlate());
        System.out.println("Yolcu "+yolcu.getName()+" "+yolcu.getSurName());
        System.out.println("Yolculuk tipi: "+(ticket.getType()==1? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Koltuk numarası: "+ ticket.getSeatNo());
        System.out.println("Toplam  : "+ ticket.getPrice());
        System.out.println("*".repeat(40));

    }



}
