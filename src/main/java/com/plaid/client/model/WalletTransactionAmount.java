/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.58.1
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
import java.math.BigDecimal;

/**
 * The amount and currency of a transaction
 */
@ApiModel(description = "The amount and currency of a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T23:30:31.820Z[GMT]")
public class WalletTransactionAmount {
  /**
   * The ISO-4217 currency code of the transaction. Currently, only &#x60;\&quot;GBP\&quot;&#x60; is supported.
   */
  @JsonAdapter(IsoCurrencyCodeEnum.Adapter.class)
  public enum IsoCurrencyCodeEnum {
    GBP("GBP");

    private String value;

    IsoCurrencyCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsoCurrencyCodeEnum fromValue(String value) {
      for (IsoCurrencyCodeEnum b : IsoCurrencyCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsoCurrencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsoCurrencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsoCurrencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsoCurrencyCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private IsoCurrencyCodeEnum isoCurrencyCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public WalletTransactionAmount isoCurrencyCode(IsoCurrencyCodeEnum isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Currently, only &#x60;\&quot;GBP\&quot;&#x60; is supported.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction. Currently, only `\"GBP\"` is supported.")

  public IsoCurrencyCodeEnum getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(IsoCurrencyCodeEnum isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public WalletTransactionAmount value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount of the transaction. Must contain at most two digits of precision e.g. &#x60;1.23&#x60;.
   * minimum: 1
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The amount of the transaction. Must contain at most two digits of precision e.g. `1.23`.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionAmount walletTransactionAmount = (WalletTransactionAmount) o;
    return Objects.equals(this.isoCurrencyCode, walletTransactionAmount.isoCurrencyCode) &&
        Objects.equals(this.value, walletTransactionAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCurrencyCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionAmount {\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

