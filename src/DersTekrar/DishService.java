package DersTekrar;

import java.util.ArrayList;
import java.util.List;

public class DishService {
    //Dish objesi üzerinde çalışacağımız zaman bu service classını oluşturuyoruz

    //Liste lazım bize
    private List<Dish> dishList= new ArrayList<>();

    //Listeye eklenilen elemanlar parametresiz constructor içinde olacak
    public DishService(){
        fillDishList();
        //constructor içi temiz olsun diye bunu yaptık kısa yoldan


    }

    private void fillDishList() {
        //Dish objemi oluşturup  listeye ekleyeceğim
        Dish dish1=new Dish(100,"Adana Kebabı",250.99);
        Dish dish2=new Dish(101,"Urfa Kebabı",200.0);
        Dish dish3=new Dish(102,"Çökertme Kebabı",200.0);
        Dish dish4=new Dish(200,"Baklava",100.0);
        Dish dish5=new Dish(201,"Kadayıf",85.0);
        Dish dish6=new Dish(202,"Künefe",75.0);
        Dish dish7=new Dish(300,"Yayık Ayranı",30.0);
        Dish dish8=new Dish(301,"Kola",35.0);
        Dish dish9=new Dish(302,"Çay",15.0);
        Dish dish10=new Dish(303,"Su",7.5);
        //listeye eklemek için
        this.dishList.add(dish1);
        this.dishList.add(dish2);
        this.dishList.add(dish3);
        this.dishList.add(dish4);
        this.dishList.add(dish5);
        this.dishList.add(dish6);
        this.dishList.add(dish7);
        this.dishList.add(dish8);
        this.dishList.add(dish9);
        this.dishList.add(dish10);

        //parametresiz konstrcter çağrıldığında bunlar otomatik çalışacak
    }
    public void showMenu() {
        System.out.println("       ****LEZZETLERİMİZ****         ");
        System.out.printf("%-3s     %-20s     %-6s     \n", "KOD", "ADI", "FİYAT");
        System.out.printf("%-3s     %-20s     %-6s     \n", "***", "****", "****************");

        for (Dish w : dishList) {

            System.out.printf("%-3s     %-20s     %-6s    Lira\n", w.getCode(), w.getName(), w.getPrice());
        }
    }
    //kullanıcıdan alınan koda göre yiyeceğin ismini bulacak
    public Dish findNameByCode(int code){
        if(code==0){
            System.out.println("Ana menüye gidiyorsun yolun açık olsun...");
        }else{
            for(Dish dish:dishList){
                if(dish.getCode()==code){
                    return dish;
                }
            }
            System.out.println("Ürün bulunamadı!..");
        }
        return null;
    }
}
