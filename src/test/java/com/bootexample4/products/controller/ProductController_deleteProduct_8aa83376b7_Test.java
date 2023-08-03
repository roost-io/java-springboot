package com.bootexample4.products.controller;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

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
    public void testDeleteProduct_WhenProductExists() {
        Product product = new Product();
        product.setId(1L);

        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void testDeleteProduct_WhenProductDoesNotExist() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }
}
