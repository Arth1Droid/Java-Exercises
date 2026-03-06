package br.dev.arthdroid1.exercises.exceptions.exercicio1.models.exceptions;

public class WithdrawalLimitExceededException extends RuntimeException {
	 private static final long serialVersionUID = 1L;
	 public WithdrawalLimitExceededException(String msg) {
		super(msg);
	}
}
