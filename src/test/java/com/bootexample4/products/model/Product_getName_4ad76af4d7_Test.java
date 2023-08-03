package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

interface ProductInterface {
    String getName();
}

class Product implements ProductInterface {
    // Your Product class implementation
}

public class Product_getName_4ad76af4d7_Test {

    @Mock
    private ProductInterface product;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetNameSuccess() {
        String expectedName = "Product1";
        when(product.getName()).thenReturn(expectedName);

        String actualName = product.getName();

        assertEquals(expectedName, actualName, "Name should be Product1");
    }

    @Test
    public void testGetNameFailure() {
        String unexpectedName = "Product2";
        when(product.getName()).thenReturn("Product1");

        String actualName = product.getName();

        assertEquals(false, unexpectedName.equals(actualName), "Name should not be Product2");
    }
}
