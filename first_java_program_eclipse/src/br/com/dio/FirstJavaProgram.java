package br.com.dio;

import br.com.dio.model.Cat;

public class FirstJavaProgram {
	public static void main(String[] args) {
		Cat cat = new Cat("Bolinha","Branco",12);
		Book book = new Book();
		
		System.out.println(cat.getName());
		/*int myAge = 21;
		int gfAge = 19;
		System.out.println("Hello World!! This is my first code in Java Language!\nand this is the sum of my age and my GF age: " + (myAge + gfAge));*/
	}
}

class Book {
	private String name;
	private String nPages;
}