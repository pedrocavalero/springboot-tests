# WebhookApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookChaveDelete**](WebhookApi.md#webhookChaveDelete) | **DELETE** /webhook/{chave} | Cancelar o webhook Pix.
[**webhookChaveGet**](WebhookApi.md#webhookChaveGet) | **GET** /webhook/{chave} | Exibir informações acerca do Webhook Pix.
[**webhookChavePut**](WebhookApi.md#webhookChavePut) | **PUT** /webhook/{chave} | Configurar o Webhook Pix.
[**webhookGet**](WebhookApi.md#webhookGet) | **GET** /webhook | Consultar webhooks cadastrados.

<a name="webhookChaveDelete"></a>
# **webhookChaveDelete**
> webhookChaveDelete(chave)

Cancelar o webhook Pix.

Endpoint para cancelamento do webhook. Não é a única forma pela qual um webhook pode ser removido.  O PSP recebedor está livre para remover unilateralmente um webhook que esteja associado a uma chave que não pertence mais a este usuário recebedor. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
String chave = "chave_example"; // String | 
try {
    apiInstance.webhookChaveDelete(chave);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookChaveDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chave** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a name="webhookChaveGet"></a>
# **webhookChaveGet**
> WebhookCompleto webhookChaveGet(chave)

Exibir informações acerca do Webhook Pix.

Endpoint para recuperação de informações sobre o Webhook Pix. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
String chave = "chave_example"; // String | 
try {
    WebhookCompleto result = apiInstance.webhookChaveGet(chave);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookChaveGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chave** | **String**|  |

### Return type

[**WebhookCompleto**](WebhookCompleto.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="webhookChavePut"></a>
# **webhookChavePut**
> webhookChavePut(body, chave)

Configurar o Webhook Pix.

Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente Pix associados a um txid serão notificados. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
WebhookSolicitado body = new WebhookSolicitado(); // WebhookSolicitado | 
String chave = "chave_example"; // String | 
try {
    apiInstance.webhookChavePut(body, chave);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookChavePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookSolicitado**](WebhookSolicitado.md)|  |
 **chave** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a name="webhookGet"></a>
# **webhookGet**
> WebhooksConsultados webhookGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar webhooks cadastrados.

Endpoint para consultar Webhooks cadastrados

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    WebhooksConsultados result = apiInstance.webhookGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | [**OffsetDateTime**](.md)|  | [optional]
 **fim** | [**OffsetDateTime**](.md)|  | [optional]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**WebhooksConsultados**](WebhooksConsultados.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

