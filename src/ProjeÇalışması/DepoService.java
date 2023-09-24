package ProjeÇalışması;

import java.util.*;

public class DepoService {
    Scanner input= new Scanner(System.in);
    static int counter=1000;
    HashMap<String,Depo> productList= new HashMap<>();


    //urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist


    public void productIdentification(){

        int optional=-1;
        do{
            System.out.println("Eklemek istediğiniz ürünün adını giriniz: ");
            String productName=input.nextLine();

            System.out.println("Eklediğiniz ürünün üretici firmasını giriniz: ");
            String producerName=input.nextLine();

            System.out.println("Lütfen ürünün birimini seçiniz:");
            System.out.println("1-Palet   2-Çuval   3-Koli   4-Kutu");
            int unitSelection=input.nextInt();

            String unit="";
            switch (unitSelection){
                case 1:
                    unit="Palet";
                    break;
                case 2:
                    unit="Çuval";
                    break;
                case 3:
                    unit="Koli";
                    break;
                case 4:
                    unit="Kutu";
                    break;
                default:
                    System.out.println("Hatalı bir giriş yaptınız...");
            }
            String id= String.valueOf(counter);
            Depo product= new Depo(id,productName,producerName,0,unit,"-");
            productList.put(id,product);
            System.out.println(productList);

            System.out.println("Ürün kaydedildi...");
            System.out.println("Başka ürün eklemek ister misiniz? ");
            System.out.println(" 0-HAYIR *** 1-EVET ");

            optional=input.nextInt();

            counter++;
            input.nextLine();
        }while(optional!=0);

        DepoRunner.start();
    }
    //urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
    public void urunListele(){
        System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s\n", "Ürün ID", "Ürün Adı", "Üretici", "Miktar", "Birim", "Raf");
        System.out.printf("-------------------------------------------------------------------------------------\n");
        Set<String> sorted = productList.keySet();
        List<String> productIdsAsList = new ArrayList<>(sorted);
        Collections.sort(productIdsAsList);//?? anlamadım
        for (String w : productIdsAsList) {
            Depo p = this.productList.get(w);
            System.out.printf("%-8s %-15s %-15s %-15s %-15s %-15s\n",
                    p.getId(),
                    p.getProductName(),
                    p.getProducerName(),
                    p.getAmount(),
                    p.getUnit(),
                    p.getShelf());
        }
        DepoRunner.start();


    }
    public void urunEkle() {
        System.out.println();
        System.out.println("Ürün id'sini giriniz");
        String id = input.nextLine();
        Depo product = this.productList.get(id);
        if (product != null) {
            System.out.println("Miktarı giriniz:");
            int miktar = input.nextInt();
            miktar += product.getAmount();
            product.setAmount(miktar);
            String dummy = input.nextLine();
        } else
            System.out.println("Ürün Bulunamadı!");
        this.urunListele();
    }
    public void urunuRafaKoy() {
        System.out.println();
        System.out.println("Ürün id'sini giriniz");
        String id = input.nextLine();
        Depo product = this.productList.get(id);
        if (product != null) {
            System.out.println("Raf giriniz:");
            String raf = input.nextLine();
            product.setShelf(raf);

        } else
            System.out.println("Ürün Bulunamadı!");
        this.urunListele();
    }
    public void urunCıkısı() {
        System.out.println("Ürün id'sini giriniz");
        String id = input.nextLine();

        Depo product = this.productList.get(id);
        if (product != null) {
            System.out.println("Çıkarmak istediğiniz miktarı giriniz:");
            int miktar = input.nextInt();
            String dummy = input.nextLine();
            if (miktar > product.getAmount()) {
                System.out.println("\nStokta girdiğiniz kadar ürün bulunmamaktadır. \n Stok 0 olarak güncellendi.");
                product.setAmount(0);
            } else {

                miktar = product.getAmount() - miktar;
                product.setAmount(miktar);
            }
        } else
            System.out.println("Ürün Bulunamadı !");
        this.urunListele();
    }



}
