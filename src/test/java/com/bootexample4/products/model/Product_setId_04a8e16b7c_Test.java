package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setId_04a8e16b7c_Test {

    @Test
    public void testSetId_ValidId() {
        Product product = new Product();
        product.setId(1L);
        assertEquals(1L, product.getId());
    }

    @Test
    public void testSetId_NullId() {
        Product product = new Product();
        product.setId(null);
        assertEquals(null, product.getId());
    }

    @Test
    public void testSetId_NegativeId() {
        Product product = new Product();
        product.setId(-1L);
        assertEquals(-1L, product.getId());
    }

}
