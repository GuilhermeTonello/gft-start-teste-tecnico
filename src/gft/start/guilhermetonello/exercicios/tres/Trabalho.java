package gft.start.guilhermetonello.exercicios.tres;

public enum Trabalho {
	
	ATOR("Novelas"),
	MODELO("Malhação");
	
	private String trabalho;
	
	Trabalho(String trabalho) {
		this.trabalho = trabalho;
	}
	
	public String getTrabalho() {
		return trabalho;
	}

}
