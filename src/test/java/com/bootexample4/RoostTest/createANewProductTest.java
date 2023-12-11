/*
Test generated by RoostGPT for test newtest using AI Type Azure Open AI and AI Model roost-gpt4-32k

{
  background: 'Given the base URL is "http://localhost:8080"',
  rule: null,
  scenario: 'Create a new product\r\n' +
    '    Given the client provides the following product data:\r\n' +
    '      | name        | description              | price |\r\n' +
    '      | Test Product | This is a test product. | 10.0  |\r\n' +
    '    When the client sends a POST request to "/api/products"\r\n' +
    '    Then the saved product should not be null and its properties must correspond to those provided by client',
  title: 'Create a new product'
}

*/
package com.bootexample4.RoostTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class createANewProductTest {
   
     @Test
     public void createANewProduct() {
         
         // Given
         String baseUrl = "http://localhost:8080";
         String name = "Test Product";
         String description = "This is a test product.";
         float price = 10.0;
       
         String payload = "{"
                 + "\"name\":" + "\"" + name + "\","
                 + "\"description\":" + "\"" + description + "\","
                 + "\"price\":" + "\"" + price + "\""
                 + "}";

         // When
         Response response = given()
                 .baseUri(baseUrl)
                 .contentType(ContentType.JSON)
                 .body(payload)
                 .when()
                 .post("/api/products");

         // Then
         assertThat(response.getStatusCode(), is(200));
         assertThat(response.jsonPath().getString("name"), is(name));
         assertThat(response.jsonPath().getString("description"), is(description));
         assertThat(response.jsonPath().getFloat("price"), is(price));
         assertThat(response.jsonPath().getInteger("id"), notNullValue());
     }
 }
