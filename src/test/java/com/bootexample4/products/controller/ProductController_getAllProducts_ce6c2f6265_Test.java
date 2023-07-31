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
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllProducts_success() {
        Product product1 = new Product();
        product1.setId(1L); // change here
        product1.setName("Product1");

        Product product2 = new Product();
        product2.setId(2L); // change here
        product2.setName("Product2");

        List<Product> mockProducts = Arrays.asList(product1, product2);
        when(productRepository.findAll()).thenReturn(mockProducts);

        List<Product> result = productController.getAllProducts();
        assertEquals(2, result.size());
        assertEquals(mockProducts, result);
    }

    @Test
    public void testGetAllProducts_empty() {
        List<Product> mockProducts = Arrays.asList();
        when(productRepository.findAll()).thenReturn(mockProducts);

        List<Product> result = productController.getAllProducts();
        assertEquals(0, result.size());
    }
}
