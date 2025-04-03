package io.github.tddsuitetraining.stack;

public class PopOnEmptyStackException extends RuntimeException {

    public PopOnEmptyStackException() {
        super("Impossible to pop a value of an empty stack.");
    }
}
