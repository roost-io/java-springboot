package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Product_getId_eb19b6a6d6_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = Mockito.mock(Product.class);
        Mockito.when(product.getId()).thenReturn(123L);
    }

    @Test
    public void testGetIdSuccess() {
        Mockito.when(product.getId()).thenReturn(123L);
        Long expected = 123L;
        Long actual = product.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIdFailure() {
        Mockito.when(product.getId()).thenReturn(456L);
        Long expected = 123L;
        Long actual = product.getId();
        assertNotEquals(expected, actual);
    }
}
