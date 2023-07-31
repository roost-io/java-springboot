package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class Product_getPrice_d97185b3e6_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setUp() {
        product.setPrice(100.0);
    }

    @Test
    public void testGetPriceSuccess() {
        double expectedPrice = 100.0;
        double actualPrice = product.getPrice();
        assertEquals(expectedPrice, actualPrice, "The expected price does not match the actual price");
    }

    @Test
    public void testGetPriceFailure() {
        double unexpectedPrice = 200.0;
        double actualPrice = product.getPrice();
        assertNotEquals(unexpectedPrice, actualPrice, "The expected price should not match the actual price");
    }
}
