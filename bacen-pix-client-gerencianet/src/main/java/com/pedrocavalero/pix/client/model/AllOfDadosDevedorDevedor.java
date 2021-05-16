/*
 * API Pix
 * A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e consultas. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços Pix do PSP.  # Evolução da API Pix  A API Pix busca respeitar __[SemVer](https://semver.org/lang/pt-BR/)__. Nesse sentido, mudanças compatíveis não devem gerar nova versão _major_.  A versão da API é composta por 4 elementos: _major_, _minor_, _patch_ e _release candidate_. A versão `v[x]`que consta no path da URL é o elemento _major_ da versão da API. A evolução da versão se dá seguinte forma:    - Major: alterações incompatíveis, com quebra de contrato (v1.0.0 → v2.0.0)   - Minor: alterações compatíveis, sem quebra de contrato (v1.1.0 → v1.2.0)   - Patch: bugfixes, esclarecimentos às especificações, sem alterações funcionais (v1.1.1 → v1.1.2)   - Release candidate: versões de pré-lançamento de qualquer patch futuro, minor ou major (v1.0.0-rc.1 → v1.0.0-rc.22)  Alterações sem quebra de contrato e esclarecimentos às especificações podem ocorrer a qualquer momento. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  As seguintes mudanças são esperadas e consideradas retrocompatíveis:  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações   # Tratamento de erros  A API Pix retorna códigos de status HTTP para indicar sucesso ou falhas das requisições.  Códigos `2xx` indicam sucesso. Códigos `4xx` indicam falhas causadas pelas informações enviadas pelo cliente ou pelo estado atual das entidades. Códigos `5xx` indicam problemas no serviço no lado da API Pix.  As respostas de erro incluem no corpo detalhes do erro seguindo o _schema_ da [RFC 7807](https://tools.ietf.org/html/rfc7807).  O campo `type` identifica o tipo de erro e na API Pix segue o padrão:  `https://pix.bcb.gov.br/api/v2/error/<TipoErro>`  O padrão acima listado, referente ao campo `type`, não consiste, necessariamente, em uma URL que apresentará uma página web válida, ou um endpoint válido, embora possa, futuramente, ser exatamente o caso. O objetivo primário é apenas e tão somente identificar o tipo de erro.  Abaixo estão listados os tipos de erro e possíveis violações da API Pix.  ## Gerais  Esta seção reúne erros que poderiam ser retornados por quaisquer endpoints listados na API Pix.  ### `RequisicaoInvalida`    * __Significado__: Requisição inválida.   * __HTTP Status Code__: [400 Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1).  ### `AcessoNegado`    * __Significado__: Requisição de participante autenticado que viola alguma regra de autorização.   * __HTTP Status Code__: [403 Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3).  ### `NaoEncontrado`    * __Significado__: Entidade não encontrada.   * __HTTP Status Code__: [404 Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4).  ### `PermanentementeRemovido`    * __Significado__: Indica que a entidade existia, mas foi permanentemente removida.   * __HTTP Status Code__: [410 Gone](https://tools.ietf.org/html/rfc7231#section-6.5.9).  ### `ErroInternoDoServidor`    * __Significado__: Condição inesperada ao processar requisição.   * __HTTP Status Code__: [500 Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1).  ### `ServicoIndisponivel`    * __Significado__: Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.   * __HTTP Status Code__: [503 Service Unavailable](https://tools.ietf.org/html/rfc7231#section-6.6.4).  ### `IndisponibilidadePorTempoEsgotado`    * __Significado__: Indica que o serviço demorou além do esperado para retornar.   * __HTTP Status Code__: [504 Gateway Timeout](https://tools.ietf.org/html/rfc7231#section-6.6.5).    ## Tag  CobPayload   Esta seção reúne erros retornados pelos endpoints organizados sob a tag `CobPayload`. Estes erros indicam problemas na tentativa de recuperação, via _location_, do Payload JSON que representa a cobrança.  ### `CobPayloadNaoEncontrado`  * __Significado__: a cobrança em questão não foi encontrada para a location requisitada. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4) ou [410](https://tools.ietf.org/html/rfc7231#section-6.5.9). * __endpoints__: `GET /{pixUrlAccessToken}`, `GET /cobv/{pixUrlAccessToken}`.  Se a presente location exibia uma cobrança, mas não a exibirá mais de maneira permanentemente, pode-se aplicar o HTTP status code [410](https://tools.ietf.org/html/rfc7231#section-6.5.9). Se a presente location não está exibindo nenhuma cobrança, pode-se utilizar o HTTP status code [404](https://tools.ietf.org/html/rfc7231#section-6.5.4).  Uma cobrança pode estar \"expirada\" (`calendario.expiracao`), \"vencida\", \"Concluida\", entre outros estados em que não poderia ser efetivamente paga. Nesses casos, é uma liberalidade do PSP recebedor retornar o presente código de erro ou optar por servir o payload de qualquer maneira, objetivando fornecer uma informação adicional ao usuário pagador final a respeito da cobrança.  ### `CobPayloadOperacaoInvalida`  * __Significado__: a cobrança existe, mas a requisição é inválida. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cobv/{pixUrlAccessToken}`.  __Violações__:   - `codMun` não respeita o schema.   - `codMun` não é um código válido segundo a __[tabela de municípios do IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__.   - `DPP` não respeita o schema.   - `DPP` anterior ao momento presente.   - `DPP` superior à validade da cobrança em função dos parâmetros `calendario.dataDeVencimento`   e `calendario.validadeAposVencimento`. Exemplo: `dataDeVencimento` => 2020-12-25,   `validadeAposVencimento` => 10, `DPP` => 2021-01-05. Neste exemplo, o parâmetro `DPP` é   inválido considerando o contexto apresentado porque é uma data em que a cobrança   não poderá ser paga. A cobrança, neste exemplo, não será considerada válida   a partir da data 2021-01-05.  ## Tag Cob  Esta seção reúne erros retornados pelos endpoints organizados sob a tag `Cob`. Esses erros indicam problemas no gerenciamento de uma cobrança para pagamento imediato.  ### `CobNaoEncontrado`  * __Significado__: Cobrança não encontrada para o txid informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /cob/{txid}`.  ### `CobOperacaoInvalida`  * __Significado__: a requisição que busca alterar ou criar uma cobrança para pagamento imediato não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[POST|PUT|PATCH] /cob/{txid}`.  __Violações__ para os endpoints `PUT|PATCH /cob/{txid}`:   - O campo cob.calendario.expiracao é igual ou menor que zero.   - O campo cob.valor.original não respeita o _schema_.   - O campo cob.valor.original é zero.   - O objeto cob.devedor não respeita o _schema_.   - O campo cob.chave não respeita o _schema_.   - O campo cob.chave corresponde a uma conta que não pertence a este usuário recebedor.   - O campo solicitacaoPagador não respeita o _schema_.   - O objeto infoAdicionais não respeita o _schema.   - O location referenciado por loc.id inexiste.   - O location referenciado por loc.id já está sendo utilizado por outra cobrança.   - O location referenciado por cob.loc.id apresenta tipo \"cobv\" (deveria ser \"cob\").  __Violações__ específicas para o endpoint `PUT /cob/{txid}`:   - A cobrança já existe, não está no status ATIVA, e a presente requisição busca alterá-la.  __Violações__ específicas para o endpoint `PATCH /cob/{txid}`:   - A cobrança não está ATIVA, e a presente requisição busca alterá-la.   - A cobrança está ATIVA, e a presente requisição propõe alterar   seu status para _REMOVIDA_PELO_USUARIO_RECEBEDOR_ juntamente com outras alterações   (não faz sentido remover uma cobrança ao mesmo tempo em que se realizam   alterações que não serão aproveitadas).   - o campo cob.status não respeita o _schema_.  ### `CobConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de cobranças para pagamento imediato não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cob` e `GET /cob/{txid}`.  __Violações__ específicas para o endpoint `GET /cob`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  __Violações__ específicas para o endpoint `GET /cob/{txid}`:   - o parâmetro `revisao` corresponde a uma revisão inexistente para a cobrança   apontada pelo parâmetro `txid`.  ## Tag CobV  Esta seção reúne erros retornados pelos endpoints organizados sob a tag `CobV`. Esses erros indicam problemas no gerenciamento de uma cobrança com vencimento.  ### `CobVNaoEncontrada`  * __Significado__: Cobrança com vencimento não encontrada para o txid informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /cobv/{txid}`.  ### `CobVOperacaoInvalida`  * __Significado__: a requisição que busca alterar ou criar uma cobrança com vencimento não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[PUT|PATCH] /cobv/{txid}`.  __Violações__ para os endpoints `PUT|PATCH /cobv/{txid}`:   - Este `txid` está associado a um lote e no referido lote, o status desta cobrança está atribuído como   \"EM_PROCESSAMENTO\" ou \"NEGADA\".   - O campo `cobv.calendario.dataDeVencimento` é anterior à data de criação da cobrança.   - O campo `cobv.calendario.validadeAposVencimento` é menor do que zero.   - O objeto `cobv.devedor` não respeita o schema.   - O objeto `cobv.devedor` não respeita o _schema_.   - O campo `cobv.chave` não respeita o _schema_.   - O campo `cobv.chave` corresponde a uma conta que não pertence a este usuário recebedor.   - O campo `solicitacaoPagador` não respeita o _schema_.   - O objeto `infoAdicionais` não respeita o _schema.   - O location referenciado por `cobv.loc.id` inexiste.   - O location referenciado por `cobv.loc.id` já está sendo utilizado por outra cobrança.   - O location referenciado por `cobv.loc.id` apresenta tipo \"cob\" (deveria ser \"cobv\").   - O campo `cobv.valor.original` não respeita o _schema_.   - O campo `cobv.valor.original` apresenta o valor `zero`.   - O objeto `cobv.valor.multa` não respeita o _schema_.   - O objeto `cobv.valor.juros` não respeita o _schema_.   - O objeto `cobv.valor.abatimento` não respeita o _schema_.   - O objeto `cobv.valor.desconto` não respeita o _schema_.   - O objeto `cobv.valor.abatimento` representa um valor maior ou igual ao valor da   cobrança original ou maior ou igual a 100%.   - O objeto `cobv.valor.desconto` apresenta algum elemento de desconto que representa um valor maior ou   igual ao valor da cobrança original ou maior ou igual a 100%.   - O objeto `cobv.valor.desconto` apresenta algum elemento cuja data seja posterior à data de vencimento   representada por `calendario.dataDeVencimento`.   - O objeto `cobv.valor.desconto` apresenta modalidade no valor `1` ou `2`,   porém `cobv.valor.desconto.valorPerc` encontra-se preenchido   - O objeto `cobv.valor.desconto` apresenta modalidade no valor `1` ou `2`, porém   o array `cobv.valor.desconto.descontoDataFixa` está vazio ou nulo.   - O objeto `cobv.valor.desconto` apresenta modalidade nos valores de `3` a `6`, porém   o elemento `cobv.valor.desconto.valorPerc` não está preenchido.   - O objeto `cobv.valor.desconto` apresenta modalidade nos valores de `3` a `6`, porém   o elemento `cobv.valor.desconto.descontoDataFixa` está preenchido ou não nulo.    __Violações__ específicas para o endpoint `PUT /cobv/{txid}`:   - A cobrança já existe, não está ATIVA, e a presente requisição busca alterá-la  __Violações__ específicas para o endpoint `PATCH /cobv/{txid}`:   - A cobrança não está ATIVA, e a presente requisição busca alterá-la   - A cobrança está ATIVA, e a presente requisição propõe alterar   seu status para _REMOVIDA_PELO_USUARIO_RECEBEDOR_ juntamente com outras alterações   (não faz sentido remover uma cobrança ao mesmo tempo em que se realizam   alterações que não serão aproveitadas).   - o campo cob.status não respeita o _schema_.  ### `CobVConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de cobranças com vencimento não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cobv` e `GET /cobv/{txid}`.  __Violações__ específicas para o endpoint `GET /cobv`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  __Violações__ específicas para o endpoint `GET /cobv/{txid}`:   - o parâmetro `revisao` corresponde a uma revisão inexistente para a cobrança   apontada pelo parâmetro `txid`.  ## Tag LoteCobV Esta seção reúne erros referentes a endpoints que tratam do gerenciamento de lotes de cobrança.  ### `LoteCobVNaoEncontrado` * __Significado__: Lote não encontrado para o `id` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /lotecobv/{id}`.  ### `LoteCobVOperacaoInvalida` * __Significado__: a requisição que busca alterar ou criar um lote de cobranças com vencimento não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[PUT|PATCH] /lotecobv/{id}`.  __Violações__ para os endpoints `PUT|PATCH /lotecobv/{id}`:   - O campo loteCobV.descricao não respeita o schema.   - O objeto loteCobV.cobsV não respeita o schema.  __Violações__ para o endpoint `PUT /lotecobv/{id}`:   - a presente requisição tenta criar um conjunto de cobranças dentre as quais pelo menos   uma cobrança já encontra-se criada.   - a presente requisição busca alterar um lote já existente, entretanto contém um array de   solicitações de alteração de cobranças que não referencia exatamente as mesmas cobranças   referenciadas pela requisição original que criou o lote.   Uma vez criado um lote, não se pode remover ou adicionar solicitações de   criação ou alteração de cobranças a este lote.  __Violações__ para o endpoint `PATCH /lotecobv/{id}`:   - a presente requisição busca alterar um lote já existente e contém, no `array`   de cobranças representado por `cobsv`, uma cobrança não existente no array de cobranças   atribuído pela requisição original que criou o lote.   Uma vez criado um lote, não se pode remover ou adicionar cobranças a este lote.  __Violações__ para os endpoints `GET /lotecobv/{id}`:   - __observação__: para cada elemento do array `cobsv`, retornado por este endpoint, caso a requisição de criação de cobrança esteja em   status \"NEGADA\", o atributo `problema` deste elemento deve ser preenchido respeitando   o [schema](https://tools.ietf.org/html/rfc7807) referenciado pela API Pix.   - o preenchimento do atributo `problema`, conforme descrito acima, segue o mesmo regramento dos   erros especificados para os endpoints `[PUT/PATCH /cobv/{txid}]`, de maneira a possibilitar, ao   usuário recebedor, entender qual foi a violação cometida ao se tentar criar   a cobrança referenciada por este elemento do array `cobsv`.  ### `LoteCobVConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de lotes de cobrança com vencimento não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /lotecobv` e `GET /lotecobv/{id}`.  __Violações__ específicas para o endpoint `GET /lotecobv`:   - algum dos parâmetros informados para a consulta não respeitam o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ## Tag PayloadLocation Esta seção reúne erros referentes a endpoints que tratam do gerenciamento de _locations_.  ### `PayloadLocationNaoEncontrado` * __Significado__: _Location_ não encontrada para o `id` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /loc/{id}`, `DELETE /loc/{id}/txid`.  ### `PayloadLocationOperacaoInvalida`  * __Significado__: a presente requisição busca criar uma location sem respeitar o schema estabelecido. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `POST /loc`.  __Violações__ para o endpoint `POST /loc`:   - o campo tipoCob não respeita o _schema_.  ### `PayloadLocationConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de _locations_ não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /loc` e `GET /loc/{id}`.  __Violações__ específicas para o endpoint `GET /loc`:   - algum dos parâmetros informados para a consulta não respeitam o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ## Tag Pix  Reúne erros em endpoints de gestão de Pix recebidos e solicitação de devoluções.  ### `PixNaoEncontrado`  * __Significado__: pix não encontrada para o `e2eid` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /pix/{e2eid}`  ### `PixDevolucaoNaoEncontrada`  * __Significado__: devolução representada por {id} não encontrada para o `e2eid` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /pix/{e2eid}/devolucao/{id}`  ### `PixConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de pix recebidos não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /pix`.  __Violações__ específicas para o endpoint `GET /pix`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ### `PixDevolucaoInvalida`  * __Significado__: a presente requisição de devolução não respeita o schema ou não faz sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `PUT /pix/{e2eid}/devolucao/{id}`.  __Violações__ específicas para o endpoint `PUT /pix/{e2eid}/devolucao/{id}`:   - O campo devolucao.valor não respeita o schema   - A presente requisição de devolução, em conjunto com as demais prévias devoluções,   se aplicável, excederia o valor do pix originário.   - A presente requisição de devolução apresenta um `{id}` já utilizado por outra requisição de   devolução para o `{e2eid}` em questão.   - A presente requisição de devolução viola a janela de tempo permitida para solicitações de devoluções   de um pix (hoje estabelecida como 90 dias desde a data de liquidação original do pix).  ## Tag Webhook Reúne erros dos endpoints que tratam do gerenciamente dos Webhooks da API Pix.  ### `WebhookOperacaoInvalida` * __Significado__: a presente requisição busca criar um webhook sem respeitar o schema ou, ainda, apresenta semântica inválida. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `PUT /webhook/{chave}`.  __Violações__ para o endpoint `PUT /webhook/{chave}`:   - o parâmetro {chave} não corresponde a uma chave DICT válida.   - o parâmetro {chave} não corresponde a uma chave DICT pertencente a este usuário recebedor.   - Campo webhook.webhookUrl não respeita o schema.  ### `WebhookNaoEncontrado`  * __Significado__: o webhook denotado por {chave} não encontra-se estabelecido. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /webhook/{chave}`,  `DELETE /webhook/{chave}`  ### `WebhookConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de webhooks ativados não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /webhook`.  __Violações__ específicas para o endpoint `GET /webhook`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.
 *
 * OpenAPI spec version: 2.3.0
 * Contact: suporte.pix@bcb.gov.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.pedrocavalero.pix.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pedrocavalero.pix.client.model.DadosComplementaresPessoa;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * O objeto devedor organiza as informações sobre o devedor da cobrança.
 */
