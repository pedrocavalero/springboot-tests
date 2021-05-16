package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import com.pedrocavalero.pix.client.model.CobVCompleta;
import com.pedrocavalero.pix.client.model.CobVGerada;
import com.pedrocavalero.pix.client.model.CobVRevisada;
import com.pedrocavalero.pix.client.model.CobVSolicitada;
import com.pedrocavalero.pix.client.model.CobsVConsultadas;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.CobVApi")
public class CobVApi {
    private ApiClient apiClient;

    public CobVApi() {
        this(new ApiClient());
    }

    @Autowired
    public CobVApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consultar lista de cobranças com vencimento.
     * Endpoint para consultar cobranças com vencimento através de parâmetros como início, fim, cpf, cnpj e status.
     * <p><b>200</b> - Lista de cobranças com vencimento.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param cpf The cpf parameter
     * @param cnpj The cnpj parameter
     * @param locationPresente The locationPresente parameter
     * @param status The status parameter
     * @param loteCobVId The loteCobVId parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return CobsVConsultadas
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobsVConsultadas cobvGet(OffsetDateTime inicio, OffsetDateTime fim, String cpf, String cnpj, Boolean locationPresente, String status, Integer loteCobVId, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling cobvGet");
        }
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling cobvGet");
        }
        String path = UriComponentsBuilder.fromPath("/cobv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "locationPresente", locationPresente));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "loteCobVId", loteCobVId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<CobsVConsultadas> returnType = new ParameterizedTypeReference<CobsVConsultadas>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar cobrança com vencimento.
     * Endpoint para consultar uma cobrança com vencimento através de um determinado txid.
     * <p><b>200</b> - Dados da cobrança com vencimento.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param txid The txid parameter
     * @param revisao The revisao parameter
     * @return CobVCompleta
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobVCompleta cobvTxidGet(String txid, Integer revisao) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobvTxidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cobv/{txid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CobVCompleta> returnType = new ParameterizedTypeReference<CobVCompleta>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Revisar cobrança com vencimento.
     * 
     * <p><b>200</b> - Cobrança com vencimento revisada. A revisão deve ser incrementada em 1.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da cobrança.
     * @param txid The txid parameter
     * @return CobVGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobVGerada cobvTxidPatch(CobVRevisada body, String txid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cobvTxidPatch");
        }
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobvTxidPatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cobv/{txid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CobVGerada> returnType = new ParameterizedTypeReference<CobVGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar cobrança com vencimento.
     * Endpoint para criar uma cobrança com vencimento.
     * <p><b>201</b> - Cobrança com vencimento criada
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração da cobrança com vencimento.
     * @param txid The txid parameter
     * @return CobVGerada
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobVGerada cobvTxidPut(CobVSolicitada body, String txid) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cobvTxidPut");
        }
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling cobvTxidPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cobv/{txid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CobVGerada> returnType = new ParameterizedTypeReference<CobVGerada>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
