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
import com.pedrocavalero.pix.model.PixsHorario;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DevolucaoPix
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class DevolucaoPix {
  @JsonProperty("horario")
  private PixsHorario horario = null;

  @JsonProperty("rtrId")
  private String rtrId = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  public DevolucaoPix horario(PixsHorario horario) {
    this.horario = horario;
    return this;
  }

   /**
   * Get horario
   * @return horario
  **/
  @ApiModelProperty(required = true, value = "")
  public PixsHorario getHorario() {
    return horario;
  }

  public void setHorario(PixsHorario horario) {
    this.horario = horario;
  }

  public DevolucaoPix rtrId(String rtrId) {
    this.rtrId = rtrId;
    return this;
  }

   /**
   * ReturnIdentification
   * @return rtrId
  **/
  @ApiModelProperty(example = "D12345678202009091000abcde123456", required = true, value = "ReturnIdentification")
  public String getRtrId() {
    return rtrId;
  }

  public void setRtrId(String rtrId) {
    this.rtrId = rtrId;
  }

  public DevolucaoPix valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor da devolução
   * @return valor
  **/
  @ApiModelProperty(example = "11.00", required = true, value = "Valor da devolução")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public DevolucaoPix id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id da devolução
   * @return id
  **/
  @ApiModelProperty(example = "208ab4b5-8be8-4186-927b-15ed2a4fbff9", required = true, value = "Id da devolução")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DevolucaoPix status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status da Devolução. Pode ser: EM_PROCESSAMENTO, DEVOLVIDO ou NAO_REALIZADO
   * @return status
  **/
  @ApiModelProperty(example = "EM_PROCESSAMENTO", required = true, value = "Status da Devolução. Pode ser: EM_PROCESSAMENTO, DEVOLVIDO ou NAO_REALIZADO")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevolucaoPix devolucaoPix = (DevolucaoPix) o;
    return Objects.equals(this.horario, devolucaoPix.horario) &&
        Objects.equals(this.rtrId, devolucaoPix.rtrId) &&
        Objects.equals(this.valor, devolucaoPix.valor) &&
        Objects.equals(this.id, devolucaoPix.id) &&
        Objects.equals(this.status, devolucaoPix.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horario, rtrId, valor, id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevolucaoPix {\n");
    
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
    sb.append("    rtrId: ").append(toIndentedString(rtrId)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
