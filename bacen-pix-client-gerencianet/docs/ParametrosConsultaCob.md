# ParametrosConsultaCob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inicio** | [**OffsetDateTime**](OffsetDateTime.md) | Data inicial utilizada na consulta. Respeita RFC 3339. | 
**fim** | [**OffsetDateTime**](OffsetDateTime.md) | Data de fim utilizada na consulta. Respeita RFC 3339. | 
**cpf** | **String** | Filtro pelo CPF do devedor. Não pode ser utilizado ao mesmo tempo que o CNPJ. |  [optional]
**cnpj** | **String** | Filtro pelo CNPJ do devedor. Não pode ser utilizado ao mesmo tempo que o CPF. |  [optional]
**locationPresente** | **Boolean** | Filtro pela existência de location vinculada. |  [optional]
**status** | **String** | Filtro pelo status das cobranças. |  [optional]
**paginacao** | [**Paginacao**](Paginacao.md) |  | 
