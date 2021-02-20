
# CobrancaPatchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devedor** | [**CobrancasDevedor**](CobrancasDevedor.md) |  |  [optional]
**valor** | [**CobrancasValor**](CobrancasValor.md) |  |  [optional]
**calendario** | [**CobrancaPutRequestCalendario**](CobrancaPutRequestCalendario.md) |  |  [optional]
**infoAdicionais** | [**List&lt;CobrancasInfoAdicionais&gt;**](CobrancasInfoAdicionais.md) | Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador |  [optional]
**solicitacaoPagador** | **String** | O campo solicitacaoPagador, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor |  [optional]
**status** | **String** | Status da Cobrança |  [optional]



