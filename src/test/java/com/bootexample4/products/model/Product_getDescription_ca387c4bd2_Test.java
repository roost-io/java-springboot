package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Product_getDescription_ca387c4bd2_Test {

    @Mock
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDescription_Success() {
        String expectedDescription = "Product Description";
        when(product.toString()).thenReturn(expectedDescription);

        String actualDescription = product.toString();

        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testGetDescription_Null() {
        when(product.toString()).thenReturn(null);

        String actualDescription = product.toString();

        assertEquals(null, actualDescription);
    }
}
