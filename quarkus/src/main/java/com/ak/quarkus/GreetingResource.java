package com.ak.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Path("/hello")
public class GreetingResource {
  private static final Logger LOGGER = Logger.getLogger(GreetingResource.class);

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    String message = "Hello World! %s".formatted(ZonedDateTime.now(ZoneId.systemDefault()));
    LOGGER.debug(message);
    return message;
  }
}
