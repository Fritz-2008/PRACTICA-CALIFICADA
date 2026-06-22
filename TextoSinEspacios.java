public class TextoSinEspacios {
    public static void main(String[] args) {

        String texto = "Hola mundo en Java";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == ' ') {
                continue;
            }

            System.out.print(c);
        }
    }
}
