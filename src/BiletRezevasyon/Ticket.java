package BiletRezevasyon;

public class Ticket {
    private double distance;
    private int type;
    private String seatNo;

    private double price;

    public Ticket() {
    }

    public Ticket(double distance, int type, String seatNo) {
        this.distance = distance;
        this.type = type;
        this.seatNo = seatNo;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
