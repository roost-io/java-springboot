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
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ProductController_getProductById_079f0e7d67_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetProductById_Success() {
        Product product = new Product();
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(product, responseEntity.getBody());
    }

    @Test
    public void testGetProductById_NotFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertEquals(404, responseEntity.getStatusCodeValue());
        assertTrue(responseEntity.getBody() == null);
    }
}
