// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Product_getName_8400ac6fb7_Test {

    private Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testGetName_whenNameIsSet() {
        String expectedName = "Product1";
        product.setName(expectedName);

        String actualName = product.getName();

        Assertions.assertNotNull(actualName, "Name should not be null");
        Assertions.assertEquals(expectedName, actualName, "Actual name should match the expected name");
    }

    @Test
    public void testGetName_whenNameIsNotSet() {
        String actualName = product.getName();

        Assertions.assertNull(actualName, "Name should be null when it is not set");
    }
}