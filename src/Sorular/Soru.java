package Sorular;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Soru {
    /*
    ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

     */


    static Scanner inp=new Scanner(System.in);
    static SoruService soruService=new SoruService();
    public static void main(String[] args) {

        start();



    }

    private static void start() {
        boolean menuyeGecis=false;

        do{
            System.out.println("Lütfen kart numaranızı giriniz: ");
            String cardNumber=inp.nextLine().replace(" ","");
            System.out.println("Lütfen şifrenizi giriniz: ");
            String cardPassword=inp.nextLine();
            if (soruService.userList().containsKey(cardNumber)&&soruService.userList().containsValue(cardPassword)){
                int option=-1;
                do{
                    System.out.println("İşlem menüsüne hoşgeldiniz,yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1-Bakiye sorgula: \n2-Para yatirma: \n3-Para çekme: \n4-Para gönderme: \n5-Şifre değiştirme: \n0-ÇIKIŞ");
                    int selection= inp.nextInt();
                    switch (selection){
                        case 1:
                            soruService.bakiyeSorgula(soruService);
                            break;
                        case 2:
                            soruService.paraYatırma(soruService);
                            break;
                        case 3:
                            soruService.paraCekme(soruService);
                            break;
                        case 4:
                            //Para gönderme
                            soruService.paraGonder(soruService);
                            break;
                        case 5:
                            //Şifre değiştirme
                            //soruService.sifreDegistir();

                            break;
                        case 0:
                            System.out.println("iyi günler...");
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız...");
                            break;
                    }
                    System.out.println("Yeni bir işlem yapmak istiyor musunuz: \n1-EVET 0-HAYIR");
                    option=inp.nextInt();

                }while(option!=0);
                System.out.println("Ana menüye yönlendiriliyorsunuz...");
            }else{
                System.out.println("Lütfen bilgilerinizi kontrol ediniz...");
            }
            System.out.println("Çıkış için 0 giriniz..." );
            int cıkıs=inp.nextInt();inp.nextLine();
            menuyeGecis= cıkıs==0 ? false : true;

        }while(menuyeGecis);
        System.out.println("İyi günler dileriz...");

    }


}
