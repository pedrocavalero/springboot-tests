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

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

/**
 * CobPayloadAllOf
 */
@JsonPropertyOrder({
  CobPayloadAllOf.JSON_PROPERTY_TXID,
  CobPayloadAllOf.JSON_PROPERTY_REVISAO,
  CobPayloadAllOf.JSON_PROPERTY_CALENDARIO,
  CobPayloadAllOf.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class CobPayloadAllOf {
  public static final String JSON_PROPERTY_TXID = "txid";
  private String txid;

  public static final String JSON_PROPERTY_REVISAO = "revisao";
  private Integer revisao;

  public static final String JSON_PROPERTY_CALENDARIO = "calendario";
  private CobCriacao calendario = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CobStatus status;


  public CobPayloadAllOf txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * # Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como &#x60;TransactionIdentification &lt;txId&gt;&#x60; ou &#x60;idConciliacaoRecebedor&#x60;. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. 
   * @return txid
  **/
  @Nullable
  @ApiModelProperty(value = "# Identificador da transação  O campo txid, obrigatório, determina o identificador da transação. O objetivo desse campo é ser um elemento que possibilite ao PSP do recebedor apresentar ao usuário recebedor a funcionalidade de conciliação de pagamentos.  Na pacs.008, é referenciado como `TransactionIdentification <txId>` ou `idConciliacaoRecebedor`. O preenchimento do campo txid é limitado a 35 caracteres na pacs.008.  Em termos de fluxo de funcionamento, o txid é lido pelo aplicativo do PSP do pagador e,  depois de confirmado o pagamento, é enviado para o SPI via pacs.008.  Uma pacs.008 também é enviada ao PSP do recebedor, contendo, além de todas as informações usuais  do pagamento, o txid. Ao perceber um recebimento dotado de txid, o PSP do recebedor está apto a se comunicar com o usuário recebedor,  informando que um pagamento específico foi liquidado.  O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. O txid, no contexto de representação de uma cobrança, é único por CPF/CNPJ do usuário recebedor. Cabe ao  PSP recebedor validar essa regra na API PIX. ")
  @JsonProperty(JSON_PROPERTY_TXID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public CobPayloadAllOf revisao(Integer revisao) {
    
    this.revisao = revisao;
    return this;
  }

   /**
   * Revisão da cobrança. Sempre começa em zero. Sempre varia em acréscimos de 1.
   * @return revisao
  **/
  @Nullable
  @ApiModelProperty(value = "Revisão da cobrança. Sempre começa em zero. Sempre varia em acréscimos de 1.")
  @JsonProperty(JSON_PROPERTY_REVISAO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRevisao() {
    return revisao;
  }


  public void setRevisao(Integer revisao) {
    this.revisao = revisao;
  }


  public CobPayloadAllOf calendario(CobCriacao calendario) {
    
    this.calendario = calendario;
    return this;
  }

   /**
   * Os campos aninhados sob o identificador calendário organizam informações a respeito de controle de tempo da cobrança.
   * @return calendario
  **/
  @Nullable
  @ApiModelProperty(value = "Os campos aninhados sob o identificador calendário organizam informações a respeito de controle de tempo da cobrança.")
  @JsonProperty(JSON_PROPERTY_CALENDARIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobCriacao getCalendario() {
    return calendario;
  }


  public void setCalendario(CobCriacao calendario) {
    this.calendario = calendario;
  }


  public CobPayloadAllOf status(CobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobStatus getStatus() {
    return status;
  }


  public void setStatus(CobStatus status) {
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
    CobPayloadAllOf cobPayloadAllOf = (CobPayloadAllOf) o;
    return Objects.equals(this.txid, cobPayloadAllOf.txid) &&
        Objects.equals(this.revisao, cobPayloadAllOf.revisao) &&
        Objects.equals(this.calendario, cobPayloadAllOf.calendario) &&
        Objects.equals(this.status, cobPayloadAllOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txid, revisao, calendario, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobPayloadAllOf {\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    revisao: ").append(toIndentedString(revisao)).append("\n");
    sb.append("    calendario: ").append(toIndentedString(calendario)).append("\n");
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

