package gft.start.guilhermetonello.exercicios.tres;

import java.util.ArrayList;
import java.util.List;

public class ModeloAtorApplication {
	
	public static void main(String[] args) {
		System.out.println("Modelo:");
		Modelo gisele = new Modelo();
		gisele.setNome("Gisele Bündchen");
		gisele.setIdade(41);
		gisele.setAltura(180);
		gisele.setPeso(55);
		gisele.mostrarDados();
		
		System.out.println("\nAtor: ");
		Ator leonardo = new Ator();
		leonardo.setNome("Leonardo DiCaprio");
		leonardo.setAltura(183);
		leonardo.setIdade(46);
		leonardo.setPeso(78);
		leonardo.setNivelAtor(3);
		leonardo.mostrarDados();
		
		List<Modelo> modelos = new ArrayList<Modelo>();
		modelos.add(gisele);
		modelos.add(leonardo);
		
		System.out.println("\nListando todos:");
		mostrarDados(modelos);
	}
	
	private static void mostrarDados(List<Modelo> modelos) {
		modelos.forEach(modelo -> {
			System.out.println("Nome: " + modelo.getNome());
			if (modelo instanceof Ator) {
				System.out.println("Trabalho: " + Trabalho.ATOR.getTrabalho());
			} else {
				System.out.println("Trabalho: " + Trabalho.MODELO.getTrabalho());
			}
			System.out.println();
		});
	}
	
}
