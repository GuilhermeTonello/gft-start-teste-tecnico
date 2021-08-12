package gft.start.guilhermetonello.exercicios.dois;

public enum TipoTrabalho {
	
	HOME_OFFICE("100% home office"),
	PRESENCIAL("Presencial"),
	HIBRIDO("Híbrido");
	
	private String descricao;
	
	TipoTrabalho(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
