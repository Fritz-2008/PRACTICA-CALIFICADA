public class OmitirNegativos {
    public static void main(String[] args) {

        int[] lista = {4, -2, 7, -5, 10};

        for (int num : lista) {
            if (num < 0) {
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
