package gft.start.guilhermetonello.exercicios.dois;

public enum Cargo {
	
	ESTAGIARIO("Estagiário"),
	JUNIOR("Júnior"),
	SENIOR("Sênior");
	
	private String descricao;
	
	Cargo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
