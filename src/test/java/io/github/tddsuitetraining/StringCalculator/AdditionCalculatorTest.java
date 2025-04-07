package io.github.tddsuitetraining.StringCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionCalculatorTest {


  @Test
  void should_return_0_by_default() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_1_if_operation_is_1() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_2_if_operation_is_1_comma_1() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_3_comma_3_if_operation_is_1_dot_1_and_2_dot_2() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_6_if_operation_is_1_comma_2_comma_3() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_16_if_operation_is_1_comma_2_comma_3_comma_10() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_6_if_operation_is_1_newline_2_comma_3() throws UnexpectedNewlineException, NotANumberException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_throw_unexpected_newline_at_position_six(){

  }

  @Test
  void should_throw_unexpected_newline_at_position_3(){

  }

  @Test
  void should_throw_not_a_number_exception_if_finish_by_1_comma(){

  }

  @Test
  void should_throw_not_a_number_exception_if_finish_by_123_comma(){

  }

  @Test
  void should_throw_not_a_number_exception_if_finish_by_12_comma_1_newline(){

  }

  @Test
  void should_return_3_with_semicolon_as_delimiter() throws NotANumberException, UnexpectedNewlineException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_6_with_pipe_as_delimiter() throws NotANumberException, UnexpectedNewlineException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_return_5_with_text_as_delimiter() throws NotANumberException, UnexpectedNewlineException, UnexpectedCommaException, NegativeNotAllowedException , NotCompliantOperationException {
  }

  @Test
  void should_throw_unexpected_comma_exception_pipe_delimiter_is_choose(){

  }

  @Test
  void should_throw_unexpected_comma_exception_if_toto_delimiter_is_choose(){
  }

  @Test
  void should_throw_negative_not_allowed_exception_if_operation_contains_minus_one(){

  }

  @Test
  void should_throw_negative_not_allowed_exception_if_operation_contains_minus_four_minus_five(){

  }


  @Test
  void should_throw_a_common_error_exception_if_operation_contains_several_errors(){

  }

  @Test
  void should_throw_a_common_error_exception_if_operation_contains_several_negatives(){

  }

  @Test
  void should_throw_a_common_error_exception_if_operation_contains_unexpected_newline(){

  }

  @Test
  void should_throw_a_common_error_exception_if_operation_contains_all_errors(){

  }

}
