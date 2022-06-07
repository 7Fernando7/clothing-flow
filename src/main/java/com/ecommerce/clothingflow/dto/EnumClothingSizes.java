package com.ecommerce.clothingflow.dto;

public enum EnumClothingSizes {

    XXS("1", "XXS"), XS("2", "XS"), S("3", "S"), M("4", "M"), X("5", "X"), XL("6", "XL"),
    XXL("5", "XXL");

  private String code;

  private String description;

  EnumClothingSizes(final String code, final String description) {

    this.code = code;
    this.description = description;
  }

  public String getCode() {

    return code;
  }

  public String getDescription() {

    return description;
  }

  public static EnumClothingSizes getStateByCode(final String idCode) {

    if (idCode != null) {
      for (final EnumClothingSizes statesEnum : EnumClothingSizes.values()) {
        if (statesEnum.code.equals(idCode)) {
          return statesEnum;
        }
      }
    }
    return null;
  }

  public static EnumClothingSizes getStateByDescription(final String description) {

    if (description != null) {
      for (final EnumClothingSizes statesEnum : EnumClothingSizes.values()) {
        if (statesEnum.description.equals(description)) {
          return statesEnum;
        }
      }
    }
    return null;
  }
}
