package Bakkal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalKazanc {
    /*Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
    Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
    Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
    Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.*
    Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
    Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
    Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
    Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    ortalama kazançtan yüksekse o günleri return yap.
            Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    ortalama kazançtan aşağıysa o günleri return yap.
*/

    public static void main(String[] args) {
        List<String> günler= new ArrayList<>();
        günler.add("Pazartesi");
        günler.add("Salı");
        günler.add("Çarşamba");
        günler.add("Perşembe");
        günler.add("Cuma");
        günler.add("Cumartesi");
        günler.add("Pazar");

        System.out.println(günler);

        List<Double> günlükKazanc= new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int i=1;
        while(i<=günler.size()){
            System.out.print("Haftanın "+ i+"."+" günü olan kazancınız: ");
            double kazanc=input.nextInt();
            günlükKazanc.add(kazanc);
            i++;
        }
        System.out.println(günlükKazanc);

        /*int sum=0;
        int sayac=0;
        for (int j = 0; j < günlükKazanc.size() ; j++) {
            sum=sum+günlükKazanc.get(j);
            sayac++;
        }
        double kazancOrtalama= sum/sayac;
        System.out.println(kazancOrtalama);*/

        double ort= getOrtalamaKazanc(günlükKazanc);
        System.out.println(ort);
        System.out.println(getOrtalamaKazancUstuGunler(ort, günlükKazanc, günler));
        System.out.println(getOrtalamaKazancAltıGunler(ort, günlükKazanc, günler));


    }
    public static double getOrtalamaKazanc(List<Double> sayı ){
        double sum=0;

        for ( double w :sayı ) {
            sum= sum+w;

        }
        return sum/sayı.size();
    }

    public static List<String> getOrtalamaKazancUstuGunler( double ort, List<Double> kazanclar ,List<String> gunler ){
        List<String> kazancUstuGunler= new ArrayList<>();
        for(int i=0; i<gunler.size();i++){
            if(kazanclar.get(i)>ort){
                kazancUstuGunler.add(gunler.get(i));
            }
        }
        return kazancUstuGunler;
    }
    public static List<String> getOrtalamaKazancAltıGunler( double ort, List<Double> kazanclar ,List<String> gunler ){
        List<String> kazancAltıGunler= new ArrayList<>();
        for(int i=0; i<gunler.size();i++){
            if(kazanclar.get(i)<ort){
                kazancAltıGunler.add(gunler.get(i));
            }
        }
        return kazancAltıGunler;
    }


}
