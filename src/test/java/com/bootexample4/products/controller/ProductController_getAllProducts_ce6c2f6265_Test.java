package com.bootexample4.products.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductController_getAllProducts_ce6c2f6265_Test {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductRepository productRepository;

    List<Product> productList;

    @Before
    public void setup() {
        productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Product1");
        product1.setDescription("Description1");
        product1.setPrice(100.0);
        productList.add(product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Product2");
        product2.setDescription("Description2");
        product2.setPrice(200.0);
        productList.add(product2);
    }

    @Test
    public void testGetAllProducts_Success() {
        when(productRepository.findAll()).thenReturn(productList);

        List<Product> result = productController.getAllProducts();
        assertEquals(productList.size(), result.size());
    }

    @Test
    public void testGetAllProducts_Empty() {
        productList.clear();
        when(productRepository.findAll()).thenReturn(productList);

        List<Product> result = productController.getAllProducts();
        assertEquals(0, result.size());
    }
}
