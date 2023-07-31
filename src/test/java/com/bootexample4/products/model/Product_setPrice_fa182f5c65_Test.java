package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setProductPrice_fa182f5c65_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testSetProductPrice_PositiveValue() {
        double expectedPrice = 100.0;
        product.setProductPrice(expectedPrice);
        assertEquals(expectedPrice, product.getProductPrice(), "Price should be set correctly for positive values");
    }

    @Test
    public void testSetProductPrice_ZeroValue() {
        double expectedPrice = 0.0;
        product.setProductPrice(expectedPrice);
        assertEquals(expectedPrice, product.getProductPrice(), "Price should be set correctly for zero value");
    }

    @Test
    public void testSetProductPrice_NegativeValue() {
        double expectedPrice = -100.0;
        product.setProductPrice(expectedPrice);
        assertEquals(expectedPrice, product.getProductPrice(), "Price should be set correctly even for negative values");
    }
}
