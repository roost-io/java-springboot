package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getId_ba349b1eff_Test {

    @Test
    public void whenGetId_thenReturnId() {
        Product product = new Product();
        product.setId(1L);

        Long expectedId = 1L;
        Long actualId = product.getId();

        assertEquals(expectedId, actualId);
    }

    @Test
    public void whenGetId_thenReturnNull() {
        Product product = new Product();

        Long expectedId = null;
        Long actualId = product.getId();

        assertEquals(expectedId, actualId);
    }
}
