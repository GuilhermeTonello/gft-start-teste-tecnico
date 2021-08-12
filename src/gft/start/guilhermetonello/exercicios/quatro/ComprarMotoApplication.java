package gft.start.guilhermetonello.exercicios.quatro;

import java.util.Scanner;

public class ComprarMotoApplication {
	
	public static void main(String[] args) {
		System.out.print("Digite o preço da moto: ");
		
		Scanner scanner = new Scanner(System.in);
		
		double preco = 0;
		boolean rodando = true;
		while (rodando) {
			String precoString = scanner.nextLine();
			precoString = precoString.replace(",", ".");
			try {
				preco = Double.parseDouble(precoString);
				rodando = false;
			} catch (Exception e) {
				System.out.println("Digite o preço da moto corretamente!");
			}
		}
		
		System.out.println("Preço final | Quantidade de parcelas | Valor da parcela");
		
		double precoFinal = preco * 0.7;
		System.out.println(precoFinal + "     |     Pago à vista");
		
		int parcelas = 5;
		precoFinal = preco * 1.04;
		double valorParcela = precoFinal/parcelas;
		System.out.println(precoFinal + "     |     " + parcelas + "     |     " + valorParcela);
		
		parcelas = 11;
		precoFinal = preco * 1.07;
		valorParcela = precoFinal/parcelas;
		System.out.println(precoFinal + "     |     " + parcelas + "     |     " + valorParcela);
		
		parcelas = 17;
		precoFinal = preco * 1.1;
		valorParcela = precoFinal/parcelas;
		System.out.println(precoFinal + "     |     " + parcelas + "     |     " + valorParcela);
		
		parcelas = 23;
		precoFinal = preco * 1.13;
		valorParcela = precoFinal/parcelas;
		System.out.println(precoFinal + "     |     " + parcelas + "     |     " + valorParcela);
		
		parcelas = 29;
		precoFinal = preco * 1.16;
		valorParcela = precoFinal/parcelas;
		System.out.println(precoFinal + "     |     " + parcelas + "     |     " + valorParcela);
		
	}

}
