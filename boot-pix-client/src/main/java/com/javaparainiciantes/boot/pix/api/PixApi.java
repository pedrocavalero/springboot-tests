package com.javaparainiciantes.boot.pix.api;

import com.javaparainiciantes.boot.pix.invoker.ApiClient;

import com.javaparainiciantes.boot.pix.model.Devolucao;
import com.javaparainiciantes.boot.pix.model.InlineObject;
import java.time.OffsetDateTime;
import com.javaparainiciantes.boot.pix.model.Pix;
import com.javaparainiciantes.boot.pix.model.PixConsultados;

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
@Component("com.javaparainiciantes.boot.pix.api.PixApi")
public class PixApi {
    private ApiClient apiClient;

    public PixApi() {
        this(new ApiClient());
    }

    @Autowired
    public PixApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consultar devolução.
     * Endpoint para consultar uma devolução através de um End To End ID do Pix e do ID da devolução
     * <p><b>200</b> - Dados da devolução.
     * @param e2eid  (required)
     * @param id  (required)
     * @return Devolucao
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Devolucao pixE2eidDevolucaoIdGet(String e2eid, String id) throws RestClientException {
        return pixE2eidDevolucaoIdGetWithHttpInfo(e2eid, id).getBody();
    }

    /**
     * Consultar devolução.
     * Endpoint para consultar uma devolução através de um End To End ID do Pix e do ID da devolução
     * <p><b>200</b> - Dados da devolução.
     * @param e2eid  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Devolucao&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Devolucao> pixE2eidDevolucaoIdGetWithHttpInfo(String e2eid, String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pixE2eidDevolucaoIdGet");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pixE2eidDevolucaoIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/pix/{e2eid}/devolucao/{id}", uriVariables);

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

        ParameterizedTypeReference<Devolucao> returnType = new ParameterizedTypeReference<Devolucao>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Solicitar devolução.
     * Endpoint para solicitar uma devolução através de um e2eid do Pix e do ID da devolução.
     * <p><b>200</b> - Dados da devolução.
     * @param e2eid  (required)
     * @param id  (required)
     * @param inlineObject  (required)
     * @return Devolucao
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Devolucao pixE2eidDevolucaoIdPut(String e2eid, String id, InlineObject inlineObject) throws RestClientException {
        return pixE2eidDevolucaoIdPutWithHttpInfo(e2eid, id, inlineObject).getBody();
    }

    /**
     * Solicitar devolução.
     * Endpoint para solicitar uma devolução através de um e2eid do Pix e do ID da devolução.
     * <p><b>200</b> - Dados da devolução.
     * @param e2eid  (required)
     * @param id  (required)
     * @param inlineObject  (required)
     * @return ResponseEntity&lt;Devolucao&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Devolucao> pixE2eidDevolucaoIdPutWithHttpInfo(String e2eid, String id, InlineObject inlineObject) throws RestClientException {
        Object postBody = inlineObject;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pixE2eidDevolucaoIdPut");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pixE2eidDevolucaoIdPut");
        }
        
        // verify the required parameter 'inlineObject' is set
        if (inlineObject == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inlineObject' when calling pixE2eidDevolucaoIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/pix/{e2eid}/devolucao/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Devolucao> returnType = new ParameterizedTypeReference<Devolucao>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar Pix.
     * Endpoint para consultar um Pix através de um e2eid.
     * <p><b>200</b> - Dados do Pix efetuado.
     * @param e2eid  (required)
     * @return Pix
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pix pixE2eidGet(String e2eid) throws RestClientException {
        return pixE2eidGetWithHttpInfo(e2eid).getBody();
    }

    /**
     * Consultar Pix.
     * Endpoint para consultar um Pix através de um e2eid.
     * <p><b>200</b> - Dados do Pix efetuado.
     * @param e2eid  (required)
     * @return ResponseEntity&lt;Pix&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pix> pixE2eidGetWithHttpInfo(String e2eid) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pixE2eidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        String path = apiClient.expandPath("/pix/{e2eid}", uriVariables);

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

        ParameterizedTypeReference<Pix> returnType = new ParameterizedTypeReference<Pix>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar Pix recebidos.
     * Endpoint para consultar Pix recebidos
     * <p><b>200</b> - lista dos Pix recebidos de acordo com o critério de busca.
     * @param inicio  (required)
     * @param fim  (required)
     * @param txId  (optional)
     * @param cpf  (optional, default to null)
     * @param cnpj  (optional, default to null)
     * @param paginacaoPaginaAtual  (optional, default to 0)
     * @param paginacaoItensPorPagina  (optional, default to 100)
     * @return PixConsultados
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PixConsultados pixGet(OffsetDateTime inicio, OffsetDateTime fim, String txId, String cpf, String cnpj, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        return pixGetWithHttpInfo(inicio, fim, txId, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina).getBody();
    }

    /**
     * Consultar Pix recebidos.
     * Endpoint para consultar Pix recebidos
     * <p><b>200</b> - lista dos Pix recebidos de acordo com o critério de busca.
     * @param inicio  (required)
     * @param fim  (required)
     * @param txId  (optional)
     * @param cpf  (optional, default to null)
     * @param cnpj  (optional, default to null)
     * @param paginacaoPaginaAtual  (optional, default to 0)
     * @param paginacaoItensPorPagina  (optional, default to 100)
     * @return ResponseEntity&lt;PixConsultados&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PixConsultados> pixGetWithHttpInfo(OffsetDateTime inicio, OffsetDateTime fim, String txId, String cpf, String cnpj, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling pixGet");
        }
        
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling pixGet");
        }
        
        String path = apiClient.expandPath("/pix", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "txId", txId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PixConsultados> returnType = new ParameterizedTypeReference<PixConsultados>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
