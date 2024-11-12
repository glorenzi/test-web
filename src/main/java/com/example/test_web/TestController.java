package com.example.test_web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  private static final Logger logger = LoggerFactory.getLogger(TestController.class);

  @GetMapping("/test")
  public String testEndpoint() {
    logger.info("Endpoint /test chiamato");
    return "Endpoint di test chiamato";
  }
}