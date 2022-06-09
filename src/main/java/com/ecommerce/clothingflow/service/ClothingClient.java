package com.ecommerce.clothingflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ecommerce.clothingflow.dto.ClothingDTO;

@FeignClient(name = "clothingClient", url = "${clothingRepo.url}")
public interface ClothingClient {

  @GetMapping(path = "/{id}")
  ClothingDTO getClothing(@PathVariable("id") int id);

  @PostMapping
  ClothingDTO registerProducts(ClothingDTO clothingDTO);

  @PutMapping
  ClothingDTO updateClothing(ClothingDTO clothingDTO);

  @DeleteMapping(path = "/{id}")
  ClothingDTO deleteClothing(@PathVariable("id") ClothingDTO clothingDeleteDTO);
}
