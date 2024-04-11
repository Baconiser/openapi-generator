/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EnumArrays
 */
@JsonPropertyOrder({
  EnumArrays.JSON_PROPERTY_JUST_SYMBOL,
  EnumArrays.JSON_PROPERTY_ARRAY_ENUM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class EnumArrays {
  /**
   * Gets or Sets justSymbol
   */
  public enum JustSymbolEnum {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private String value;

    JustSymbolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static JustSymbolEnum fromValue(String value) {
      for (JustSymbolEnum b : JustSymbolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_JUST_SYMBOL = "just_symbol";
  private JustSymbolEnum justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  public enum ArrayEnumEnum {
    FISH("fish"),
    
    CRAB("crab");

    private String value;

    ArrayEnumEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrayEnumEnum fromValue(String value) {
      for (ArrayEnumEnum b : ArrayEnumEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ARRAY_ENUM = "array_enum";
  private List<ArrayEnumEnum> arrayEnum = new ArrayList<>();

  public EnumArrays() {
  }

  public EnumArrays justSymbol(JustSymbolEnum justSymbol) {
    
    this.justSymbol = justSymbol;
    return this;
  }

   /**
   * Get justSymbol
   * @return justSymbol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JUST_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JustSymbolEnum getJustSymbol() {
    return justSymbol;
  }


  @JsonProperty(JSON_PROPERTY_JUST_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJustSymbol(JustSymbolEnum justSymbol) {
    this.justSymbol = justSymbol;
  }


  public EnumArrays arrayEnum(List<ArrayEnumEnum> arrayEnum) {
    
    this.arrayEnum = arrayEnum;
    return this;
  }

  public EnumArrays addArrayEnumItem(ArrayEnumEnum arrayEnumItem) {
    if (this.arrayEnum == null) {
      this.arrayEnum = new ArrayList<>();
    }
    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

   /**
   * Get arrayEnum
   * @return arrayEnum
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRAY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArrayEnumEnum> getArrayEnum() {
    return arrayEnum;
  }


  @JsonProperty(JSON_PROPERTY_ARRAY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayEnum(List<ArrayEnumEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumArrays enumArrays = (EnumArrays) o;
    return Objects.equals(this.justSymbol, enumArrays.justSymbol) &&
        Objects.equals(this.arrayEnum, enumArrays.arrayEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justSymbol, arrayEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumArrays {\n");
    sb.append("    justSymbol: ").append(toIndentedString(justSymbol)).append("\n");
    sb.append("    arrayEnum: ").append(toIndentedString(arrayEnum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

