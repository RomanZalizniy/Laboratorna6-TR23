package Zavd_4_pack;

public class zavd4pusk {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota Camry", "Сірий", 200);
        Truck truck = new Truck("Ford F-150", "Червоний", 150);

        sedan.gas();
        truck.gas();

        sedan.brake();
        truck.brake();
    }
}
