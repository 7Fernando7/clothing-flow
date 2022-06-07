package com.ecommerce.clothingflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.clothingflow.dto.ClothingDTO;
import com.ecommerce.clothingflow.service.ClothingService;

@RestController
@RequestMapping(value = "/clothing-flow")
public class ClothingFlowController {

  @Autowired
  private ClothingService clothingService;

  @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public ResponseEntity<ClothingDTO> getClothing(@PathVariable final int id) {

    final ClothingDTO clothingOptionalDTO = clothingService.findById(id);

    return new ResponseEntity<ClothingDTO>(clothingOptionalDTO, HttpStatus.OK);
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<ClothingDTO> insertClothing(@RequestBody final ClothingDTO clothing) {

    final ClothingDTO clothingOptionalDTO = clothingService.registerProducts(clothing);

    return new ResponseEntity<ClothingDTO>(clothingOptionalDTO, HttpStatus.CREATED);
  }

}
