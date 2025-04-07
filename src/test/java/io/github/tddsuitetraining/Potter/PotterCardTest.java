package io.github.tddsuitetraining.Potter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PotterCardTest {

    @Test
    void zero_if_card_is_empty() {

    }

    @ParameterizedTest
    @ValueSource(strings = {"À l’école des sorciers", "La Chambre des secrets"})
    void a_book_alone_price_is_8(String book) {
    }

    @Test
    void three_same_books_price_is_24() {

    }

    @Test
    void two_different_books_discount_of_5_percent() {

    }

    @Test
    void three_different_books_discount_of_10_percent() {
    }

    @Test
    void three_different_books_discount_of_20_percent() {

    }

    @Test
    void two_same_books_and_one_different__only_one_discount() {

    }

    @Test
    void two_same_books_and_two_different__two_little_discounts() {

    }

    @Test
    void three_same_books_and_two_different__only_two_discounts() {

    }
}