package com.pedrocavalero.pix.client.api;

import com.pedrocavalero.pix.client.invoker.ApiClient;

import com.pedrocavalero.pix.client.model.CobPayload;
import com.pedrocavalero.pix.client.model.CobVPayload;
import org.threeten.bp.LocalDate;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")@Component("com.pedrocavalero.pix.client.api.CobPayloadApi")
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
     * Recuperar o payload JSON que representa a cobrança com vencimento.
     * ## Endpoint (location) que serve um payload que representa uma cobrança com vencimento.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 
     * <p><b>200</b> - # Descrição do Retorno O retorno desse endpoint é um objeto que apresenta estrutura JWS, conforme especificado no manual de segurança. Segue um exemplo:  &#x60;&#x60;&#x60;jws eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXUyIsImtpZCI6IjIwMTEtMDQtMjkiLCJqa3UiOiJodHRwczovL3Rvb2xzLmlldGYub3JnL2h0bWwvcmZjNzUxNyIsIng1dCI6IkFwcGVuZGl4QUV4YW1wbGVBMUpXS1NSc2FLZXkifQ.eyJjYWxlbmRhcmlvIjp7ImNyaWFjYW8iOiIyMDIwLTA5LTE1VDE5OjM5OjU0LjAxM1oiLCJhcHJlc2VudGFjYW8iOiIyMDIwLTA0LTAxVDE4OjAwOjAwWiIsImRhdGFEZVZlbmNpbWVudG8iOiIyMDIwLTEyLTMxIiwidmFsaWRhZGVBcG9zVmVuY2ltZW50byI6MzB9LCJkZXZlZG9yIjp7ImxvZ3JhZG91cm8iOiJBbGFtZWRhIFNhbnRvcywgTnVtZXJvIDEwLCBCYWlycm8gQnJheiIsImNpZGFkZSI6IkRpYWRlbWEiLCJ1ZiI6IlNQIiwiY2VwIjoiNzA4MDAxMDAiLCJjbnBqIjoiNTY5ODkwMDAwMTk1MzMiLCJub21lIjoiRW1wcmVzYSBkZSBBbGltZW50b3MgU0EifSwicmVjZWJlZG9yIjp7ImxvZ3JhZG91cm8iOiJSdWEgMjAgTnVtZXJvIDcwLCBCYWlycm8gTHV6IiwiY2lkYWRlIjoiQmVsbyBIb3Jpem9udGUiLCJ1ZiI6Ik1HIiwiY2VwIjoiNTUxMjA3NTAiLCJjbnBqIjoiNTg5MDA2MzMxMjA3MTEiLCJub21lIjoiRW1wcmVzYSBkZSBBYmFzdGVjaW1lbnRvIFNBIn0sInR4aWQiOiJmYzlhNDM2NmZmM2Q0OTY0YjVkYmM2YzkxYTg3MjJkMyIsInJldmlzYW8iOiIzIiwic3RhdHVzIjoiQVRJVkEiLCJ2YWxvciI6eyJvcmlnaW5hbCI6IjEyMy40NSIsIm11bHRhIjoiMTUuMDAiLCJqdXJvcyI6IjIuMDAiLCJmaW5hbCI6IjE0MCw0NSJ9LCJjaGF2ZSI6Ijc0MDdjOWM4LWY3OGItMTFlYS1hZGMxLTAyNDJhYzEyMDAwMiIsInNvbGljaXRhY2FvUGFnYWRvciI6IkluZm9ybWFyIGNhcnRhbyBmaWRlbGlkYWRlIiwiaW5mb0FkaWNpb25haXMiOlt7Im5vbWUiOiJxdWFudGlkYWRlIiwidmFsb3IiOiIyIn1dfQ.BYibf_oK38IubbnnfThe4gaXuJgfoGQzFIezxHS76jGLQ4re2BwSdsiIzBW1t0JOtL094jLtJMVttdIdF9YJukrdzbknbf1jzfHghgBfNqXfZm7jxWuV8IO0jimoSoo7oMrG3MYytRFpdk2Q_ZhTL5UgZqVbfJkMwcp8o0FYmzrmiGPll-kgBulTgGgvGjzl-mC5dtl56351ix1-If1D7KAohHzcYTHzEFkvYZlNCcxyHJX94-8IqpYaTQ1rJlnPExPIgys-ioZ3U_QzcPz4d3tGvRAfHEU7VoIeZHeXR1jqKuqvz70ayc8mAbL7RXzJat1Ru_glS3krkSdXdZxK-w &#x60;&#x60;&#x60;  Este objeto JWS assinado deve ser validado pelo devedor. Maiores detalhes técnicos a respeito da especificação de segurança encontram-se no __[Manual de Segurança do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos)__.  Conforme pode-se verificar no exemplo acima, o objeto JWS apresenta três fragmentos separados pelo caractere &#x60;.&#x60; (ponto). São eles: &#x60;header&#x60;, &#x60;payload&#x60; e &#x60;signature&#x60;.  Em termos de funcionalidade, o fragmento que interessa ao devedor é o &#x60;payload&#x60;, que apresenta estrutura conforme especificada pelo &#x60;schema&#x60; do presente endpoint, contendo detalhes concernentes à cobrança. 
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param pixUrlAccessToken The pixUrlAccessToken parameter
     * @param codMun Código baseado na Tabela de Códigos de Municípios do __[IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__ que apresenta a lista dos municípios brasileiros associados a um código composto de 7 dígitos, sendo os dois primeiros referentes ao código da Unidade da Federação. 
     * @param DPP Data de pagamento pretendida. Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601.
     * @return CobVPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobVPayload cobvPixUrlAccessTokenGet(String pixUrlAccessToken, String codMun, LocalDate DPP) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pixUrlAccessToken' is set
        if (pixUrlAccessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pixUrlAccessToken' when calling cobvPixUrlAccessTokenGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pixUrlAccessToken", pixUrlAccessToken);
        String path = UriComponentsBuilder.fromPath("/cobv/{pixUrlAccessToken}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "codMun", codMun));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "DPP", DPP));

        final String[] accepts = { 
            "application/jose", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CobVPayload> returnType = new ParameterizedTypeReference<CobVPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Recuperar o payload JSON que representa a cobrança imediata.
     * ## Endpoint (location) que serve um payload que representa uma cobrança imediata.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 
     * <p><b>200</b> - # Descrição do Retorno O retorno desse endpoint é um objeto que apresenta estrutura JWS, conforme especificado no manual de segurança. Segue um exemplo:  &#x60;&#x60;&#x60;jws eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXUyIsImtpZCI6IjIwMTEtMDQtMjkiLCJqa3UiOiJodHRwczovL3Rvb2xzLmlldGYub3JnL2h0bWwvcmZjNzUxNyIsIng1dCI6IkFwcGVuZGl4QUV4YW1wbGVBMUpXS1NSc2FLZXkifQ.eyJjYWxlbmRhcmlvIjp7ImNyaWFjYW8iOiIyMDIwLTA5LTE1VDE5OjM5OjU0LjAxM1oiLCJhcHJlc2VudGFjYW8iOiIyMDIwLTA0LTAxVDE4OjAwOjAwWiIsImV4cGlyYWNhbyI6IjM2MDAifSwidHhpZCI6ImZjOWE0MzY2ZmYzZDQ5NjRiNWRiYzZjOTFhODcyMmQzIiwicmV2aXNhbyI6IjMiLCJzdGF0dXMiOiJBVElWQSIsInZhbG9yIjp7Im9yaWdpbmFsIjoiNTAwLjAwIn0sImNoYXZlIjoiNzQwN2M5YzgtZjc4Yi0xMWVhLWFkYzEtMDI0MmFjMTIwMDAyIiwic29saWNpdGFjYW9QYWdhZG9yIjoiSW5mb3JtYXIgY2FydGFvIGZpZGVsaWRhZGUiLCJpbmZvQWRpY2lvbmFpcyI6W3sibm9tZSI6InF1YW50aWRhZGUiLCJ2YWxvciI6IjIifV19.qI7NUrYkwcgXmyoyOjt2YLQyhxH-lPdr3xQ7RId9TDXZ-MlWmPJkUScjuo1Nz_EvlSotbWDGOxErBXHeTLHOQM-9T7lBmG5iw6uEX7L5U72XiganIm80EZCFD1vBPq9j89i4cP2U2Yv21TTt8JLhjA57KHLOSlj-KB5UAKCH-MX3AORFcrXFrYL2rrSQDe-lFNtdyPRwLQHIrhkQ6RR2FPhynzUG0401LScS9mWLLYbYzhzwtP5lk07Ryf4MZq86ihmOLFZXkIiW7pbSd8QfD5Dvj28XebLQi_bam9wInqKB--57_N741BskCN_TXf0EHbQ1qjNTgiT8Y1GIrA4pFA &#x60;&#x60;&#x60;  Este objeto JWS assinado deve ser validado pelo devedor. Maiores detalhes técnicos a respeito da especificação de segurança encontram-se no __[Manual de Segurança do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos)__.  Conforme pode-se verificar no exemplo acima, o objeto JWS apresenta três fragmentos separados pelo caractere &#x60;.&#x60; (ponto). São eles: &#x60;header&#x60;, &#x60;payload&#x60; e &#x60;signature&#x60;.  Em termos de funcionalidade, o fragmento que interessa ao devedor é o &#x60;payload&#x60;, que apresenta estrutura conforme especificada pelo &#x60;schema&#x60; do presente endpoint, contendo detalhes concernentes à cobrança. 
     * <p><b>400</b> - Requisição com formato inválido.
     * <p><b>404</b> - Recurso solicitado não foi encontrado.
     * <p><b>503</b> - Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.
     * @param pixUrlAccessToken The pixUrlAccessToken parameter
     * @return CobPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobPayload pixUrlAccessTokenGet(String pixUrlAccessToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pixUrlAccessToken' is set
        if (pixUrlAccessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pixUrlAccessToken' when calling pixUrlAccessTokenGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pixUrlAccessToken", pixUrlAccessToken);
        String path = UriComponentsBuilder.fromPath("/{pixUrlAccessToken}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/jose", "application/problem+json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CobPayload> returnType = new ParameterizedTypeReference<CobPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
