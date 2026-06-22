
import java.util.Scanner;

public class AcumularNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, suma = 0;
        int contador = 0;
        char continuar;

        do {
            System.out.print("Ingrese nota: ");
            nota = sc.nextDouble();
            suma += nota;
            contador++;

            System.out.print("¿Continuar? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("Promedio: " + (suma / contador));
        sc.close();
    }
}
