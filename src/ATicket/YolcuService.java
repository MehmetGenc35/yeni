package ATicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YolcuService {

    public List<Yolcu> yolcuList=new ArrayList<>();


    public YolcuService() {

    }

    public void informationPassenger(){
        Scanner inp=new Scanner(System.in);

        System.out.println("Adınız: ");
        String passengerName=inp.nextLine();
        System.out.println("Soyadınız: ");
        String passengerSurame=inp.nextLine();
        System.out.println("Yaşınız: ");
        int passengerAge=inp.nextInt();
        String arrived="";
        System.out.println("Hangi şehire gideceksiniz");
        System.out.println("B     - C     - D ");
        String varıs=inp.nextLine().toUpperCase();
        switch (varıs){
            case "B":
                arrived="B";
                break;
            case "C":
                arrived="C";
                break;
            case "D":
                arrived="D";
                break;
            default:
                System.out.println("Geçerli bir varış yeri seçiniz...");
                break;
        }
        System.out.println("Yolculuk tipini seçiniz:\n 1-Tek Yön  2-Gidiş-Dönüş");
        int option=inp.nextInt();inp.nextLine();
        String type="";

        switch (option){
            case 1:
                type="Tek Yön";
                break;
            case 2:
                type="Gidiş-Dönüş";
            default:
                System.out.println("Geçersiz seçim yaptınız...");
                break;

            }

        System.out.println("Satın alma işlemi başarıyla tamamlandı...");
        System.out.println("-".repeat(50));

        Yolcu yolcu = new Yolcu(passengerName,passengerSurame,passengerAge);
        this.yolcuList.add(yolcu);
        System.out.printf("%-15s  |  %-15s  |  %-15s  |  %-15s  |  %-10s\n","*Yolcu Adı*","*Yolcu Soyadı*","*Yolcunun Yaşı*","*Yolculuk Tipi*","*Varış*");
        System.out.printf("%-15s  |  %-15s  |  %-15s  |  %-15s  |  %-10s\n","*---------*","*------------*","*-------------*","*-------------*","*-----*");
        System.out.printf("%-15s  |  %-15s  |  %-15d  |  %-15s  |  %-10s\n",passengerName,passengerSurame,passengerAge,type,arrived);





    }

    public void printTicket(){




    }


}
