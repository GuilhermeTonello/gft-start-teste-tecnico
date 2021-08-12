package gft.start.guilhermetonello.exercicios.tres;

public class Modelo {
	
	private String nome;
	
	private int altura;
	
	private double peso;
	
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Altura: " + ((double) altura/100) + " metro(s)");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Peso: " + peso + " kg");
		System.out.println("Trabalho: " + Trabalho.MODELO.getTrabalho());
	}

}
