package ATicket;

import java.util.Scanner;

/*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */
public class TicketRunner {
    static Scanner inp=new Scanner(System.in);


    public static void main(String[] args) {


        start();

    }

    public static void start(){

        System.out.println("********* Firmamıza Hoşgeldiniz **********");
        int select;
        YolcuService yolcuService=new YolcuService();
        do{
            System.out.println("Lütfen Bir İşlem Seçiniz: ");
            System.out.println("1-Bilet Satın Al \n2-Bilet İptal \n3-Ödeme  \n0-Çıkış");
            select=inp.nextInt();inp.nextLine();

            switch (select){
                case 1:
                    yolcuService.informationPassenger();
                    break;
                case 2:
                    //bileti iptal et
                    break;
                case 3:
                    //ödeme
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız...");
                    break;


            }
        }while(select!=0);





    }

}
