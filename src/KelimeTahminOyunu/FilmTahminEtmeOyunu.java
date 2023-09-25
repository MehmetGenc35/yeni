package KelimeTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminEtmeOyunu {
    /*
static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));


TASK :
yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
filmin index nosuna göre sectiriniz
seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
sağlayan method create ediniz...
Ahanda TRICK...
kullanıcının sectiği filmin harf sayısını  console yazdırınız.
kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

*/
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));


    public static void main(String[] args) {
        int game = -1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lütfen 0 ve 8 arası bir sayı seçiniz\n (0 dahil 8 dahil değil) --> ");
            int option = input.nextInt();
            String optionMovie = film.get(option);
            System.out.println("_ ".repeat(optionMovie.length()));
            System.out.println("Seçtiğiniz film " + optionMovie.length() + " harften oluşmaktadır...");
            System.out.println("Filmi tahmin etmek için " + (optionMovie.length() * 2) + " harf söyleme hakkınız bulunmaktadır");

            limitOfToken(optionMovie);

            System.out.println("Tekrar oynamak ister misiniz, Seçiniz\n 1-Evet   0-Hayır");
            game=input.nextInt();
        }while(game!=0);
    }
    public static void limitOfToken(String movie){
        int trueTry=0;
        int falseTry=0;
        Scanner input = new Scanner(System.in);
        for (int i = movie.length()*2 ; i >=0 ; i--) {

            if(i==0){
                System.out.println("KAYBETTİNİZ...");
                System.out.println("Tahmin hakkınız kalmadı, filmi bulamadınız...");
                System.out.println("Doğru yapılan tahmin sayısı: "+trueTry + "\nYanlış yapılan tahmin sayısı: "+falseTry);
                break;
            }else{
                System.out.println("Filmi tahmin etmek için kalan hakkınız: "+i);
                System.out.println("_ ".repeat(movie.length()));
                System.out.println("Filmi tahmin ediniz: ");
                String guessMovie=input.nextLine().toUpperCase();

                if(movie.equals(guessMovie)){
                    System.out.println("Tebrikler filmi doğru tahmin ettiniz\nKAZANDINIZ!!!");
                    trueTry++;
                    System.out.println("Doğru yapılan tahmin sayısı: "+trueTry + "\nYanlış yapılan tahmin sayısı: "+falseTry);
                    break;
                }else{
                    System.out.println("Tahmininiz doğru değildir...");
                    falseTry++;
                }

            }

        }



    }
}


