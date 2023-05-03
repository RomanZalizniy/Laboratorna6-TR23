public class Zavd1 {
    private String fullName;
    private int age;

    public Zavd1() {
        this.fullName = "";
        this.age = 0;
    }

    public Zavd1(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public static void main(String[] args) {
        Zavd1 person1 = new Zavd1();
        Zavd1 person2 = new Zavd1("John Smith", 35);

        person1.move();
        person2.talk();
    }
}
