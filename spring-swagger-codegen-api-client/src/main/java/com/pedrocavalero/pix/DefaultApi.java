package com.pedrocavalero.pix;

import com.pedrocavalero.pix.invoker.ApiClient;

import com.pedrocavalero.pix.model.Cobranca;
import com.pedrocavalero.pix.model.CobrancaPatchRequest;
import com.pedrocavalero.pix.model.CobrancaPatchResponse;
import com.pedrocavalero.pix.model.CobrancaPutRequest;
import com.pedrocavalero.pix.model.CobrancaPutResponse;
import com.pedrocavalero.pix.model.Cobrancas;
import com.pedrocavalero.pix.model.DevolucaoPix;
import com.pedrocavalero.pix.model.DevolucaoPutRequest;
import com.pedrocavalero.pix.model.DevolucaoPutResponse;
import com.pedrocavalero.pix.model.Pix;
import com.pedrocavalero.pix.model.Pixs;
import com.pedrocavalero.pix.model.Qrcode;
import com.pedrocavalero.pix.model.Webhook;
import com.pedrocavalero.pix.model.Webhooks;

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
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-20T11:54:19.646-03:00")
@Component("com.pedrocavalero.pix.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Operação responsável por deletar webhook para aviso de recebimentos pix por chave
     * <p><b>200</b> - A execução foi bem-sucedida, o recurso foi removido corretamente de forma síncrona.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso será excluído de forma assíncrona.O retorno deste pedido deve ser um recurso de tarefas.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void dELETEWebhookchave(String chave, String xCorrelationID) throws RestClientException {
        dELETEWebhookchaveWithHttpInfo(chave, xCorrelationID);
    }

    /**
     * 
     * Operação responsável por deletar webhook para aviso de recebimentos pix por chave
     * <p><b>200</b> - A execução foi bem-sucedida, o recurso foi removido corretamente de forma síncrona.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso será excluído de forma assíncrona.O retorno deste pedido deve ser um recurso de tarefas.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> dELETEWebhookchaveWithHttpInfo(String chave, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling dELETEWebhookchave");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param fim Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param cpf CPF do pagador cadastrado na cobrança. (optional)
     * @param cnpj CNPJ do pagador cadastrado na cobrança. (optional)
     * @param status Filtro pelo status da cobrança. Pode ser ATIVA, CONCLUIDA, REMOVIDA_PELO_PSP OU REMOVIDA_PELO_USUARIO_RECEBEDOR (optional)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0. (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100. (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Cobrancas
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cobrancas gETCob(String inicio, String fim, String cpf, String cnpj, String status, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID) throws RestClientException {
        return gETCobWithHttpInfo(inicio, fim, cpf, cnpj, status, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param fim Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param cpf CPF do pagador cadastrado na cobrança. (optional)
     * @param cnpj CNPJ do pagador cadastrado na cobrança. (optional)
     * @param status Filtro pelo status da cobrança. Pode ser ATIVA, CONCLUIDA, REMOVIDA_PELO_PSP OU REMOVIDA_PELO_USUARIO_RECEBEDOR (optional)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0. (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100. (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Cobrancas&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cobrancas> gETCobWithHttpInfo(String inicio, String fim, String cpf, String cnpj, String status, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling gETCob");
        }
        
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling gETCob");
        }
        
        String path = UriComponentsBuilder.fromPath("/cob").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Cobrancas> returnType = new ParameterizedTypeReference<Cobrancas>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por recuperar os dados do documento pelo id transacional
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param revisao Id de transaçao do documento, utilizado para a sua identificação no banco central (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Cobranca
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cobranca gETCobtxid(String txid, String revisao, String xCorrelationID) throws RestClientException {
        return gETCobtxidWithHttpInfo(txid, revisao, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por recuperar os dados do documento pelo id transacional
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param revisao Id de transaçao do documento, utilizado para a sua identificação no banco central (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Cobranca&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cobranca> gETCobtxidWithHttpInfo(String txid, String revisao, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling gETCobtxid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "revisao", revisao));

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Cobranca> returnType = new ParameterizedTypeReference<Cobranca>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por recuperar os dados do documento
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Qrcode
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Qrcode gETCobtxidqrcode(String txid, String xCorrelationID) throws RestClientException {
        return gETCobtxidqrcodeWithHttpInfo(txid, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por recuperar os dados do documento
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Qrcode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Qrcode> gETCobtxidqrcodeWithHttpInfo(String txid, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling gETCobtxidqrcode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}/qrcode").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Qrcode> returnType = new ParameterizedTypeReference<Qrcode>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param fim Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param txid ID de identificação do documento entre os bancos e o cliente emissor. O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’ (optional)
     * @param cpf CPF do pagador cadastrado na cobrança (optional)
     * @param cnpj CNPJ do pagador cadastrado na cobrança. (optional)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0. (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100. (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Pixs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pixs gETPix(String inicio, String fim, String txid, String cpf, String cnpj, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID) throws RestClientException {
        return gETPixWithHttpInfo(inicio, fim, txid, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param fim Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; (required)
     * @param txid ID de identificação do documento entre os bancos e o cliente emissor. O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’ (optional)
     * @param cpf CPF do pagador cadastrado na cobrança (optional)
     * @param cnpj CNPJ do pagador cadastrado na cobrança. (optional)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0. (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100. (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Pixs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pixs> gETPixWithHttpInfo(String inicio, String fim, String txid, String cpf, String cnpj, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling gETPix");
        }
        
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling gETPix");
        }
        
        String path = UriComponentsBuilder.fromPath("/pix").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "txid", txid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cpf", cpf));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cnpj", cnpj));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Pixs> returnType = new ParameterizedTypeReference<Pixs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por recuperar os dados do documento pelo id transacional
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Pix
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pix gETPixe2eid(String e2eid, String xCorrelationID) throws RestClientException {
        return gETPixe2eidWithHttpInfo(e2eid, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por recuperar os dados do documento pelo id transacional
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Pix&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pix> gETPixe2eidWithHttpInfo(String e2eid, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling gETPixe2eid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Pix> returnType = new ParameterizedTypeReference<Pix>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsavel por resgatar um pagamento específico para o PIX.
     * <p><b>200</b> - Ok
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param id id da devolução (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return DevolucaoPix
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DevolucaoPix gETPixe2eiddevolucaoid(String e2eid, String id, String xCorrelationID) throws RestClientException {
        return gETPixe2eiddevolucaoidWithHttpInfo(e2eid, id, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsavel por resgatar um pagamento específico para o PIX.
     * <p><b>200</b> - Ok
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param id id da devolução (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;DevolucaoPix&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DevolucaoPix> gETPixe2eiddevolucaoidWithHttpInfo(String e2eid, String id, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling gETPixe2eiddevolucaoid");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling gETPixe2eiddevolucaoid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}/devolucao/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<DevolucaoPix> returnType = new ParameterizedTypeReference<DevolucaoPix>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por resgatar webhooks de aviso de recebimentos pix para um parceiro
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data de inicio da pesquisa de webhooks, no formato de acordo com RFC3339 (required)
     * @param fim Data fim da pesquisa de webhooks, no formato de acordo com RFC3339 (required)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0 (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100 (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @param statusCode Define Status Code Sandbox (optional)
     * @return Webhooks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Webhooks gETWebhook(String inicio, String fim, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID, String statusCode) throws RestClientException {
        return gETWebhookWithHttpInfo(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID, statusCode).getBody();
    }

    /**
     * 
     * Operação responsável por resgatar webhooks de aviso de recebimentos pix para um parceiro
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param inicio Data de inicio da pesquisa de webhooks, no formato de acordo com RFC3339 (required)
     * @param fim Data fim da pesquisa de webhooks, no formato de acordo com RFC3339 (required)
     * @param paginacaoPaginaAtual Numero da Página que deseja realizar o acesso, valor considerado por default 0 (optional)
     * @param paginacaoItensPorPagina Quantidade de ocorrência retornadas por pagina, valor por default 100 (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @param statusCode Define Status Code Sandbox (optional)
     * @return ResponseEntity&lt;Webhooks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Webhooks> gETWebhookWithHttpInfo(String inicio, String fim, String paginacaoPaginaAtual, String paginacaoItensPorPagina, String xCorrelationID, String statusCode) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inicio' is set
        if (inicio == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inicio' when calling gETWebhook");
        }
        
        // verify the required parameter 'fim' is set
        if (fim == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fim' when calling gETWebhook");
        }
        
        String path = UriComponentsBuilder.fromPath("/webhook").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inicio", inicio));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fim", fim));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.paginaAtual", paginacaoPaginaAtual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginacao.itensPorPagina", paginacaoItensPorPagina));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status_code", statusCode));

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Webhooks> returnType = new ParameterizedTypeReference<Webhooks>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por resgatar webhook de aviso de recebimentos pix por chave
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return Webhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Webhook gETWebhookchave(String chave, String xCorrelationID) throws RestClientException {
        return gETWebhookchaveWithHttpInfo(chave, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por resgatar webhook de aviso de recebimentos pix por chave
     * <p><b>200</b> - OK
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>303</b> - See Other - Resposta à solicitação da consulta será redirecionada (pode ser encontrada em outro URI/localização), usando o método GET. Quando recebido em resposta a um POST (ou PUT / DELETE), o cliente deve presumir que o servidor recebeu os dados e deve emitir uma nova solicitação GET para o URI/localização fornecido.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (como certificado, expiração do token, configuração da credencial e secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Webhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Webhook> gETWebhookchaveWithHttpInfo(String chave, String xCorrelationID) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling gETWebhookchave");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Webhook> returnType = new ParameterizedTypeReference<Webhook>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por revisar uma cobranca
     * <p><b>200</b> - OK
     * <p><b>202</b> - A execução foi bem-sucedido e atualização se derá de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param body Objeto cobranca a ser revisado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return CobrancaPatchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobrancaPatchResponse pATCHCobtxid(String txid, CobrancaPatchRequest body, String xCorrelationID) throws RestClientException {
        return pATCHCobtxidWithHttpInfo(txid, body, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por revisar uma cobranca
     * <p><b>200</b> - OK
     * <p><b>202</b> - A execução foi bem-sucedido e atualização se derá de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * <p><b>504</b> - Gateway Timeout. Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param body Objeto cobranca a ser revisado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;CobrancaPatchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobrancaPatchResponse> pATCHCobtxidWithHttpInfo(String txid, CobrancaPatchRequest body, String xCorrelationID) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling pATCHCobtxid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<CobrancaPatchResponse> returnType = new ParameterizedTypeReference<CobrancaPatchResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por incluir uma nova cobranca
     * <p><b>200</b> - OK
     * <p><b>201</b> - Se não exsitir o recurso, neste caso, o recurso foi criado.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param body Objeto cobranca a ser criado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return CobrancaPutResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CobrancaPutResponse pUTCobtxid(String txid, CobrancaPutRequest body, String xCorrelationID) throws RestClientException {
        return pUTCobtxidWithHttpInfo(txid, body, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por incluir uma nova cobranca
     * <p><b>200</b> - OK
     * <p><b>201</b> - Se não exsitir o recurso, neste caso, o recurso foi criado.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param txid Txid a ser consultado. (required)
     * @param body Objeto cobranca a ser criado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;CobrancaPutResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CobrancaPutResponse> pUTCobtxidWithHttpInfo(String txid, CobrancaPutRequest body, String xCorrelationID) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'txid' is set
        if (txid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'txid' when calling pUTCobtxid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("txid", txid);
        String path = UriComponentsBuilder.fromPath("/cob/{txid}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<CobrancaPutResponse> returnType = new ParameterizedTypeReference<CobrancaPutResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por solicitar um nova devolução, por meio do e2eid e do ID da devolução
     * <p><b>200</b> - OK
     * <p><b>201</b> - Se não exsitir o recurso, neste caso, o recurso foi criado.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param id id da devolução (required)
     * @param body Objeto de devolução cobranca a ser solicitado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return DevolucaoPutResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DevolucaoPutResponse pUTPixe2eiddevolucaoid(String e2eid, String id, DevolucaoPutRequest body, String xCorrelationID) throws RestClientException {
        return pUTPixe2eiddevolucaoidWithHttpInfo(e2eid, id, body, xCorrelationID).getBody();
    }

    /**
     * 
     * Operação responsável por solicitar um nova devolução, por meio do e2eid e do ID da devolução
     * <p><b>200</b> - OK
     * <p><b>201</b> - Se não exsitir o recurso, neste caso, o recurso foi criado.
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param e2eid Id fim a fim da transação. (required)
     * @param id id da devolução (required)
     * @param body Objeto de devolução cobranca a ser solicitado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;DevolucaoPutResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DevolucaoPutResponse> pUTPixe2eiddevolucaoidWithHttpInfo(String e2eid, String id, DevolucaoPutRequest body, String xCorrelationID) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'e2eid' is set
        if (e2eid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'e2eid' when calling pUTPixe2eiddevolucaoid");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pUTPixe2eiddevolucaoid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("e2eid", e2eid);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/pix/{e2eid}/devolucao/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<DevolucaoPutResponse> returnType = new ParameterizedTypeReference<DevolucaoPutResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Operação responsável por cadastrar webhook para aviso de recebimentos pix por chave
     * <p><b>200</b> - A execução foi bem-sucedida, o recurso é atualizado de acordo com as mudanças enviadas de forma síncrona.
     * <p><b>201</b> - OK
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param body Objeto de webhook a ser solicitado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pUTWebhookchave(String chave, Webhook body, String xCorrelationID) throws RestClientException {
        pUTWebhookchaveWithHttpInfo(chave, body, xCorrelationID);
    }

    /**
     * 
     * Operação responsável por cadastrar webhook para aviso de recebimentos pix por chave
     * <p><b>200</b> - A execução foi bem-sucedida, o recurso é atualizado de acordo com as mudanças enviadas de forma síncrona.
     * <p><b>201</b> - OK
     * <p><b>202</b> - A execução foi bem-sucedida, o recurso é atualizado / criado de acordo com as mudanças enviadas de forma assíncrona.O retorno deverá ser um recurso de taferas.
     * <p><b>204</b> - Solicitação processada com sucesso, mas não está retornando nenhum conteúdo.
     * <p><b>400</b> - Parâmetros incorretos (os dados de entradas estão incorretos ou ausentes).
     * <p><b>401</b> - Não autorizado. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>403</b> - Acesso Proibido. Verifique se os parâmetros de acesso estão válidos (certificado, expiração do token, configuração da credencial, secret ou jwt). Se o problema persistir, entre em contato com o suporte Itaú.
     * <p><b>404</b> - Recurso Inexistente (não encontrado)
     * <p><b>405</b> - Método não permitido
     * <p><b>422</b> - Erro semântico
     * <p><b>428</b> - Solicitação requer pré requisito ou condição que não foi enviada
     * <p><b>500</b> - Erro Inesperado. Entre em contato com o suporte Itaú.
     * <p><b>501</b> - Não implementado. Entre em contato com o suporte Itaú.
     * <p><b>503</b> - Serviço Indisponível.Entre em contato com o suporte Itaú.
     * @param chave Chave de endereçamento do recebedor (required)
     * @param body Objeto de webhook a ser solicitado (optional)
     * @param xCorrelationID Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pUTWebhookchaveWithHttpInfo(String chave, Webhook body, String xCorrelationID) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'chave' is set
        if (chave == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chave' when calling pUTWebhookchave");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chave", chave);
        String path = UriComponentsBuilder.fromPath("/webhook/{chave}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xCorrelationID != null)
        headerParams.add("x-correlationID", apiClient.parameterToString(xCorrelationID));

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuthAccessCode", "OAuthImplicit" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
