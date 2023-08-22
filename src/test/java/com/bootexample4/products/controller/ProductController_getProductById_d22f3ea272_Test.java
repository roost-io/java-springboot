package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductController_getProductById_d22f3ea272_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetProductById_Success() {
        Long id = 1L;
        Product product = new Product();
        product.setId(id);
        when(productRepository.findById(id)).thenReturn(Optional.of(product));

        ResponseEntity<Product> response = productController.getProductById(id);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(product, response.getBody());
    }

    @Test
    public void testGetProductById_NotFound() {
        Long id = 1L;
        when(productRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<Product> response = productController.getProductById(id);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
}
