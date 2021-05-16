# CobVGerada

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devedor** | **Object** | O objeto devedor organiza as informações sobre o devedor da cobrança. | 
**recebedor** | **Object** | O objeto recebedor organiza as informações sobre o credor da cobrança. | 
**chave** | **String** | # Formato do campo chave  * O campo chave determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \&quot;Formatação das chaves do DICT no BR Code\&quot; do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos).  | 
**solicitacaoPagador** | **String** | O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation &lt;RmtInf&gt;. O tamanho do campo &lt;RmtInf&gt; na pacs.008 está limitado a 140 caracteres. |  [optional]
**infoAdicionais** | [**List&lt;CobBaseInfoAdicionais&gt;**](CobBaseInfoAdicionais.md) | Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador. |  [optional]
**loc** | **Object** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**valor** | **Object** |  | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ATIVA | &quot;ATIVA&quot;
CONCLUIDA | &quot;CONCLUIDA&quot;
REMOVIDA_PELO_USUARIO_RECEBEDOR | &quot;REMOVIDA_PELO_USUARIO_RECEBEDOR&quot;
REMOVIDA_PELO_PSP | &quot;REMOVIDA_PELO_PSP&quot;
