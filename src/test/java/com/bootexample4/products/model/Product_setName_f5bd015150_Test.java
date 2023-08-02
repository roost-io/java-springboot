package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Product_setName_f5bd015150_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetName_withValidName() {
        String expectedName = "Test Product";
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetName_withNull() {
        String expectedName = null;
        product.setName(expectedName);
        assertNull(product.getName());
    }

    // TODO: Add more test cases here for other scenarios
}
