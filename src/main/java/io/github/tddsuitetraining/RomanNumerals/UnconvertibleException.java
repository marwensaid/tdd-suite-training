package io.github.tddsuitetraining.RomanNumerals;

public class UnconvertibleException extends Exception {
  public UnconvertibleException() {
    super("Il est impossible de convertir 0 ou un nombre négatif.");
  }
}
