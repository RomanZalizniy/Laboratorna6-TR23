import java.util.Scanner;

public class Zavd5 {
    private int numberOfItems;
    private double totalWeight;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість речей: ");
        numberOfItems = scanner.nextInt();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Введіть вагу речі " + i + " (в кілограмах): ");
            double weight = scanner.nextDouble();
            totalWeight += weight;
        }
    }

    public void printTotalWeight() {
        System.out.println("Загальна вага багажу: " + totalWeight + " кг");
    }
}

    public static void main(String[] args) {
        Zavd5 baggage = new Zavd5();
        baggage.input();
        baggage.printTotalWeight();
        }
}