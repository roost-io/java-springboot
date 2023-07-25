package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

public class ProductController_deleteProduct_8aa83376b7_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDeleteProduct_success() {
        Product product = new Product();
        product.setId(1L);

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
        doNothing().when(productRepository).delete(product);

        ResponseEntity<Object> response = productController.deleteProduct(1L);

        verify(productRepository).delete(product);

        assertEquals(HttpStatus.OK.value(), response.getStatusCodeValue());
    }

    @Test
    public void testDeleteProduct_notFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Object> response = productController.deleteProduct(1L);

        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCodeValue());
    }
}
