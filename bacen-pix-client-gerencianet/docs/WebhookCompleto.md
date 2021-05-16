# WebhookCompleto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**webhookUrl** | **String** |  | 
**chave** | **String** | # Formato do campo chave  * O campo chave determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \&quot;Formatação das chaves do DICT no BR Code\&quot; do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos).  | 
**criacao** | [**OffsetDateTime**](OffsetDateTime.md) | Data e hora em que o webhook foi cadastrado. Respeita RFC 3339. | 
