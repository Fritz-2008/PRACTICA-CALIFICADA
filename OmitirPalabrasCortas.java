public class OmitirPalabrasCortas {
    public static void main(String[] args) {

        String texto = "Yo estudio en la universidad de sistemas";
        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            if (palabra.length() < 3) {
                continue;
            }
            System.out.print(palabra + " ");
        }
    }
}
