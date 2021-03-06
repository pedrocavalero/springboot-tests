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
import com.pedrocavalero.pix.model.CobrancaPatchResponseCalendario;
import com.pedrocavalero.pix.model.CobrancasDevedor;
import com.pedrocavalero.pix.model.CobrancasInfoAdicionais;
import com.pedrocavalero.pix.model.CobrancasValor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CobrancaPatchResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class CobrancaPatchResponse {
  @JsonProperty("devedor")
  private CobrancasDevedor devedor = null;

  @JsonProperty("valor")
  private CobrancasValor valor = null;

  @JsonProperty("chave")
  private String chave = null;

  @JsonProperty("txid")
  private String txid = null;

  @JsonProperty("calendario")
  private CobrancaPatchResponseCalendario calendario = null;

  @JsonProperty("infoAdicionais")
  private List<CobrancasInfoAdicionais> infoAdicionais = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("revisao")
  private BigDecimal revisao = null;

  @JsonProperty("solicitacaoPagador")
  private String solicitacaoPagador = null;

  @JsonProperty("status")
  private String status = null;

  public CobrancaPatchResponse devedor(CobrancasDevedor devedor) {
    this.devedor = devedor;
    return this;
  }

   /**
   * Get devedor
   * @return devedor
  **/
  @ApiModelProperty(value = "")
  public CobrancasDevedor getDevedor() {
    return devedor;
  }

  public void setDevedor(CobrancasDevedor devedor) {
    this.devedor = devedor;
  }

  public CobrancaPatchResponse valor(CobrancasValor valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(value = "")
  public CobrancasValor getValor() {
    return valor;
  }

  public void setValor(CobrancasValor valor) {
    this.valor = valor;
  }

  public CobrancaPatchResponse chave(String chave) {
    this.chave = chave;
    return this;
  }

   /**
   * Chave Pix do Sistema DICT - BACEN
   * @return chave
  **/
  @ApiModelProperty(example = "a1f4102e-a446-4a57-bcce-6fa48899c1d1", required = true, value = "Chave Pix do Sistema DICT - BACEN")
  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  public CobrancaPatchResponse txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * ID de identificação do documento entre os bancos e o cliente emissor.O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’
   * @return txid
  **/
  @ApiModelProperty(example = "7978c0c97ea847e78e88496344", required = true, value = "ID de identificação do documento entre os bancos e o cliente emissor.O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public CobrancaPatchResponse calendario(CobrancaPatchResponseCalendario calendario) {
    this.calendario = calendario;
    return this;
  }

   /**
   * Get calendario
   * @return calendario
  **/
  @ApiModelProperty(value = "")
  public CobrancaPatchResponseCalendario getCalendario() {
    return calendario;
  }

  public void setCalendario(CobrancaPatchResponseCalendario calendario) {
    this.calendario = calendario;
  }

  public CobrancaPatchResponse infoAdicionais(List<CobrancasInfoAdicionais> infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
    return this;
  }

  public CobrancaPatchResponse addInfoAdicionaisItem(CobrancasInfoAdicionais infoAdicionaisItem) {
    if (this.infoAdicionais == null) {
      this.infoAdicionais = new ArrayList<CobrancasInfoAdicionais>();
    }
    this.infoAdicionais.add(infoAdicionaisItem);
    return this;
  }

   /**
   * Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador
   * @return infoAdicionais
  **/
  @ApiModelProperty(value = "Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador")
  public List<CobrancasInfoAdicionais> getInfoAdicionais() {
    return infoAdicionais;
  }

  public void setInfoAdicionais(List<CobrancasInfoAdicionais> infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
  }

  public CobrancaPatchResponse location(String location) {
    this.location = location;
    return this;
  }

   /**
   * URL com a Localização do Payload informado na criação da cobrança
   * @return location
  **/
  @ApiModelProperty(example = "pix.example.com/qr/9d36b84f-c70b-478f-b95c-12729b90ca25", required = true, value = "URL com a Localização do Payload informado na criação da cobrança")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public CobrancaPatchResponse revisao(BigDecimal revisao) {
    this.revisao = revisao;
    return this;
  }

   /**
   * Quantidade de revisões da cobrança
   * @return revisao
  **/
  @ApiModelProperty(example = "4.0", required = true, value = "Quantidade de revisões da cobrança")
  public BigDecimal getRevisao() {
    return revisao;
  }

  public void setRevisao(BigDecimal revisao) {
    this.revisao = revisao;
  }

  public CobrancaPatchResponse solicitacaoPagador(String solicitacaoPagador) {
    this.solicitacaoPagador = solicitacaoPagador;
    return this;
  }

   /**
   * O campo solicitacaoPagador, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor
   * @return solicitacaoPagador
  **/
  @ApiModelProperty(example = "Texto personalizado a ser apresentado ao pagador", value = "O campo solicitacaoPagador, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor")
  public String getSolicitacaoPagador() {
    return solicitacaoPagador;
  }

  public void setSolicitacaoPagador(String solicitacaoPagador) {
    this.solicitacaoPagador = solicitacaoPagador;
  }

  public CobrancaPatchResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status da Cobrança
   * @return status
  **/
  @ApiModelProperty(example = "REMOVIDA_PELO_USUARIO_RECEBEDOR", required = true, value = "Status da Cobrança")
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
    CobrancaPatchResponse cobrancaPatchResponse = (CobrancaPatchResponse) o;
    return Objects.equals(this.devedor, cobrancaPatchResponse.devedor) &&
        Objects.equals(this.valor, cobrancaPatchResponse.valor) &&
        Objects.equals(this.chave, cobrancaPatchResponse.chave) &&
        Objects.equals(this.txid, cobrancaPatchResponse.txid) &&
        Objects.equals(this.calendario, cobrancaPatchResponse.calendario) &&
        Objects.equals(this.infoAdicionais, cobrancaPatchResponse.infoAdicionais) &&
        Objects.equals(this.location, cobrancaPatchResponse.location) &&
        Objects.equals(this.revisao, cobrancaPatchResponse.revisao) &&
        Objects.equals(this.solicitacaoPagador, cobrancaPatchResponse.solicitacaoPagador) &&
        Objects.equals(this.status, cobrancaPatchResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devedor, valor, chave, txid, calendario, infoAdicionais, location, revisao, solicitacaoPagador, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrancaPatchResponse {\n");
    
    sb.append("    devedor: ").append(toIndentedString(devedor)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    calendario: ").append(toIndentedString(calendario)).append("\n");
    sb.append("    infoAdicionais: ").append(toIndentedString(infoAdicionais)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    revisao: ").append(toIndentedString(revisao)).append("\n");
    sb.append("    solicitacaoPagador: ").append(toIndentedString(solicitacaoPagador)).append("\n");
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

