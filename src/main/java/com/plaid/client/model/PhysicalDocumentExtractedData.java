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
import com.plaid.client.model.PhysicalDocumentCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data extracted from a user-submitted document.
 */
@ApiModel(description = "Data extracted from a user-submitted document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class PhysicalDocumentExtractedData {
  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private PhysicalDocumentCategory category;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private java.util.Date expirationDate;

  public static final String SERIALIZED_NAME_ISSUING_COUNTRY = "issuing_country";
  @SerializedName(SERIALIZED_NAME_ISSUING_COUNTRY)
  private String issuingCountry;


  public PhysicalDocumentExtractedData idNumber(String idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Alpha-numeric ID number extracted via OCR from the user&#39;s document image.
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AB123456", required = true, value = "Alpha-numeric ID number extracted via OCR from the user's document image.")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public PhysicalDocumentExtractedData category(PhysicalDocumentCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")

  public PhysicalDocumentCategory getCategory() {
    return category;
  }


  public void setCategory(PhysicalDocumentCategory category) {
    this.category = category;
  }


  public PhysicalDocumentExtractedData expirationDate(java.util.Date expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public java.util.Date getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(java.util.Date expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PhysicalDocumentExtractedData issuingCountry(String issuingCountry) {
    
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return issuingCountry
  **/
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getIssuingCountry() {
    return issuingCountry;
  }


  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalDocumentExtractedData physicalDocumentExtractedData = (PhysicalDocumentExtractedData) o;
    return Objects.equals(this.idNumber, physicalDocumentExtractedData.idNumber) &&
        Objects.equals(this.category, physicalDocumentExtractedData.category) &&
        Objects.equals(this.expirationDate, physicalDocumentExtractedData.expirationDate) &&
        Objects.equals(this.issuingCountry, physicalDocumentExtractedData.issuingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, category, expirationDate, issuingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalDocumentExtractedData {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
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

