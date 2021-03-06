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
import com.javaparainiciantes.boot.pix.model.DevolucaoHorario;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Devolucao
 */
@JsonPropertyOrder({
  Devolucao.JSON_PROPERTY_ID,
  Devolucao.JSON_PROPERTY_RTR_ID,
  Devolucao.JSON_PROPERTY_VALOR,
  Devolucao.JSON_PROPERTY_HORARIO,
  Devolucao.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class Devolucao {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RTR_ID = "rtrId";
  private String rtrId;

  public static final String JSON_PROPERTY_VALOR = "valor";
  private String valor = null;

  public static final String JSON_PROPERTY_HORARIO = "horario";
  private DevolucaoHorario horario;

  /**
   * Status da devolução.
   */
  public enum StatusEnum {
    EM_PROCESSAMENTO("EM_PROCESSAMENTO"),
    
    DEVOLVIDO("DEVOLVIDO"),
    
    NAO_REALIZADO("NAO_REALIZADO");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public Devolucao id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id gerado pelo cliente para representar unicamente uma devolução.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id gerado pelo cliente para representar unicamente uma devolução.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Devolucao rtrId(String rtrId) {
    
    this.rtrId = rtrId;
    return this;
  }

   /**
   * ReturnIdentification que transita na PACS004.
   * @return rtrId
  **/
  @ApiModelProperty(example = "D12345678202009091000abcde123456", required = true, value = "ReturnIdentification que transita na PACS004.")
  @JsonProperty(JSON_PROPERTY_RTR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRtrId() {
    return rtrId;
  }


  public void setRtrId(String rtrId) {
    this.rtrId = rtrId;
  }


  public Devolucao valor(String valor) {
    
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValor() {
    return valor;
  }


  public void setValor(String valor) {
    this.valor = valor;
  }


  public Devolucao horario(DevolucaoHorario horario) {
    
    this.horario = horario;
    return this;
  }

   /**
   * Get horario
   * @return horario
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HORARIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DevolucaoHorario getHorario() {
    return horario;
  }


  public void setHorario(DevolucaoHorario horario) {
    this.horario = horario;
  }


  public Devolucao status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status da devolução.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status da devolução.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
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
    Devolucao devolucao = (Devolucao) o;
    return Objects.equals(this.id, devolucao.id) &&
        Objects.equals(this.rtrId, devolucao.rtrId) &&
        Objects.equals(this.valor, devolucao.valor) &&
        Objects.equals(this.horario, devolucao.horario) &&
        Objects.equals(this.status, devolucao.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rtrId, valor, horario, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Devolucao {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rtrId: ").append(toIndentedString(rtrId)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
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

