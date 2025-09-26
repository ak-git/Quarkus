package com.ak.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Path("/hello")
public class GreetingResource {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Hello World! %s".formatted(ZonedDateTime.now(ZoneId.systemDefault()));
  }
}
