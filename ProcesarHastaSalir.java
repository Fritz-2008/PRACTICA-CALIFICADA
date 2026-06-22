import java.util.Scanner;

public class ProcesarHastaSalir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Escribe algo (salir para terminar): ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingresaste: " + texto);
        }

        sc.close();
    }
}
