// Test generated by RoostGPT for test dmtestunit using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ProductController_updateProduct_d88ecc4aa9_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateProductSuccess() {
        Product existingProduct = new Product();
        existingProduct.setName("Test Product");
        existingProduct.setDescription("Test Description");
        existingProduct.setPrice(100.0);

        Product newProduct = new Product();
        newProduct.setName("New Test Product");
        newProduct.setDescription("New Test Description");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.of(existingProduct));
        when(productRepository.save(existingProduct)).thenReturn(newProduct);

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(newProduct, response.getBody());
    }

    @Test
    public void testUpdateProductNotFound() {
        Product newProduct = new Product();
        newProduct.setName("New Test Product");
        newProduct.setDescription("New Test Description");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(404, response.getStatusCodeValue());
    }
}
