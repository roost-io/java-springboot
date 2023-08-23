package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setName_5d23a892d9_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetName() {
        String expectedName = "Product1";
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetNameWithEmptyString() {
        String expectedName = "";
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }

    @Test
    public void testSetNameWithNull() {
        String expectedName = null;
        product.setName(expectedName);
        assertEquals(expectedName, product.getName());
    }
}
