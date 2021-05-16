# CobRevisada

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chave** | **String** | # Formato do campo chave  * O campo chave determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \&quot;Formatação das chaves do DICT no BR Code\&quot; do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos).  |  [optional]
**solicitacaoPagador** | **String** | O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation &lt;RmtInf&gt;. O tamanho do campo &lt;RmtInf&gt; na pacs.008 está limitado a 140 caracteres. |  [optional]
**infoAdicionais** | [**List&lt;CobBaseInfoAdicionais&gt;**](CobBaseInfoAdicionais.md) | Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador. |  [optional]
**devedor** | **Object** | Os campos aninhados sob o objeto devedor são opcionais e identificam o devedor, ou seja, a pessoa ou a instituição a quem a cobrança está endereçada. Não identifica, necessariamente, quem irá efetivamente realizar o pagamento. Um CPF pode ser o devedor de uma cobrança, mas pode acontecer de outro CPF realizar, efetivamente, o pagamento do documento. Não é permitido que o campo devedor.cpf e campo devedor.cnpj estejam preenchidos ao mesmo tempo. Se o campo devedor.cnpj está preenchido, então o campo devedor.cpf não pode estar preenchido, e vice-versa. Se o campo devedor.nome está preenchido, então deve existir ou um devedor.cpf ou um campo devedor.cnpj preenchido. |  [optional]
**loc** | **Object** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**valor** | [**CobValor**](CobValor.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEBEDOR | &quot;REMOVIDA_PELO_USUARIO_RECEBEDOR&quot;
