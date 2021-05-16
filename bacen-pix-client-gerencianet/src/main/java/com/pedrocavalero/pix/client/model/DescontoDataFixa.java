package com.pedrocavalero.pix.client.model;

import java.util.Objects;

import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Descontos aplicados à cobrança")
public class DescontoDataFixa {

	@JsonProperty("valorPerc")
	private String valorPerc = null;

	@JsonProperty("data")
	private LocalDate data = null;

	public String getValorPerc() {
		return valorPerc;
	}

	public void setValorPerc(String valorPerc) {
		this.valorPerc = valorPerc;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, valorPerc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DescontoDataFixa other = (DescontoDataFixa) obj;
		return Objects.equals(data, other.data) && Objects.equals(valorPerc, other.valorPerc);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DescontoDataFixa {\n");

		sb.append("    data: ").append(toIndentedString(data)).append("\n");
		sb.append("    valorPerc: ").append(toIndentedString(valorPerc)).append("\n");
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
