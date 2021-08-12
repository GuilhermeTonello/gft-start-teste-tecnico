package gft.start.guilhermetonello.exercicios.dois;

public class FuncionarioApplication {
	
	public static void main(String[] args) throws NaoPossuiCargoException {
		System.out.println("Estagiário: ");
		Funcionario gabriel = new Funcionario("Gabriel Oliveira", Cargo.ESTAGIARIO);
		System.out.println(gabriel.toString());
		System.out.println(gabriel.getTipoTrabalho().getDescricao());
		
		System.out.println("\nJúnior: ");
		Funcionario leo = new Funcionario("Leonardo Pereira", Cargo.JUNIOR);
		System.out.println(leo.toString());
		System.out.println(leo.getTipoTrabalho().getDescricao());
		
		System.out.println("\nSênior: ");
		Funcionario olivia = new Funcionario("Olívia Silva", Cargo.SENIOR);
		System.out.println(olivia);
		System.out.println(olivia.getTipoTrabalho().getDescricao());
	}

}
