package DersTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {

    Scanner input= new Scanner(System.in);

    public List<Order> orderList= new ArrayList<>();

    //Sipariş oluşturma
    public void createOrder(){
        int dishCode;
        do{
            System.out.println("Lütfen ürünün kodunu giriniz(ÇIKIŞ için 0!): ");
            dishCode=input.nextInt();//Burada yiyeceğin kodunu aldık ama obje oluşması için bize ismi lazım o yüzden dishservice geri
            //gidip orada yiyeceğin ismini bulan bir method yazacağız.
            //GO DİSH SERVİCE!!!
            //devamı sonra!!!!




        }while(dishCode!=0);



    }
}
