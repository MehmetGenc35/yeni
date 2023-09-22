package Deneme;

import java.util.Scanner;

public class PolindromSayı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean secim=true;

        do{
            System.out.println("Lütfen en az 3 basamaklı bir tamsayı giriniz...");
            String number= input.nextLine();

            String num2="";

            if(number.length()>=3){
                for (int i = number.length()-1 ; i>=0 ; i--) {
                    num2=num2+number.charAt(i);

                }
                System.out.println(num2);
                if(number.equals(num2)){
                    System.out.println("Girilen sayı polindrom sayıdır...");
                }else{
                    System.out.println("Girilen sayı polindrom sayı değildir...");
                }
                secim=false;

            }else{
                System.out.println("Hatalı bir giriş yaptınız...");

            }

        }while(secim);
    }
}
