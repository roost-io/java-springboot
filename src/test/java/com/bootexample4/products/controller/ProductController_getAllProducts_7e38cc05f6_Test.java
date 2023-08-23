package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductController_getAllProducts_7e38cc05f6_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllProducts() {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product1");
        product1.setDescription("Description1");
        product1.setPrice(10.0);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product2");
        product2.setDescription("Description2");
        product2.setPrice(20.0);

        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        List<Product> result = productController.getAllProducts();

        assertEquals(2, result.size());
        assertEquals(product1, result.get(0));
        assertEquals(product2, result.get(1));
    }

    @Test
    public void testGetAllProducts_EmptyList() {
        when(productRepository.findAll()).thenReturn(Arrays.asList());

        List<Product> result = productController.getAllProducts();

        assertEquals(0, result.size());
    }
}
