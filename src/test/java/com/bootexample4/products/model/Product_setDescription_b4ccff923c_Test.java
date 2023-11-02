// Test generated by RoostGPT for test java-dm-test using AI Type Azure Open AI and AI Model roost-gpt4-32k

package com.bootexample4.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Entity
public class Product_setDescription_b4ccff923c_Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private double price;

    public Product_setDescription_b4ccff923c_Test() {}
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
      return description;
    }

    @Mock
    private Product_setDescription_b4ccff923c_Test productMock;

    @BeforeEach
    void setUp() {
       MockitoAnnotations.openMocks(this);
    }

    @Test
    public void setDescription_NullDescription_ThrowsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
          productMock.setDescription(null);
      });
    }

    @Test
    public void setDescription_ValidDescription_SetsDescription(){
        productMock.setDescription("Test Description");
        Assertions.assertEquals("Test Description", productMock.getDescription());
    }

}
