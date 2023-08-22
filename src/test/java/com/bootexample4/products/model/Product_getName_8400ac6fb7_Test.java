// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_8400ac6fb7_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = Mockito.mock(Product.class);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "TestProduct";
        Mockito.when(product.getName()).thenReturn(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Product name should be 'TestProduct'");
    }

    @Test
    public void testGetName_Empty() {
        String expectedName = "";
        Mockito.when(product.getName()).thenReturn(expectedName);
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Product name should be empty");
    }
}