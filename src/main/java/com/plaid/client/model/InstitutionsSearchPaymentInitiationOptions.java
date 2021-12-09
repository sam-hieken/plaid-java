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

/**
 * Additional options that will be used to filter institutions by various Payment Initiation configurations.
 */
@ApiModel(description = "Additional options that will be used to filter institutions by various Payment Initiation configurations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T23:30:31.820Z[GMT]")
public class InstitutionsSearchPaymentInitiationOptions {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;


  public InstitutionsSearchPaymentInitiationOptions paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID identifying the payment
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID identifying the payment")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionsSearchPaymentInitiationOptions institutionsSearchPaymentInitiationOptions = (InstitutionsSearchPaymentInitiationOptions) o;
    return Objects.equals(this.paymentId, institutionsSearchPaymentInitiationOptions.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionsSearchPaymentInitiationOptions {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
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

