package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setId_e7f341730a_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        product = new Product();
    }

    @Test
    public void testSetId_PositiveNumber() {
        Long expectedId = 5L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId());
    }

    @Test
    public void testSetId_Zero() {
        Long expectedId = 0L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId());
    }

    @Test
    public void testSetId_Null() {
        Long expectedId = null;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId());
    }

    // TODO: Add more test cases as per your requirements.
}
