# ParametrosConsultaPayloadLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inicio** | [**OffsetDateTime**](OffsetDateTime.md) | Data inicial utilizada na consulta. Respeita RFC 3339. | 
**fim** | [**OffsetDateTime**](OffsetDateTime.md) | Data de fim utilizada na consulta. Respeita RFC 3339. | 
**txIdPresente** | **Boolean** | Filtro pela existência de txid. |  [optional]
**tipoCob** | [**TipoCobEnum**](#TipoCobEnum) |  |  [optional]
**paginacao** | [**Paginacao**](Paginacao.md) |  | 

<a name="TipoCobEnum"></a>
## Enum: TipoCobEnum
Name | Value
---- | -----
COB | &quot;cob&quot;
COBV | &quot;cobv&quot;
