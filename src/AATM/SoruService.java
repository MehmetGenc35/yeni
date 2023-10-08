package AATM;

import java.util.HashMap;
import java.util.Scanner;

public class SoruService {
    static Scanner inp=new Scanner(System.in);
    private HashMap<String,Integer> bakiye =new HashMap<>();
    private String userCard="2545365424523254";
    private String userPassword="qwert12345.";
    private HashMap<String,String>user=new HashMap<>();

    public HashMap<String, String> getUser() {
        return user;
    }



    public SoruService() {
    this.bakiye.put("bakiye",1000);
    this.user.put(userCard,userPassword);
    }


    public void bakiyeSorgula(SoruService soruService) {

        System.out.println("Mevcut bakiyeniz: "+soruService.bakiye.get("bakiye"));

    }

    public void paraYatirma(SoruService soruService) {

        boolean secim =false;
        int money;
        int yeniBakiye;
        do {
            System.out.println("Ne kadar para yatırmak istersiniz: ");
            money=inp.nextInt();

            if(money>0){
                System.out.println("Yatırmak istediğiniz tutar "+money+" liradır.");
                System.out.println("Para eklemek istiyor musunuz: \n1-EVET\n2-HAYIR");
                int tercih= inp.nextInt();
                secim= tercih==1? true : false;

            }
            yeniBakiye= soruService.bakiye.get("bakiye")+money;
            soruService.bakiye.clear();
            soruService.bakiye.put("bakiye",yeniBakiye);
        }while (secim);

        bakiyeSorgula(soruService);

    }

    public void paraCekme(SoruService soruService) {
        boolean secim =false;
        int money;
        int yeniBakiye;
        do {
            System.out.println("Ne kadar para çekmek istersiniz: ");
            money=inp.nextInt();

            if(money<soruService.bakiye.get("bakiye")){

                System.out.println("Çekmek istediğiniz tutar "+money+" liradır.");

                yeniBakiye= soruService.bakiye.get("bakiye")-money;
                soruService.bakiye.clear();
                soruService.bakiye.put("bakiye",yeniBakiye);

                bakiyeSorgula(soruService);
            }else{
                System.out.println("Hesabınızda yeterli miktar bulunamadı...");
            }
            System.out.println("Tekrar para çekmek istiyor musunuz: \n1-EVET\n2-HAYIR");
            int tercih= inp.nextInt();
            secim= tercih==1? true : false;


        }while (secim);


    }

    public void paraGonder(SoruService soruService) {
        boolean secim =false;
        int money;
        int yeniBakiye;
        do {
            System.out.println("Para gönderilecek IBAN hesabını giriniz: ");
            String paraGidecekHesap=inp.nextLine();
            if (paraGidecekHesap.substring(0,2).equals("TR")&& paraGidecekHesap.length()==26){
                System.out.println("Ne kadar para göndermek istersiniz: ");
                money=inp.nextInt();

                if(money<=soruService.bakiye.get("bakiye")){

                    System.out.println("Göndermek istediğiniz tutar "+money+" liradır.");

                    yeniBakiye= soruService.bakiye.get("bakiye")-money;
                    soruService.bakiye.clear();
                    soruService.bakiye.put("bakiye",yeniBakiye);

                    System.out.println("Gönderme işlemi başarılı...");
                    bakiyeSorgula(soruService);
                }else{
                    System.out.println("Hesabınızda yeterli miktar bulunamadı...");
                }
                System.out.println("Tekrar para göndermek istiyor musunuz: \n1-EVET\n2-HAYIR");
                int tercih= inp.nextInt();inp.nextLine();
                secim= tercih==1? true : false;
            }else{
                System.out.println("Gönderilecek hesap 'TR' ile başlamalı ve toplam 26 haneli olmalıdır... ");
                secim=true;
            }

        }while (secim);



    }


    public void sifreDegistir() {
        int secim;
        do {
            System.out.println("Eski şifrenizi giriniz: ");
            String oldPassword=inp.nextLine();
            if(oldPassword.equals(this.user.get("2545365424523254"))){
                System.out.println("Yeni şifrenizi giriniz: ");
                String newPassword=inp.nextLine();


                this.user.replace("2545365424523254", oldPassword ,newPassword);

                System.out.println("Şifreniz güncellenmiştir...");
                secim=0;
            }else{
                System.out.println("Şifrenizi kontrol ediniz...");
                secim=1;
            }

        }while(secim!=0);

    }
}
