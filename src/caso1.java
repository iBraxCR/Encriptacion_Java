public class caso1 {

    private static final int MODULO = 26; // Número de letras en el alfabeto

    // Método para cifrar un texto dado una clave
    public String cifrar(String texto, int clave) {
        StringBuilder textoCifrado = new StringBuilder();

        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                // Obtener el valor numérico del carácter y aplicar la clave
                int valorOriginal = (Character.toUpperCase(caracter) - 'A');
                int valorCifrado = (valorOriginal + clave) % MODULO;

                // Manejar resultados negativos
                if (valorCifrado < 0) {
                    valorCifrado += MODULO;
                }

                // Ajustar para asegurarse de que esté dentro del rango de letras del alfabeto
                valorCifrado = (valorCifrado + MODULO) % MODULO;

                // Convertir el valor cifrado a carácter y añadir al resultado
                char caracterCifrado = (char) ('A' + valorCifrado);
                textoCifrado.append(caracterCifrado);
            } else {
                // Mantener los caracteres no alfabéticos sin cambios
                textoCifrado.append(caracter);
            }
        }

        return textoCifrado.toString();
    }

    // Método para descifrar un texto dado una clave
    public String descifrar(String textoCifrado, int clave) {
        // El descifrado es similar al cifrado, pero restando la clave en lugar de sumarla
        return cifrar(textoCifrado, -clave);
    }
}
