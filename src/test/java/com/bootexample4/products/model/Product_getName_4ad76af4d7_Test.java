package com.bootexample4.products.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_4ad76af4d7_Test {

    @Test
    public void testGetNameSuccess() {
        Product product = new Product();
        product.setName("Test Product");
        assertEquals("Test Product", product.getName(), "Product name should be 'Test Product'");
    }

    @Test
    public void testGetNameNull() {
        Product product = new Product();
        product.setName(null);
        assertEquals(null, product.getName(), "Product name should be null");
    }
}
