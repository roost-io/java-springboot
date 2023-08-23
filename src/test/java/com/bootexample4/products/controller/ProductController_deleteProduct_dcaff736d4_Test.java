package com.bootexample4.products.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.service.ProductService;

public class ProductController_deleteProduct_dcaff736d4_Test {
    
    @InjectMocks
    ProductController productController;

    @Mock
    ProductService productService;

    Product product;

    @BeforeEach
    public void setup() {
        product = new Product();
    }

    @Test
    public void testDeleteProduct_Success() {
        when(productService.getProductById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        verify(productService, times(1)).deleteProduct(product.getId());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testDeleteProduct_NotFound() {
        when(productService.getProductById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        verify(productService, times(0)).deleteProduct(product.getId());
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }
}
