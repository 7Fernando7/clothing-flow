package com.ecommerce.clothingflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.clothingflow.dto.ClothingDTO;
import com.ecommerce.clothingflow.service.ClothingClient;
import com.ecommerce.clothingflow.service.ClothingService;

@Service
public class ClothingServiceImpl implements ClothingService {

  @Autowired
  ClothingClient clothingClient;

  @Override
  public ClothingDTO findById(final int id) {

    final ClothingDTO clothingDTO = clothingClient.getClothing(id);

    return clothingDTO;
  }

  @Override
  public ClothingDTO registerProducts(final ClothingDTO clothingDTO) {

    final ClothingDTO clothing = clothingClient.registerProducts(clothingDTO);

    return clothing;
  }

  @Override
  public ClothingDTO updateClothing(final ClothingDTO clothingDTO) {

    final ClothingDTO clothing = clothingClient.updateClothing(clothingDTO);

    return clothing;
  }

  @Override
  public ClothingDTO deleteClothing(final ClothingDTO clothingDeleteDTO) {

    final ClothingDTO clothing = clothingClient.deleteClothing(clothingDeleteDTO);

    return null;
  }

}
