package com.ecommerce.clothingflow.service;

import com.ecommerce.clothingflow.dto.ClothingDTO;

public interface ClothingService {

  ClothingDTO findById(int id);

  ClothingDTO registerProducts(ClothingDTO clothing);

}
