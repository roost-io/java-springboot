package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mockito;

@SpringBootTest
public class Product_getId_eb19b6a6d6_Test {

    @MockBean
    private Product product;

    @BeforeEach
    public void setUp() {
        Mockito.when(product.getId()).thenReturn(123L);
    }

    @Test
    public void testGetIdSuccess() {
        Long expectedId = 123L;
        Long actualId = product.getId();
        Assertions.assertEquals(expectedId, actualId, "The expected id does not match the actual id");
    }

    @Test
    public void testGetIdFailure() {
        Long unexpectedId = 456L;
        Long actualId = product.getId();
        Assertions.assertNotEquals(unexpectedId, actualId, "The unexpected id matches the actual id");
    }
}
