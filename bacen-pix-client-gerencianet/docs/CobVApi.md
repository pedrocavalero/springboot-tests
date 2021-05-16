# CobVApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cobvGet**](CobVApi.md#cobvGet) | **GET** /cobv | Consultar lista de cobranças com vencimento.
[**cobvTxidGet**](CobVApi.md#cobvTxidGet) | **GET** /cobv/{txid} | Consultar cobrança com vencimento.
[**cobvTxidPatch**](CobVApi.md#cobvTxidPatch) | **PATCH** /cobv/{txid} | Revisar cobrança com vencimento.
[**cobvTxidPut**](CobVApi.md#cobvTxidPut) | **PUT** /cobv/{txid} | Criar cobrança com vencimento.

<a name="cobvGet"></a>
# **cobvGet**
> CobsVConsultadas cobvGet(inicio, fim, cpf, cnpj, locationPresente, status, loteCobVId, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar lista de cobranças com vencimento.

Endpoint para consultar cobranças com vencimento através de parâmetros como início, fim, cpf, cnpj e status.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.CobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobVApi apiInstance = new CobVApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
String cpf = "cpf_example"; // String | 
String cnpj = "cnpj_example"; // String | 
Boolean locationPresente = true; // Boolean | 
String status = "status_example"; // String | 
Integer loteCobVId = 56; // Integer | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    CobsVConsultadas result = apiInstance.cobvGet(inicio, fim, cpf, cnpj, locationPresente, status, loteCobVId, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobVApi#cobvGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | [**OffsetDateTime**](.md)|  |
 **fim** | [**OffsetDateTime**](.md)|  |
 **cpf** | **String**|  | [optional]
 **cnpj** | **String**|  | [optional]
 **locationPresente** | **Boolean**|  | [optional]
 **status** | **String**|  | [optional]
 **loteCobVId** | **Integer**|  | [optional]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**CobsVConsultadas**](CobsVConsultadas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="cobvTxidGet"></a>
# **cobvTxidGet**
> CobVCompleta cobvTxidGet(txid, revisao)

Consultar cobrança com vencimento.

Endpoint para consultar uma cobrança com vencimento através de um determinado txid.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.CobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobVApi apiInstance = new CobVApi();
String txid = "txid_example"; // String | 
Integer revisao = 56; // Integer | 
try {
    CobVCompleta result = apiInstance.cobvTxidGet(txid, revisao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobVApi#cobvTxidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | [**String**](.md)|  |
 **revisao** | [**Integer**](.md)|  | [optional]

### Return type

[**CobVCompleta**](CobVCompleta.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="cobvTxidPatch"></a>
# **cobvTxidPatch**
> CobVGerada cobvTxidPatch(body, txid)

Revisar cobrança com vencimento.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.CobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobVApi apiInstance = new CobVApi();
CobVRevisada body = new CobVRevisada(); // CobVRevisada | Dados para geração da cobrança.
String txid = "txid_example"; // String | 
try {
    CobVGerada result = apiInstance.cobvTxidPatch(body, txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobVApi#cobvTxidPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CobVRevisada**](CobVRevisada.md)| Dados para geração da cobrança. |
 **txid** | [**String**](.md)|  |

### Return type

[**CobVGerada**](CobVGerada.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="cobvTxidPut"></a>
# **cobvTxidPut**
> CobVGerada cobvTxidPut(body, txid)

Criar cobrança com vencimento.

Endpoint para criar uma cobrança com vencimento.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.CobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobVApi apiInstance = new CobVApi();
CobVSolicitada body = new CobVSolicitada(); // CobVSolicitada | Dados para geração da cobrança com vencimento.
String txid = "txid_example"; // String | 
try {
    CobVGerada result = apiInstance.cobvTxidPut(body, txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobVApi#cobvTxidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CobVSolicitada**](CobVSolicitada.md)| Dados para geração da cobrança com vencimento. |
 **txid** | [**String**](.md)|  |

### Return type

[**CobVGerada**](CobVGerada.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

