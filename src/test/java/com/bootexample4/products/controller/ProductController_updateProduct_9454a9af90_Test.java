package com.bootexample4.products.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductController_updateProduct_9454a9af90_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUpdateProductSuccess() {
        Product existingProduct = new Product();
        existingProduct.setId(1L);
        existingProduct.setName("Old Product");
        existingProduct.setDescription("Old Description");
        existingProduct.setPrice(100.00);

        Product newProduct = new Product();
        newProduct.setName("New Product");
        newProduct.setDescription("New Description");
        newProduct.setPrice(200.00);

        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(existingProduct));
        when(productRepository.save(any(Product.class))).thenReturn(newProduct);

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("New Product", response.getBody().getName());
        assertEquals("New Description", response.getBody().getDescription());
        assertEquals(200.00, response.getBody().getPrice(), 0.01);
    }

    @Test
    public void testUpdateProductNotFound() {
        Product newProduct = new Product();
        newProduct.setName("New Product");
        newProduct.setDescription("New Description");
        newProduct.setPrice(200.00);

        when(productRepository.findById(1L)).thenReturn(java.util.Optional.empty());

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(404, response.getStatusCodeValue());
    }
}
