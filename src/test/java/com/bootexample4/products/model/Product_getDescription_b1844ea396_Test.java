package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product_getDescription_b1844ea396_Test {

    @Test
    public void testGetDescription_whenDescriptionIsSet_shouldReturnDescription() {
        // Arrange
        Product product = new Product();
        product.setDescription("This is a description");

        // Act
        String description = product.getDescription();

        // Assert
        assertEquals("This is a description", description);
    }

    @Test
    public void testGetDescription_whenDescriptionIsNotSet_shouldReturnNull() {
        // Arrange
        Product product = new Product();

        // Act
        String description = product.getDescription();

        // Assert
        assertEquals(null, description);
    }
}
