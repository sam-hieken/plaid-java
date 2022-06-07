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
import com.plaid.client.model.IndividualWatchlistProgram;
import com.plaid.client.model.IndividualWatchlistProgramList;
import com.plaid.client.model.ListPagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of individual watchlist screening programs
 */
@ApiModel(description = "Paginated list of individual watchlist screening programs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class PaginatedIndividualWatchlistProgramList {
  public static final String SERIALIZED_NAME_WATCHLIST_PROGRAMS = "watchlist_programs";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_PROGRAMS)
  private List<IndividualWatchlistProgram> watchlistPrograms = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;


  public PaginatedIndividualWatchlistProgramList watchlistPrograms(List<IndividualWatchlistProgram> watchlistPrograms) {
    
    this.watchlistPrograms = watchlistPrograms;
    return this;
  }

  public PaginatedIndividualWatchlistProgramList addWatchlistProgramsItem(IndividualWatchlistProgram watchlistProgramsItem) {
    this.watchlistPrograms.add(watchlistProgramsItem);
    return this;
  }

   /**
   * List of individual watchlist screening programs
   * @return watchlistPrograms
  **/
  @ApiModelProperty(required = true, value = "List of individual watchlist screening programs")

  public List<IndividualWatchlistProgram> getWatchlistPrograms() {
    return watchlistPrograms;
  }


  public void setWatchlistPrograms(List<IndividualWatchlistProgram> watchlistPrograms) {
    this.watchlistPrograms = watchlistPrograms;
  }


  public PaginatedIndividualWatchlistProgramList nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * An identifier that determines which page of results you receive.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJkaXJlY3Rpb24iOiJuZXh0Iiwib2Zmc2V0IjoiMTU5NDM", required = true, value = "An identifier that determines which page of results you receive.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedIndividualWatchlistProgramList paginatedIndividualWatchlistProgramList = (PaginatedIndividualWatchlistProgramList) o;
    return Objects.equals(this.watchlistPrograms, paginatedIndividualWatchlistProgramList.watchlistPrograms) &&
        Objects.equals(this.nextCursor, paginatedIndividualWatchlistProgramList.nextCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistPrograms, nextCursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedIndividualWatchlistProgramList {\n");
    sb.append("    watchlistPrograms: ").append(toIndentedString(watchlistPrograms)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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
