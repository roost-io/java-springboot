// Test generated by RoostGPT for test java-test using AI Type Open AI and AI Model gpt-4

package com.bootexample4.products.controller;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductController_getAllProducts_7e38cc05f6_Test {

    @InjectMocks
    private ProductController productController;
    
    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetAllProducts_whenProductsExist() {
        Product product1 = new Product("Product 1", "Description 1", 100.0);
        Product product2 = new Product("Product 2", "Description 2", 200.0);
        when(productRepository.findAll()).thenReturn(Arrays.asList(product1, product2));
        
        List<Product> result = productController.getAllProducts();
        
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).containsExactlyInAnyOrder(product1, product2);
    }

    @Test
    public void testGetAllProducts_whenNoProductsExist() {
        when(productRepository.findAll()).thenReturn(Arrays.asList());
        
        List<Product> result = productController.getAllProducts();
        
        assertThat(result).isNotNull();
        assertThat(result).isEmpty();
    }
}
