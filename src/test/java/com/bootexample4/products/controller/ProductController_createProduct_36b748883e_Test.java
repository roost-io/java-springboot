package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductController_createProduct_36b748883e_Test {

    @InjectMocks
    private ProductController controller;

    @Mock
    private ProductRepository productRepository;

    private Product product;

    @Before
    public void setUp() {
        product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Test product description");
        product.setPrice(100.0);
    }

    @Test
    public void testCreateProductSuccess() {
        when(productRepository.save(any(Product.class))).thenReturn(product);

        Product createdProduct = controller.createProduct(product);

        assertThat(createdProduct).isNotNull();
        assertThat(createdProduct.getId()).isEqualTo(product.getId());
        assertThat(createdProduct.getName()).isEqualTo(product.getName());
        assertThat(createdProduct.getDescription()).isEqualTo(product.getDescription());
        assertThat(createdProduct.getPrice()).isEqualTo(product.getPrice());

        verify(productRepository, times(1)).save(product);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateProductFailure() {
        when(productRepository.save(any(Product.class))).thenThrow(new RuntimeException("Exception occurred"));

        controller.createProduct(product);
    }
}
