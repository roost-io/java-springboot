// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class Product_getDescription_b1844ea396_Test {

    @Mock
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetDescription_success() {
        String expectedDescription = "This is a product description.";
        when(product.getDescription()).thenReturn(expectedDescription);

        String actualDescription = product.getDescription();
        assertEquals(expectedDescription, actualDescription);
    }

    @Test
    public void testGetDescription_empty() {
        String expectedDescription = "";
        when(product.getDescription()).thenReturn(expectedDescription);

        String actualDescription = product.getDescription();
        assertEquals(expectedDescription, actualDescription);
    }
}
