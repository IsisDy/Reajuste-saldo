package reajuste_saldo;
import java.util.Scanner;
//Informar um saldo e imprimir o saldo com desconto de 1%.

public class reajuste_saldo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		double saldo = 0;
		double desconto = 1.0 / 100; //desconto direto
		double total;
		
		System.out.println("Informe seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Informe seu saldo atual: ");
		saldo = input.nextInt();
		
		total = saldo - (desconto * saldo);
		
		System.out.println( nome + " seu saldo com desconto e de: " + total);
		
	}

}
