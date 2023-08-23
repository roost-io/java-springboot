package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setDescription_b4ccff923c_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetDescription_Success() {
        String expectedDescription = "This is a test product";
        product.setDescription(expectedDescription);
        assertEquals(expectedDescription, product.getDescription());
    }

    @Test
    public void testSetDescription_Null() {
        String expectedDescription = null;
        product.setDescription(expectedDescription);
        assertEquals(expectedDescription, product.getDescription());
    }
}
