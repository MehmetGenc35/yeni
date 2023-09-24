package KelimeTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmiTahminEt {
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
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        int gameOver=-1;
        do{
            System.out.print("Lütfen 0 ve 8 arası bir sayı seçiniz (0 dahil 8 dahil değil) --> ");
            int option=input.nextInt();
            String optionMovie=film.get(option);
            System.out.println("Seçtiğiniz film "+optionMovie.length()+" harften oluşmaktadır...");
            System.out.println("Filmi tahmin etmek için "+(optionMovie.length()*2)+" harf söyleme hakkınız bulunmaktadır");
            limitOfToken(optionMovie);


        }while(gameOver!=0);









    }
    public static void limitOfToken(String movie){
        int trueTry=0;
        int falseTry=0;

        for (int i = movie.length()*2; i >=0  ; i--) {
            if(i==0){
                System.out.println("KAYBETTİNİZ!!! Harf tahnin hakkınız kalmadı...");
                System.out.println("Doğru tahmininiz: "+trueTry+ " Yanlış tahmininiz: "+falseTry);
            }else{

                String newMovie="_".repeat(movie.length());
                System.out.println("Kalan hakkınız "+i);
                System.out.println("Bir harf söyleyiniz: ");
                char charOfMovie= input.next().toUpperCase().charAt(0);
                boolean letterControl=false;
                int letterCount=0;
                for (int j = 0; j < movie.length() ; j++) {
                    if(movie.charAt(j)==charOfMovie) {
                        letterControl=true;
                        letterCount++;
                    }
                }
                if(letterControl){
                    int change= movie.indexOf(charOfMovie);
                    newMovie.replace(newMovie.charAt(change),charOfMovie);
                    System.out.println(newMovie);
                    trueTry++;
                    if(!newMovie.contains("_")){
                        System.out.println(newMovie);
                        System.out.println("KAZANDINIZ!!! Filmi doğru tahmin ettiniz...");
                        System.out.println("Doğru tahmininiz: "+trueTry+ " Yanlış tahmininiz: "+falseTry);
                    }
                }else{
                    System.out.println("Söylediğiniz harf filmin isminde bulunmamaktadır");
                    falseTry++;
                }
            }





        }


    }
}

