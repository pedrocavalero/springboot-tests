# DefaultApi

All URIs are relative to *https://sandbox.mbi.cloud.ihf/sandbox/pix_recebimentos/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dELETEWebhookchave**](DefaultApi.md#dELETEWebhookchave) | **DELETE** /webhook/{chave} | 
[**gETCob**](DefaultApi.md#gETCob) | **GET** /cob | 
[**gETCobtxid**](DefaultApi.md#gETCobtxid) | **GET** /cob/{txid} | 
[**gETCobtxidqrcode**](DefaultApi.md#gETCobtxidqrcode) | **GET** /cob/{txid}/qrcode | 
[**gETPix**](DefaultApi.md#gETPix) | **GET** /pix | 
[**gETPixe2eid**](DefaultApi.md#gETPixe2eid) | **GET** /pix/{e2eid} | 
[**gETPixe2eiddevolucaoid**](DefaultApi.md#gETPixe2eiddevolucaoid) | **GET** /pix/{e2eid}/devolucao/{id} | 
[**gETWebhook**](DefaultApi.md#gETWebhook) | **GET** /webhook | 
[**gETWebhookchave**](DefaultApi.md#gETWebhookchave) | **GET** /webhook/{chave} | 
[**pATCHCobtxid**](DefaultApi.md#pATCHCobtxid) | **PATCH** /cob/{txid} | 
[**pUTCobtxid**](DefaultApi.md#pUTCobtxid) | **PUT** /cob/{txid} | 
[**pUTPixe2eiddevolucaoid**](DefaultApi.md#pUTPixe2eiddevolucaoid) | **PUT** /pix/{e2eid}/devolucao/{id} | 
[**pUTWebhookchave**](DefaultApi.md#pUTWebhookchave) | **PUT** /webhook/{chave} | 


<a name="dELETEWebhookchave"></a>
# **dELETEWebhookchave**
> dELETEWebhookchave(chave, xCorrelationID)



Operação responsável por deletar webhook para aviso de recebimentos pix por chave

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String chave = "chave_example"; // String | Chave de endereçamento do recebedor
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    apiInstance.dELETEWebhookchave(chave, xCorrelationID);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dELETEWebhookchave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chave** | **String**| Chave de endereçamento do recebedor |
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

null (empty response body)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="gETCob"></a>
# **gETCob**
> Cobrancas gETCob(inicio, fim, cpf, cnpj, status, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID)



Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String inicio = "inicio_example"; // String | Data início da criação da cobrança, no formato '2020-06-01T09:00'
String fim = "fim_example"; // String | Data fim da criação da Cobrança, no formato '2020-06-01T09:00'
String cpf = "cpf_example"; // String | CPF do pagador cadastrado na cobrança.
String cnpj = "cnpj_example"; // String | CNPJ do pagador cadastrado na cobrança.
String status = "status_example"; // String | Filtro pelo status da cobrança. Pode ser ATIVA, CONCLUIDA, REMOVIDA_PELO_PSP OU REMOVIDA_PELO_USUARIO_RECEBEDOR
String paginacaoPaginaAtual = "paginacaoPaginaAtual_example"; // String | Numero da Página que deseja realizar o acesso, valor considerado por default 0.
String paginacaoItensPorPagina = "paginacaoItensPorPagina_example"; // String | Quantidade de ocorrência retornadas por pagina, valor por default 100.
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Cobrancas result = apiInstance.gETCob(inicio, fim, cpf, cnpj, status, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | **String**| Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; |
 **fim** | **String**| Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; |
 **cpf** | **String**| CPF do pagador cadastrado na cobrança. | [optional]
 **cnpj** | **String**| CNPJ do pagador cadastrado na cobrança. | [optional]
 **status** | **String**| Filtro pelo status da cobrança. Pode ser ATIVA, CONCLUIDA, REMOVIDA_PELO_PSP OU REMOVIDA_PELO_USUARIO_RECEBEDOR | [optional]
 **paginacaoPaginaAtual** | **String**| Numero da Página que deseja realizar o acesso, valor considerado por default 0. | [optional]
 **paginacaoItensPorPagina** | **String**| Quantidade de ocorrência retornadas por pagina, valor por default 100. | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Cobrancas**](Cobrancas.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCobtxid"></a>
# **gETCobtxid**
> Cobranca gETCobtxid(txid, revisao, xCorrelationID)



Operação responsável por recuperar os dados do documento pelo id transacional

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String txid = "txid_example"; // String | Txid a ser consultado.
String revisao = "revisao_example"; // String | Id de transaçao do documento, utilizado para a sua identificação no banco central
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Cobranca result = apiInstance.gETCobtxid(txid, revisao, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCobtxid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Txid a ser consultado. |
 **revisao** | **String**| Id de transaçao do documento, utilizado para a sua identificação no banco central | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Cobranca**](Cobranca.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETCobtxidqrcode"></a>
# **gETCobtxidqrcode**
> Qrcode gETCobtxidqrcode(txid, xCorrelationID)



Operação responsável por recuperar os dados do documento

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String txid = "txid_example"; // String | Txid a ser consultado.
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Qrcode result = apiInstance.gETCobtxidqrcode(txid, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETCobtxidqrcode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Txid a ser consultado. |
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Qrcode**](Qrcode.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPix"></a>
# **gETPix**
> Pixs gETPix(inicio, fim, txid, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID)



Operação responsável por recuperar os dados de documentos de acordo com os filtros enviados

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String inicio = "inicio_example"; // String | Data início da criação da cobrança, no formato '2020-06-01T09:00'
String fim = "fim_example"; // String | Data fim da criação da Cobrança, no formato '2020-06-01T09:00'
String txid = "txid_example"; // String | ID de identificação do documento entre os bancos e o cliente emissor. O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’
String cpf = "cpf_example"; // String | CPF do pagador cadastrado na cobrança
String cnpj = "cnpj_example"; // String | CNPJ do pagador cadastrado na cobrança.
String paginacaoPaginaAtual = "paginacaoPaginaAtual_example"; // String | Numero da Página que deseja realizar o acesso, valor considerado por default 0.
String paginacaoItensPorPagina = "paginacaoItensPorPagina_example"; // String | Quantidade de ocorrência retornadas por pagina, valor por default 100.
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Pixs result = apiInstance.gETPix(inicio, fim, txid, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | **String**| Data início da criação da cobrança, no formato &#39;2020-06-01T09:00&#39; |
 **fim** | **String**| Data fim da criação da Cobrança, no formato &#39;2020-06-01T09:00&#39; |
 **txid** | **String**| ID de identificação do documento entre os bancos e o cliente emissor. O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’ | [optional]
 **cpf** | **String**| CPF do pagador cadastrado na cobrança | [optional]
 **cnpj** | **String**| CNPJ do pagador cadastrado na cobrança. | [optional]
 **paginacaoPaginaAtual** | **String**| Numero da Página que deseja realizar o acesso, valor considerado por default 0. | [optional]
 **paginacaoItensPorPagina** | **String**| Quantidade de ocorrência retornadas por pagina, valor por default 100. | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Pixs**](Pixs.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPixe2eid"></a>
# **gETPixe2eid**
> Pix gETPixe2eid(e2eid, xCorrelationID)



Operação responsável por recuperar os dados do documento pelo id transacional

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String e2eid = "e2eid_example"; // String | Id fim a fim da transação.
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Pix result = apiInstance.gETPixe2eid(e2eid, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPixe2eid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **e2eid** | **String**| Id fim a fim da transação. |
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Pix**](Pix.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETPixe2eiddevolucaoid"></a>
# **gETPixe2eiddevolucaoid**
> DevolucaoPix gETPixe2eiddevolucaoid(e2eid, id, xCorrelationID)



Operação responsavel por resgatar um pagamento específico para o PIX.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String e2eid = "e2eid_example"; // String | Id fim a fim da transação.
String id = "id_example"; // String | id da devolução
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    DevolucaoPix result = apiInstance.gETPixe2eiddevolucaoid(e2eid, id, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETPixe2eiddevolucaoid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **e2eid** | **String**| Id fim a fim da transação. |
 **id** | **String**| id da devolução |
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**DevolucaoPix**](DevolucaoPix.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWebhook"></a>
# **gETWebhook**
> Webhooks gETWebhook(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID, statusCode)



Operação responsável por resgatar webhooks de aviso de recebimentos pix para um parceiro

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String inicio = "inicio_example"; // String | Data de inicio da pesquisa de webhooks, no formato de acordo com RFC3339
String fim = "fim_example"; // String | Data fim da pesquisa de webhooks, no formato de acordo com RFC3339
String paginacaoPaginaAtual = "paginacaoPaginaAtual_example"; // String | Numero da Página que deseja realizar o acesso, valor considerado por default 0
String paginacaoItensPorPagina = "paginacaoItensPorPagina_example"; // String | Quantidade de ocorrência retornadas por pagina, valor por default 100
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
String statusCode = "statusCode_example"; // String | Define Status Code Sandbox
try {
    Webhooks result = apiInstance.gETWebhook(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina, xCorrelationID, statusCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | **String**| Data de inicio da pesquisa de webhooks, no formato de acordo com RFC3339 |
 **fim** | **String**| Data fim da pesquisa de webhooks, no formato de acordo com RFC3339 |
 **paginacaoPaginaAtual** | **String**| Numero da Página que deseja realizar o acesso, valor considerado por default 0 | [optional]
 **paginacaoItensPorPagina** | **String**| Quantidade de ocorrência retornadas por pagina, valor por default 100 | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]
 **statusCode** | **String**| Define Status Code Sandbox | [optional]

### Return type

[**Webhooks**](Webhooks.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gETWebhookchave"></a>
# **gETWebhookchave**
> Webhook gETWebhookchave(chave, xCorrelationID)



Operação responsável por resgatar webhook de aviso de recebimentos pix por chave

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String chave = "chave_example"; // String | Chave de endereçamento do recebedor
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    Webhook result = apiInstance.gETWebhookchave(chave, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETWebhookchave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chave** | **String**| Chave de endereçamento do recebedor |
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**Webhook**](Webhook.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pATCHCobtxid"></a>
# **pATCHCobtxid**
> CobrancaPatchResponse pATCHCobtxid(txid, body, xCorrelationID)



Operação responsável por revisar uma cobranca

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String txid = "txid_example"; // String | Txid a ser consultado.
CobrancaPatchRequest body = new CobrancaPatchRequest(); // CobrancaPatchRequest | Objeto cobranca a ser revisado
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    CobrancaPatchResponse result = apiInstance.pATCHCobtxid(txid, body, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pATCHCobtxid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Txid a ser consultado. |
 **body** | [**CobrancaPatchRequest**](CobrancaPatchRequest.md)| Objeto cobranca a ser revisado | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**CobrancaPatchResponse**](CobrancaPatchResponse.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pUTCobtxid"></a>
# **pUTCobtxid**
> CobrancaPutResponse pUTCobtxid(txid, body, xCorrelationID)



Operação responsável por incluir uma nova cobranca

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String txid = "txid_example"; // String | Txid a ser consultado.
CobrancaPutRequest body = new CobrancaPutRequest(); // CobrancaPutRequest | Objeto cobranca a ser criado
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    CobrancaPutResponse result = apiInstance.pUTCobtxid(txid, body, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pUTCobtxid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | **String**| Txid a ser consultado. |
 **body** | [**CobrancaPutRequest**](CobrancaPutRequest.md)| Objeto cobranca a ser criado | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**CobrancaPutResponse**](CobrancaPutResponse.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pUTPixe2eiddevolucaoid"></a>
# **pUTPixe2eiddevolucaoid**
> DevolucaoPutResponse pUTPixe2eiddevolucaoid(e2eid, id, body, xCorrelationID)



Operação responsável por solicitar um nova devolução, por meio do e2eid e do ID da devolução

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String e2eid = "e2eid_example"; // String | Id fim a fim da transação.
String id = "id_example"; // String | id da devolução
DevolucaoPutRequest body = new DevolucaoPutRequest(); // DevolucaoPutRequest | Objeto de devolução cobranca a ser solicitado
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    DevolucaoPutResponse result = apiInstance.pUTPixe2eiddevolucaoid(e2eid, id, body, xCorrelationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pUTPixe2eiddevolucaoid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **e2eid** | **String**| Id fim a fim da transação. |
 **id** | **String**| id da devolução |
 **body** | [**DevolucaoPutRequest**](DevolucaoPutRequest.md)| Objeto de devolução cobranca a ser solicitado | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

[**DevolucaoPutResponse**](DevolucaoPutResponse.md)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pUTWebhookchave"></a>
# **pUTWebhookchave**
> pUTWebhookchave(chave, body, xCorrelationID)



Operação responsável por cadastrar webhook para aviso de recebimentos pix por chave

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.invoker.ApiClient;
//import com.pedrocavalero.pix.invoker.ApiException;
//import com.pedrocavalero.pix.invoker.Configuration;
//import com.pedrocavalero.pix.invoker.auth.*;
//import com.pedrocavalero.pix.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuthAccessCode
OAuth OAuthAccessCode = (OAuth) defaultClient.getAuthentication("OAuthAccessCode");
OAuthAccessCode.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: OAuthImplicit
OAuth OAuthImplicit = (OAuth) defaultClient.getAuthentication("OAuthImplicit");
OAuthImplicit.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String chave = "chave_example"; // String | Chave de endereçamento do recebedor
Webhook body = new Webhook(); // Webhook | Objeto de webhook a ser solicitado
String xCorrelationID = "xCorrelationID_example"; // String | Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail
try {
    apiInstance.pUTWebhookchave(chave, body, xCorrelationID);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pUTWebhookchave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chave** | **String**| Chave de endereçamento do recebedor |
 **body** | [**Webhook**](Webhook.md)| Objeto de webhook a ser solicitado | [optional]
 **xCorrelationID** | **String**| Identificador de correlação que serve como um agrupar dentro da estrutura de audit trail | [optional]

### Return type

null (empty response body)

### Authorization

[OAuthAccessCode](../README.md#OAuthAccessCode), [OAuthImplicit](../README.md#OAuthImplicit)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

