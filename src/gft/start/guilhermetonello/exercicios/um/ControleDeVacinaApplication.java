package gft.start.guilhermetonello.exercicios.um;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleDeVacinaApplication {
	
	public static void main(String[] args) {
		System.out.println("Controle de vacina:");
		
		String vacinaTipo = null;
		int vacina = 0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Informe a vacina que você tomou (digite o número e pression ENTER):");
			System.out.println("1 - Aperte 1 para Coronavac");
			System.out.println("2 - Aperte 2 para Janssen");
			
			try {
				vacina = Integer.parseInt(scanner.nextLine());
				
				switch (vacina) {
					case 1:
						vacinaTipo = "Coronavac";
						break;
					case 2:
						vacinaTipo = "Janssen";
						break;
					default:
						System.out.println("Tipo de vacina inválida!");
				}
			} catch (Exception e) {
				System.out.println("Utilize apenas 1 ou 2!");
			}
		} while (vacina != 1 && vacina != 2);
		
		LocalDate data = null;
		boolean rodando = true;
		while (rodando) {
			System.out.println("Agora digite a data em que tomou/tomará a vacina no formato dia/mês/ano (Ex. 09/07/2021)");
			
			try {
				String dataString = scanner.nextLine();
				
				data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				rodando = false;
			} catch (Exception e) {
				System.out.println("Tipo de data inválida!");
			}
		}
		
		System.out.println("Vacina tomada: " + vacinaTipo);
		
		String texto = null;
		if (vacina == 1) {
			data = data.plusDays(14L);
			texto = "Data da segunda dose (dia/mês/ano): " + data.getDayOfMonth()
				+ "/" + data.getMonthValue() + "/" + data.getYear();
		} else {
			texto = "Dose única!";
		}
		
		System.out.println("Data da segunda dose: " + texto);
		
	}

}
