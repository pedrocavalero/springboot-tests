package com.pedrocavalero.pix.client.api;

import java.util.Objects;

public class PayloadLocationQrCode {

	private String qrcode;
	private String imagemQrcode;
	public PayloadLocationQrCode(String qrcode, String imagemQrcode) {
		super();
		this.qrcode = qrcode;
		this.imagemQrcode = imagemQrcode;
	}
	
	public PayloadLocationQrCode() {
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getImagemQrcode() {
		return imagemQrcode;
	}

	public void setImagemQrcode(String imagemQrcode) {
		this.imagemQrcode = imagemQrcode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(imagemQrcode, qrcode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayloadLocationQrCode other = (PayloadLocationQrCode) obj;
		return Objects.equals(imagemQrcode, other.imagemQrcode) && Objects.equals(qrcode, other.qrcode);
	}

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class CobrancaPayloadLocationQrcode {\n");
	    
	    sb.append("    qrcode: ").append(toIndentedString(qrcode)).append("\n");
	    sb.append("    imagemQrcode: ").append(toIndentedString(imagemQrcode)).append("\n");
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