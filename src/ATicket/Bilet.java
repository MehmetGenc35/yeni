package ATicket;

public class Bilet {

    private Yolcu yolcu;
    private int typeNo;
    private double distance;


    public Bilet(Yolcu yolcu) {

        this.yolcu = yolcu;
    }

    public Yolcu getYolcu() {

        return yolcu;
    }

    public void setYolcu(Yolcu yolcu) {

        this.yolcu = yolcu;
    }

    public int getPrice() {

        return typeNo;
    }

    public void setPrice(int price) {

        this.typeNo = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
