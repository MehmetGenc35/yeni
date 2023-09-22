package Sorular.kütüphane;

import java.util.*;
import java.util.stream.Collectors;

public class KitapService {


    List<Kitap> kitapList= new ArrayList<>();
    List<Kitap> kitapList2= new ArrayList<>();




    public KitapService() {
        fillBookList();

    }

    private void fillBookList() {
        Kitap kitap1= new Kitap("Sefiller");
        Kitap kitap2= new Kitap("Suç ve Ceza");
        Kitap kitap3= new Kitap("Fareler ve İnsanlar");
        Kitap kitap4= new Kitap("Hacı Murat");

        this.kitapList.add(kitap1);
        this.kitapList.add(kitap2);
        this.kitapList.add(kitap3);
        this.kitapList.add(kitap4);
    }

    public void kitapEkleme(){
        Scanner input=new Scanner(System.in);
        System.out.print("Hangi kitabı eklemek istersiniz? ==> ");
        String yeni=input.nextLine();
        Kitap yeniKitap=new Kitap(yeni);
        this.kitapList.add(yeniKitap);
        System.err.println(kitapList);
        System.err.println("Kitabınız başarıyla eklendi.");
    }

    /*public void kitapGöster(){
        for (Kitap w : kitapList   ) {
            System.out.println(w.getName());
        }
    }*/
    public void kitaplarıAlfabetikSırala(){
        List<Kitap> newLİst= kitapList.stream().sorted(Comparator.comparing(Kitap::getName)).collect(Collectors.toList());
        System.out.println(newLİst);




    }
    public void kitapSilme(){
        System.out.println(kitapList);
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi kitabı listeden silmek istersiniz?");
        String silinecekKitap=input.nextLine();
        for (Kitap w :kitapList ) {
            if(!w.getName().equals(silinecekKitap)){
                kitapList2.add(w);

            }
        }
        System.out.println("Kitap silindi...");
        this.kitapList=kitapList2;
        System.out.println(kitapList2);

        /*kitapList.stream().filter(t->!t.getName().equalsIgnoreCase(silinecekKitap)).forEach(t-> System.out.print(t+", "));
        System.out.println();

        System.err.println("Girdiğiniz kitap başarıyla silindi...");*/

    }


    public void kutuphaneyiSifirla(){
        System.out.println(kitapList);
        Scanner input = new Scanner(System.in);
        System.out.println("Kütüphaneyi sıfırlamak istermisiniz?");
        System.out.println("1=EVET   2=HAYIR ");
        int secim=input.nextInt();
       if(secim==1){
           kitapList.clear();
           System.out.println(kitapList);
           System.out.println("Kütüphane sıfırlandı...");
       }else if(secim==2){
           System.out.println(kitapList);
       }else{
           System.out.println("Hatalı bir giriş yaptınız!");
       }




    }

}

