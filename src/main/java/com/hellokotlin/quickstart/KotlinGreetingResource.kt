package com.hellokotlin.quickstart

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

// 參考 https://quarkus.io/guides/kotlin
// 執行 http://localhost:8080/hellokotlin
@Path("/hellokotlin")
class KotlinGreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hellokotlin() = "Hello Kotlin"
    
}