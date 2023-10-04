package OOPAracSigortaApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AracServis {
    //Prim methodu burada oluşturulacak


    List<Integer> haziran2023=new ArrayList<>(Arrays.asList(2000,3000,4000,1500));
    List<Integer> aralık2023=new ArrayList<>(Arrays.asList(2500,3500,4500,1750));


    public void pirimHesapla(int donem,int tip){
        Scanner inp=new Scanner(System.in);
        System.out.println("Aracınızın model yılını giriniz: ");
        int yil=inp.nextInt();
        System.out.println("Aracınızın fiyat bilgisini giriniz: ");
        int fiyat=inp.nextInt();
        System.out.println("Aracınızın durum bilgisini giriniz: \n1-Sıfır Araç\n2-İkinci El araç");
        int durum=inp.nextInt();
        int pirim;
        if (donem==1){
            pirim=haziran2023.get(tip-1);
            if (yil<2010){
                pirim+=300;
            }else{
                pirim+=200;
            }
            if(fiyat<250000){
                pirim+=300;
            }else{
                pirim+=200;
            }if(durum==1){
                pirim+=300;
            }else{
                pirim+=200;
            }
        } else {
            pirim=aralık2023.get(tip-1);
            if (yil<2010){
                pirim+=300;
            }else{
                pirim+=200;
            }
            if(fiyat<250000){
                pirim+=300;
            }else{
                pirim+=200;
            }if(durum==1){
                pirim+=300;
            }else{
                pirim+=200;
            }
        }
        switch (tip){
            case 1:
                Arac arac=new Otomobil(yil,durum,fiyat);
                arac.setAracİsim("Otomobil");
                System.out.println(arac.getAracİsim()+" aracınızın bu döneme ait pirim borcu= "+pirim);
                break;
            case 2:
                Arac arac2=new Otobüs(yil,durum,fiyat);
                arac2.setAracİsim("Otobüs");
                System.out.println("Otobüsünüzün modelini seçiniz: \n1-18-31 koltuk\n2-31 koltuk ve üzeri");
                int secim=inp.nextInt();
                pirim=secim==1 ? pirim+0 : pirim+1000;
                ((Otobüs) arac2).setModel(secim==1? "18-31 koltuklu" : "31 koltuk ve üzeri");
                System.out.println(((Otobüs) arac2).getModel()+" "+arac2.getAracİsim()+" aracınızın bu döneme ait pirim borcu= "+pirim);
                break;
            case 3:
                Arac arac3=new Kamyon(yil,durum,fiyat);
                arac3.setAracİsim("Kamyon");
                System.out.println(arac3.getAracİsim()+" aracınızın bu döneme ait pirim borcu= "+pirim);
                break;
            case 4:
                Arac arac4=new Motorsiklet(yil,durum,fiyat);
                arac4.setAracİsim("Motorsiklet");
                System.out.println(arac4.getAracİsim()+" aracınızın bu döneme ait pirim borcu= "+pirim);
                break;
        }

    }

}
