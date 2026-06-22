
import java.util.Scanner;

public class VocalesEnTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        System.out.print("Vocales encontradas: ");

        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));

            if ("aeiou".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }

        sc.close();
    }
}
