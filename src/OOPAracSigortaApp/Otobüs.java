package OOPAracSigortaApp;

public class Otobüs extends Arac {
    private String model;


    public Otobüs(int yil, int durum, int fiyat) {
        super(yil, durum, fiyat);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
