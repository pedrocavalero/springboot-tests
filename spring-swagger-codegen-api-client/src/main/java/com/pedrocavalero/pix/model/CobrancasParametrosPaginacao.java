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
import java.math.BigDecimal;

/**
 * CobrancasParametrosPaginacao
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
public class CobrancasParametrosPaginacao {
  @JsonProperty("paginaAtual")
  private BigDecimal paginaAtual = null;

  @JsonProperty("quantidadeTotalDeItens")
  private BigDecimal quantidadeTotalDeItens = null;

  @JsonProperty("itensPorPagina")
  private BigDecimal itensPorPagina = null;

  @JsonProperty("quantidadeDePaginas")
  private BigDecimal quantidadeDePaginas = null;

  public CobrancasParametrosPaginacao paginaAtual(BigDecimal paginaAtual) {
    this.paginaAtual = paginaAtual;
    return this;
  }

   /**
   * Numero da Página que deseja realizar o acesso, valor considerado por default 0
   * @return paginaAtual
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "Numero da Página que deseja realizar o acesso, valor considerado por default 0")
  public BigDecimal getPaginaAtual() {
    return paginaAtual;
  }

  public void setPaginaAtual(BigDecimal paginaAtual) {
    this.paginaAtual = paginaAtual;
  }

  public CobrancasParametrosPaginacao quantidadeTotalDeItens(BigDecimal quantidadeTotalDeItens) {
    this.quantidadeTotalDeItens = quantidadeTotalDeItens;
    return this;
  }

   /**
   * Quantidade total de itens disponíveis de acordo com os parâmetros informados.
   * @return quantidadeTotalDeItens
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "Quantidade total de itens disponíveis de acordo com os parâmetros informados.")
  public BigDecimal getQuantidadeTotalDeItens() {
    return quantidadeTotalDeItens;
  }

  public void setQuantidadeTotalDeItens(BigDecimal quantidadeTotalDeItens) {
    this.quantidadeTotalDeItens = quantidadeTotalDeItens;
  }

  public CobrancasParametrosPaginacao itensPorPagina(BigDecimal itensPorPagina) {
    this.itensPorPagina = itensPorPagina;
    return this;
  }

   /**
   * Quantidade de ocorrência retornadas por pagina, valor por default 100
   * @return itensPorPagina
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "Quantidade de ocorrência retornadas por pagina, valor por default 100")
  public BigDecimal getItensPorPagina() {
    return itensPorPagina;
  }

  public void setItensPorPagina(BigDecimal itensPorPagina) {
    this.itensPorPagina = itensPorPagina;
  }

  public CobrancasParametrosPaginacao quantidadeDePaginas(BigDecimal quantidadeDePaginas) {
    this.quantidadeDePaginas = quantidadeDePaginas;
    return this;
  }

   /**
   * Quantidade de páginas disponíveis para consulta.
   * @return quantidadeDePaginas
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "Quantidade de páginas disponíveis para consulta.")
  public BigDecimal getQuantidadeDePaginas() {
    return quantidadeDePaginas;
  }

  public void setQuantidadeDePaginas(BigDecimal quantidadeDePaginas) {
    this.quantidadeDePaginas = quantidadeDePaginas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobrancasParametrosPaginacao cobrancasParametrosPaginacao = (CobrancasParametrosPaginacao) o;
    return Objects.equals(this.paginaAtual, cobrancasParametrosPaginacao.paginaAtual) &&
        Objects.equals(this.quantidadeTotalDeItens, cobrancasParametrosPaginacao.quantidadeTotalDeItens) &&
        Objects.equals(this.itensPorPagina, cobrancasParametrosPaginacao.itensPorPagina) &&
        Objects.equals(this.quantidadeDePaginas, cobrancasParametrosPaginacao.quantidadeDePaginas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginaAtual, quantidadeTotalDeItens, itensPorPagina, quantidadeDePaginas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrancasParametrosPaginacao {\n");
    
    sb.append("    paginaAtual: ").append(toIndentedString(paginaAtual)).append("\n");
    sb.append("    quantidadeTotalDeItens: ").append(toIndentedString(quantidadeTotalDeItens)).append("\n");
    sb.append("    itensPorPagina: ").append(toIndentedString(itensPorPagina)).append("\n");
    sb.append("    quantidadeDePaginas: ").append(toIndentedString(quantidadeDePaginas)).append("\n");
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

