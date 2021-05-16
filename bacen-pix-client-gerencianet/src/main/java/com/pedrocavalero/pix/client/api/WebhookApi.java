package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import org.threeten.bp.OffsetDateTime;
import com.pedrocavalero.pix.client.model.Problema;
import com.pedrocavalero.pix.client.model.WebhookCompleto;
import com.pedrocavalero.pix.client.model.WebhookSolicitado;
import com.pedrocavalero.pix.client.model.WebhooksConsultados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.WebhookApi")
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
     * Endpoint para cancelamento do webhook. Não é a única forma pela qual um webhook pode ser removido.  O PSP recebedor está livre para remover unilateralmente um webhook que esteja associado a uma chave que não pertence mais a este usuário recebedor. 
     * <p><b>204</b> - Webhook para notificações Pix foi cancelado.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param chave The chave parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookChaveDelete(String chave) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling webhookChaveDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Exibir informações acerca do Webhook Pix.
     * Endpoint para recuperação de informações sobre o Webhook Pix. 
     * <p><b>200</b> - Dados do webhook.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param chave The chave parameter
     * @return WebhookCompleto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhookCompleto webhookChaveGet(String chave) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling webhookChaveGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WebhookCompleto> returnType = new ParameterizedTypeReference<WebhookCompleto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Configurar o Webhook Pix.
     * Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente Pix associados a um txid serão notificados. 
     * <p><b>200</b> - Webhook para notificações acerca de Pix recebidos associados a um txid.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body The body parameter
     * @param chave The chave parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookChavePut(WebhookSolicitado body, String chave) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling webhookChavePut");
        }
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling webhookChavePut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar webhooks cadastrados.
     * Endpoint para consultar Webhooks cadastrados
     * <p><b>200</b> - lista dos locations cadastrados de acordo com o critério de busca.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return WebhooksConsultados
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WebhooksConsultados webhookGet(OffsetDateTime inicio, OffsetDateTime fim, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/webhook").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WebhooksConsultados> returnType = new ParameterizedTypeReference<WebhooksConsultados>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
