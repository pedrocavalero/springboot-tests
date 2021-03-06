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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Atributos comuns a todas entidades de Cobrança
 */
@ApiModel(description = "Atributos comuns a todas entidades de Cobrança")
@JsonPropertyOrder({
  CobBase.JSON_PROPERTY_DEVEDOR,
  CobBase.JSON_PROPERTY_VALOR,
  CobBase.JSON_PROPERTY_CHAVE,
  CobBase.JSON_PROPERTY_SOLICITACAO_PAGADOR,
  CobBase.JSON_PROPERTY_INFO_ADICIONAIS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
public class CobBase {
  public static final String JSON_PROPERTY_DEVEDOR = "devedor";
  private Pessoa devedor = null;

  public static final String JSON_PROPERTY_VALOR = "valor";
  private CobBaseValor valor;

  public static final String JSON_PROPERTY_CHAVE = "chave";
  private String chave;

  public static final String JSON_PROPERTY_SOLICITACAO_PAGADOR = "solicitacaoPagador";
  private String solicitacaoPagador;

  public static final String JSON_PROPERTY_INFO_ADICIONAIS = "infoAdicionais";
  private List<CobBaseInfoAdicionais> infoAdicionais = null;


  public CobBase devedor(Pessoa devedor) {
    
    this.devedor = devedor;
    return this;
  }

   /**
   * Os campos aninhados sob o objeto devedor são opcionais e identificam o devedor, ou seja, a pessoa ou a instituição a quem a cobrança está endereçada. Não identifica, necessariamente, quem irá efetivamente realizar o pagamento. Um CPF pode ser o devedor de uma cobrança, mas pode acontecer de outro CPF realizar, efetivamente, o pagamento do documento. Não é permitido que o campo pagador.cpf e campo pagador.cnpj estejam preenchidos ao mesmo tempo. Se o campo pagador.cnpj está preenchido, então o campo pagador.cpf não pode estar preenchido, e vice-versa. Se o campo pagador.nome está preenchido, então deve existir ou um pagador.cpf ou um campo pagador.cnpj preenchido.
   * @return devedor
  **/
  @Nullable
  @ApiModelProperty(value = "Os campos aninhados sob o objeto devedor são opcionais e identificam o devedor, ou seja, a pessoa ou a instituição a quem a cobrança está endereçada. Não identifica, necessariamente, quem irá efetivamente realizar o pagamento. Um CPF pode ser o devedor de uma cobrança, mas pode acontecer de outro CPF realizar, efetivamente, o pagamento do documento. Não é permitido que o campo pagador.cpf e campo pagador.cnpj estejam preenchidos ao mesmo tempo. Se o campo pagador.cnpj está preenchido, então o campo pagador.cpf não pode estar preenchido, e vice-versa. Se o campo pagador.nome está preenchido, então deve existir ou um pagador.cpf ou um campo pagador.cnpj preenchido.")
  @JsonProperty(JSON_PROPERTY_DEVEDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pessoa getDevedor() {
    return devedor;
  }


  public void setDevedor(Pessoa devedor) {
    this.devedor = devedor;
  }


  public CobBase valor(CobBaseValor valor) {
    
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CobBaseValor getValor() {
    return valor;
  }


  public void setValor(CobBaseValor valor) {
    this.valor = valor;
  }


  public CobBase chave(String chave) {
    
    this.chave = chave;
    return this;
  }

   /**
   * O campo chave, obrigatório, determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança.
   * @return chave
  **/
  @Nullable
  @ApiModelProperty(value = "O campo chave, obrigatório, determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança.")
  @JsonProperty(JSON_PROPERTY_CHAVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChave() {
    return chave;
  }


  public void setChave(String chave) {
    this.chave = chave;
  }


  public CobBase solicitacaoPagador(String solicitacaoPagador) {
    
    this.solicitacaoPagador = solicitacaoPagador;
    return this;
  }

   /**
   * O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation &lt;RmtInf&gt;. O tamanho do campo &lt;RmtInf&gt; na pacs.008 está limitado a 140 caracteres.
   * @return solicitacaoPagador
  **/
  @Nullable
  @ApiModelProperty(value = "O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation <RmtInf>. O tamanho do campo <RmtInf> na pacs.008 está limitado a 140 caracteres.")
  @JsonProperty(JSON_PROPERTY_SOLICITACAO_PAGADOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSolicitacaoPagador() {
    return solicitacaoPagador;
  }


  public void setSolicitacaoPagador(String solicitacaoPagador) {
    this.solicitacaoPagador = solicitacaoPagador;
  }


  public CobBase infoAdicionais(List<CobBaseInfoAdicionais> infoAdicionais) {
    
    this.infoAdicionais = infoAdicionais;
    return this;
  }

  public CobBase addInfoAdicionaisItem(CobBaseInfoAdicionais infoAdicionaisItem) {
    if (this.infoAdicionais == null) {
      this.infoAdicionais = new ArrayList<>();
    }
    this.infoAdicionais.add(infoAdicionaisItem);
    return this;
  }

   /**
   * Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador.
   * maximum: 50
   * @return infoAdicionais
  **/
  @Nullable
  @ApiModelProperty(value = "Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador.")
  @JsonProperty(JSON_PROPERTY_INFO_ADICIONAIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CobBaseInfoAdicionais> getInfoAdicionais() {
    return infoAdicionais;
  }


  public void setInfoAdicionais(List<CobBaseInfoAdicionais> infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobBase cobBase = (CobBase) o;
    return Objects.equals(this.devedor, cobBase.devedor) &&
        Objects.equals(this.valor, cobBase.valor) &&
        Objects.equals(this.chave, cobBase.chave) &&
        Objects.equals(this.solicitacaoPagador, cobBase.solicitacaoPagador) &&
        Objects.equals(this.infoAdicionais, cobBase.infoAdicionais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devedor, valor, chave, solicitacaoPagador, infoAdicionais);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobBase {\n");
    sb.append("    devedor: ").append(toIndentedString(devedor)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    solicitacaoPagador: ").append(toIndentedString(solicitacaoPagador)).append("\n");
    sb.append("    infoAdicionais: ").append(toIndentedString(infoAdicionais)).append("\n");
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

