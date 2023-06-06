package Zavd_4_pack;

import Zavd_4_pack.Zavd4;

public class Sedan extends Zavd4 {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує");
    }
}

