package io.github.tddsuitetraining.FizzBuzz;

public class NonCompliantNumberException extends RuntimeException {
  public NonCompliantNumberException() {
    super("The number provided is not greater than 1");
  }
}
