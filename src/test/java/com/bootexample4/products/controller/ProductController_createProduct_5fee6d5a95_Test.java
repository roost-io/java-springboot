package com.bootexample4.products.controller;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_createProduct_5fee6d5a95_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProduct_Success() {
        Product product = new Product();
        product.setId(1L); // Changed from int to Long
        product.setName("Test Product");

        when(productRepository.save(product)).thenReturn(product);

        Product result = productController.createProduct(product);

        assertEquals(product, result);
    }

    @Test
    public void testCreateProduct_Failure() {
        Product product = new Product();
        product.setId(1L); // Changed from int to Long
        product.setName("Test Product");

        when(productRepository.save(product)).thenReturn(null);

        Product result = productController.createProduct(product);

        assertEquals(null, result);
    }
}
