package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductController_getAllProducts_7e38cc05f6_Test {

    @Autowired
    private ProductController productController;

    @MockBean
    private ProductRepository productRepository;

    @Test
    public void testGetAllProducts_Success() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Product 1");
        product1.setPrice(100.0);
        products.add(product1);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Product 2");
        product2.setPrice(200.0);
        products.add(product2);

        when(productRepository.findAll()).thenReturn(products);

        List<Product> response = productController.getAllProducts();

        assertEquals(products, response);
    }

    @Test
    public void testGetAllProducts_NoProducts() {
        List<Product> products = new ArrayList<>();

        when(productRepository.findAll()).thenReturn(products);

        List<Product> response = productController.getAllProducts();

        assertEquals(products, response);
    }
}
