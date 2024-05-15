

package com.bootexample4.products.controller;

import com.bootexample4.products.model.Product;
import com.bootexample4.products.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ProductControllerUpdateProductTest {

	private ProductRepository productRepository;

	private ProductController productController;

	@BeforeEach
	public void setup() {
		// There's no import statement for declaration of Mockito.
		// Make sure to add import org.mockito.Mockito; at the beginning of the file.
		productRepository = Mockito.mock(ProductRepository.class);
		productController = new ProductController();
	}

	@Test
	public void testUpdateProductWithValidData() {
		Long validId = 1L;
		Product productObj = new Product();
		productObj.setName("TestProduct");
		productObj.setDescription("Test Product Description");
		productObj.setPrice(100.0);
		
		// Cannot find symbol variable Optional
		// Make sure to import java.util.Optional at the top of the file.
		Mockito.when(productRepository.findById(validId)).thenReturn(Optional.of(productObj));
		Mockito.when(productRepository.save(productObj))
			.thenAnswer((Answer<Product>) invocation -> invocation.getArgument(0));
		
		ResponseEntity<Product> responseEntity = productController.updateProduct(validId, productObj);
		
		// Cannot find symbol Spring's HttpStatus
		// Make sure to import org.springframework.http.HttpStatus at the beginning of the file.
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
		assertEquals(productObj, responseEntity.getBody());
	}

	@Test
	public void testUpdateProductWithNonExistentId() {
		Long invalidId = -1L;
		Product productObj = new Product();
		productObj.setName("NonExistentProduct");
		productObj.setDescription("Non Existent Product Description");
		productObj.setPrice(0.0);

		Mockito.when(productRepository.findById(invalidId)).thenReturn(Optional.empty());

		ResponseEntity<Product> responseEntity = productController.updateProduct(invalidId, productObj);

		assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
	}

	@Test
	public void testUpdateProductWithNullProduct() {
		Long validId = 1L;
		Product nullProductObj = null;

		assertThrows(NullPointerException.class, () -> {
			productController.updateProduct(validId, nullProductObj);
		});
	}

	@Test
	public void testUpdateProductWithNullId() {
		Long nullId = null;
		Product productObj = new Product();
		productObj.setName("TestProduct");
		productObj.setDescription("Test Product Description");
		productObj.setPrice(100.0);

		assertThrows(NullPointerException.class, () -> {
			productController.updateProduct(nullId, productObj);
		});
	}
}
