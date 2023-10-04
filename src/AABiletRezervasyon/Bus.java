package AABiletRezervasyon;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private String plate;

    List<String> seatNo=new ArrayList<>();

    public Bus(String plate) {
        this.plate = plate;

        for (int i = 1; i <33 ; i++) {
            this.seatNo.add(String.valueOf(i));
        }
    }

    public String getPlate() {
        return plate;
    }
}
