package io.github.tddsuitetraining.StringCalculator;

public class UnexpectedNewlineException extends Exception {
  public UnexpectedNewlineException(int position) {
    super("Number expected but '\n' found at position " + position + ".");
  }
}
