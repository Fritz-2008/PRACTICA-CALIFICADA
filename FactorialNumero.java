
import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("No existe factorial de números negativos");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}
