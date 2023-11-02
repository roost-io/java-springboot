// Test generated by RoostGPT for test java-dm-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Product_setId_04a8e16b7c_Test {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetIdWithPositiveNumber() {
        Long expectedId = 10L;
        product.setId(expectedId);
        assertThat(product.getId()).isEqualTo(expectedId);
    }
   
    @Test
    public void testSetIdWithNull() {
        Long expectedId = null;
        product.setId(expectedId);
        assertThat(product.getId()).isEqualTo(expectedId);
    }
}
