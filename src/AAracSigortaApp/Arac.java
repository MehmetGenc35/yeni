package AAracSigortaApp;
/*
Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
 */
import java.util.Scanner;

public class Arac {
    public String type;

    public int price;

public void typeOfVehicle(int term){
    Scanner inp = new Scanner(System.in);
    System.out.println("Lütfen arabanın tipini seçiniz: ");
    System.out.println("otomobil,kamyon,otobüs,motorsiklet");

    String type=inp.nextLine().toLowerCase();

    switch (type){
        case "otomobil":
            this.price=term == 1 ? 2000 : 2500 ;
            System.out.println(this.price);
            break;
        case "kamyon":
            this.price=term == 1 ? 3000 : 3500 ;
            System.out.println(this.price);
            break;
        case "otobüs":
            typeOfBus(term);
            System.out.println(this.price);
            break;
        case "motorsiklet":
            this.price=term == 1 ? 1500 : 1750;
            System.out.println(this.price);
            break;
        default:
            System.out.println("Hatalı giriş yaptınız...");
            break;


    }


}
public void typeOfBus(int term){
    Scanner inp=new Scanner(System.in);
    System.out.println("Otobüs tipini seçiniz: ");
    System.out.println("1-18-30 koltuk\n2-31 ve üstü koltuk");
    int select=inp.nextInt();inp.nextLine();
    if(select==1){
        this.price=term==1?4000:4500;
    }else if(select==2){
        this.price=term==1?5000:5500;
    }else
        System.out.println("hatalı bir giriş yaptınız...");

}

}















