package ProjeÇalışması;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DepoService {
    Scanner input= new Scanner(System.in);
    static int counter=1000;
    HashMap<String,Depo> productList= new HashMap<>();


    //urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist


    public void productIdentification(){

        int optional=-1;
        do{
            System.out.println("Eklemek istediğiniz ürünün adını giriniz: ");
            String productName=input.nextLine();

            System.out.println("Eklediğiniz ürünün üretici firmasını giriniz: ");
            String producerName=input.nextLine();

            System.out.println("Lütfen ürünün birimini seçiniz:");
            System.out.println("1-Palet   2-Çuval   3-Koli   4-Kutu");
            int unitSelection=input.nextInt();

            String unit="";
            switch (unitSelection){
                case 1:
                    unit="Palet";
                    break;
                case 2:
                    unit="Çuval";
                    break;
                case 3:
                    unit="Koli";
                    break;
                case 4:
                    unit="Kutu";
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız...");
            }
            String id= String.valueOf(counter);
            Depo product= new Depo(id,productName,producerName,0,unit,"-");
            productList.put(id,product);
            System.out.println(productList);

            System.out.println("Ürün kaydedildi...");
            System.out.println("Başka ürün eklemek ister misiniz? ");
            System.out.println(" 0-HAYIR *** 1-EVET ");

            optional=input.nextInt();

            counter++;
            input.nextLine();
        }while(optional!=0);

        DepoRunner.start();



    }



}
