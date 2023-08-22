// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getPrice_d2cb73a47d_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testGetPriceWhenPriceIsSet() {
        double expectedPrice = 100.00;
        product.setPrice(expectedPrice);

        double actualPrice = product.getPrice();

        assertEquals(expectedPrice, actualPrice, "Price should be 100.00");
    }

    @Test
    public void testGetPriceWhenPriceIsNotSet() {
        double expectedPrice = 0.00;

        double actualPrice = product.getPrice();

        assertEquals(expectedPrice, actualPrice, "Price should be 0.00 as it is not set");
    }
}