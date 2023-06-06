package Zavd_6_pack;

import Zavd_6_pack.Zavd6_3;

public class Zavd6_3_right extends Zavd6_3 {
    private double s;
    private double h;

    public Zavd6_3_right(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    public double getBaseArea() {
        return s;
    }

    public double getHeight() {
        return h;
    }
}
