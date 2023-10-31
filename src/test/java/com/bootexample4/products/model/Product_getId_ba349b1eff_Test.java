// Test generated by RoostGPT for test divyesh-31oct using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Product_getId_ba349b1eff_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testGetId() {
        Long id = 1L;
        product.setId(id);
        Long result = product.getId();
        assertNotNull(result);
        assertEquals(id, result);
    }

    @Test
    public void testGetIdWithNull() {
        product.setId(null);
        Long result = product.getId();
        assertEquals(null, result);
    }
}
