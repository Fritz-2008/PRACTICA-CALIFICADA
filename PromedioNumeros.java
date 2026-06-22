
import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de números: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que 0");
        } else {
            double suma = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Número " + i + ": ");
                suma += sc.nextDouble();
            }

            double promedio = suma / n;
            System.out.println("Promedio: " + promedio);
        }

        sc.close();
    }
}
