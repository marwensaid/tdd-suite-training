package io.github.tddsuitetraining.Potter;

import java.util.ArrayList;
import java.util.List;

public class PotterCard {

    private static final int BOOK_PRICE = 8;
    private static final Double DISCOUNT_PER_BOOKS = 0.05;

    private final List<List<Book>> batches = new ArrayList<>() {{
        add(new ArrayList<>() {
        });
    }};

    public void addBook(String title) {

    }

    private double getAmountOfABatch(List<Book> books) {
        int size = books.size();
        return size * BOOK_PRICE * (1 - (size - 1) * DISCOUNT_PER_BOOKS);
    }
}
