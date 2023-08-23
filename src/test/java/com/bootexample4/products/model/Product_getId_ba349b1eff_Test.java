// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getId_ba349b1eff_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetIdWithNonNullId() {
        Long expectedId = 123L;
        product.setId(expectedId);

        Long actualId = product.getId();

        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID.");
    }

    @Test
    public void testGetIdWithNullId() {
        product.setId(null);

        Long actualId = product.getId();

        assertEquals(null, actualId, "The expected ID does not match the actual ID.");
    }
}
