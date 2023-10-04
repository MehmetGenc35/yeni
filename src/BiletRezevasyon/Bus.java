package BiletRezevasyon;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String busPlate;

    public List<String> seats= new ArrayList<>();

    public Bus(String busPlate) {
        this.busPlate = busPlate;
        for (int i = 1; i <33 ; i++) {
            this.seats.add(i+"");

        }
    }

    public String getBusPlate() {
        return busPlate;
    }

    public void setBusPlate(String busPlate) {
        this.busPlate = busPlate;
    }
}
