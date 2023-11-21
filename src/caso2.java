import java.util.Scanner;

public class caso2 {

    public static void cifrarVigenere(String texto, String clave) {
        char[][] matriz = new char[28][28];
        inicializarMatriz(matriz);

        // Convertir el texto y la clave a mayúsculas
        texto = texto.toUpperCase();
        clave = clave.toUpperCase();

        // Realizar el cifrado de Vigenere
        String textoCifrado = "";
        int index = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracterTexto = texto.charAt(i);

            // Verificar si el carácter es una letra
            if (Character.isLetter(caracterTexto)) {
                char caracterClave = clave.charAt(index % clave.length());

                // Obtener la fila y columna correspondientes al texto y la clave
                int fila = caracterClave - 'A';
                int columna = caracterTexto - 'A';

                // Obtener el carácter cifrado de la matriz
                char caracterCifrado = matriz[fila][columna];

                // Agregar el carácter cifrado al resultado
                textoCifrado += caracterCifrado;

                // Incrementar el índice de la clave
                index++;
            } else {
                // Mantener los caracteres no alfabéticos sin cambios
                textoCifrado += caracterTexto;
            }
        }

        System.out.println("Texto cifrado: " + textoCifrado);
    }

    public static void descifrarVigenere(String texto, String clave) {
        char[][] matriz = new char[28][28];
        inicializarMatriz(matriz);

        // Convertir el texto y la clave a mayúsculas
        texto = texto.toUpperCase();
        clave = clave.toUpperCase();

        // Realizar el descifrado de Vigenere
        String textoDescifrado = "";
        int index = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracterTexto = texto.charAt(i);

            // Verificar si el carácter es una letra
            if (Character.isLetter(caracterTexto)) {
                char caracterClave = clave.charAt(index % clave.length());

                // Obtener la fila correspondiente a la letra de la clave
                int fila = caracterClave - 'A';

                // Buscar la columna correspondiente al carácter en la fila de la clave
                for (int j = 0; j < 28; j++) {
                    if (matriz[fila][j] == caracterTexto) {
                        // Obtener el carácter descifrado de la matriz
                        char caracterDescifrado = (char) ('A' + j);
                        // Agregar el carácter descifrado al resultado
                        textoDescifrado += caracterDescifrado;
                        break;
                    }
                }

                // Incrementar el índice de la clave
                index++;
            } else {
                // Mantener los caracteres no alfabéticos sin cambios
                textoDescifrado += caracterTexto;
            }
        }

        System.out.println("Texto descifrado: " + textoDescifrado);
    }

    private static void inicializarMatriz(char[][] matriz) { // Método privado para inicializar la matriz para el cifrado.
        for (int i = 0; i < 28; i++) { //Corre las filas de la matriz.
            char letra = (char) (i + 'A'); // Obtine la letra correspondiente a la fila actual.

            for (int j = 0; j < 28; j++) { //Recorre las columnas de la matriz.
                matriz[i][j] = letra; // Asigna la letra actual a la posición (i, j) de la matriz.
                letra++; // Incrementa la letra para la siguiente posición en la fila.
                if (letra > 'Z') { //Vuelve a reiniciar a la A cuándo llegue a la Z.
                    letra = 'A';
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el texto
        System.out.print("Ingrese el texto: ");
        String textoVigenere = scanner.nextLine();

        // Solicitar la clave
        System.out.print("Ingrese la clave: ");
        String claveVigenere = scanner.nextLine();

        // Permitir al usuario elegir entre cifrar y descifrar
        System.out.print("Seleccione 'C' para cifrar o 'D' para descifrar: ");
        char opcion = scanner.next().toUpperCase().charAt(0);

        // Llamada al método correspondiente según la opción elegida
        switch (opcion) {
            case 'C': //Llama la función cifrado.
                cifrarVigenere(textoVigenere, claveVigenere);
                break;
            case 'D': //Llama la función de descibrado.
                descifrarVigenere(textoVigenere, claveVigenere);
                break;
            default: //Invalida la opción.
                System.out.println("Opción no válida. Seleccione 'C' para cifrar o 'D' para descifrar.");
        }

        scanner.close(); // Cierra el scanner para evitar fugas de recursos.
    }
}
