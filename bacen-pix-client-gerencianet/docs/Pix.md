# Pix

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endToEndId** | **String** |  | 
**txid** | **AllOfPixTxid** |  |  [optional]
**valor** | **String** | Valor do Pix. | 
**chave** | **String** | # Formato do campo chave  * Campo chave do recebedor conforme atribuído na respectiva PACS008. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \&quot;Formatação das chaves do DICT no BR Code\&quot; do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos).  |  [optional]
**horario** | [**OffsetDateTime**](OffsetDateTime.md) | Horário em que o Pix foi processado no PSP. | 
**infoPagador** | **String** |  |  [optional]
**devolucoes** | [**List&lt;Devolucao&gt;**](Devolucao.md) |  |  [optional]
