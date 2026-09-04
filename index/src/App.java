import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        var scanner = new Scanner(System.in);

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: Computer, wich price is %.2f%n", price1);
        System.out.printf("Office desk, wich price is $ %.2f%n", price2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.10f%n", measure);
        System.out.printf("Rouded (three decimal places): 53,235");
        System.out.printf(" %n US decimal point: 53.235");

    }
}
