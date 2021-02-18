/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
 * Identifying information for transferring money to or from an international bank account via wire transfer.
 */
@ApiModel(description = "Identifying information for transferring money to or from an international bank account via wire transfer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-18T00:06:17.510Z[GMT]")
public class NumbersInternational {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;


  public NumbersInternational accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersInternational iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the account
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "The International Bank Account Number (IBAN) for the account")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public NumbersInternational bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * The Bank Identifier Code (BIC) for the account
   * @return bic
  **/
  @ApiModelProperty(required = true, value = "The Bank Identifier Code (BIC) for the account")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersInternational numbersInternational = (NumbersInternational) o;
    return Objects.equals(this.accountId, numbersInternational.accountId) &&
        Objects.equals(this.iban, numbersInternational.iban) &&
        Objects.equals(this.bic, numbersInternational.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, iban, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersInternational {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

