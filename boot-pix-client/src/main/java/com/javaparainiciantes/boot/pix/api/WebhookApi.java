package com.javaparainiciantes.boot.pix.api;

import com.javaparainiciantes.boot.pix.invoker.ApiClient;

import com.javaparainiciantes.boot.pix.model.Webhook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
@Component("com.javaparainiciantes.boot.pix.api.WebhookApi")
public class WebhookApi {
    private ApiClient apiClient;

    public WebhookApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancelar o webhook Pix.
     * Endpoint para cancelamento do webhook. 
     * <p><b>204</b> - Webhook para notificações Pix foi cancelado.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookDelete() throws RestClientException {
        webhookDeleteWithHttpInfo();
    }

    /**
     * Cancelar o webhook Pix.
     * Endpoint para cancelamento do webhook. 
     * <p><b>204</b> - Webhook para notificações Pix foi cancelado.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> webhookDeleteWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/webhook", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Exibir informações acerca do Webook Pix.
     * Endpoint para recuperação de informações sobre o webhook pix. 
     * <p><b>200</b> - Dados da location do Payload.
     * @return Webhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Webhook webhookGet() throws RestClientException {
        return webhookGetWithHttpInfo().getBody();
    }

    /**
     * Exibir informações acerca do Webook Pix.
     * Endpoint para recuperação de informações sobre o webhook pix. 
     * <p><b>200</b> - Dados da location do Payload.
     * @return ResponseEntity&lt;Webhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Webhook> webhookGetWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/webhook", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Webhook> returnType = new ParameterizedTypeReference<Webhook>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Configurar o Webhook Pix.
     * Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente PIX associados a um txid serão notificados. 
     * <p><b>201</b> - Webhook para notificações acerca de Pix recebidos associados a um txid.
     * @param webhook  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookPut(Webhook webhook) throws RestClientException {
        webhookPutWithHttpInfo(webhook);
    }

    /**
     * Configurar o Webhook Pix.
     * Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente PIX associados a um txid serão notificados. 
     * <p><b>201</b> - Webhook para notificações acerca de Pix recebidos associados a um txid.
     * @param webhook  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> webhookPutWithHttpInfo(Webhook webhook) throws RestClientException {
        Object postBody = webhook;
        
        // verify the required parameter 'webhook' is set
        if (webhook == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhook' when calling webhookPut");
        }
        
        String path = apiClient.expandPath("/webhook", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