@Schema(description = "O objeto devedor organiza as informações sobre o devedor da cobrança.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]")
public class AllOfDadosDevedorDevedor {
  @JsonProperty("logradouro")
  private String logradouro = null;

  @JsonProperty("cidade")
  private String cidade = null;

  @JsonProperty("uf")
  private String uf = null;

  @JsonProperty("cep")
  private String cep = null;

  public AllOfDadosDevedorDevedor logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

   /**
   * Logradouro do usuário.
   * @return logradouro
  **/
  @Schema(description = "Logradouro do usuário.")
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public AllOfDadosDevedorDevedor cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

   /**
   * Cidade do usuário.
   * @return cidade
  **/
  @Schema(description = "Cidade do usuário.")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public AllOfDadosDevedorDevedor uf(String uf) {
    this.uf = uf;
    return this;
  }

   /**
   * UF do usuário.
   * @return uf
  **/
  @Schema(description = "UF do usuário.")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public AllOfDadosDevedorDevedor cep(String cep) {
    this.cep = cep;
    return this;
  }

   /**
   * CEP do usuário.
   * @return cep
  **/
  @Schema(description = "CEP do usuário.")
  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfDadosDevedorDevedor allOfDadosDevedorDevedor = (AllOfDadosDevedorDevedor) o;
    return Objects.equals(this.logradouro, allOfDadosDevedorDevedor.logradouro) &&
        Objects.equals(this.cidade, allOfDadosDevedorDevedor.cidade) &&
        Objects.equals(this.uf, allOfDadosDevedorDevedor.uf) &&
        Objects.equals(this.cep, allOfDadosDevedorDevedor.cep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, cidade, uf, cep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfDadosDevedorDevedor {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
