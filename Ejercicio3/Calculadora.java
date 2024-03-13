package Ejercicio3;

import java.util.Scanner;
import Ejercicio3.NumeroRacional;

class Calculadora {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Ejemplo de uso
        NumeroRacional numero1 = new NumeroRacional(1, 2);
        NumeroRacional numero2 = new NumeroRacional(3, 4);

        NumeroRacional resultado = new NumeroRacional(numero1);
        resultado.sumar(numero2);

        System.out.println("Resultado de la suma: " + resultado);

        mostrarMenu();
    }

    private static void mostrarMenu() {
        System.out.println("=== Menú ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        int opcion = obtenerOpcion();

        switch (opcion) {
            case 1: {
                // Lógica para sumar números racionales
                break;
            static NumeroRacional obtenerNumeroRacional() {
                System.out.print("Ingrese el numerador: ");
                int numerador = scanner.nextInt();

                System.out.print("Ingrese el denominador: ");
                int denominador = scanner.nextInt();

                return new NumeroRacional(numerador, denominador);
            
            }}
            case 3:
                // Lógica para multiplicar números racionales
                NumeroRacional numero5 = obtenerNumeroRacional();
                NumeroRacional numero6 = obtenerNumeroRacional();

                NumeroRacional resultadoMultiplicacion = new NumeroRacional(numero5);
                resultadoMultiplicacion.multiplicar(numero6);

                System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
                break;
            case 4:
                // Lógica para dividir números racionales
                NumeroRacional numero7 = obtenerNumeroRacional();
                NumeroRacional numero8 = obtenerNumeroRacional();

                NumeroRacional resultadoDivision = new NumeroRacional(numero7);
                resultadoDivision.dividir(numero8);

                System.out.println("Resultado de la división: " + resultadoDivision);
                break;
            case 5:
                System.out.println("Saliendo...");
                return;
            default:
                System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                break;
        }

        mostrarMenu();
    }

    private static int obtenerOpcion() {
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Calculadora []";
    }
}
    
