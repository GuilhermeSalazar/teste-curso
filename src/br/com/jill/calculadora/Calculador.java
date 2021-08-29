package br.com.jill.calculadora;

import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float a,b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
    System.out.println("Digite segundo valor: ");
    b = scan.nextFloat();

        float somar = somar(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);
    System.out.println("Somar = "+ somar);
    System.out.println("Subtrair = "+ subtrair);
    System.out.println("Multiplicar = "+ multiplicar);
    System.out.println("Dividir = "+ dividir);
    }

    public static float somar(float a, float b) {
        return a + b;
    }

        public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }


}
