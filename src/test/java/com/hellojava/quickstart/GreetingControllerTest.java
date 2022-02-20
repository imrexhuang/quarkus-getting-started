package com.hellojava.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

// https://quarkus.io/guides/spring-web

@QuarkusTest
public class GreetingControllerTest {
    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/springgreeting")
          .then()
             .statusCode(200)
             .body(is("hello Spring"));
    }   
}
