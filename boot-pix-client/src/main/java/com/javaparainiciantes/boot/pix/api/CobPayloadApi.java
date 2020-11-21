package com.javaparainiciantes.boot.pix.api;

import com.javaparainiciantes.boot.pix.invoker.ApiClient;

import com.javaparainiciantes.boot.pix.model.CobPayload;

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
@Component("com.javaparainiciantes.boot.pix.api.CobPayloadApi")
public class CobPayloadApi {
    private ApiClient apiClient;

    public CobPayloadApi() {
        this(new ApiClient());
    }

    @Autowired
    public CobPayloadApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Recuperar o payload JSON que representa a cobrança.
     * ## Endpoint (location) que serve um payload que representa uma cobrança.  No momento que o usuário pagador efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 
     * <p><b>200</b> - # Descrição do Retorno O retorno desse endpoint é um objeto que apresenta estrutura JWS, conforme especificado no manual de segurança. Segue um exemplo:  &#x60;&#x60;&#x60;jws eyJhbGciOiJQUzI1NiIsInR5cCI6IkpXUyJ9.eyJ0eElkIjoiNTJjNDMzNjEtY2FhMS00ZGRiLTkxNTItNzA4NDI2YTI1ZGIzIiwicmV2aXNhbyI6IjMiLCJjYWxlbmRhcmlvIjp7ImNyaWFjYW8iOiIyMDIwLTA5LTE1VDE5OjM5OjU0LjAxM1oiLCJhcHJlc2VudGFjYW8iOiIyMDIwLTA0LTAxVDE4OjAwOjAwWiIsImV4cGlyYWNhbyI6IjEyMDAifSwidmFsb3IiOnsib3JpZ2luYWwiOiI1MDAuMDAifSwiY2hhdmUiOiI3NDA3YzljOC1mNzhiLTExZWEtYWRjMS0wMjQyYWMxMjAwMDIiLCJzb2xpY2l0YWNhb1BhZ2Fkb3IiOiJJbmZvcm1hciBjYXJ0w6NvIGZpZGVsaWRhZGUiLCJpbmZvQWRpY2lvbmFpcyI6W3sibm9tZSI6InF1YW50aWRhZGUiLCJ2YWxvciI6IjIifV19.khlLEW4Q4W6zIYlacIaSHzwg_q9JrIkeinmvRDcUUD3120oXXew_xqSEAWsefY28g4MhUmK-RuaZgn1_rR22ZVM1pDbblw7Sk6dlHGxEc8PbMzMgEJPLdOZRumzMLx6YBYLAYsxT-HZp_vmBT713biN3jJf3V55z9RK6Xyo1CeWvemt81_O4kyGZ9lbp7p0VhmdJ9u6_EquEyP2n0uWy2ikbe7AFobkAdBRoF8gtp891WG5-gZmk4ZzATORNQOTrytQYMyprWV7o_prVjwT308RUo9Si-FRPTvYRGqyKo-voGoQVaZgCMUjc0jLr9WqYCRMyeCJZHTJmpaCFSNQnhw &#x60;&#x60;&#x60;  Este objeto JWS assinado deve ser validado pelo pagador. Maiores detalhes técnicos a respeito da especificação de segurança encontram-se no __[Manual de Segurança do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos)__.  Conforme pode-se verificar no exemplo acima, o objeto JWS apresenta três fragmentos separados pelo caractere &#x60;.&#x60; (ponto). São eles: &#x60;header&#x60;, &#x60;payload&#x60; e &#x60;signature&#x60;.  Em termos de funcionalidade, o fragmento que interessa ao pagador é o &#x60;payload&#x60;, que apresenta estrutura conforme especificada pelo &#x60;schema&#x60; do presente endpoint, contendo detalhes concernentes à cobrança. 
     * @param pixUrlAcessToken  (required)
     * @return CobPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobPayload pixUrlAcessTokenGet(String pixUrlAcessToken) throws RestClientException {
        return pixUrlAcessTokenGetWithHttpInfo(pixUrlAcessToken).getBody();
    }

