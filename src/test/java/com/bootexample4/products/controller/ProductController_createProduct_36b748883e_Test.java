package com.bootexample4.products.controller;

import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@SpringBootTest
public class ProductController_createProduct_36b748883e_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateProduct_Success() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Test Product Description");
        product.setPrice(100.00);

        Mockito.when(productRepository.save(Mockito.any(Product.class))).thenReturn(product);

        Product createdProduct = productController.createProduct(product);

        Mockito.verify(productRepository, Mockito.times(1)).save(Mockito.any(Product.class));
        assert createdProduct.getId().equals(product.getId());
        assert createdProduct.getName().equals(product.getName());
        assert createdProduct.getDescription().equals(product.getDescription());
        assert createdProduct.getPrice() == product.getPrice();
    }

    @Test
    public void testCreateProduct_Failure() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setDescription("Test Product Description");
        product.setPrice(100.00);

        Mockito.when(productRepository.save(Mockito.any(Product.class))).thenReturn(null);

        Product createdProduct = productController.createProduct(product);

        Mockito.verify(productRepository, Mockito.times(1)).save(Mockito.any(Product.class));
        assert createdProduct == null;
    }
}
