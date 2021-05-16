# LoteCobVApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lotecobvGet**](LoteCobVApi.md#lotecobvGet) | **GET** /lotecobv | Consultar lotes de cobranças com vencimento.
[**lotecobvIdGet**](LoteCobVApi.md#lotecobvIdGet) | **GET** /lotecobv/{id} | Consultar um lote específico de cobranças com vencimento.
[**lotecobvIdPatch**](LoteCobVApi.md#lotecobvIdPatch) | **PATCH** /lotecobv/{id} | Utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.
[**lotecobvIdPut**](LoteCobVApi.md#lotecobvIdPut) | **PUT** /lotecobv/{id} | Criar/Alterar lote de cobranças com vencimento.

<a name="lotecobvGet"></a>
# **lotecobvGet**
> LotesCobVConsultados lotecobvGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar lotes de cobranças com vencimento.

Endpoint para consultar lista de lotes de cobranças com vencimento.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.LoteCobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

LoteCobVApi apiInstance = new LoteCobVApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    LotesCobVConsultados result = apiInstance.lotecobvGet(inicio, fim, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoteCobVApi#lotecobvGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | [**OffsetDateTime**](.md)|  |
 **fim** | [**OffsetDateTime**](.md)|  |
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**LotesCobVConsultados**](LotesCobVConsultados.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="lotecobvIdGet"></a>
# **lotecobvIdGet**
> LoteCobVConsultado lotecobvIdGet(id)

Consultar um lote específico de cobranças com vencimento.

Endpoint para consultar um lote de cobranças com vencimento. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.LoteCobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

LoteCobVApi apiInstance = new LoteCobVApi();
String id = "id_example"; // String | 
try {
    LoteCobVConsultado result = apiInstance.lotecobvIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoteCobVApi#lotecobvIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**LoteCobVConsultado**](LoteCobVConsultado.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="lotecobvIdPatch"></a>
# **lotecobvIdPatch**
> lotecobvIdPatch(body, id)

Utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.

Endpoint utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.   A diferença deste endpoint para o endpoint PUT correlato é que este endpoint admite um array &#x60;cobsv&#x60; com menos solicitações de criação ou alteração de cobranças do que o array atribuído na requisição originária do lote.  Não se pode, entretanto, utilizar esse endpoint para agregar ou remover solicitações de alteração ou criação de cobranças conforme constam na requisição originária do lote.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.LoteCobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

LoteCobVApi apiInstance = new LoteCobVApi();
Object body = {
  "$ref" : "#/components/examples/loteCobVBodyRevisado1"
}; // Object | Dados para geração de lote de cobranças com vencimento.
String id = "id_example"; // String | 
try {
    apiInstance.lotecobvIdPatch(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling LoteCobVApi#lotecobvIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Dados para geração de lote de cobranças com vencimento. |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a name="lotecobvIdPut"></a>
# **lotecobvIdPut**
> lotecobvIdPut(body, id)

Criar/Alterar lote de cobranças com vencimento.

Endpoint utilizado para criar ou alterar um lote de cobranças com vencimento.  Para o caso de uso de alteração de cobranças, o array a ser atribuído na requisicão deve ser composto pelas exatas requisições de criação de cobranças que constaram no array atribuído na requisição originária.  Não se pode utilizar este endpoint para _alterar_ um lote de cobranças com vencimento agregando ou removendo cobranças já existentes dentro do conjunto de cobranças criadas na requisição originária do lote.  Em outras palavras, se originalmente criou-se um lote, por exemplo, com as cobranças [&#x60;a&#x60;, &#x60;b&#x60; e &#x60;c&#x60;], não se pode _alterar_ esse conjunto de cobranças original que o lote representa para [&#x60;a&#x60;, &#x60;b&#x60;, &#x60;c&#x60;, &#x60;d&#x60;], ou para [&#x60;a&#x60;, &#x60;b&#x60;]. Por outro lado, pode-se alterar, _em lote_ as cobranças [&#x60;a&#x60;, &#x60;b&#x60;, &#x60;c&#x60;], conforme originalmente constam na requisição originária do lote.  Uma solicitação de __criação__ de cobrança com status \&quot;EM_PROCESSAMENTO\&quot; ou \&quot;NEGADA\&quot; está associada a uma cobrança não _existe_ de fato, portanto não será listada em &#x60;GET /cobv&#x60; ou &#x60;GET /cobv/{txid}&#x60;.  Uma cobrança, uma vez criada via &#x60;PUT /cobv/{txid}&#x60;, não pode ser associada a um lote posteriormente.  Uma cobrança, uma vez criada via &#x60;PUT /lotecobv/{id}&#x60;, não pode ser associada a um novo lote posteriormente.

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiClient;
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.invoker.Configuration;
//import com.pedrocavalero.pix.client.invoker.auth.*;
//import com.pedrocavalero.pix.client.api.LoteCobVApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

LoteCobVApi apiInstance = new LoteCobVApi();
Object body = {
  "$ref" : "#/components/examples/loteCobVBody1"
}; // Object | Dados para geração de lote de cobranças com vencimento.
String id = "id_example"; // String | 
try {
    apiInstance.lotecobvIdPut(body, id);
} catch (ApiException e) {
    System.err.println("Exception when calling LoteCobVApi#lotecobvIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Dados para geração de lote de cobranças com vencimento. |
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

