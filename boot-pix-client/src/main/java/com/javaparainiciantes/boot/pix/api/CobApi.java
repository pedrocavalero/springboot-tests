package com.javaparainiciantes.boot.pix.api;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import java.time.format.DateTimeFormatter;

import com.javaparainiciantes.boot.pix.invoker.ApiClient;
import com.javaparainiciantes.boot.pix.model.CobCompleta;
import com.javaparainiciantes.boot.pix.model.CobGerada;
import com.javaparainiciantes.boot.pix.model.CobRevisada;
import com.javaparainiciantes.boot.pix.model.CobSolicitada;
import com.javaparainiciantes.boot.pix.model.CobStatus;
import com.javaparainiciantes.boot.pix.model.CobsConsultadas;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-06T23:21:02.042427800-03:00[America/Sao_Paulo]")
@Component("com.javaparainiciantes.boot.pix.api.CobApi")
public class CobApi {
    private ApiClient apiClient;

    public CobApi() {
        this(new ApiClient());
    }

    @Autowired
    public CobApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consultar lista de cobranças.
     * Endpoint para consultar cobranças através de parâmetros como início, fim, cpf, cnpj e status.
     * <p><b>200</b> - Lista de cobranças.
     * @param inicio  (required)
     * @param fim  (required)
     * @param cpf  (optional, default to null)
     * @param cnpj  (optional, default to null)
     * @param status  (optional, default to null)
     * @param paginacaoPaginaAtual  (optional, default to 0)
     * @param paginacaoItensPorPagina  (optional, default to 100)
     * @return CobsConsultadas
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobsConsultadas cobGet(OffsetDateTime inicio, OffsetDateTime fim, String cpf, String cnpj, CobStatus status, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        return cobGetWithHttpInfo(inicio, fim, cpf, cnpj, status, paginacaoPaginaAtual, paginacaoItensPorPagina).getBody();
    }

    /**
     * Consultar lista de cobranças.
     * Endpoint para consultar cobranças através de parâmetros como início, fim, cpf, cnpj e status.
     * <p><b>200</b> - Lista de cobranças.
     * @param inicio  (required)
     * @param fim  (required)
     * @param cpf  (optional, default to null)
     * @param cnpj  (optional, default to null)
     * @param status  (optional, default to null)
     * @param paginacaoPaginaAtual  (optional, default to 0)
     * @param paginacaoItensPorPagina  (optional, default to 100)
     * @return ResponseEntity&lt;CobsConsultadas&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobsConsultadas> cobGetWithHttpInfo(OffsetDateTime inicio, OffsetDateTime fim, String cpf, String cnpj, CobStatus status, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling cobGet");
        }
        
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling cobGet");
        }
        
        String path = apiClient.expandPath("/cob/", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio.format(formatter)));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim.format(formatter)));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CobsConsultadas> returnType = new ParameterizedTypeReference<CobsConsultadas>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar cobrança.
     * Endpoint para consultar uma cobrança através de um determinado TxID.
     * <p><b>200</b> - Dados da cobrança.
     * @param txid  (required)
     * @param revisao  Permite recuperar revisões anteriores de uma cobrança.  Na ausência desse parâmetro, sempre será retornada a cobrança conforme consta em sua última revisão. (optional)
     * @return CobCompleta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobCompleta cobTxidGet(String txid, Integer revisao) throws RestClientException {
        return cobTxidGetWithHttpInfo(txid, revisao).getBody();
    }

    /**
     * Consultar cobrança.
     * Endpoint para consultar uma cobrança através de um determinado TxID.
     * <p><b>200</b> - Dados da cobrança.
     * @param txid  (required)
     * @param revisao  Permite recuperar revisões anteriores de uma cobrança.  Na ausência desse parâmetro, sempre será retornada a cobrança conforme consta em sua última revisão. (optional)
     * @return ResponseEntity&lt;CobCompleta&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobCompleta> cobTxidGetWithHttpInfo(String txid, Integer revisao) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = apiClient.expandPath("/cob/{txid}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "revisao", revisao));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CobCompleta> returnType = new ParameterizedTypeReference<CobCompleta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Revisar cobrança.
     * 
     * <p><b>200</b> - Cobrança revisada. A revisão deve ser incrementada em 1.
     * @param txid  (required)
     * @param cobRevisada Dados para geração da cobrança. (required)
     * @return CobGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobGerada cobTxidPatch(String txid, CobRevisada cobRevisada) throws RestClientException {
        return cobTxidPatchWithHttpInfo(txid, cobRevisada).getBody();
    }

    /**
     * Revisar cobrança.
     * 
     * <p><b>200</b> - Cobrança revisada. A revisão deve ser incrementada em 1.
     * @param txid  (required)
     * @param cobRevisada Dados para geração da cobrança. (required)
     * @return ResponseEntity&lt;CobGerada&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobGerada> cobTxidPatchWithHttpInfo(String txid, CobRevisada cobRevisada) throws RestClientException {
        Object postBody = cobRevisada;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidPatch");
        }
        
        // verify the required parameter 'cobRevisada' is set
        if (cobRevisada == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cobRevisada' when calling cobTxidPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = apiClient.expandPath("/cob/{txid}", uriVariables);

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

        ParameterizedTypeReference<CobGerada> returnType = new ParameterizedTypeReference<CobGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar cobrança.
     * Endpoint para criar uma cobrança.
     * <p><b>200</b> - Cobrança criada
     * @param txid  (required)
     * @param cobSolicitada Dados para geração da cobrança. (required)
     * @return CobGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobGerada cobTxidPut(String txid, CobSolicitada cobSolicitada) throws RestClientException {
        return cobTxidPutWithHttpInfo(txid, cobSolicitada).getBody();
    }

    /**
     * Criar cobrança.
     * Endpoint para criar uma cobrança.
     * <p><b>200</b> - Cobrança criada
     * @param txid  (required)
     * @param cobSolicitada Dados para geração da cobrança. (required)
     * @return ResponseEntity&lt;CobGerada&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobGerada> cobTxidPutWithHttpInfo(String txid, CobSolicitada cobSolicitada) throws RestClientException {
        Object postBody = cobSolicitada;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidPut");
        }
        
        // verify the required parameter 'cobSolicitada' is set
        if (cobSolicitada == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cobSolicitada' when calling cobTxidPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = apiClient.expandPath("/cob/{txid}", uriVariables);

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

        ParameterizedTypeReference<CobGerada> returnType = new ParameterizedTypeReference<CobGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
