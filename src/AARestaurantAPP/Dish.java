package AARestaurantAPP;
/*
2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.
 */
public class Dish {
    private int dishCode;
    private String dishName;
    private double dishPrice;

    public Dish(int dishCode, String dishName, double dishPrice) {
        this.dishCode = dishCode;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    public int getDishCode() {
        return dishCode;
    }

    public String getDishName() {
        return dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }
}
