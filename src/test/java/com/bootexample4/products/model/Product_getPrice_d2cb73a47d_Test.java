package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getPrice_d2cb73a47d_Test {

    @Test
    public void shouldReturnPrice() {
        Product product = new Product();
        product.setPrice(10.0);

        assertEquals(10.0, product.getPrice());
    }

    @Test
    public void shouldReturnZeroForNullPrice() {
        Product product = new Product();

        assertEquals(0.0, product.getPrice());
    }
}
