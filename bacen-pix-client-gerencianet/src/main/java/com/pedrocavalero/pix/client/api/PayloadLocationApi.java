package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import org.threeten.bp.OffsetDateTime;
import com.pedrocavalero.pix.client.model.PayloadLocation;
import com.pedrocavalero.pix.client.model.PayloadLocationCompleta;
import com.pedrocavalero.pix.client.model.PayloadLocationConsultadas;
import com.pedrocavalero.pix.client.model.PayloadLocationSolicitada;
import com.pedrocavalero.pix.client.model.Problema;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.PayloadLocationApi")
public class PayloadLocationApi {
    private ApiClient apiClient;

    public PayloadLocationApi() {
        this(new ApiClient());
    }

    @Autowired
    public PayloadLocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consultar locations cadastradas.
     * Endpoint para consultar locations cadastradas
     * <p><b>200</b> - lista dos locations cadastrados de acordo com o critério de busca.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param txIdPresente The txIdPresente parameter
     * @param tipoCob The tipoCob parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return PayloadLocationConsultadas
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayloadLocationConsultadas locGet(OffsetDateTime inicio, OffsetDateTime fim, Boolean txIdPresente, String tipoCob, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling locGet");
        }
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling locGet");
        }
        String path = UriComponentsBuilder.fromPath("/loc").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "txIdPresente", txIdPresente));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tipoCob", tipoCob));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PayloadLocationConsultadas> returnType = new ParameterizedTypeReference<PayloadLocationConsultadas>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Recuperar location do payload.
     * Recupera a location do payload
     * <p><b>200</b> - Dados da location do Payload.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param id The id parameter
     * @return PayloadLocationCompleta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayloadLocationCompleta locIdGet(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling locIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/loc/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PayloadLocationCompleta> returnType = new ParameterizedTypeReference<PayloadLocationCompleta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    public PayloadLocationQrCode locIdQrCodeGet(String id) throws RestClientException {
    	Object postBody = null;
    	// verify the required parameter 'id' is set
    	if (id == null) {
    		throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling locIdGet");
    	}
    	// create path and map variables
    	final Map<String, Object> uriVariables = new HashMap<String, Object>();
    	uriVariables.put("id", id);
    	String path = UriComponentsBuilder.fromPath("/loc/{id}/qrcode").buildAndExpand(uriVariables).toUriString();
    	
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
    	
    	ParameterizedTypeReference<PayloadLocationQrCode> returnType = new ParameterizedTypeReference<PayloadLocationQrCode>() {};
    	return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Desvincular uma cobrança de uma location.
     * Endpoint utilizado para desvincular uma cobrança de uma location.  Se executado com sucesso, a entidade &#x60;loc&#x60; não apresentará mais um txid, se apresentava anteriormente à chamada. Adicionalmente, a entidade &#x60;cob&#x60; ou &#x60;cobv&#x60; associada ao txid desvinculado também passará a não mais apresentar um _location_. Esta operação não altera o &#x60;status&#x60; da &#x60;cob&#x60; ou &#x60;cobv&#x60; em questão. 
     * <p><b>200</b> - cobrança representada pelo txid informado desvinculada com sucesso.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param id The id parameter
     * @return PayloadLocation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayloadLocation locIdTxidDelete(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling locIdTxidDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/loc/{id}/txid").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<PayloadLocation> returnType = new ParameterizedTypeReference<PayloadLocation>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar location do payload.
     * Criar location do payload
     * <p><b>201</b> - Dados da location do Payload.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da location.
     * @return PayloadLocation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayloadLocation locPost(PayloadLocationSolicitada body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling locPost");
        }
        String path = UriComponentsBuilder.fromPath("/loc").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PayloadLocation> returnType = new ParameterizedTypeReference<PayloadLocation>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
