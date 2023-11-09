package com.bootexample4.products.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Product_setPrice_8f1e19b496_Test {

    private Product product;

    @Before
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetPrice() {
        double price = 10.5;
        product.setPrice(price);
        assertEquals(price, product.getPrice(), 0.0);
    }

    @Test
    public void testSetPriceZero() {
        double price = 0.0;
        product.setPrice(price);
        assertEquals(price, product.getPrice(), 0.0);
    }

    @Test
    public void testSetPriceNegative() {
        double price = -5.5;
        assertThrows(IllegalArgumentException.class, () -> product.setPrice(price));
    }
}
