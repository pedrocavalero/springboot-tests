
# PixsPix

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**horario** | [**OffsetDateTime**](OffsetDateTime.md) | Horário do pagamento. | 
**devolucoes** | [**List&lt;PixsDevolucoes&gt;**](PixsDevolucoes.md) | Devolucoes registradas no documento |  [optional]
**pagador** | [**PixsPagador**](PixsPagador.md) |  |  [optional]
**valor** | **String** | Valor do pagamento. | 
**txid** | **String** | ID de identificação do documento entre os bancos e o cliente emissor.O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’ |  [optional]
**infoPagador** | **String** | Informação livre do pagador. |  [optional]
**endToEndId** | **String** | Id fim a fim da transação.Esse campo é o &#39;id do pagamento&#39;. Transita nas mensagens de recebimento dos QR Codes e transferências. | 



