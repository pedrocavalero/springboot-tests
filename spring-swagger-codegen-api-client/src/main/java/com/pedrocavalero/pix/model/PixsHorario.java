/*
 * pix_recebimentos
 * APis Pix Recebimentos para Clientes (regulatórias). 
 *
 * OpenAPI spec version: 1.40.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pedrocavalero.pix.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * PixsHorario
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class PixsHorario {
  @JsonProperty("solicitacao")
  private OffsetDateTime solicitacao = null;

  @JsonProperty("liquidacao")
  private OffsetDateTime liquidacao = null;

  public PixsHorario solicitacao(OffsetDateTime solicitacao) {
    this.solicitacao = solicitacao;
    return this;
  }

   /**
   * Data hora em que foi efetuada a devolução
   * @return solicitacao
  **/
  @ApiModelProperty(example = "2020-09-10T13:03:33.902Z", required = true, value = "Data hora em que foi efetuada a devolução")
  public OffsetDateTime getSolicitacao() {
    return solicitacao;
  }

  public void setSolicitacao(OffsetDateTime solicitacao) {
    this.solicitacao = solicitacao;
  }

  public PixsHorario liquidacao(OffsetDateTime liquidacao) {
    this.liquidacao = liquidacao;
    return this;
  }

   /**
   * Horário no qual a devolução foi liquidada no PSP.
   * @return liquidacao
  **/
  @ApiModelProperty(example = "2020-09-10T13:03:33.902Z", value = "Horário no qual a devolução foi liquidada no PSP.")
  public OffsetDateTime getLiquidacao() {
    return liquidacao;
  }

  public void setLiquidacao(OffsetDateTime liquidacao) {
    this.liquidacao = liquidacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PixsHorario pixsHorario = (PixsHorario) o;
    return Objects.equals(this.solicitacao, pixsHorario.solicitacao) &&
        Objects.equals(this.liquidacao, pixsHorario.liquidacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solicitacao, liquidacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PixsHorario {\n");
    
    sb.append("    solicitacao: ").append(toIndentedString(solicitacao)).append("\n");
    sb.append("    liquidacao: ").append(toIndentedString(liquidacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

