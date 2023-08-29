package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductController_updateProduct_9454a9af90_Test {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @Test
    public void shouldUpdateProductWhenProductExists() {
        // given
        Long id = 1L;
        Product existingProduct = new Product();
        existingProduct.setId(id);
        existingProduct.setName("name");
        existingProduct.setDescription("description");
        existingProduct.setPrice(10.0);

        Product updatedProduct = new Product();
        updatedProduct.setId(id);
        updatedProduct.setName("updated name");
        updatedProduct.setDescription("updated description");
        updatedProduct.setPrice(11.0);

        when(productRepository.findById(id)).thenReturn(Optional.of(existingProduct));

        // when
        ResponseEntity<Product> responseEntity = productController.updateProduct(id, updatedProduct);

        // then
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
        assertThat(responseEntity.getBody()).isEqualTo(updatedProduct);
    }

    @Test
    public void shouldReturnNotFoundWhenProductDoesNotExist() {
        // given
        Long id = 1L;
        when(productRepository.findById(id)).thenReturn(Optional.empty());

        // when
        ResponseEntity<Product> responseEntity = productController.updateProduct(id, new Product());

        // then
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(404);
    }
}
