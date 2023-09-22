package Sorular;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        //TechPro Spor Salonu
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz: ");
        String nameSurname= input.nextLine();
        System.out.print("Lütfen yaşınızı giriniz: ");
        int age= input.nextInt();
        System.out.print("Lütfen kilonuzu kg giriniz: ");
        int weigth= input.nextInt();
        System.out.print("Lütfen boyunuzu cm olarak giriniz: ");
        int heigth= input.nextInt();
        System.out.print("Salona kaç ay devam etmeyi planlıyorsunuz: ");
        int mounth= input.nextInt();

        System.out.println("---------------------------");

        System.out.println("nameSurname = " + nameSurname);
        System.out.println("age = " + age);
        System.out.println("weigth = " + weigth+" kg");
        System.out.println("heigth = " + heigth+" cm");
        System.out.println("Total Price: "+"$"+(mounth*20));
    }
}
