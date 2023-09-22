package KahveMAkinesi;

import java.util.Scanner;

public class KahveRunner {
    static Scanner scan ;
    static Kahve kahve = new Kahve();
    public static void main(String[] args) {
        start();
    }


    private static void start() {

        scan=new Scanner(System.in);
        String selectCoffee;
        boolean isAgain=false;
        do {
            System.out.println("*".repeat(30));
            System.out.println("*** Hangi Kahveyi İstersiniz? ***");
            System.out.println();
            System.out.println("\t\t 1. Türk Kahvesi");
            System.out.println("\t\t 2. Filtre Kahve");
            System.out.println("\t\t 3. Espresso");
            selectCoffee = scan.nextLine();
            if (    selectCoffee.compareToIgnoreCase("Türk Kahvesi") == 0 ||
                    selectCoffee.compareToIgnoreCase("Filtre Kahve") == 0 ||
                    selectCoffee.compareToIgnoreCase("Espresso") == 0) {
                kahve.setTypeOfCoffee(selectCoffee);
                isAgain=false;
            }
            else {
                System.out.println("Hatalı tuşlama yaptınız");
                isAgain=true;
            }
        }while(isAgain);
        sugarSelect();
    }

    private static void sugarSelect() {
        String selectSugar;

        System.out.println("Şeker istiyor musunuz?");
        selectSugar= scan.nextLine();
        if(selectSugar.compareToIgnoreCase("evet")==0) {
            kahve.setSugar(true);
            System.out.println("Kaç şeker istersiniz?" );
            kahve.setCountOfSugar(scan.nextInt());
        }
        else
            kahve.setSugar(false);
        milkSelect();
    }

    private static void milkSelect() {
        scan=new Scanner(System.in);
        String selectMilk;
        System.out.println("Süt istiyor musunuz?");
        selectMilk= scan.nextLine();
        if(selectMilk.compareToIgnoreCase("evet")==0)
            kahve.setMilk(true);
        else
            kahve.setMilk(false);
        sizeSelect();
    }

    private static void sizeSelect() {
        String selectSize;
        System.out.println("Lütfen ebat seçiniz?");
        System.out.println("1. Küçük Boy");
        System.out.println("2. Orta Boy");
        System.out.println("3. Büyük Boy");
        selectSize= scan.nextLine();
        if(     selectSize.compareToIgnoreCase("Küçük Boy")==0||
                selectSize.compareToIgnoreCase("Orta Boy")==0||
                selectSize.compareToIgnoreCase("Büyük Boy")==0
        )
            kahve.setSizeOfCoffee(selectSize);
        else
            kahve.setSizeOfCoffee("Tercih edilmedi");
        kahve.printCoffee();
    }
}
