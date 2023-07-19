// Test generated by RoostGPT for test roost-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_getProductById_079f0e7d67_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetProductById_ProductExists() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Product1");
        product.setDescription("Description1");

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    public void testGetProductById_ProductDoesNotExist() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertNotNull(responseEntity);
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }
}
