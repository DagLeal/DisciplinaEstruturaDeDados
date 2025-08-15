package main;

import java.util.Scanner;

public class exemplo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		
		System.out.println(somaAteN(n));

	}
	
	public static int somaAteN(int n) {
		if(n<=0) return 0; // base
		return n + somaAteN(n - 1);
	}
}
