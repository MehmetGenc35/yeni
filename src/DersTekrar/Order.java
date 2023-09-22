package DersTekrar;

public class Order {
    //Sipariş objesini oluşturmak için bu classı oluşturduk

    private static int count=999;
    private int orderCode;
    private Dish dish;
    private int numberOfDish;
    private double orderPrice;

    //Sipariş objesi yemek ve adet ile oluşturulabilsin diye 2 parametreli constructor oluşturacağız
    //Obje oluşturulduğunda bu iki bilgi girilerek sipariş oluşmuş olacak;


    public Order(Dish dish, int numberOfDish) {
        count++;
        this.orderCode=count;
        this.dish = dish;
        this.numberOfDish = numberOfDish;
    }
    //Siparişin toplamının hesaplanması için bir metod yazacağız
    public void setOrderPrice(){
        this.orderPrice=this.dish.getPrice()*numberOfDish;
    }

    //Sadece sipariş adedi set edilebilsin diye sadece numberOfDish setter oluşturacağız

    public void setNumberOfDish(int numberOfDish) {

        this.numberOfDish = numberOfDish;
    }

    //buradaki fieldları kullanmak için getter metotlarına ihtiyacımız var


    public int getOrderCode() {
        return orderCode;
    }

    public Dish getDish() {
        return dish;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public double getOrderPrice() {
        return orderPrice;
    }
}
