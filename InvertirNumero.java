
import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int original = num;
        int invertido = 0;

        for (; num != 0; num /= 10) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Número original: " + original);
        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}
