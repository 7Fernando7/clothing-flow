package com.ecommerce.clothingflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerce.clothingflow.dto.ClothingDTO;

@FeignClient(name = "clothingClient", url = "${clothingRepo.url}")
public interface ClothingClient {

  @GetMapping(path = "/{id}")
  ClothingDTO getClothing(@PathVariable("id") int id);

  @PostMapping
  ClothingDTO registerProducts(ClothingDTO clothingDTO);
}
