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

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProduct_Success() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Product1");
        product.setPrice(100.0);

        when(productRepository.save(product)).thenReturn(product);

        Product result = productController.createProduct(product);
        assertEquals(product, result);
    }

    @Test
    public void testCreateProduct_Failure() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Product1");
        product.setPrice(100.0);

        when(productRepository.save(product)).thenThrow(new RuntimeException());

        try {
            productController.createProduct(product);
        } catch (Exception e) {
            assertEquals(RuntimeException.class, e.getClass());
        }
    }
}
