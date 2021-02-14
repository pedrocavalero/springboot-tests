/*
 * API Pix
 * A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e conciliação. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços PIX do PSP.  # Evolução da API Pix As seguintes mudanças são esperadas e consideradas retro-compatíveis (_backwards-compatibility_):  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações  Mudanças compatíveis não geram nova versão da API Pix. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  Mudanças incompatíveis geram nova versão da API Pix.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: suporte.ti@bcb.gov.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.javaparainiciantes.boot.pix.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.javaparainiciantes.boot.pix.model.CobCompleta;
import com.javaparainiciantes.boot.pix.model.ParametrosConsultaCob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CobsConsultadas
 */
@JsonPropertyOrder({
  CobsConsultadas.JSON_PROPERTY_PARAMETROS,
  CobsConsultadas.JSON_PROPERTY_COBS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class CobsConsultadas {
  public static final String JSON_PROPERTY_PARAMETROS = "parametros";
  private ParametrosConsultaCob parametros;

  public static final String JSON_PROPERTY_COBS = "cobs";
  private List<CobCompleta> cobs = new ArrayList<>();


  public CobsConsultadas parametros(ParametrosConsultaCob parametros) {
    
    this.parametros = parametros;
    return this;
  }

   /**
   * Get parametros
   * @return parametros
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETROS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ParametrosConsultaCob getParametros() {
    return parametros;
  }


  public void setParametros(ParametrosConsultaCob parametros) {
    this.parametros = parametros;
  }


  public CobsConsultadas cobs(List<CobCompleta> cobs) {
    
    this.cobs = cobs;
    return this;
  }

  public CobsConsultadas addCobsItem(CobCompleta cobsItem) {
    this.cobs.add(cobsItem);
    return this;
  }

   /**
   * Get cobs
   * @return cobs
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COBS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CobCompleta> getCobs() {
    return cobs;
  }


  public void setCobs(List<CobCompleta> cobs) {
    this.cobs = cobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobsConsultadas cobsConsultadas = (CobsConsultadas) o;
    return Objects.equals(this.parametros, cobsConsultadas.parametros) &&
        Objects.equals(this.cobs, cobsConsultadas.cobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parametros, cobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobsConsultadas {\n");
    sb.append("    parametros: ").append(toIndentedString(parametros)).append("\n");
    sb.append("    cobs: ").append(toIndentedString(cobs)).append("\n");
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
