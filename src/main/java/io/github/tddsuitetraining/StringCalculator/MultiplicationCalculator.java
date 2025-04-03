package io.github.tddsuitetraining.StringCalculator;

import org.springframework.expression.Operation;

public class MultiplicationCalculator extends StringCalculator {
  public String calculate(String operation) throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException, NotCompliantOperationException {
    return calculateWith(Operation.MULTIPLY ,operation);
  }
}
