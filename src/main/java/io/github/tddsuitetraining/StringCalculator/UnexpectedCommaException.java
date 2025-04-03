package io.github.tddsuitetraining.StringCalculator;

public class UnexpectedCommaException extends Exception {
  public UnexpectedCommaException(String delimiter, int position) {
    super("'" + delimiter + "' expected but ',' found at position " + position + ".");
  }
}
