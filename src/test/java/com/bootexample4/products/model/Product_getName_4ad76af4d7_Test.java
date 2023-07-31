package com.bootexample4.products.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Product_getName_4ad76af4d7_Test {

    @Mock
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "Test Product";
        Mockito.when(product.getName()).thenReturn(expectedName);
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName, "Product name should match the expected name");
    }

    @Test
    public void testGetName_Empty() {
        String expectedName = "";
        Mockito.when(product.getName()).thenReturn(expectedName);
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName, "Product name should be empty");
    }

    @Test
    public void testGetName_Null() {
        Mockito.when(product.getName()).thenReturn(null);
        String actualName = product.getName();
        Assertions.assertNull(actualName, "Product name should be null");
    }
}
