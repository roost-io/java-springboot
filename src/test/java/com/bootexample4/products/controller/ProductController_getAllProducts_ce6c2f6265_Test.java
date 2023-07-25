package com.bootexample4.products.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@SpringBootTest
public class ProductController_getAllProducts_ce6c2f6265_Test {

    @InjectMocks
    private ProductController productController;
    
    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetAllProducts() {

        // Setup our mock repository
        Product product1 = new Product();
        product1.setName("Product1");
        product1.setDescription("Description1");
        product1.setPrice(100.0);
        
        Product product2 = new Product();
        product2.setName("Product2");
        product2.setDescription("Description2");
        product2.setPrice(200.0);
        
        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));

        // Execute the service call
        List<Product> returnedProducts = productController.getAllProducts();

        // Assert the response
        assertEquals(2, returnedProducts.size(), "getAllProducts should return 2 products");
    }

    @Test
    public void testGetAllProducts_Empty() {

        // Setup our mock repository
        when(productRepository.findAll()).thenReturn(Arrays.asList());

        // Execute the service call
        List<Product> returnedProducts = productController.getAllProducts();

        // Assert the response
        assertEquals(0, returnedProducts.size(), "getAllProducts should return 0 products");
    }
}
