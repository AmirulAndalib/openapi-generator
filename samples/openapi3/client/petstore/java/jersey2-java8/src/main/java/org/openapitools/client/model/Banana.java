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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * Banana
 */
@JsonPropertyOrder({
  Banana.JSON_PROPERTY_LENGTH_CM
})
@JsonTypeName("banana")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class Banana {
  public static final String JSON_PROPERTY_LENGTH_CM = "lengthCm";
  private BigDecimal lengthCm;

  public Banana() { 
  }

  public Banana lengthCm(BigDecimal lengthCm) {
    this.lengthCm = lengthCm;
    return this;
  }

  /**
   * Get lengthCm
   * @return lengthCm
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH_CM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLengthCm() {
    return lengthCm;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH_CM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLengthCm(BigDecimal lengthCm) {
    this.lengthCm = lengthCm;
  }


  /**
   * Return true if this banana object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banana banana = (Banana) o;
    return Objects.equals(this.lengthCm, banana.lengthCm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lengthCm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banana {\n");
    sb.append("    lengthCm: ").append(toIndentedString(lengthCm)).append("\n");
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

