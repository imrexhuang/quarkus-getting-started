package com.hellokotlin.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

@QuarkusTest
public class KotlinGreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hellokotlin")
          .then()
             .statusCode(200)
             .body(is("Hello Kotlin"));
    }


}