package com.bootexample4.products.controller;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@SpringBootTest
public class ProductController_getAllProducts_ce6c2f6265_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product 1");
        product1.setDescription("Description 1");
        product1.setPrice(100.0);
        
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product 2");
        product2.setDescription("Description 2");
        product2.setPrice(200.0);
        
        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        List<Product> products = productController.getAllProducts();

        assertEquals(2, products.size());
        assertEquals(product1, products.get(0));
        assertEquals(product2, products.get(1));
    }

    @Test
    public void testGetAllProducts_NoProducts() {
        when(productRepository.findAll()).thenReturn(Arrays.asList());

        List<Product> products = productController.getAllProducts();

        assertEquals(0, products.size());
    }
}
