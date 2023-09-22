package KahveMAkinesi;

public class Kahve {
    public Kahve() {
    }

    public boolean isMilk() {

        return isMilk;
    }

    public void setMilk(boolean milk) {

        isMilk = milk;
    }

    public String getTypeOfCoffee() {

        return typeOfCoffee;
    }

    public void setTypeOfCoffee(String typeOfCoffee) {

        this.typeOfCoffee = typeOfCoffee;
    }

    public boolean isSugar() {

        return isSugar;
    }

    public void setSugar(boolean sugar) {

        isSugar = sugar;
    }

    public int getCountOfSugar() {

        return countOfSugar;
    }

    public void setCountOfSugar(int countOfSugar) {

        this.countOfSugar = countOfSugar;
    }

    public String getSizeOfCoffee() {

        return sizeOfCoffee;
    }

    public void setSizeOfCoffee(String sizeOfCoffee) {

        this.sizeOfCoffee = sizeOfCoffee;
    }

    public Kahve(String typeOfCoffee, boolean isSugar, int countOfSugar, String sizeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
        this.isSugar = isSugar;
        this.isMilk=isMilk;
        this.countOfSugar = countOfSugar;
        this.sizeOfCoffee = sizeOfCoffee;
    }
    public boolean isMilk;
    public String typeOfCoffee;
    public boolean isSugar;
    public int countOfSugar;
    public String sizeOfCoffee;

    public void printCoffee(){
        String sugar=this.isSugar==true?this.countOfSugar+" şekerli":"şekersiz";
        String milk=this.isMilk==true?"Sütlü\n":"Süt ilavesiz";

        System.out.println(
                "Seçiminiz : \n"    +
                        this.typeOfCoffee+"\n"   +
                        sugar+"\n"+
                        milk+"\n"+
                        this.sizeOfCoffee+"\n"+
                        "Hazırlanıyor\nAfiyet olsun..."
        );
    }

}
