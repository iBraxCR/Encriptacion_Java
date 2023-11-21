# Sistema de Encriptación - Documentación README

Este es un sistema de encriptación en Java que proporciona dos métodos de cifrado: sustitución monoalfabética y sustitución polialfabética (cifrado de Vigenère). El programa presenta un menú interactivo que permite al usuario seleccionar la operación deseada y realizar cifrado o descifrado según la opción elegida.

## Contenido del Repositorio

- App.java Este archivo contiene la clase principal que ejecuta el programa. Gestiona la interacción con el usuario a través de un menú y utiliza las clases `caso1` y `caso2` para realizar las operaciones de cifrado y descifrado.

- caso1.java: Clase que implementa el cifrado y descifrado mediante sustitución monoalfabética.

- caso2.java: Clase que implementa el cifrado y descifrado mediante sustitución polialfabética (cifrado de Vigenère).

- util.java: Clase de utilidades que proporciona funciones para imprimir mensajes, solicitar entrada de usuario y convertir cadenas a enteros.

## Instrucciones de Uso

1. Ejecute el programa desde el archivo `App.java`.

2. El sistema le dará la bienvenida y le solicitará que ingrese su nombre.

3. A continuación, se presenta un menú con opciones para realizar diferentes operaciones de cifrado y descifrado.

4. Seleccione la operación deseada ingresando el número correspondiente.

5. Siga las instrucciones adicionales que se le presentarán para completar la operación elegida.

6. Puede repetir el proceso hasta que elija la opción para salir del programa.

## Detalles de Implementación

- Sustitución Monoalfabética (caso1): Este método utiliza una clave numérica para desplazar las letras del alfabeto y realizar el cifrado y descifrado.

- Sustitución Polialfabética (caso2): Se implementa el cifrado de Vigenère, que utiliza una matriz para realizar el cifrado y descifrado basado en una clave alfabética.

## Personalización

- Puede modificar las clases `caso1` y `caso2` para ajustar el comportamiento del cifrado según sus necesidades.

- La clase `util` proporciona funciones básicas de entrada/salida que pueden ser ampliadas o personalizadas según sea necesario.

## Ejemplo de Uso

1. Cifrado Monoalfabético:
   - Seleccione la opción 1 en el menú principal.
   - Elija cifrar o descifrar.
   - Ingrese el texto y la clave cuando se le solicite.

2. Cifrado de Vigenère:
   - Seleccione la opción 2 en el menú principal.
   - Elija cifrar o descifrar.
   - Ingrese el texto y la clave cuando se le solicite.

## Agradecimientos

Este proyecto fue desarrollado como proyecto de fundamentos de programacion en el CUC.

---

¡Gracias por utilizar este sistema de encriptación! Si tiene alguna pregunta o mejora, no dude en enviar un mensaje al discord ibraxcr.

Fecha de última actualización: 21/11/23