package org.example;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("***Selecciona una opcion***\n"
                    + "1. Ejercicios del 1-6 \n"
                    + "2. Ejercicios del 7-12 \n"
                    + "3. Ejercicios del 13-18 \n"
                    + "4. Ejercicios del 19-24 \n"
                    + "5. Ejercicios del 25-30 \n"
                    + "6. Ejercicios del 31-35 \n"
                    + "7. Salir");
            switch (opcion) {
                //EJERCICIOS DEL 1-6
                case "1":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "1. Operaciones \n"
                                + "2. Par o Impar \n"
                                + "3. Area-Perimetro circulo \n"
                                + "4. Mayor-Menor edad \n"
                                + "5. Cual numero es mayor \n"
                                + "6. Numero posotivo-negativo-cero \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "1":
                                Metodos.ejercicio1();
                                break;
                            case "2":
                                Metodos.ejercicio2();
                                break;
                            case "3":
                                Metodos.ejercicio3();
                                break;
                            case "4":
                                Metodos.ejercicio4();
                                break;
                            case "5":
                                Metodos.ejercicio5();
                                break;
                            case "6":
                                Metodos.ejercicio6();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                //EJERCICIOS DEL 7-12
                case "2":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "7. Tabla de multiplicar \n"
                                + "8. Adivinar Numero #8 \n"
                                + "9. Factorial de un numero \n"
                                + "10. Fibonacci-20 \n"
                                + "11. Area triangulo-FHeron \n"
                                + "12. Numero Primo \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "7":
                                Metodos.ejercicio7();
                                break;
                            case "8":
                                Metodos.ejercicio8();
                                break;
                            case "9":
                                Metodos.ejercicio9();
                                break;
                            case "10":
                                Metodos.ejercicio10();
                                break;
                            case "11":
                                Metodos.ejercicio11();
                                break;
                            case "12":
                                Metodos.ejercicio12();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                //EJERCICIOS DEL 13-18
                case "3":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "13. Redondeo decimales \n"
                                + "14. Numero Perfecto \n"
                                + "15. Numero Capicua \n"
                                + "16. Fibonacci Especifico \n"
                                + "17. Rango de Primos \n"
                                + "18. Contraseña generada \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "13":
                                Metodos.ejercicio13();
                                break;
                            case "14":
                                Metodos.ejercicio14();
                                break;
                            case "15":
                                Metodos.ejercicio15();
                                break;
                            case "16":
                                Metodos.ejercicio16();
                                break;
                            case "17":
                                Metodos.ejercicio17();
                                break;
                            case "18":
                                Metodos.ejercicio18();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                //EJERCICIOS DEL 19-24
                case "4":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "19. Nombre en mayus y minus \n"
                                + "20. Cadena Invertida \n"
                                + "21. Numero de veces letra \n"
                                + "22. Frase palindromo \n"
                                + "23. Cantidad de palabras \n"
                                + "24. Reemplazo de letra \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "19":
                                Metodos.ejercicio19();
                                break;
                            case "20":
                                Metodos.ejercicio20();
                                break;
                            case "21":
                                Metodos.ejercicio21();
                                break;
                            case "22":
                                Metodos.ejercicio22();
                                break;
                            case "23":
                                Metodos.ejercicio23();
                                break;
                            case "24":
                                Metodos.ejercicio24();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                //EJERCICIOS DEL 25-30
                case "5":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "25. Separar palabras \n"
                                + "26. Caracter sin espacio \n"
                                + "27. ordenar alfabeticamente \n"
                                + "28. Suma elementos \n"
                                + "29. Numero mas grande \n"
                                + "30. Eliminar Duplicados \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "25":
                                Metodos.ejercicio25();
                                break;
                            case "26":
                                Metodos.ejercicio26();
                                break;
                            case "27":
                                Metodos.ejercicio27();
                                break;
                            case "28":
                                Metodos.ejercicio28();
                                break;
                            case "29":
                                Metodos.ejercicio29();
                                break;
                            case "30":
                                Metodos.ejercicio30();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                //EJERCICIOS DEL 31-35
                case "6":
                    do {
                        opcion = JOptionPane.showInputDialog("***Selecciona un ejercicio***\n"
                                + "31. Ordenar Elementos \n"
                                + "32. Buscar Elemento \n"
                                + "33. Frecuencia de elementos \n"
                                + "34. Rotacion de elementos \n"
                                + "35. Tablas de multiplicar \n"
                                + "0. atras \n");

                        switch (opcion) {
                            case "31":
                                Metodos.ejercicio31();
                                break;
                            case "32":
                                Metodos.ejercicio32();
                                break;
                            case "33":
                                Metodos.ejercicio33();
                                break;
                            case "34":
                                Metodos.ejercicio34();
                                break;
                            case "35":
                                Metodos.ejercicio35();
                                break;
                        }
                    } while (opcion == "0");
                    break;

                case "7":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                    ;
                    break;
            }

        } while (opcion != "0");

    }
}