package Sorular;

import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {
        //Vücut Kitle İndeksi

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
        int weigth= input.nextInt();
        System.out.print("Lütfen boyunuzu m olarak giriniz: ");
        double heigth= input.nextDouble();

        double vki= weigth /(Math.pow(heigth,2));
        System.out.println("vki = " + vki);


    }


}
