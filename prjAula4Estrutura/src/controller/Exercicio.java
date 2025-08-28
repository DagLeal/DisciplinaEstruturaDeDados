package controller;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ex = 0;
		
		System.out.print("Digite o número do exercício:");
		ex = sc.nextInt();
			
		
		if (ex == 1) {
			int[] numeros = new int[20];
			int pares = 0, impares = 0;
			
			for (int i = 0; i < 20; i++) {
				System.out.print("Digite um número: ");
				numeros[i] = sc.nextInt();
			}
			
			for (int i = 0; i < 20; i++) {
				if (numeros[i] % 2 == 0) {
					pares++;
				}
				else {
					impares++;
				}
			}
			
			System.out.print(pares + " números pares e " + impares + " números impares.");
		}
		
		
		if (ex == 2) {
			//Leia um array de 10 números e depois pergunte ao usuário um número. 
			//Informe se o número existe no array e em qual posição.
			int[] numeros = new int[10];
			int procura = 0;
			boolean posicao = false;
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um número: ");
				numeros[i] = sc.nextInt();
			}
			
			System.out.print("Digite um número para buscar: ");
			procura = sc.nextInt();
			
			for (int i = 0; i < 10; i++) {
				if (numeros[i] == procura) {
					System.out.print("O número " + procura + " foi encontrado na posição " + i + ".");
					posicao = true;
				}
			}
			if (posicao == false) {
				System.out.print("O número " + procura + " não foi encontrado.");
			}
			
		}
		
		
		if (ex == 3) {
			//Leia um array de 10 nomes e permita que o usuário digite um nome para “remover”. 
			//Ao remover, substitua o valor por "---".
			String[] nomes = new String[10];
			String procura;
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um nome: \n");
				nomes[i] = sc.next();
			}
			
			System.out.print("Digite um nome para remover: \n");
			procura = sc.next();
			
			for (int i = 0; i < 10; i++) {
				if (nomes[i] == procura) {
					System.out.print("O nome " + procura + " foi removido com sucesso.\n");
					nomes[i] = "---";
				}
			}
			for (int i = 0; i < 10; i++) {
				if (nomes[i] == procura) {
					System.out.print("Lista de nomes: \n" + nomes[i] + "\n");
				}
			}
			
			
		}
		
		
		if (ex == 4) {
			//Leia um array de 10 números e depois pergunte ao usuário um número. 
			//Informe se o número existe no array e em qual posição.
			int[] numeros = new int[10];
			
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite um número inteiro: ");
				numeros[i] = sc.nextInt();
			}
			
			 for (int i = 0; i < numeros.length; i++) {
		            int count = 1;
		            if (numeros[i] != -1) {
		                for (int j = i + 1; j < numeros.length; j++) {
		                    if (numeros[i] == numeros[j]) {
		                        count++;
		                        numeros[j] = -1;
		                    }
		                }
		                System.out.println("Número " + numeros[i] + " aparece " + count + " vez(es).");
		            }
		        }
		}
		
		
		if (ex == 5) {
			// Array de inteiros a ser ordenado
	        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
	        
	        // Chama o método de ordenação
	        bubbleSort(numeros);
	        
	        // Exibe o array ordenado
	        System.out.println("Array ordenado:");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	    }
	}
	
	 public static void bubbleSort(int[] array) {
	        int n = array.length;
	        boolean trocou;

	        // Percorre o array
	        for (int i = 0; i < n - 1; i++) {
	            trocou = false; // Flag para verificar se houve troca durante a iteração

	            // Percorre o array até a parte não ordenada
	            for (int j = 0; j < n - i - 1; j++) {
	                // Compara os elementos adjacentes
	                if (array[j] > array[j + 1]) {
	                    // Troca se estiverem na ordem errada
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;

	                    trocou = true;
	                }
	            }

	            // Se não houve troca, o array já está ordenado
	            if (!trocou) {
	                break;
	            }
	        }
		}

}
