package com.bootexample4.products.controller;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;
import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductController_deleteProduct_8aa83376b7_Test {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testDeleteProductSuccess() {
        Product product = new Product();
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(200, responseEntity.getStatusCodeValue());
    }

    @Test
    public void testDeleteProductNotFound() {
        when(productRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<Object> responseEntity = productController.deleteProduct(1L);

        assertEquals(404, responseEntity.getStatusCodeValue());
    }
}
