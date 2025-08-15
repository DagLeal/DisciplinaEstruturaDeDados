package main;

import java.util.Scanner;

public class exemplo3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		
		System.out.println(fatorial(n));

	}
	
	public static int fatorial(int n) {
		if(n == 0) return 1; // base
		return n * fatorial(n - 1);
	}
}