    /**
     * Recuperar o payload JSON que representa a cobrança.
     * ## Endpoint (location) que serve um payload que representa uma cobrança.  No momento que o usuário pagador efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 
     * <p><b>200</b> - # Descrição do Retorno O retorno desse endpoint é um objeto que apresenta estrutura JWS, conforme especificado no manual de segurança. Segue um exemplo:  &#x60;&#x60;&#x60;jws eyJhbGciOiJQUzI1NiIsInR5cCI6IkpXUyJ9.eyJ0eElkIjoiNTJjNDMzNjEtY2FhMS00ZGRiLTkxNTItNzA4NDI2YTI1ZGIzIiwicmV2aXNhbyI6IjMiLCJjYWxlbmRhcmlvIjp7ImNyaWFjYW8iOiIyMDIwLTA5LTE1VDE5OjM5OjU0LjAxM1oiLCJhcHJlc2VudGFjYW8iOiIyMDIwLTA0LTAxVDE4OjAwOjAwWiIsImV4cGlyYWNhbyI6IjEyMDAifSwidmFsb3IiOnsib3JpZ2luYWwiOiI1MDAuMDAifSwiY2hhdmUiOiI3NDA3YzljOC1mNzhiLTExZWEtYWRjMS0wMjQyYWMxMjAwMDIiLCJzb2xpY2l0YWNhb1BhZ2Fkb3IiOiJJbmZvcm1hciBjYXJ0w6NvIGZpZGVsaWRhZGUiLCJpbmZvQWRpY2lvbmFpcyI6W3sibm9tZSI6InF1YW50aWRhZGUiLCJ2YWxvciI6IjIifV19.khlLEW4Q4W6zIYlacIaSHzwg_q9JrIkeinmvRDcUUD3120oXXew_xqSEAWsefY28g4MhUmK-RuaZgn1_rR22ZVM1pDbblw7Sk6dlHGxEc8PbMzMgEJPLdOZRumzMLx6YBYLAYsxT-HZp_vmBT713biN3jJf3V55z9RK6Xyo1CeWvemt81_O4kyGZ9lbp7p0VhmdJ9u6_EquEyP2n0uWy2ikbe7AFobkAdBRoF8gtp891WG5-gZmk4ZzATORNQOTrytQYMyprWV7o_prVjwT308RUo9Si-FRPTvYRGqyKo-voGoQVaZgCMUjc0jLr9WqYCRMyeCJZHTJmpaCFSNQnhw &#x60;&#x60;&#x60;  Este objeto JWS assinado deve ser validado pelo pagador. Maiores detalhes técnicos a respeito da especificação de segurança encontram-se no __[Manual de Segurança do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos)__.  Conforme pode-se verificar no exemplo acima, o objeto JWS apresenta três fragmentos separados pelo caractere &#x60;.&#x60; (ponto). São eles: &#x60;header&#x60;, &#x60;payload&#x60; e &#x60;signature&#x60;.  Em termos de funcionalidade, o fragmento que interessa ao pagador é o &#x60;payload&#x60;, que apresenta estrutura conforme especificada pelo &#x60;schema&#x60; do presente endpoint, contendo detalhes concernentes à cobrança. 
     * @param pixUrlAcessToken  (required)
     * @return ResponseEntity&lt;CobPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobPayload> pixUrlAcessTokenGetWithHttpInfo(String pixUrlAcessToken) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'pixUrlAcessToken' is set
        if (pixUrlAcessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pixUrlAcessToken' when calling pixUrlAcessTokenGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pixUrlAcessToken", pixUrlAcessToken);
        String path = apiClient.expandPath("/{pixUrlAcessToken}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/jose"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CobPayload> returnType = new ParameterizedTypeReference<CobPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
