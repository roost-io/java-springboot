// Test generated by RoostGPT for test dm-unit-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductController_getProductById_d22f3ea272_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetProductById_found() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(1L, responseEntity.getBody().getId());
    }

    @Test
    public void testGetProductById_notFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);

        assertEquals(404, responseEntity.getStatusCodeValue());
    }
}
