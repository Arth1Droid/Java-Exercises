package br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions;

public class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String msg) {
		super(msg);
	}

}
