package DersTekrar;

public class Dish {
    private int code;
    private String name;
    private double price;

    //ilk oluşturulduğunda set edilebilsin diye constructor ı parametreli yapıyoruz


    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    //Bu variabler çağrıldığında okunabilsin diye getter yapacağız sadece

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
