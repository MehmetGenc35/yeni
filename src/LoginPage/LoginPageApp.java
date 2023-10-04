package LoginPage;
/*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

        menü: kullanıcıya işlem seçimi için menü gösterilir.

        üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                            email ve şifre birer listede tutulur.
                            aynı email kabul edilmez.

        giriş(login): email ve şifre girilir.
                      email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                      email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.



        password validation: boşluk içermemeli
                           : en az 6 karakter olmalı
                           : en az bir tane küçük harf içermeli
                           : en az bir tane büyük harf içermeli
                           : en az bir tane rakam içermeli
                           : en az bir tane sembol içermeli
*/

import java.util.Scanner;

public class LoginPageApp {


    public static void main(String[] args) {

        start();


    }

    private static void start() {
        Scanner inp=new Scanner(System.in);
        System.out.println("----MATERYALDUNYASİ35 UYGULAMASI----");
        int select=-1;
        UserService userService=new UserService();
        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            System.out.println("1-Üye ol\n2-Giriş yap\n0-Çıkış");
            select=inp.nextInt();

            switch (select){
                case 1:
                    userService.registerPage();
                    break;
                case 2:
                    userService.loginPage();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız...");
                    break;
            }








        }while (select!=0);



    }
}
