package io.github.tddsuitetraining.stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StackTest {

    private final Stack stack = new Stack();

    @Test
    void should_create_an_empty_list() {
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 34, 37284849})
    void should_not_be_empty_when_push_a_value(int valueToAdd) {
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 34, 37284849})
    void should_return_pushed_value_when_pop(int valueToAdd) {
    }

    @Test
    void should_pop_the_last_value_added_first() {

    }

    @Test
    void should_throw_an_exception_when_pop_a_value_of_an_empty_stack() {

    }
}
