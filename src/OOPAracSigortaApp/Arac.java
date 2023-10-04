package OOPAracSigortaApp;
/*
yıl
durum
fiyat
pirim

 */
public class Arac {
    private String aracİsim;
    private int yil;
    private int durum;
    private int fiyat;
    private int prim;

    public Arac() {
    }

    public Arac(int yil, int durum, int fiyat) {
        this.yil = yil;
        this.durum = durum;
        this.fiyat = fiyat;
        this.aracİsim=getAracİsim();
    }

    public String getAracİsim() {
        return aracİsim;
    }

    public void setAracİsim(String aracİsim) {
        this.aracİsim = aracİsim;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getDurum() {
        return durum;
    }

    public void setDurum(int durum) {
        this.durum = durum;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getPrim() {
        return prim;
    }

    public void setPrim(int prim) {
        this.prim = prim;
    }
}
