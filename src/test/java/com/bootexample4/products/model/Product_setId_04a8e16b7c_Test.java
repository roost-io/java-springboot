package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_setId_04a8e16b7c_Test {

    @InjectMocks
    private Product product;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetId_Success() {
        Long expectedId = 123L;
        product.setId(expectedId);
        assertEquals(expectedId, product.getId());
    }

    @Test
    public void testSetId_Null() {
        product.setId(null);
        assertEquals(null, product.getId());
    }
}
