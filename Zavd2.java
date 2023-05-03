public class Zavd2 {
    private String number;
    private String model;
    private double weight;

    public Zavd2() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }

    public Zavd2(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Zavd2(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }

    public String getNumber() {
        return this.number;
    }

    public void sendMessage(String... numbers) {
        System.out.print("Номера телефонів для відправки повідомлення: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Zavd2 phone1 = new Zavd2();
        Zavd2 phone2 = new Zavd2("555-1234", "Samsung");
        Zavd2 phone3 = new Zavd2("555-5678", "iPhone", 0.2);

        System.out.println("Телефон 1: номер - " + phone1.getNumber() + ", модель - " + phone1.model + ", вага - " + phone1.weight);
        System.out.println("Телефон 2: номер - " + phone2.getNumber() + ", модель - " + phone2.model + ", вага - " + phone2.weight);
        System.out.println("Телефон 3: номер - " + phone3.getNumber() + ", модель - " + phone3.model + ", вага - " + phone3.weight);

        phone1.receiveCall("Джон Сміт");
        phone2.receiveCall("Кейт Харрісон");
        phone3.receiveCall("Том Браун", "555-9012");

        phone2.sendMessage("555-4321", "555-6789");
    }
}
