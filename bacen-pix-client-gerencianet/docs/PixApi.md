# PixApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pixE2eidDevolucaoIdGet**](PixApi.md#pixE2eidDevolucaoIdGet) | **GET** /pix/{e2eid}/devolucao/{id} | Consultar devolução.
[**pixE2eidDevolucaoIdPut**](PixApi.md#pixE2eidDevolucaoIdPut) | **PUT** /pix/{e2eid}/devolucao/{id} | Solicitar devolução.
[**pixE2eidGet**](PixApi.md#pixE2eidGet) | **GET** /pix/{e2eid} | Consultar Pix.
[**pixGet**](PixApi.md#pixGet) | **GET** /pix | Consultar Pix recebidos.

<a name="pixE2eidDevolucaoIdGet"></a>
# **pixE2eidDevolucaoIdGet**
> Devolucao pixE2eidDevolucaoIdGet(e2eid, id)

Consultar devolução.

Endpoint para consultar uma devolução através de um End To End ID do Pix e do ID da devolução

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PixApi apiInstance = new PixApi();
String e2eid = "e2eid_example"; // String | 
String id = "id_example"; // String | 
try {
    Devolucao result = apiInstance.pixE2eidDevolucaoIdGet(e2eid, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PixApi#pixE2eidDevolucaoIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **e2eid** | [**String**](.md)|  |
 **id** | [**String**](.md)|  |

### Return type

[**Devolucao**](Devolucao.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="pixE2eidDevolucaoIdPut"></a>
# **pixE2eidDevolucaoIdPut**
> Devolucao pixE2eidDevolucaoIdPut(body, e2eid, id)

Solicitar devolução.

Endpoint para solicitar uma devolução através de um e2eid do Pix e do ID da devolução. O motivo que será atribuído à PACS.004 será \&quot;Devolução solicitada pelo usuário recebedor do pagamento original\&quot; cuja sigla é \&quot;MD06\&quot; de acordo com a aba RTReason da PACS.004 que consta no Catálogo de Mensagens do Pix. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PixApi apiInstance = new PixApi();
DevolucaoSolicitada body = new DevolucaoSolicitada(); // DevolucaoSolicitada | Dados para pedido de devolução.
String e2eid = "e2eid_example"; // String | 
String id = "id_example"; // String | 
try {
    Devolucao result = apiInstance.pixE2eidDevolucaoIdPut(body, e2eid, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PixApi#pixE2eidDevolucaoIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DevolucaoSolicitada**](DevolucaoSolicitada.md)| Dados para pedido de devolução. |
 **e2eid** | [**String**](.md)|  |
 **id** | [**String**](.md)|  |

### Return type

[**Devolucao**](Devolucao.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="pixE2eidGet"></a>
# **pixE2eidGet**
> Pix pixE2eidGet(e2eid)

Consultar Pix.

Endpoint para consultar um Pix através de um e2eid.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PixApi apiInstance = new PixApi();
String e2eid = "e2eid_example"; // String | 
try {
    Pix result = apiInstance.pixE2eidGet(e2eid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PixApi#pixE2eidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **e2eid** | [**String**](.md)|  |

### Return type

[**Pix**](Pix.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="pixGet"></a>
# **pixGet**
> PixConsultados pixGet(inicio, fim, txid, txIdPresente, devolucaoPresente, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar Pix recebidos.

Endpoint para consultar Pix recebidos

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.PixApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PixApi apiInstance = new PixApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
Txid txid = new Txid(); // Txid | 
Boolean txIdPresente = true; // Boolean | 
Boolean devolucaoPresente = true; // Boolean | 
String cpf = "cpf_example"; // String | 
String cnpj = "cnpj_example"; // String | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    PixConsultados result = apiInstance.pixGet(inicio, fim, txid, txIdPresente, devolucaoPresente, cpf, cnpj, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PixApi#pixGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | [**OffsetDateTime**](.md)|  |
 **fim** | [**OffsetDateTime**](.md)|  |
 **txid** | [**Txid**](.md)|  | [optional]
 **txIdPresente** | **Boolean**|  | [optional]
 **devolucaoPresente** | **Boolean**|  | [optional]
 **cpf** | **String**|  | [optional]
 **cnpj** | **String**|  | [optional]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**PixConsultados**](PixConsultados.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

