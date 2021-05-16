# Devolucao

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**rtrId** | **String** | ReturnIdentification que transita na PACS004. | 
**valor** | **String** | Valor a devolver. | 
**horario** | [**DevolucaoHorario**](DevolucaoHorario.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) | Status da devolução. | 
**motivo** | **String** | # Status da Devolução  Campo opcional que pode ser utilizado pelo PSP recebedor para detalhar os motivos de a devolução ter atingido o status em questão. Pode ser utilizado, por exemplo, para detalhar o motivo de a devolução não ter sido realizada.            |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot;
DEVOLVIDO | &quot;DEVOLVIDO&quot;
NAO_REALIZADO | &quot;NAO_REALIZADO&quot;
