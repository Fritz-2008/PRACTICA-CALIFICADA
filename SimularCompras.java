
import java.util.Scanner;

public class SimularCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, total = 0;

        do {
            System.out.print("Ingrese precio (0 para terminar): ");
            precio = sc.nextDouble();
            total += precio;
        } while (precio != 0);

        System.out.println("Total de compra: " + total);
        sc.close();
    }
}
