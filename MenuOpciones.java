
import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Adiós!");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);

        sc.close();
    }
}
