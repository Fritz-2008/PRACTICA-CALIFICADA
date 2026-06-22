
import java.util.Scanner;

public class ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        char continuar;

        do {
            System.out.print("Ingrese temperatura en Celsius: ");
            celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + fahrenheit);

            System.out.print("¿Desea continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}
