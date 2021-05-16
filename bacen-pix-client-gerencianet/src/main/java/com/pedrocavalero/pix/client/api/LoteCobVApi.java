package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import com.pedrocavalero.pix.client.model.LoteCobVConsultado;
import com.pedrocavalero.pix.client.model.LotesCobVConsultados;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.LoteCobVApi")
public class LoteCobVApi {
    private ApiClient apiClient;

    public LoteCobVApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoteCobVApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consultar lotes de cobranças com vencimento.
     * Endpoint para consultar lista de lotes de cobranças com vencimento.
     * <p><b>200</b> - Lotes de cobranças com vencimento.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param inicio The inicio parameter
     * @param fim The fim parameter
     * @param paginacaoPaginaAtual The paginacaoPaginaAtual parameter
     * @param paginacaoItensPorPagina The paginacaoItensPorPagina parameter
     * @return LotesCobVConsultados
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LotesCobVConsultados lotecobvGet(OffsetDateTime inicio, OffsetDateTime fim, Integer paginacaoPaginaAtual, Integer paginacaoItensPorPagina) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling lotecobvGet");
        }
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling lotecobvGet");
        }
        String path = UriComponentsBuilder.fromPath("/lotecobv").build().toUriString();
        
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

        ParameterizedTypeReference<LotesCobVConsultados> returnType = new ParameterizedTypeReference<LotesCobVConsultados>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Consultar um lote específico de cobranças com vencimento.
     * Endpoint para consultar um lote de cobranças com vencimento. 
     * <p><b>200</b> - Lote de cobranças com vencimento.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param id The id parameter
     * @return LoteCobVConsultado
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoteCobVConsultado lotecobvIdGet(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lotecobvIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/lotecobv/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LoteCobVConsultado> returnType = new ParameterizedTypeReference<LoteCobVConsultado>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.
     * Endpoint utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.   A diferença deste endpoint para o endpoint PUT correlato é que este endpoint admite um array &#x60;cobsv&#x60; com menos solicitações de criação ou alteração de cobranças do que o array atribuído na requisição originária do lote.  Não se pode, entretanto, utilizar esse endpoint para agregar ou remover solicitações de alteração ou criação de cobranças conforme constam na requisição originária do lote.
     * <p><b>202</b> - Solicitação de revisão do Lote de cobranças encaminhada para processamento.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração de lote de cobranças com vencimento.
     * @param id The id parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void lotecobvIdPatch(Object body, String id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling lotecobvIdPatch");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lotecobvIdPatch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/lotecobv/{id}").buildAndExpand(uriVariables).toUriString();
        
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
        apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Criar/Alterar lote de cobranças com vencimento.
     * Endpoint utilizado para criar ou alterar um lote de cobranças com vencimento.  Para o caso de uso de alteração de cobranças, o array a ser atribuído na requisicão deve ser composto pelas exatas requisições de criação de cobranças que constaram no array atribuído na requisição originária.  Não se pode utilizar este endpoint para _alterar_ um lote de cobranças com vencimento agregando ou removendo cobranças já existentes dentro do conjunto de cobranças criadas na requisição originária do lote.  Em outras palavras, se originalmente criou-se um lote, por exemplo, com as cobranças [&#x60;a&#x60;, &#x60;b&#x60; e &#x60;c&#x60;], não se pode _alterar_ esse conjunto de cobranças original que o lote representa para [&#x60;a&#x60;, &#x60;b&#x60;, &#x60;c&#x60;, &#x60;d&#x60;], ou para [&#x60;a&#x60;, &#x60;b&#x60;]. Por outro lado, pode-se alterar, _em lote_ as cobranças [&#x60;a&#x60;, &#x60;b&#x60;, &#x60;c&#x60;], conforme originalmente constam na requisição originária do lote.  Uma solicitação de __criação__ de cobrança com status \&quot;EM_PROCESSAMENTO\&quot; ou \&quot;NEGADA\&quot; está associada a uma cobrança não _existe_ de fato, portanto não será listada em &#x60;GET /cobv&#x60; ou &#x60;GET /cobv/{txid}&#x60;.  Uma cobrança, uma vez criada via &#x60;PUT /cobv/{txid}&#x60;, não pode ser associada a um lote posteriormente.  Uma cobrança, uma vez criada via &#x60;PUT /lotecobv/{id}&#x60;, não pode ser associada a um novo lote posteriormente.
     * <p><b>202</b> - Lote de cobranças com vencimento solicitado para criação.
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>403</b> - Requisição de participante autenticado que viola alguma regra de autorização.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param body Dados para geração de lote de cobranças com vencimento.
     * @param id The id parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void lotecobvIdPut(Object body, String id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling lotecobvIdPut");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lotecobvIdPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/lotecobv/{id}").buildAndExpand(uriVariables).toUriString();
        
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
}
