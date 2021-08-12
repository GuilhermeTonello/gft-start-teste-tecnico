package gft.start.guilhermetonello.exercicios.dois;

public class Funcionario {
	
	private String nome;
	
	private Cargo cargo;
	
	private double salario;
	
	public Funcionario(String nome, Cargo cargo) {
		this.nome = nome;
		this.cargo = cargo;
		setSalario(cargo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(Cargo cargo) {
		switch (cargo) {
			case ESTAGIARIO:
				this.salario = 800.0;
				break;
			case JUNIOR:
				this.salario = 1200.0;
				break;
			case SENIOR:
				this.salario = 2500.0;
				break;
		}
	}
	
	@Override
	public String toString() {
		return "Funcionário: (Nome: " + nome + "; Cargo: " + cargo.getDescricao() + "; Salário: " + salario + ")";
	}
	
	public TipoTrabalho getTipoTrabalho() throws NaoPossuiCargoException {
		if (this.cargo == null) {
			throw new NaoPossuiCargoException();
		}
		switch (cargo) {
			case ESTAGIARIO:
				return TipoTrabalho.HOME_OFFICE;
			case JUNIOR:
				return TipoTrabalho.PRESENCIAL;
			case SENIOR:
				return TipoTrabalho.HIBRIDO;
		}
		return null;
	}
	
	public void imprimirDados() {
		System.out.println(this.toString());
	}

}
