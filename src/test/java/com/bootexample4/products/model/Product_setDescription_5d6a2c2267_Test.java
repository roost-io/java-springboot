package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setDescription_5d6a2c2267_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetDescription_Success() {
        String description = "This is a test product description.";
        product.setDescription(description);
        assertEquals(description, product.getDescription());
    }

    @Test
    public void testSetDescription_Null() {
        String description = null;
        product.setDescription(description);
        assertEquals(description, product.getDescription());
    }

    @Test
    public void testSetDescription_Empty() {
        String description = "";
        product.setDescription(description);
        assertEquals(description, product.getDescription());
    }
}
