package com.pedrocavalero.pix;

import com.pedrocavalero.pix.invoker.ApiClient;
import com.pedrocavalero.pix.model.Cobranca;

public class Main {

	public static void main(String[] args) {
		ApiClient client = new ApiClient();
		client.setAccessToken("");
		DefaultApi api = new DefaultApi(client);
		Cobranca cobranca = api.gETCobtxid("1", "", "");
		//System.out.println(cobranca);
		System.out.println(cobranca.getStatus());
		
	}

}
