# ParametrosConsultaPix

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inicio** | [**OffsetDateTime**](OffsetDateTime.md) | Data inicial utilizada na consulta. Respeita RFC 3339. | 
**fim** | [**OffsetDateTime**](OffsetDateTime.md) | Data de fim utilizada na consulta. Respeita RFC 3339. | 
**txid** | **AllOfParametrosConsultaPixTxid** |  |  [optional]
**txIdPresente** | **Boolean** | Filtro pela existência de txid. |  [optional]
**devolucaoPresente** | **Boolean** | Filtro pela existência de devolução. |  [optional]
**cpf** | **String** | CPF |  [optional]
**cnpj** | **String** | CNPJ |  [optional]
**paginacao** | [**Paginacao**](Paginacao.md) |  | 
