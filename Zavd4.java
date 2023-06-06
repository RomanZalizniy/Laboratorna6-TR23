package Zavd_4_pack;

public abstract class Zavd4 {
    public String model;
    public String color;
    public int maxSpeed;

    public Zavd4(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газуємо!");
    }

    public abstract void brake();
}
