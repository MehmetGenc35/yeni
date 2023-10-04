package LoginPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserService {

    //List<User> userList=new ArrayList<>();
    HashMap<String,String > userList2= new HashMap<>();
    Scanner inp=new Scanner(System.in);

    public void registerPage(){

        System.out.println("Lütfen ad-soyad giriniz: ");
        String name=inp.nextLine();
        boolean isValid;
        boolean isExist;
        String email;
        do {
            System.out.println("Lütfen email adresinizi giriniz: ");
            email=inp.nextLine();
            isExist=userList2.keySet().contains(email);
            if (isExist){
                System.out.println("Bu email kullanılmaktadır...");
                isValid=false;
            }
            else{

                isValid=validateEmail(email);;

            }

        }while (!isValid);

        boolean isValidPassword;
        String password;
        do {
        System.out.println("Lütfen şifrenizi giriniz: ");
        password=inp.nextLine();

        isValidPassword=isValidatePassword(password);


        }while (!isValidPassword);


        //User(name,email,password);
        userList2.put(email,password);
        System.out.println("Üyelik işleminiz başarıyla gerçekleşmiştir...");

    }
    public void loginPage() {
        boolean isValid;
        boolean isExist;
        String email;
        String password;
        do {
            System.out.println("Lütfen email adresinizi giriniz: ");
            email=inp.nextLine();
            isExist=userList2.keySet().contains(email);
            if (isExist){
                System.out.println("Şifrenizi giriniz...");
                password=inp.nextLine();
                if (userList2.get(email).equals(password)){
                    System.out.println("Sisteme giriş yapıldı...");
                    isValid=true;
                }else{
                    System.out.println("Lütfen şifrenizi kontrol ediniz...");
                    isValid=false;
                }
            }else{
                System.out.println("Kullanıcı bulunamadı...");
                isValid=false;
            }

            }while (!isValid);
    }







    private boolean isValidatePassword(String password) {
        /*
        password validation: boşluk içermemeli
                           : en az 6 karakter olmalı
                           : en az bir tane küçük harf içermeli
                           : en az bir tane büyük harf içermeli
                           : en az bir tane rakam içermeli
                           : en az bir tane sembol içermeli
         */
        boolean space= !password.contains(" ");
        boolean charachterLengthControl=(password.length()>5)?true:false;
        boolean lowerCaseControl=(password.replace("[^a-z]","").length()>0)? true:false;
        boolean upperCaseControl=(password.replace("[^A-Z]","").length()>0)? true:false;
        boolean digitControl=(password.replace("[^0-9]","").length()>0)? true:false;
        boolean symbolControl=(password.replace("[\\P{Punct}]","").length()>0)? true:false;

        if(space&&charachterLengthControl&&lowerCaseControl&&upperCaseControl&&digitControl&&symbolControl){
            return true;
        }else{
            System.out.println("şifrenizde büyük harf,küçük harf,rakam ve sembol olmalıdır.");
        }
        return false;

    }

    private boolean validateEmail(String email){
        /*
 email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.
         */
        if (email.contains("@")){
            boolean space= !email.contains(" ");
            boolean domain;
            String afterSymbol=email.split("@")[1];
            String beforeSymbol=email.split("@")[0];

            boolean domainControl=afterSymbol.equals("gmail.com")||afterSymbol.equals("hotmail.com")||afterSymbol.equals("yahoo.com");
            boolean lowerCaseControl=(beforeSymbol.replace("[^a-z]","").length()>0)? true:false;
            boolean upperCaseControl=(beforeSymbol.replace("[^A-Z]","").length()>0)? true:false;
            boolean symbolControl=beforeSymbol.contains("-")||beforeSymbol.contains(".")||beforeSymbol.contains("_");

            if(space&&domainControl&&lowerCaseControl&&upperCaseControl){
                return true;
            }
        }else{
            System.out.println("emailiniz kontrol ediniz...");

        }
       return false;
    }



}
