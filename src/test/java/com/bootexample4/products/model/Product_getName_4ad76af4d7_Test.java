package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_4ad76af4d7_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "TestProduct";
        product.name = expectedName;
        String actualName = product.name;
        assertEquals(expectedName, actualName, "The name returned by getName() doesn't match the expected name");
    }

    @Test
    public void testGetName_Null() {
        String expectedName = null;
        product.name = expectedName;
        String actualName = product.name;
        assertEquals(expectedName, actualName, "The name returned by getName() should be null as it was not set");
    }
}
