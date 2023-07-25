package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getName_4ad76af4d7_Test {

    @InjectMocks
    Product product;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetName_Success() {
        String expectedName = "ProductA";
        product.setName(expectedName);  // Assuming setName() method exists in Product class
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Product name should match the expected name");
    }

    @Test
    public void testGetName_Failure() {
        String expectedName = "ProductB";
        product.setName("ProductA"); // Assuming setName() method exists in Product class
        String actualName = product.getName();
        assertEquals(expectedName, actualName, "Product name should not match the expected name");
    }
}
