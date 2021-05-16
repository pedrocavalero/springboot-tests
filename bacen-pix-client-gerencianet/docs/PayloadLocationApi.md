# PayloadLocationApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locGet**](PayloadLocationApi.md#locGet) | **GET** /loc | Consultar locations cadastradas.
[**locIdGet**](PayloadLocationApi.md#locIdGet) | **GET** /loc/{id} | Recuperar location do payload.
[**locIdTxidDelete**](PayloadLocationApi.md#locIdTxidDelete) | **DELETE** /loc/{id}/txid | Desvincular uma cobrança de uma location.
[**locPost**](PayloadLocationApi.md#locPost) | **POST** /loc | Criar location do payload.

<a name="locGet"></a>
# **locGet**
> PayloadLocationConsultadas locGet(inicio, fim, txIdPresente, tipoCob, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar locations cadastradas.

Endpoint para consultar locations cadastradas

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
Boolean txIdPresente = true; // Boolean | 
String tipoCob = "tipoCob_example"; // String | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    PayloadLocationConsultadas result = apiInstance.locGet(inicio, fim, txIdPresente, tipoCob, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | [**OffsetDateTime**](.md)|  |
 **fim** | [**OffsetDateTime**](.md)|  |
 **txIdPresente** | **Boolean**|  | [optional]
 **tipoCob** | **String**|  | [optional] [enum: cob, cobv]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**PayloadLocationConsultadas**](PayloadLocationConsultadas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="locIdGet"></a>
# **locIdGet**
> PayloadLocationCompleta locIdGet(id)

Recuperar location do payload.

Recupera a location do payload

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
String id = "id_example"; // String | 
try {
    PayloadLocationCompleta result = apiInstance.locIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PayloadLocationCompleta**](PayloadLocationCompleta.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="locIdTxidDelete"></a>
# **locIdTxidDelete**
> PayloadLocation locIdTxidDelete(id)

Desvincular uma cobrança de uma location.

Endpoint utilizado para desvincular uma cobrança de uma location.  Se executado com sucesso, a entidade &#x60;loc&#x60; não apresentará mais um txid, se apresentava anteriormente à chamada. Adicionalmente, a entidade &#x60;cob&#x60; ou &#x60;cobv&#x60; associada ao txid desvinculado também passará a não mais apresentar um _location_. Esta operação não altera o &#x60;status&#x60; da &#x60;cob&#x60; ou &#x60;cobv&#x60; em questão. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
String id = "id_example"; // String | 
try {
    PayloadLocation result = apiInstance.locIdTxidDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locIdTxidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="locPost"></a>
# **locPost**
> PayloadLocation locPost(body)

Criar location do payload.

Criar location do payload

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
PayloadLocationSolicitada body = new PayloadLocationSolicitada(); // PayloadLocationSolicitada | Dados para geração da location.
try {
    PayloadLocation result = apiInstance.locPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PayloadLocationSolicitada**](PayloadLocationSolicitada.md)| Dados para geração da location. |

### Return type

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

