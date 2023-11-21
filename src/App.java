import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        util.out("Hola bienvenido al sistema de encriptación, Digite su nombre: "); //Menú para registrar el nombre.
        String nombre = scanner.nextLine();       

        boolean continuar = true; // Variable para controlar el bucle de operaciones.        

        int op; // Variable para almacenar la opción seleccionada por el usuario.

        System.out.println("Hola " + nombre + ", ¿qué desea hacer hoy?"); // Mensaje de bienvenida.

        do { 
            System.out.println("¿Qué operación desea realizar?\n" // Menú de opciones.
                    + "1. Sustitución monoalfabética\n"
                    + "2. Sustitución polialfabética\n"
                    + "3. Salir");

            op = scanner.nextInt(); // Da la opción principal al usuario.

            switch (op) { // Utiliza un switch para manejar diferentes opciones.
                case 1:
                    // Submenú para cifrar o descifrar
                    int subOp;
                    do {
                        System.out.println("¿Qué desea hacer?\n"
                                + "1. Cifrar\n"
                                + "2. Descifrar\n"
                                + "3. Salir");

                        subOp = scanner.nextInt();

                        // Realizar la acción según la subopción
                        switch (subOp) {
                            case 1:
                                // Solicitar el texto y la clave
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.print("Ingrese el texto: ");
                                String texto = scanner.nextLine();
                                System.out.print("Ingrese la clave: ");
                                int clave = scanner.nextInt();

                                // Crear una instancia de SustitucionMonoalfabetica
                                caso1 caso1 = new caso1();

                                // Cifrar el texto usando el método cifrar
                                String textoCifrado = caso1.cifrar(texto, clave);
                                System.out.println("Texto cifrado: " + textoCifrado);
                                break;
                            case 2:
                                // Solicitar el texto y la clave
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.print("Ingrese el texto: ");
                                String textoDescifrar = scanner.nextLine();
                                System.out.print("Ingrese la clave: ");
                                int claveDescifrar = scanner.nextInt();

                                // Crear una instancia de SustitucionMonoalfabetica
                                caso1 caso1Descifrar = new caso1();

                                // Descifrar el texto usando el método descifrar
                                String textoDescifrado = caso1Descifrar.descifrar(textoDescifrar, claveDescifrar);
                                System.out.println("Texto descifrado: " + textoDescifrado);
                                break;
                            case 3: // Salir del submenú.
                                System.out.println("Volviendo al menú principal...");
                                break;
                            default: // Invalida la opción.
                                System.out.println("Opción no válida");
                                break;
                        }
                    } while (subOp != 3); // Valida la opción de salir cuando se elija la opción 3.
                    break;
                case 2:
                    // Submenú para cifrar o descifrar en caso2
                    int subOp2;
                    do {
                        System.out.println("¿Qué desea hacer?\n"
                                + "1. Cifrar\n"
                                + "2. Descifrar\n"
                                + "3. Salir");

                        subOp2 = scanner.nextInt();

                        // Realizar la acción según la subopción
                        switch (subOp2) {
                            case 1:
                                // Solicitar el texto y la clave antes de llamar al método cifrarVigenere
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.print("Ingrese el texto: ");
                                String textoVigenere = scanner.nextLine();
                                System.out.print("Ingrese la clave: ");
                                String claveVigenere = scanner.nextLine();

                                // Cifrar el texto usando el método cifrarVigenere de caso2
                                caso2.cifrarVigenere(textoVigenere, claveVigenere);
                                break;
                            case 2:
                                // Solicitar el texto y la clave antes de llamar al método descifrarVigenere
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.print("Ingrese el texto: ");
                                String textoVigenereDescifrar = scanner.nextLine();
                                System.out.print("Ingrese la clave: ");
                                String claveVigenereDescifrar = scanner.nextLine();

                                // Descifrar el texto usando el método descifrarVigenere de caso2
                                caso2.descifrarVigenere(textoVigenereDescifrar, claveVigenereDescifrar);
                                break;
                            case 3: // Salir del submenú.
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default: // Invalida la opción.
                                System.out.println("Opción no válida");
                                break;
                        }
                    } while (subOp2 != 3); // Valida la opción de salir cuando se elija la opción 3.
                    break;
                case 3: //Valida la opción de salir y termina el programa.
                    continuar = false;
                    break;
                default:  // Invalida la opción.
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }

        } while (continuar); //Permite repeti el menú.

        System.out.println("Gracias por usar este sistema de encriptación");
        scanner.close(); //Ciera el scanner para evitar fugas de recursos.
    }
}
