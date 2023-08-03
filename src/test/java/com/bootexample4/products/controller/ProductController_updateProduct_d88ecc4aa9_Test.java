package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductController_updateProduct_d88ecc4aa9_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateProduct_success() {
        Product existingProduct = new Product();
        existingProduct.setId(1L);
        existingProduct.setName("Old Product");
        existingProduct.setDescription("Old Description");
        existingProduct.setPrice(100.0);

        Product newProduct = new Product();
        newProduct.setName("New Product");
        newProduct.setDescription("New Description");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.of(existingProduct));
        when(productRepository.save(existingProduct)).thenReturn(existingProduct);

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("New Product", response.getBody().getName());
        assertEquals("New Description", response.getBody().getDescription());
        assertEquals(200.0, response.getBody().getPrice(), 0.01);
    }

    @Test
    public void testUpdateProduct_notFound() {
        Product newProduct = new Product();
        newProduct.setName("New Product");
        newProduct.setDescription("New Description");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(404, response.getStatusCodeValue());
    }
}
