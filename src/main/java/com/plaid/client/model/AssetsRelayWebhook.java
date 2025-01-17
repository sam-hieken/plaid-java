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
import com.plaid.client.model.RelayEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when the Secondary Client successfully retrieves an Asset Report by calling &#x60;asset_report/relay/get&#x60;.
 */
@ApiModel(description = "Fired when the Secondary Client successfully retrieves an Asset Report by calling `asset_report/relay/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class AssetsRelayWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_RELAY_EVENT = "relay_event";
  @SerializedName(SERIALIZED_NAME_RELAY_EVENT)
  private RelayEvent relayEvent;

  public static final String SERIALIZED_NAME_SECONDARY_CLIENT_ID = "secondary_client_id";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CLIENT_ID)
  private String secondaryClientId;

  public static final String SERIALIZED_NAME_ASSET_RELAY_TOKEN = "asset_relay_token";
  @SerializedName(SERIALIZED_NAME_ASSET_RELAY_TOKEN)
  private String assetRelayToken;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;


  public AssetsRelayWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ASSETS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`ASSETS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public AssetsRelayWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;RELAY_EVENT&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`RELAY_EVENT`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public AssetsRelayWebhook relayEvent(RelayEvent relayEvent) {
    
    this.relayEvent = relayEvent;
    return this;
  }

   /**
   * Get relayEvent
   * @return relayEvent
  **/
  @ApiModelProperty(required = true, value = "")

  public RelayEvent getRelayEvent() {
    return relayEvent;
  }


  public void setRelayEvent(RelayEvent relayEvent) {
    this.relayEvent = relayEvent;
  }


  public AssetsRelayWebhook secondaryClientId(String secondaryClientId) {
    
    this.secondaryClientId = secondaryClientId;
    return this;
  }

   /**
   * The id of the client with whom the Asset Report is being shared.
   * @return secondaryClientId
  **/
  @ApiModelProperty(required = true, value = "The id of the client with whom the Asset Report is being shared.")

  public String getSecondaryClientId() {
    return secondaryClientId;
  }


  public void setSecondaryClientId(String secondaryClientId) {
    this.secondaryClientId = secondaryClientId;
  }


  public AssetsRelayWebhook assetRelayToken(String assetRelayToken) {
    
    this.assetRelayToken = assetRelayToken;
    return this;
  }

   /**
   * The &#x60;asset_relay_token&#x60; that was created by calling &#x60;/asset_report/relay/create.
   * @return assetRelayToken
  **/
  @ApiModelProperty(required = true, value = "The `asset_relay_token` that was created by calling `/asset_report/relay/create.")

  public String getAssetRelayToken() {
    return assetRelayToken;
  }


  public void setAssetRelayToken(String assetRelayToken) {
    this.assetRelayToken = assetRelayToken;
  }


  public AssetsRelayWebhook assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The &#x60;asset_report_id&#x60; that can be provided to &#x60;/asset_report/relay/get&#x60; to retrieve the Asset Report.
   * @return assetReportId
  **/
  @ApiModelProperty(required = true, value = "The `asset_report_id` that can be provided to `/asset_report/relay/get` to retrieve the Asset Report.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsRelayWebhook assetsRelayWebhook = (AssetsRelayWebhook) o;
    return Objects.equals(this.webhookType, assetsRelayWebhook.webhookType) &&
        Objects.equals(this.webhookCode, assetsRelayWebhook.webhookCode) &&
        Objects.equals(this.relayEvent, assetsRelayWebhook.relayEvent) &&
        Objects.equals(this.secondaryClientId, assetsRelayWebhook.secondaryClientId) &&
        Objects.equals(this.assetRelayToken, assetsRelayWebhook.assetRelayToken) &&
        Objects.equals(this.assetReportId, assetsRelayWebhook.assetReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, relayEvent, secondaryClientId, assetRelayToken, assetReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsRelayWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    relayEvent: ").append(toIndentedString(relayEvent)).append("\n");
    sb.append("    secondaryClientId: ").append(toIndentedString(secondaryClientId)).append("\n");
    sb.append("    assetRelayToken: ").append(toIndentedString(assetRelayToken)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
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

