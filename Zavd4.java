public abstract class Zavd4 {
    protected String model;
    protected String color;
    protected int maxSpeed;

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
