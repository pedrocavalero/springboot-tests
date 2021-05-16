# CobPayloadApi

All URIs are relative to *https://pix.example.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cobvPixUrlAccessTokenGet**](CobPayloadApi.md#cobvPixUrlAccessTokenGet) | **GET** /cobv/{pixUrlAccessToken} | Recuperar o payload JSON que representa a cobrança com vencimento.
[**pixUrlAccessTokenGet**](CobPayloadApi.md#pixUrlAccessTokenGet) | **GET** /{pixUrlAccessToken} | Recuperar o payload JSON que representa a cobrança imediata.

<a name="cobvPixUrlAccessTokenGet"></a>
# **cobvPixUrlAccessTokenGet**
> CobVPayload cobvPixUrlAccessTokenGet(pixUrlAccessToken, codMun, DPP)

Recuperar o payload JSON que representa a cobrança com vencimento.

## Endpoint (location) que serve um payload que representa uma cobrança com vencimento.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.api.CobPayloadApi;


CobPayloadApi apiInstance = new CobPayloadApi();
String pixUrlAccessToken = "pixUrlAccessToken_example"; // String | 
String codMun = "codMun_example"; // String | Código baseado na Tabela de Códigos de Municípios do __[IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__ que apresenta a lista dos municípios brasileiros associados a um código composto de 7 dígitos, sendo os dois primeiros referentes ao código da Unidade da Federação. 
LocalDate DPP = new LocalDate(); // LocalDate | Data de pagamento pretendida. Trata-se de uma data, no formato `YYYY-MM-DD`, segundo ISO 8601.
try {
    CobVPayload result = apiInstance.cobvPixUrlAccessTokenGet(pixUrlAccessToken, codMun, DPP);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobPayloadApi#cobvPixUrlAccessTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pixUrlAccessToken** | **String**|  |
 **codMun** | **String**| Código baseado na Tabela de Códigos de Municípios do __[IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__ que apresenta a lista dos municípios brasileiros associados a um código composto de 7 dígitos, sendo os dois primeiros referentes ao código da Unidade da Federação.  | [optional]
 **DPP** | **LocalDate**| Data de pagamento pretendida. Trata-se de uma data, no formato &#x60;YYYY-MM-DD&#x60;, segundo ISO 8601. | [optional]

### Return type

[**CobVPayload**](CobVPayload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jose, application/problem+json

<a name="pixUrlAccessTokenGet"></a>
# **pixUrlAccessTokenGet**
> CobPayload pixUrlAccessTokenGet(pixUrlAccessToken)

Recuperar o payload JSON que representa a cobrança imediata.

## Endpoint (location) que serve um payload que representa uma cobrança imediata.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 

### Example
```java
// Import classes:
//import com.pedrocavalero.pix.client.invoker.ApiException;
//import com.pedrocavalero.pix.client.api.CobPayloadApi;


CobPayloadApi apiInstance = new CobPayloadApi();
String pixUrlAccessToken = "pixUrlAccessToken_example"; // String | 
try {
    CobPayload result = apiInstance.pixUrlAccessTokenGet(pixUrlAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobPayloadApi#pixUrlAccessTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pixUrlAccessToken** | **String**|  |

### Return type

[**CobPayload**](CobPayload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jose, application/problem+json

