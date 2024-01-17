/*
Test generated by RoostGPT for test divyesh-java using AI Type Azure Open AI and AI Model roost-gpt4-32k

1. **Positive Price Test Scenario**: 
   - In this scenario, provide a positive price value (let's say 10.5) to the `setPrice()` function and check if the price is set correctly.

2. **Zero Price Test Scenario**: 
   - Pass a price value of '0' to the `setPrice()` function and check if the price is set to zero without any errors.

3. **Negative Price Test Scenario**:
   - In this scenario, provide a negative price value (like -10.5) to the `setPrice()` function and check if an appropriate error or exception is thrown as negative prices are usually not valid.

4. **Maximum Boundary Value Scenario**:
   - Provide a price that nears the maximum price acceptable by the system to the `setPrice()` function and check if the function sets the price correctly.

5. **Minimum Boundary Value Scenario**:
   - Provide a price that nears the minimum price acceptable to the `setPrice()` function and confirm if the function sets the price correctly.

6. **Null Value Scenario**:
   - Try passing a null value to the `setPrice()` function and check if it appropriately handles the null condition and throws an error or exception.

7. **Different Data Type Test Scenario**:
   - Try providing a value of a different data type (like string or boolean) to the `setPrice()` function and check if it throws an appropriate error or exception.

8. **Precision Test Scenario**:
   - Provide a price with more precision decimal places than the system can handle and check if it round offs/truncates to match the supported precision.

9. **Concurrency Test Scenario**:
   - If the system supports concurrency, have two threads call the `setPrice()` function at the same time and check if the function works accurately and consistently.

10. **Alphanumeric Value Scenario**:
    - Try passing an alphanumeric value to the `setPrice()` function and check if it rejects the invalid input and throws an appropriate error or exception.
*/
package com.bootexample4.products.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Product_setPrice_8f1e19b496_Test {
    private Product product;

    @BeforeEach
    void init() {
        product = new Product();
    }

    @Test
    void setPricePositiveValue() {
        double expectedPrice = 10.5;
        product.setPrice(expectedPrice);
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    void setPriceZero() {
        double expectedPrice = 0;
        product.setPrice(expectedPrice);
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    void setPriceNegativeValue() {
        double expectedPrice = -10.5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> product.setPrice(expectedPrice));
        String expectedMessage = "Price cannot be a negative value";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void setPriceMaxBoundary() {
        double expectedPrice = Double.MAX_VALUE;
        product.setPrice(expectedPrice);
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    void setPriceMinBoundary() {
        double expectedPrice = Double.MIN_VALUE;
        product.setPrice(expectedPrice);
        assertEquals(expectedPrice, product.getPrice());
    }

    @Test
    void setPriceNull() {
        assertThrows(NullPointerException.class, () -> product.setPrice(null));
    }

    @Test
    void setPriceHighPrecision() {
        double expectedPrice = 10.123456789;
        product.setPrice(expectedPrice);
        expectedPrice = 10.123456;
        assertEquals(expectedPrice, product.getPrice());
    }
}
