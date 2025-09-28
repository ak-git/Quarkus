package com.ak.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Path("/hello")
public final class GreetingResource {
  private final Logger logger;

  @Inject
  public GreetingResource(Logger logger) {
    this.logger = logger;
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    String message = "Hello World! %s".formatted(ZonedDateTime.now(ZoneId.systemDefault()));
    logger.debug(message);
    return message;
  }
}
