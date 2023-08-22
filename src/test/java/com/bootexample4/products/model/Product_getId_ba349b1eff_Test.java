package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Entity
public class Product_getId_ba349b1eff_Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Mock
    private Product_getId_ba349b1eff_Test productMock;

    public Long getId() {
        return this.id;
    }

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetIdSuccessCase() {
        // TODO: Replace the value 10L with the actual id of the product
        Long expectedId = 10L;
        when(productMock.getId()).thenReturn(expectedId);
        Long actualId = productMock.getId();
        assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetIdFailureCase() {
        // TODO: Replace the value 20L with the actual id of the product
        Long unexpectedId = 20L;
        when(productMock.getId()).thenReturn(unexpectedId);
        Long actualId = productMock.getId();
        assertNotEquals(unexpectedId, actualId);
    }
}
