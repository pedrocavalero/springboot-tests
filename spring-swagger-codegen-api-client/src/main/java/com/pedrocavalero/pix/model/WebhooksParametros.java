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
import com.pedrocavalero.pix.model.WebhooksParametrosPaginacao;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WebhooksParametros
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class WebhooksParametros {
  @JsonProperty("paginacao")
  private WebhooksParametrosPaginacao paginacao = null;

  @JsonProperty("inicio")
  private String inicio = null;

  @JsonProperty("fim")
  private String fim = null;

  public WebhooksParametros paginacao(WebhooksParametrosPaginacao paginacao) {
    this.paginacao = paginacao;
    return this;
  }

   /**
   * Get paginacao
   * @return paginacao
  **/
  @ApiModelProperty(required = true, value = "")
  public WebhooksParametrosPaginacao getPaginacao() {
    return paginacao;
  }

  public void setPaginacao(WebhooksParametrosPaginacao paginacao) {
    this.paginacao = paginacao;
  }

  public WebhooksParametros inicio(String inicio) {
    this.inicio = inicio;
    return this;
  }

   /**
   * Data início da criação do webhook, no formato de acordo com RFC 3339
   * @return inicio
  **/
  @ApiModelProperty(value = "Data início da criação do webhook, no formato de acordo com RFC 3339")
  public String getInicio() {
    return inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public WebhooksParametros fim(String fim) {
    this.fim = fim;
    return this;
  }

   /**
   * Data fim da criação do webhook, em formato de acordo com RFC 3339.
   * @return fim
  **/
  @ApiModelProperty(value = "Data fim da criação do webhook, em formato de acordo com RFC 3339.")
  public String getFim() {
    return fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksParametros webhooksParametros = (WebhooksParametros) o;
    return Objects.equals(this.paginacao, webhooksParametros.paginacao) &&
        Objects.equals(this.inicio, webhooksParametros.inicio) &&
        Objects.equals(this.fim, webhooksParametros.fim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginacao, inicio, fim);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksParametros {\n");
    
    sb.append("    paginacao: ").append(toIndentedString(paginacao)).append("\n");
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
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

