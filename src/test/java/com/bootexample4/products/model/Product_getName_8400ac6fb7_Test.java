package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Product_getName_8400ac6fb7_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = Mockito.mock(Product.class);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "Test Product";
        when(product.getName()).thenReturn(expectedName);

        String actualName = product.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }

    @Test
    public void testGetName_Empty() {
        String expectedName = "";
        when(product.getName()).thenReturn(expectedName);

        String actualName = product.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }

    @Test
    public void testGetName_Null() {
        String expectedName = null;
        when(product.getName()).thenReturn(expectedName);

        String actualName = product.getName();

        assertEquals(expectedName, actualName, "The expected name does not match the actual name");
    }
}
