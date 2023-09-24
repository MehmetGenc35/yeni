package KelimeTahminOyunu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Deneme {
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


        String secretWord="wohooo";
        int maxTry=15;
        List<Character> guessList=new ArrayList<>();

        Scanner inp= new Scanner(System.in);

        String maskedWord= getMaskedWord(secretWord,guessList);
        System.out.println(maskedWord);

        for (int i = 0; i <maxTry ; i++) {
            System.out.print("make a guess: ");
            String guess= inp.next();

            guessList.add(guess.charAt(0));

            maskedWord=getMaskedWord(secretWord,guessList);
            System.out.println(maskedWord);

            if (maskedWord.equals(secretWord)){
                System.out.println("you win");
                break;
            }

        }


    }
    public static String getMaskedWord(String word,List<Character> guessList){
        String result="";
        for (int i = 0; i <word.length() ; i++) {
            Character currentChar=word.charAt(i);

            if(guessList.contains(currentChar)){
                result=result.concat(currentChar.toString());
            }else{
                result=result.concat("_");
            }

        }



        return result;
    }



}
