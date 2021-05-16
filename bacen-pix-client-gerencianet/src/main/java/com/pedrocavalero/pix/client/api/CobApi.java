package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import com.pedrocavalero.pix.client.model.CobCompleta;
import com.pedrocavalero.pix.client.model.CobGerada;
import com.pedrocavalero.pix.client.model.CobRevisada;
import com.pedrocavalero.pix.client.model.CobSolicitada;
import com.pedrocavalero.pix.client.model.CobsConsultadas;
import org.threeten.bp.OffsetDateTime;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.CobApi")
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
     * Consultar lista de cobranças imediatas.
     * Endpoint para consultar cobranças imediatas através de parâmetros como início, fim, cpf, cnpj e status.
     * <p><b>200</b> - Lista de cobranças imediatas.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param cpf The cpf parameter
     * @param cnpj The cnpj parameter
     * @param locationPresente The locationPresente parameter
     * @param status The status parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return CobsConsultadas
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobsConsultadas cobGet(OffsetDateTime inicio, OffsetDateTime fim, String cpf, String cnpj, Boolean locationPresente, String status, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling cobGet");
        }
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling cobGet");
        }
        String path = UriComponentsBuilder.fromPath("/cob").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locationPresente", locationPresente));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CobsConsultadas> returnType = new ParameterizedTypeReference<CobsConsultadas>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar cobrança imediata.
     * Endpoint para criar uma cobrança imediata, neste caso, o txid deve ser definido pelo PSP.
     * <p><b>201</b> - Cobrança imediata criada
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da cobrança imediata.
     * @return CobGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobGerada cobPost(CobSolicitada body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cobPost");
        }
        String path = UriComponentsBuilder.fromPath("/cob").build().toUriString();
        
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

        ParameterizedTypeReference<CobGerada> returnType = new ParameterizedTypeReference<CobGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar cobrança imediata.
     * Endpoint para consultar uma cobrança através de um determinado txid.
     * <p><b>200</b> - Dados da cobrança imediata.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param txid The txid parameter
     * @param revisao The revisao parameter
     * @return CobCompleta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobCompleta cobTxidGet(String txid, Integer revisao) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "revisao", revisao));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CobCompleta> returnType = new ParameterizedTypeReference<CobCompleta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Revisar cobrança imediata.
     * 
     * <p><b>200</b> - Cobrança imediata revisada. A revisão deve ser incrementada em 1.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da cobrança.
     * @param txid The txid parameter
     * @return CobGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobGerada cobTxidPatch(CobRevisada body, String txid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cobTxidPatch");
        }
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidPatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CobGerada> returnType = new ParameterizedTypeReference<CobGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar cobrança imediata.
     * Endpoint para criar uma cobrança imediata.
     * <p><b>201</b> - Cobrança imediata criada
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da cobrança imediata.
     * @param txid The txid parameter
     * @return CobGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobGerada cobTxidPut(CobSolicitada body, String txid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cobTxidPut");
        }
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobTxidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CobGerada> returnType = new ParameterizedTypeReference<CobGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
