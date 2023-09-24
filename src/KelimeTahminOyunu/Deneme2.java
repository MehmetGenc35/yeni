package KelimeTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deneme2 {
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

        int game=-1;
        List<Character> guessList=new ArrayList<>();
        do{
            System.out.print("Lütfen 0 ve 8 arası bir sayı seçiniz\n (0 dahil 8 dahil değil) --> ");
            int option=input.nextInt();
            String optionMovie=film.get(option);
            System.out.println("Seçtiğiniz film "+optionMovie.length()+" harften oluşmaktadır...");
            System.out.println("Filmi tahmin etmek için "+(optionMovie.length()*2)+" harf söyleme hakkınız bulunmaktadır");

            String maskedWord=limitOfToken(optionMovie,guessList);
            System.out.println(maskedWord);

            for (int i=optionMovie.length()*2; i>=0  ; i--) {
                System.out.println("Kalan hakkınız "+i);
                if(i==0){
                    System.out.println("Bütün haklarınızı kullandınız...");
                    System.out.println("Oyunu kaybettiniz!!!");
                    break;
                }

                System.out.println("Lütfen bir harf giriniz");
                String guess=input.next().toUpperCase();

                guessList.add(guess.charAt(0));

                maskedWord=limitOfToken(optionMovie,guessList);
                System.out.println(maskedWord);

                if (maskedWord.equals(optionMovie)){
                    System.out.println(optionMovie);
                    System.out.println("Oyunu kazandınız!!!");
                    break;
                }
            }
            System.out.println("Tekrar oynamak ister misiniz, Seçiniz\n 1-Evet   0-Hayır");
            game=input.nextInt();

        }while(game!=0);









    }
    public static String limitOfToken(String movie,List<Character> guessList){
        String result="";
        for (int i = 0; i <movie.length() ; i++) {
            Character currentChar=movie.charAt(i);

            if(guessList.contains(currentChar)){
                result=result.concat(currentChar.toString());
            }else{
                result=result.concat("_");
            }
        }
        return result;
    }



}
