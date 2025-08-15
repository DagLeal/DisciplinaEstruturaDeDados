package main;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra/frase: ");
		String n = scanner.nextLine();
		
		
		System.out.println(inverter(n));

	}
	
	public static String inverter(String s) {
		if(s.length() <= 1) return s; 
		return s.charAt(s.length()-1) + inverter(s.substring(0, s.length()-1));
	}
}
