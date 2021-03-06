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
 * Os campos aninhados sob o identificador calendário
 */
@ApiModel(description = "Os campos aninhados sob o identificador calendário")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class CobrancaPatchResponseCalendario {
  @JsonProperty("expiracao")
  private Integer expiracao = null;

  @JsonProperty("criacao")
  private OffsetDateTime criacao = null;

  public CobrancaPatchResponseCalendario expiracao(Integer expiracao) {
    this.expiracao = expiracao;
    return this;
  }

   /**
   * Tempo de vida da cobrança, especificado em segundos
   * @return expiracao
  **/
  @ApiModelProperty(example = "3600", value = "Tempo de vida da cobrança, especificado em segundos")
  public Integer getExpiracao() {
    return expiracao;
  }

  public void setExpiracao(Integer expiracao) {
    this.expiracao = expiracao;
  }

  public CobrancaPatchResponseCalendario criacao(OffsetDateTime criacao) {
    this.criacao = criacao;
    return this;
  }

   /**
   * Data e Hora de criação da cobrança
   * @return criacao
  **/
  @ApiModelProperty(example = "2020-09-09T20:15:00.358Z", required = true, value = "Data e Hora de criação da cobrança")
  public OffsetDateTime getCriacao() {
    return criacao;
  }

  public void setCriacao(OffsetDateTime criacao) {
    this.criacao = criacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobrancaPatchResponseCalendario cobrancaPatchResponseCalendario = (CobrancaPatchResponseCalendario) o;
    return Objects.equals(this.expiracao, cobrancaPatchResponseCalendario.expiracao) &&
        Objects.equals(this.criacao, cobrancaPatchResponseCalendario.criacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiracao, criacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrancaPatchResponseCalendario {\n");
    
    sb.append("    expiracao: ").append(toIndentedString(expiracao)).append("\n");
    sb.append("    criacao: ").append(toIndentedString(criacao)).append("\n");
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

