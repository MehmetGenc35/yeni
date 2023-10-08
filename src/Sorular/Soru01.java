package Sorular;

import java.util.Scanner;


public class Soru01 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bir işçi bu işi kaç günde bitirebilir: ");
        int bitirmeGünü= input.nextInt();

        System.out.println("Bu işi kaç kişi yapacak: ");
        int kisiSayısı = input.nextInt();

        int isinBitmeSüresi= bitirmeGünü/kisiSayısı;

        System.out.println("Bir işçi işi kaç günde bitirmeltedir? "+ bitirmeGünü);
        System.out.println("Toplam kaç kişi çalışacak? "+ kisiSayısı);
        System.out.println("İşin bitme süresi "+ isinBitmeSüresi + " gündür.");



    }
}
