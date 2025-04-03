package io.github.tddsuitetraining.StringCalculator;

public class NegativeNotAllowedException extends Exception {
  public NegativeNotAllowedException(String negatives) {
    super("Negative not allowed : " + negatives);
  }
}
