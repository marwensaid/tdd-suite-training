package io.github.tddsuitetraining.Diamond;

public class UnexpectedLetter extends Exception{
  public UnexpectedLetter() {
    super("La lettre fournie n'est pas valide.");
  }
}
