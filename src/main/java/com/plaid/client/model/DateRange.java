/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A date range with a start and end date
 */
@ApiModel(description = "A date range with a start and end date")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class DateRange {
  public static final String SERIALIZED_NAME_BEGINNING = "beginning";
  @SerializedName(SERIALIZED_NAME_BEGINNING)
  private java.util.Date beginning;

  public static final String SERIALIZED_NAME_ENDING = "ending";
  @SerializedName(SERIALIZED_NAME_ENDING)
  private java.util.Date ending;


  public DateRange beginning(java.util.Date beginning) {
    
    this.beginning = beginning;
    return this;
  }

   /**
   * Get beginning
   * @return beginning
  **/
  @ApiModelProperty(required = true, value = "")

  public java.util.Date getBeginning() {
    return beginning;
  }


  public void setBeginning(java.util.Date beginning) {
    this.beginning = beginning;
  }


  public DateRange ending(java.util.Date ending) {
    
    this.ending = ending;
    return this;
  }

   /**
   * Get ending
   * @return ending
  **/
  @ApiModelProperty(required = true, value = "")

  public java.util.Date getEnding() {
    return ending;
  }


  public void setEnding(java.util.Date ending) {
    this.ending = ending;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateRange dateRange = (DateRange) o;
    return Objects.equals(this.beginning, dateRange.beginning) &&
        Objects.equals(this.ending, dateRange.ending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginning, ending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateRange {\n");
    sb.append("    beginning: ").append(toIndentedString(beginning)).append("\n");
    sb.append("    ending: ").append(toIndentedString(ending)).append("\n");
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

