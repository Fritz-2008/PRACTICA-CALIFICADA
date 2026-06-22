public class BuscarEnArreglo {
    public static void main(String[] args) {

        int[] numeros = {5, 8, 12, 3, 9};
        int buscado = 12;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("Número encontrado en la posición: " + i);
                break;
            }
        }
    }
}
