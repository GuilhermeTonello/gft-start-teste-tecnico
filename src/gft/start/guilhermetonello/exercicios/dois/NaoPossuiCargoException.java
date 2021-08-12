package gft.start.guilhermetonello.exercicios.dois;

public class NaoPossuiCargoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NaoPossuiCargoException() {
		super("Esse funcionário não possui cargo!");
	}

}
