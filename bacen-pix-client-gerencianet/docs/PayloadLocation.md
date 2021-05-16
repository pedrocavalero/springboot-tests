# PayloadLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**location** | **String** | Localização do Payload a ser informada na criação da cobrança. | 
**tipoCob** | [**TipoCobEnum**](#TipoCobEnum) |  | 
**criacao** | [**OffsetDateTime**](OffsetDateTime.md) | Data e hora em que a location foi criada. Respeita RFC 3339. | 

<a name="TipoCobEnum"></a>
## Enum: TipoCobEnum
Name | Value
---- | -----
COB | &quot;cob&quot;
COBV | &quot;cobv&quot;
