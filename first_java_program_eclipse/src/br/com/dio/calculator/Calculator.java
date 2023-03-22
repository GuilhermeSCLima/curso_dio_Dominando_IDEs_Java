package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("Digite o primeiro valor:");
		a = scan.nextFloat();
		System.out.println("Digite o segundo valor:");
		b = scan.nextFloat();
		
		float sum = sum(a,b);
		float sub = sub(a,b);
		float div = div(a,b);
		float mult = mult(a,b);
		
		System.out.println("O valor da soma é: " + sum);
		System.out.println("O valor da subtração é: " + sub);
		System.out.println("O valor da divisão é: " + div);
		System.out.println("O valor da multiplicação é: " + mult);
	}

	public static float sum(float a, float b) {
		return a+b;
	}
	
	public static float sub(float a, float b) {
		return a-b;
	}
	
	public static float div(float a, float b) {
		return a/b;
	}
	
	public static float mult(float a, float b) {
		return a*b;
	}
}
