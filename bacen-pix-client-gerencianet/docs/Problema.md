# Problema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | URI de referência que identifica o tipo de problema. De acordo com a RFC 7807. | 
**title** | **String** | Descrição resumida do problema. | 
**status** | **Integer** | Código HTTP do status retornado. | 
**detail** | **String** | Descrição completa do problema. |  [optional]
**correlationId** | **String** | Identificador de correlação do problema para fins de suporte |  [optional]
**violacoes** | [**List&lt;Violacao&gt;**](Violacao.md) |  |  [optional]
