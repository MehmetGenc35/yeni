package ProjeÇalışması;

public class Depo {
    private String id;
    private String productName;
    private String producerName;
    private int amount;
    private String unit;
    private String shelf;

    public Depo(String id, String productName, String producerName, int amount, String unit, String shelf) {
        this.id = id;
        this.productName = productName;
        this.producerName = producerName;
        this.amount = amount;
        this.unit = unit;
        this.shelf = shelf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}
