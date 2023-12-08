// Test generated by RoostGPT for test hsbcdemo using AI Type Azure Open AI and AI Model roost-gpt4-32k


// Test generated for /products/{productId}_get for http method type GET in rest-assured framework


// RoostTestHash=52a171b52e


package com.bootexample4.RoostTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.text.*;

public class products_productIdGetTest {
  
    @Test  
    public void products_productId_get_Test() {  
        RestAssured.baseURI = System.getenv("BASE_URL");  
  
        // Read CSV file  
        try (BufferedReader reader = new BufferedReader(new FileReader("src/test/java/com/bootexample4/RoostTest/products_productIdGetTest.csv"))) {  
            String headerLine = reader.readLine();  
            String[] headers = headerLine.split(",");  
  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] data = line.split(",");  
  
                // Create a map of header to data  
                Map<String, String> map = new HashMap<>();  
                for (int i = 0; i < headers.length; i++) {  
                    map.put(headers[i], data[i]);  
                }  
                
  
                Response response = given()
				.pathParam("productId", map.get("productId"))
                .when()
                .get("/products/{productId}")  
                .then() 
                .extract().response();    
         
                if (response.statusCode() == 200) {
					System.out.println("Description: successful operation");
  
            if (response.jsonPath().get("id") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("id"), instanceOf(Integer.class));
                MatcherAssert.assertThat(response.jsonPath().getString("id"), Number.isSafeInteger(
                  response.jsonPath().getInt("id")
                )); 
  
          }
  
            if (response.jsonPath().get("name") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("name"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("description") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("description"), instanceOf(String.class));  
          }
  
            if (response.jsonPath().get("price") != null) {
                MatcherAssert.assertThat(response.jsonPath().get("price"), instanceOf(Integer.class));
                MatcherAssert.assertThat(response.jsonPath().getString("price"), Number.isSafeInteger(
                  response.jsonPath().getInt("price")
                )); 
  
          }
				}
if (response.statusCode() == 404) {
					System.out.println("Description: Product not found");
				}
  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }
}
