// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Product_getId_ba349b1eff_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testGetId() {
        Long expectedId = 1L;
        product.setId(expectedId);
        Long actualId = product.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID.");
    }

    @Test
    public void testGetId_Null() {
        product.setId(null);
        Long actualId = product.getId();
        assertEquals(null, actualId, "The expected ID does not match the actual ID.");
    }
}