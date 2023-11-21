public class util {
    
    
    //Imprimir datos

    public static <T> void out(T S){

        System.out.println(S);

    }


    public static <T> void outNoLn(T S) {

        System.out.println(S);

    }

    //Solicita datos al usuario.
    public static String in(String mensaje) {

        out(mensaje);
        return System.console().readLine();

    }

    //Solicita un valor entero al usuario y devolverlo.
    public static int inInteger(String mensaje) throws NumberFormatException {


    String valor = in(mensaje);
    return Integer.parseInt(valor);


    }



    


}
