package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import com.pedrocavalero.pix.client.model.Devolucao;
import com.pedrocavalero.pix.client.model.DevolucaoSolicitada;
import org.threeten.bp.OffsetDateTime;
import com.pedrocavalero.pix.client.model.Pix;
import com.pedrocavalero.pix.client.model.PixConsultados;
import com.pedrocavalero.pix.client.model.Problema;
import com.pedrocavalero.pix.client.model.Txid;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.PixApi")
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
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param e2eid The e2eid parameter
     * @param id The id parameter
     * @return Devolucao
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Devolucao pixE2eidDevolucaoIdGet(String e2eid, String id) throws RestClientException {
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
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}/devolucao/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Devolucao> returnType = new ParameterizedTypeReference<Devolucao>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Solicitar devolução.
     * Endpoint para solicitar uma devolução através de um e2eid do Pix e do ID da devolução. O motivo que será atribuído à PACS.004 será \&quot;Devolução solicitada pelo usuário recebedor do pagamento original\&quot; cuja sigla é \&quot;MD06\&quot; de acordo com a aba RTReason da PACS.004 que consta no Catálogo de Mensagens do Pix. 
     * <p><b>201</b> - Dados da devolução.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para pedido de devolução.
     * @param e2eid The e2eid parameter
     * @param id The id parameter
     * @return Devolucao
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Devolucao pixE2eidDevolucaoIdPut(DevolucaoSolicitada body, String e2eid, String id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling pixE2eidDevolucaoIdPut");
        }
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pixE2eidDevolucaoIdPut");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pixE2eidDevolucaoIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}/devolucao/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Devolucao> returnType = new ParameterizedTypeReference<Devolucao>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar Pix.
     * Endpoint para consultar um Pix através de um e2eid.
     * <p><b>200</b> - Dados do Pix efetuado.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param e2eid The e2eid parameter
     * @return Pix
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pix pixE2eidGet(String e2eid) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pixE2eidGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Pix> returnType = new ParameterizedTypeReference<Pix>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar Pix recebidos.
     * Endpoint para consultar Pix recebidos
     * <p><b>200</b> - lista dos Pix recebidos de acordo com o critério de busca.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param txid The txid parameter
     * @param txIdPresente The txIdPresente parameter
     * @param devolucaoPresente The devolucaoPresente parameter
     * @param cpf The cpf parameter
     * @param cnpj The cnpj parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return PixConsultados
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PixConsultados pixGet(OffsetDateTime inicio, OffsetDateTime fim, Txid txid, Boolean txIdPresente, Boolean devolucaoPresente, String cpf, String cnpj, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling pixGet");
        }
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling pixGet");
        }
        String path = UriComponentsBuilder.fromPath("/pix").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "txid", txid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "txIdPresente", txIdPresente));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "devolucaoPresente", devolucaoPresente));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        final String[] accepts = { 
            "application/json", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PixConsultados> returnType = new ParameterizedTypeReference<PixConsultados>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
