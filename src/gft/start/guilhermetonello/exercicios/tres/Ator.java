package gft.start.guilhermetonello.exercicios.tres;

public class Ator extends Modelo {
	
	private int nivelAtor;
	
	public int getNivelAtor() {
		return nivelAtor;
	}
	
	public void setNivelAtor(int nivelAtor) {
		this.nivelAtor = nivelAtor;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + ((double) this.getAltura()/100) + " metro(s)");
		System.out.println("Idade: " + this.getIdade() + " anos");
		System.out.println("Peso: " + this.getPeso() + " kg");
		System.out.println("Nível de ator: " + nivelAtor);
		System.out.println("Trabalho: " + Trabalho.ATOR.getTrabalho());
	}

}
