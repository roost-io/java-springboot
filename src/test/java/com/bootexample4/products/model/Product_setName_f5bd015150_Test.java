package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setName_f5bd015150_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetName_Success() {
        String expectedName = "Test Product";
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_Null() {
        String expectedName = null;
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_EmptyString() {
        String expectedName = "";
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }
}
