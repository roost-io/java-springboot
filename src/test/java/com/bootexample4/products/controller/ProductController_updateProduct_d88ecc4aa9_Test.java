// Test generated by RoostGPT for test dmUnitTest using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ProductController_updateProduct_d88ecc4aa9_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testUpdateProduct_Success() {
        Product existingProduct = new Product();
        existingProduct.setId(1L);
        existingProduct.setName("Product1");
        existingProduct.setDescription("Description1");
        existingProduct.setPrice(100.0);

        Product newProduct = new Product();
        newProduct.setName("Product2");
        newProduct.setDescription("Description2");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.of(existingProduct));
        when(productRepository.save(any(Product.class))).thenReturn(newProduct);

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(newProduct, response.getBody());
    }

    @Test
    public void testUpdateProduct_NotFound() {
        Product newProduct = new Product();
        newProduct.setName("Product2");
        newProduct.setDescription("Description2");
        newProduct.setPrice(200.0);

        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Product> response = productController.updateProduct(1L, newProduct);

        assertEquals(404, response.getStatusCodeValue());
    }
}