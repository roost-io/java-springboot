// Test generated by RoostGPT for test divyesh-31oct using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_getAllProducts_7e38cc05f6_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllProducts_whenProductsExist() {
        // Arrange
        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setDescription("Description 1");
        product1.setPrice(10.5);

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setDescription("Description 2");
        product2.setPrice(20.5);

        List<Product> products = Arrays.asList(product1, product2);

        when(productRepository.findAll()).thenReturn(products);

        // Act
        List<Product> result = productController.getAllProducts();

        // Assert
        assertEquals(products, result);
        verify(productRepository, times(1)).findAll();
    }

    @Test
    void testGetAllProducts_whenNoProductsExist() {
        // Arrange
        when(productRepository.findAll()).thenReturn(null);

        // Act
        List<Product> result = productController.getAllProducts();

        // Assert
        assertNull(result);
        verify(productRepository, times(1)).findAll();
    }
}
