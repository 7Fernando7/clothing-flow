package com.ecommerce.clothingflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClothingFlowApplication {

  public static void main(final String[] args) {
    SpringApplication.run(ClothingFlowApplication.class, args);
  }

}
