# LoteCobVConsultadoCobsv

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**problema** | [**Problema**](Problema.md) |  |  [optional]
**criacao** | [**OffsetDateTime**](OffsetDateTime.md) | Data e hora em que a cobrança foi criada. Respeita RFC 3339. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot;
CRIADA | &quot;CRIADA&quot;
NEGADA | &quot;NEGADA&quot;
