package AYolculuk;

import java.util.HashMap;
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
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

    start();

    }
    public static void start(){
        double price;
        HashMap<String ,Integer> mesafeler=new HashMap<>();
        mesafeler.put("B",500);
        mesafeler.put("C",700);
        mesafeler.put("D",900);

        System.out.println("Lütfen adınızı giriniz: ");
        String passengerName=input.nextLine();
        System.out.println("Lütfen yaşınızı giriniz: ");
        int passengerAge=input.nextInt();
        input.nextLine();

        Yolcu passenger= new Yolcu(passengerAge,passengerName);
        System.out.println("Gideceğiniz konumu seçiniz: ");
        for (int i = 0; i <mesafeler.size() ; i++) {

            System.out.println(mesafeler.keySet().toArray()[i]+ "Şehrine olan mesafe"+ mesafeler.values().toArray()[i]);

        }
        String city = input.nextLine().toUpperCase();
        System.out.println("1-Gidiş-Dönüş \n-Tek Yön\n Tercihinizi yapınız: ");
        int control=input.nextInt();
        input.nextLine();
        switch (control){
            case 1:
                if(passenger.getAge()<12){
                    price=2*(mesafeler.get(city)*0.1*0.5*0.8);
                    System.out.println("Bilet Fiyatı: "+price);
                }else if(passenger.getAge()<24){
                    price=2*(mesafeler.get(city)*0.1*0.9*0.8);
                    System.out.println("Bilet Fiyatı: "+price);
                }else if(passenger.getAge()>65){
                    price=2*(mesafeler.get(city)*0.1*0.7*0.8);
                    System.out.println("Bilet Fiyatı: "+price);
                }else{
                    price=2*(mesafeler.get(city)*0.1*0.8);
                    System.out.println("Bilet Fiyatı: "+price);
                }
                break;
            case 2:
                if(passenger.getAge()<12){
                    price=(mesafeler.get(city)*0.1*0.5);
                    System.out.println("Bilet Fiyatı: "+price);
                }else if(passenger.getAge()<24){
                    price=(mesafeler.get(city)*0.1*0.9);
                    System.out.println("Bilet Fiyatı: "+price);
                }else if(passenger.getAge()>65){
                    price=(mesafeler.get(city)*0.1*0.7);
                    System.out.println("Bilet Fiyatı: "+price);
                }else{
                    price=(mesafeler.get(city)*0.1);
                    System.out.println("Bilet Fiyatı: "+price);
                }
                break;
            default:
                break;
        }

    }




}
