package org.example;

import javax.swing.*;
import java.util.Arrays;

public class Metodos {

    //Ejercicio1(Operaciones)
    public static void ejercicio1() {

        JOptionPane.showMessageDialog(null, "Ingrese 2 numeros");
        String tem1 = JOptionPane.showInputDialog("Ingrese el numero1");
        String tem2 = JOptionPane.showInputDialog("Ingrese el numero2");
        int num1 = Integer.parseInt(tem1);
        int num2 = Integer.parseInt(tem2);

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma + "\n" + "El resultado de la resta es: " + resta + "\n" + "El resultado de la multiplicacion es: " + multiplicacion + "\n" + "El resultado de la division es: " + division);
    }

    //Ejercicio2(Par o Impar)
    public static void ejercicio2() {
        String tem1 = JOptionPane.showInputDialog("Ingrese un numero entero");
        int num = Integer.parseInt(tem1);

        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero ingresado es PAR");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es IMPAR");
        }
    }

    //Ejercicio3(Area-Perimetro circulo)
    public static void ejercicio3() {
        String radiotem = JOptionPane.showInputDialog("Ingresa el radio del circulo:");
        double radio = Float.parseFloat(radiotem);

        // área circulo =  π x r^2
        // perimetro circulo =  2.π x r
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(null, "Area del circulo: " + area + "\nPerimetro del circulo: " + perimetro);
    }

    //Ejercicio4(Mayor-Menor edad)
    public static void ejercicio4() {
        String edadtem = JOptionPane.showInputDialog("Ingrese su edad");
        int edad = Integer.parseInt(edadtem);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        }
    }

    //Ejercicio5(Cual numero es mayor)
    public static void ejercicio5() {
        JOptionPane.showMessageDialog(null, "Ingrese 2 numeros enteros");
        String numtem1 = JOptionPane.showInputDialog("Ingrese el numero1");
        String numtem2 = JOptionPane.showInputDialog("Ingrese el numero2");
        int num1 = Integer.parseInt(numtem1);
        int num2 = Integer.parseInt(numtem2);

        //Se determina cual es mayor
        int numMayor;
        if (num1 > num2) {
            numMayor = num1;
        } else {
            numMayor = num2;
        }

        JOptionPane.showMessageDialog(null, "El numero mayor es: " + numMayor);
    }

    //Ejercicio6(Numero posotivo-negativo-cero)
    public static void ejercicio6() {
        try {
            String tem = JOptionPane.showInputDialog("Ingrese un numero entero");
            int num = Integer.parseInt(tem);

            if (num > 0) {
                JOptionPane.showMessageDialog(null, "El numero es positivo.");
            } else if (num < 0) {
                JOptionPane.showMessageDialog(null, "El numero es negativo.");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es cero.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa un valor numerico.");
        }
    }

    //Ejercicio7(Tabla de multiplicar)
    public static void ejercicio7() {
        try {
            String tem = JOptionPane.showInputDialog("Ingrese un numero entero");
            int num = Integer.parseInt(tem);

            //Se valida que el numero sea positivo
            if (num <= 0) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero entero positivo.");
                System.exit(0);
            }

            String tablaMultiplicar = "";
            for (int i = 1; i <= 10; i++) {
                tablaMultiplicar += num + " * " + i + " = " + (num * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Tabla de multiplicar del " + num + ":\n" + tablaMultiplicar);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un numero entero valido");
        }
    }

    //Ejercicio8(Adivinar Numero)
    public static void ejercicio8() {
        int numAdivinar = (int) (Math.random() * 100) + 1;
        int numIngresado;

        do {
            String tem = JOptionPane.showInputDialog("Adivina el numero entre un rango del 1 al 100:");
            numIngresado = Integer.parseInt(tem);

            if (numIngresado == numAdivinar) {
                JOptionPane.showMessageDialog(null, "Numero adivinado, felicidades ");
                break;
            } else if (numIngresado < numAdivinar) {
                JOptionPane.showMessageDialog(null, "El numero es mayor. Intenta nuevamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es menor. Intenta nuevamente.");
            }
        } while (true);
    }

    //Ejercicio9(Factorial de un numero)
    public static void ejercicio9() {
        String tem = JOptionPane.showInputDialog("Ingresa un numero entero");
        int num = Integer.parseInt(tem);

        if (num <= 0) {
            JOptionPane.showMessageDialog(null, "Ingresa un numero entero positivo.");
            System.exit(0);
        }

        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null,
                "El factorial del numero " + num + " es: " + factorial);
    }

    //Ejercicio10(Fibonacci-20)
    public static void ejercicio10() {
        int num = 25, a = 0, b = 1, c;

        String fibonacci = "";
        for (int i = 0; i < num; i++) {
            fibonacci += a + ",";
            c = a + b;
            a = b;
            b = c;
        }
        JOptionPane.showMessageDialog(null, "Fibonacci de " + num + "es:\n" + fibonacci);
    }

    //Ejercicio11(Area triangulo-FHeron)
    public static void ejercicio11() {
        JOptionPane.showMessageDialog(null, "Ingrese la longitud de los 3 lados del triangulo");
        String ladotem1 = JOptionPane.showInputDialog("Ingrese el lado1");
        String ladotem2 = JOptionPane.showInputDialog("Ingrese el lado2");
        String ladotem3 = JOptionPane.showInputDialog("Ingrese el lado3");
        double lado1 = Double.parseDouble(ladotem1);
        double lado2 = Double.parseDouble(ladotem2);
        double lado3 = Double.parseDouble(ladotem3);

        double s = (lado1 + lado2 + lado3) / 2.0;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + area);
    }

    //Ejercicio12(Numero Primo)
    public static void ejercicio12() {
        String numtem = JOptionPane.showInputDialog("Ingrese un numero entero");
        int num = Integer.parseInt(numtem);

        //se valida que el numero sea primo
        boolean primo = true;
        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es primo.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + num + " no es primo.");
        }
    }

    //Ejercicio13(Redondeo decimales)
    public static void ejercicio13() {
        String numtem = JOptionPane.showInputDialog("Ingrese un numero decimal");
        double decimal = Double.parseDouble(numtem);

        numtem = JOptionPane.showInputDialog("Ingrese el numero de decimales que desea");
        int numDecimales = Integer.parseInt(numtem);

        // Se redondea el número decimal
        double factor = Math.pow(10, numDecimales);
        double numRedondeado = Math.round(decimal * factor) / factor;

        JOptionPane.showMessageDialog(null, "El numero redondeado es: " + numRedondeado);
    }

    //Ejercicio14(Numero Perfecto)
    public static void ejercicio14() {
        String numtem = JOptionPane.showInputDialog("Ingresa un numero entero positivo");
        int num = Integer.parseInt(numtem);

        int sumaDivisores = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == num) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es un numero perfecto.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + num + " no es un numero perfecto.");
        }
    }

    //Ejercicio15(Numero Capicua)
    public static void ejercicio15() {
        String numtem = JOptionPane.showInputDialog("Ingresa un numero entero");
        int num = Integer.parseInt(numtem);

        // Se convierte el número a una cadena de caracteres
        String numCadena = String.valueOf(num);

        // Se crea una cadena invertida del número
        String numInvertido = new StringBuilder(numCadena).reverse().toString();

        // Se verifica si el número es capicúa
        if (numCadena.equals(numInvertido)) {
            JOptionPane.showMessageDialog(null, "El  " + num + " es un numero capicua.");
        } else {
            JOptionPane.showMessageDialog(null, "El  " + num + " no es un numero capicua.");
        }
    }

    //Ejercicio16(Fibonacci Especifico)
    public static void ejercicio16() {
        String numtem = JOptionPane.showInputDialog("Ingresa un numero entero");
        int num = Integer.parseInt(numtem);

        int a = 0, b = 1, c;

        String fibonacci = "";
        for (int i = 0; i < num; i++) {
            fibonacci += a + ",";
            c = a + b;
            a = b;
            b = c;
        }
        JOptionPane.showMessageDialog(null, "Fibonacci de " + num + " es:\n" + fibonacci);
    }

    //Ejercicio17(Rango de Primos)
    public static void ejercicio17() {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero entero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero entero"));

        // Nos aseguramos que el primer numero sea menor que el segundo número
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num1 = temp;
        }

        // Mostrar los números primos en el rango
        String numerosPrimos = "Numeros primos en el rango [" + num1 + ", " + num2 + "]:";
        for (int numero = num1; numero <= num2; numero++) {
            boolean Primo = true;
            if (numero <= 1) {
                Primo = false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    Primo = false;
                    break;
                }
            }
            if (Primo) {
                numerosPrimos += " " + numero;
            }
        }

        JOptionPane.showMessageDialog(null, numerosPrimos);
    }

    //Ejercicio18(Contraseña generada)
    public static void ejercicio18() {
        // Definimos los caracteres válidos para la contraseña
        String caractValidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // StrinBuilder permite modificar el contenido de una cadena de caracteres sin tener que crear una nueva instancia cada vez que se realiza una operación
        StringBuilder contrasena = new StringBuilder();

        // Generamos la contraseña de 8 caracteres
        for (int i = 0; i < 8; i++) {
            int indiceAleatorio = (int) (Math.random() * caractValidos.length());

            // Obtenemos el carácter correspondiente al índice aleatorio y lo agregamos a la contraseña
            char caracterAleatorio = caractValidos.charAt(indiceAleatorio);
            contrasena.append(caracterAleatorio);
        }

        JOptionPane.showMessageDialog(null, "La contraseña generada es: " + contrasena);
    }

    //Ejercicio19(Nombre en mayus y minus)
    public static void ejercicio19() {
        String nombre = JOptionPane.showInputDialog("Ingresa su nombre");

        JOptionPane.showMessageDialog(null,
                "Nombre en mayusculas: " + nombre.toUpperCase()
                        + "\n Nombre en minusculas: " + nombre.toLowerCase());
    }

    //Ejercicio20(Cadena Invertida)
    public static void ejercicio20() {
        String cadena = JOptionPane.showInputDialog("Ingresa una cadena");

        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Cadena invertida: " + cadenaInvertida);
    }

    //Ejercicio21(Numero de veces letra)
    public static void ejercicio21() {
        String cadena = JOptionPane.showInputDialog("Ingresa una cadena");
        String letratem = JOptionPane.showInputDialog("Ingresa una letra en especifico");

        char letra = letratem.charAt(0);

        // Contar cuántas veces aparece la letra en la cadena
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "La letra '" + letra + "' aparece " + contador + " veces.");
    }

    //Ejercicio22(Frase palindromo)
    public static void ejercicio22() {
        String frase = JOptionPane.showInputDialog(null, "Ingresa una frase");

        // Para mayor facilidad se eliminan espacios y se convierte a minúsculas para comparar
        String frasetrans = frase.replaceAll("\\s+", "").toLowerCase();

        // Se verifica si es un palíndromo
        boolean Palindromo = true;
        int longitud = frasetrans.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (frasetrans.charAt(i) != frasetrans.charAt(longitud - 1 - i)) {
                Palindromo = false;
                break;
            }
        }

        if (Palindromo) {
            JOptionPane.showMessageDialog(null, "La frase es un palindromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase NO es un palindromo.");
        }
    }

    //Ejercicio23(Cantidad de palabras)
    public static void ejercicio23() {
        String oracion = JOptionPane.showInputDialog("Ingrese una oracion");

        int cantidadPalabras = 0;

        // Contar las palabras iterando por la oración
        for (int i = 0; i < oracion.length(); i++) {
            // Si el carácter actual es un espacio y el siguiente carácter no es un espacio, incrementar el contador de palabras
            if (oracion.charAt(i) == ' ' && i + 1 < oracion.length() && oracion.charAt(i + 1) != ' ') {
                cantidadPalabras++;
            }
        }

        // Se incrementa una vez mas para tomar en cuenta la ultima palabra
        cantidadPalabras++;


        JOptionPane.showMessageDialog(null, "La oracion tiene " + cantidadPalabras + " palabras.");
    }

    //Ejercicio24(Reemplazo de letra)
    public static void ejercicio24() {
        String cadenaOriginal = JOptionPane.showInputDialog("Ingrese una cadena");
        String letraAnterior = JOptionPane.showInputDialog("Ingrese la letra que desea reemplazar");
        String letraNueva = JOptionPane.showInputDialog("Ingrese la letra de reemplazo");

        String cadenaReemplazada = cadenaOriginal.replace(letraAnterior, letraNueva);

        JOptionPane.showMessageDialog(null,
                "Cadena original: " + cadenaOriginal
                        + "\nCadena reemplazada: " + cadenaReemplazada);
    }

    //Ejercicio25(Separar palabras)
    public static void ejercicio25() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase");

        //split(" ") para dividir la frase en palabras separadas.
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            JOptionPane.showMessageDialog(null, palabras[i]);
        }
    }

    //Ejercicio26(Caracter sin espacio)
    public static void ejercicio26() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena");

        // Contar los caracteres sin contar los espacios en blanco
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                contador++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "La cadena tiene " + contador
                        + " caracteres (sin contar espacios en blanco).");
    }

    //Ejercicio27(ordenar alfabeticamente)
    public static void ejercicio27() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase");

        String[] palabras = frase.split(" ");

        // Ordena las palabras alfabéticamente
        Arrays.sort(palabras);

        //Cadena con las palabras ordenadas
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }

        JOptionPane.showMessageDialog(null,
                "Palabras ordenadas alfabeticamente:\n" + resultado);
    }

    //Ejercicio28(Suma elementos)
    public static void ejercicio28() {
        int tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del arreglo"));
        int[] arreglo = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1)));
        }

        int suma = 0;
        for (int i = 0; i < tamanoArreglo; i++) {
            suma += arreglo[i];
        }

        JOptionPane.showMessageDialog(null,
                "La suma de los elementos del arreglo es: " + suma);
    }

    //Ejercicio29(Numero mas grande)
    public static void ejercicio29() {
        int tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del arreglo"));
        int[] arreglo = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del elemento " + (i + 1) + ":"));
        }

        int maximo = arreglo[0];
        for (int i = 1; i < tamanoArreglo; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El numero mas grande es: " + maximo);
    }

    //Ejercicio30(Eliminar Duplicados)
    public static void ejercicio30() {
        int tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamano del arreglo"));
        int[] arreglo = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el elemento " + (i + 1)));
        }

        // Eliminar elementos duplicados
        int nuevoTamano = tamanoArreglo;
        for (int i = 0; i < nuevoTamano; i++) {
            for (int j = i + 1; j < nuevoTamano; j++) {
                if (arreglo[i] == arreglo[j]) {
                    for (int k = j; k < nuevoTamano - 1; k++) {
                        arreglo[k] = arreglo[k + 1];
                    }
                    nuevoTamano--;
                    j--;
                }
            }
        }

        String resultado = "Arreglo sin elementos duplicados:\n";
        for (int i = 0; i < nuevoTamano; i++) {
            resultado += arreglo[i] + " ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    //Ejercicio31(Ordenar Elementos)
    public static void ejercicio31() {
        int tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del arreglo:"));
        int[] arreglo = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1)));
        }

        //Arreglo Original
        mostrarArreglo(arreglo, "Arreglo original:");

        // Ordenar el arreglo utilizando el algoritmo de burbuja
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar los elementos si están en orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        // Arreglo Ordenado
        mostrarArreglo(arreglo, "Arreglo ordenado:");
    }

    public static void mostrarArreglo(int[] arreglo, String mensaje) {
        StringBuilder sb = new StringBuilder();
        sb.append(mensaje).append("\n");
        for (int elemento : arreglo) {
            sb.append(elemento).append(" ");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    //Ejercicio32(Buscar Elemento)
    public static void ejercicio32() {
        int[] arreglo = {10, 25, 8, 15, 30};

        int numeroABuscar = 15;

        // Variable para almacenar el índice del número encontrado (-1 si no se encuentra)
        int indice = -1;

        // Búsqueda del número
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroABuscar) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            JOptionPane.showMessageDialog(null,
                    "El número " + numeroABuscar + " se encuentra en el indice " + indice + " del arreglo.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "El número " + numeroABuscar + " no se encuentra en el arreglo.");
        }
    }

    //Ejercicio33(Frecuencia de elementos)
    public static void ejercicio33() {
        int tamanoArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano del arreglo:"));
        int[] arreglo = new int[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1)));
        }

        int[] frecuencia = new int[tamanoArreglo];
        boolean[] visitado = new boolean[tamanoArreglo];

        for (int i = 0; i < tamanoArreglo; i++) {
            if (visitado[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < tamanoArreglo; j++) {
                if (arreglo[i] == arreglo[j]) {
                    visitado[j] = true;
                    count++;
                }
            }

            frecuencia[i] = count;
        }

        StringBuilder mensaje = new StringBuilder("Frecuencia de cada elemento:\n");
        for (int i = 0; i < tamanoArreglo; i++) {
            mensaje.append(arreglo[i]).append(" -> ").append(frecuencia[i]).append(" veces\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    //Ejercicio34(Rotacion de elementos)
    public static void ejercicio34() {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int cantidadPosiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones que desea rotar"));
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion de rotacion (izquierda o derecha) ");

        if (direccion.equalsIgnoreCase("izquierda")) {
            rotarIzquierda(arreglo, cantidadPosiciones);
        } else if (direccion.equalsIgnoreCase("derecha")) {
            rotarDerecha(arreglo, cantidadPosiciones);
        } else {
            JOptionPane.showMessageDialog(null, "Direccion no valida. Solo 'izquierda' o 'derecha'.");
            return;
        }

        String resultado = "Arreglo rotado: ";
        for (int elemento : arreglo) {
            resultado += elemento + " ";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void rotarIzquierda(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        posiciones %= n;
        for (int i = 0; i < posiciones; i++) {
            int temp = arreglo[0];
            for (int j = 0; j < n - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[n - 1] = temp;
        }
    }

    public static void rotarDerecha(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        posiciones %= n;
        for (int i = 0; i < posiciones; i++) {
            int temp = arreglo[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arreglo[j] = arreglo[j - 1];
            }
            arreglo[0] = temp;
        }
    }

    //Ejercicio35(Tablas de multiplicar)
    public static void ejercicio35() {
        int[][] tablas = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append("Tabla de multiplicar del ").append(i + 1).append(":\n");
            for (int j = 0; j < 10; j++) {
                mensaje.append((i + 1)).append(" x ").append((j + 1)).append(" = ").append(tablas[i][j]).append("\n");
            }
            mensaje.append("\n");
        }
        //Se muestra las tablas por consola, para una mejor lectura.
        System.out.println(mensaje);
    }
}


