package controle;

import dominio.VendaProduto;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ControleVenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");  // Instância de DecimalFormat para formatar os valores
        VendaProduto[] vendas = new VendaProduto[5];

        for(int i = 0; i < vendas.length; i++) {
        	// Entrada dos dados da venda
	        System.out.print("Digite o número da venda: ");
	        int numero = sc.nextInt();
	
	        System.out.print("Digite a quantidade de produtos: ");
	        int quantidade = sc.nextInt();
	
	        System.out.print("Digite o valor unitário do produto: \n\n");
	        double valorUnitario = sc.nextDouble();
	
	        // Criando o objeto VendaProduto com os dados inseridos
	        VendaProduto venda = new VendaProduto(numero, quantidade, valorUnitario);
	        vendas[i] = venda;
        }

        System.out.println("Deseja ver as vendas cadastradas? ");
        char resposta = sc.next().charAt(0);
        
        if (resposta == 's') {
	        for (int i = 0; i < vendas.length; i++) {
		        // Exibindo os dados da venda com formatação via DecimalFormat
		        System.out.println("\nDados da venda:");
		        System.out.println("Número da venda: " + vendas[i].getNumero());
		        System.out.println("Quantidade de produtos: " + vendas[i].getQuantidade());
		        System.out.println("Valor unitário: R$ " + df.format(vendas[i].getValorUnitario()));
		        System.out.println("Valor total a pagar: R$ " + df.format(vendas[i].valorPagar()));
	        }
        }

        sc.close();  // Fechar o Scanner após o uso
    }
}

