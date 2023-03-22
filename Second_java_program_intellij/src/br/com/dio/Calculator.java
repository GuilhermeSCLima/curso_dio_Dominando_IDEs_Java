package br.com.dio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o primeiro valor: ");
        b = scan.nextFloat();

        float sum = sum(a, b);
        float sub = sub(a, b);
        float div = div(a, b);
        float mult = mult(a, b);
        double pow = pow(a, b);

        System.out.println("O Resultado da soma de " + a + " + " + b + "é: " + sum);
        System.out.println("O Resultado da subtração de " + a + " - " + b + "é: " + sub);
        System.out.println("O Resultado da divisão de " + a + " / " + b + "é: " + div);
        System.out.println("O Resultado da multiplicação de " + a + " * " + b + "é: " + mult);
        System.out.println("O Resultado da potenciação de " + a + " ^ " + b + "é: " + pow);
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static float sub(float a, float b) {
        return a - b;
    }
    public static float div(float a, float b) {
        return a / b;
    }
    public static float mult(float a, float b) {
        return a*b;
    }
    public static double pow(float a, float b) {
        return Math.pow(a,b);
    }
}
