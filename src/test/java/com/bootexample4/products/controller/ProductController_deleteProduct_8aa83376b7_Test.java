// Test generated by RoostGPT for test dmunit-2507 using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_deleteProduct_8aa83376b7_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeleteProduct_Success() {
        Long productId = 1L;
        Product product = new Product();
        product.setId(productId);

        when(productRepository.findById(productId)).thenReturn(Optional.of(product));
        ResponseEntity<Object> response = productController.deleteProduct(productId);

        verify(productRepository, times(1)).delete(product);
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    public void testDeleteProduct_ProductNotFound() {
        Long productId = 1L;

        when(productRepository.findById(productId)).thenReturn(Optional.empty());
        ResponseEntity<Object> response = productController.deleteProduct(productId);

        verify(productRepository, times(0)).delete(any(Product.class));
        assertEquals(404, response.getStatusCodeValue());
    }
}
