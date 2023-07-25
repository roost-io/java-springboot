package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getId_eb19b6a6d6_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 1L;
        product.setId(expectedId);
        Long actualId = product.getId();
        assertEquals(expectedId, actualId, "The expected ID does not match the actual ID");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 2L;
        product.setId(1L);
        Long actualId = product.getId();
        assertEquals(false, unexpectedId.equals(actualId), "The unexpected ID should not match the actual ID");
    }
}
