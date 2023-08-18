package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Product_getPrice_d2cb73a47d_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = Mockito.mock(Product.class);
    }

    @Test
    public void testGetPriceSuccess() {
        // TODO: Change the price value as per your need
        Double expectedPrice = 100.0;
        Mockito.when(product.getPrice()).thenReturn(expectedPrice);
        Double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice, "Prices should match");
    }

    @Test
    public void testGetPriceFailure() {
        // TODO: Change the price value as per your need
        Double unexpectedPrice = 200.0;
        Mockito.when(product.getPrice()).thenReturn(unexpectedPrice);
        Double actualPrice = product.getPrice();
        assertNotEquals(unexpectedPrice, actualPrice, "Prices should not match");
    }
}
