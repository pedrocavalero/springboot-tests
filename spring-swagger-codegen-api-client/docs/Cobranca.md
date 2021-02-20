
# Cobranca

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devedor** | [**CobrancasDevedor**](CobrancasDevedor.md) |  |  [optional]
**valor** | [**CobrancasValor**](CobrancasValor.md) |  | 
**chave** | **String** | Chave Pix do Sistema DICT - BACEN | 
**calendario** | [**CobrancasCalendario**](CobrancasCalendario.md) |  | 
**txid** | **String** | ID de identificação do documento entre os bancos e o cliente emissor.O campo txid é obrigatório e determina o identificador da transação.O objetivo desse campo é ser um elemento que possibilite a conciliação de pagamentos. O txid é criado exclusivamente pelo usuário recebedor e está sob sua responsabilidade. Deve ser único por CNPJ do recebedor. Apesar de possuir o tamanho de 35 posições (PAC008), para QR Code Estático o tamanho máximo permitido é de 25 posições (limitação EMV). No caso do QR Code dinâmico o campo deve possuir de 26 posição até 35 posições. Os caracteres permitidos no contexto do Pix para o campo txId são:Letras minúsculas, de ‘a’ a ‘z’, Letras maiúsculas, de ‘A’ a ‘Z’, Dígitos decimais, de ‘0’ a ‘9’ | 
**infoAdicionais** | [**List&lt;CobrancasInfoAdicionais&gt;**](CobrancasInfoAdicionais.md) | Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador |  [optional]
**location** | **String** | URL com a Localização do Payload informado na criação da cobrança | 
**revisao** | [**BigDecimal**](BigDecimal.md) | Quantidade de revisões da cobrança | 
**solicitacaoPagador** | **String** | O campo solicitacaoPagador, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor |  [optional]
**pix** | [**List&lt;PixsPix&gt;**](PixsPix.md) | Lista de Pix recebidos |  [optional]
**status** | **String** | Status da Cobrança. Pode ser: ATIVA, CONCLUIDA, REMOVIDA_PELO_USUARIO_RECEBEDOR, REMOVIDA_PELO_PSP | 



