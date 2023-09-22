package Sorular;

import java.util.Scanner;

public class Soru03 {

    public static void main(String[] args) {
        //Sayılar
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 3 pozitif tamsayı giriniz!\n1.sayı: ");
        int num1= input.nextInt();
        System.out.print("2.sayı: ");
        int num2= input.nextInt();
        System.out.print("3.sayı: ");
        int num3= input.nextInt();

        double sonuc= (Math.pow(num1,2)-Math.pow(num2,2)) / (3*num3);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        System.out.println("sonuc = " + sonuc);


    }
}
