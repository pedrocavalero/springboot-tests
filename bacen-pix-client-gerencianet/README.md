# bacen-pix-client

API Pix
- API version: 2.3.0
  - Build date: 2021-05-15T12:12:45.130232200-03:00[America/Sao_Paulo]

A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e consultas. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços Pix do PSP.  # Evolução da API Pix  A API Pix busca respeitar __[SemVer](https://semver.org/lang/pt-BR/)__. Nesse sentido, mudanças compatíveis não devem gerar nova versão _major_.  A versão da API é composta por 4 elementos: _major_, _minor_, _patch_ e _release candidate_. A versão `v[x]`que consta no path da URL é o elemento _major_ da versão da API. A evolução da versão se dá seguinte forma:    - Major: alterações incompatíveis, com quebra de contrato (v1.0.0 → v2.0.0)   - Minor: alterações compatíveis, sem quebra de contrato (v1.1.0 → v1.2.0)   - Patch: bugfixes, esclarecimentos às especificações, sem alterações funcionais (v1.1.1 → v1.1.2)   - Release candidate: versões de pré-lançamento de qualquer patch futuro, minor ou major (v1.0.0-rc.1 → v1.0.0-rc.22)  Alterações sem quebra de contrato e esclarecimentos às especificações podem ocorrer a qualquer momento. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  As seguintes mudanças são esperadas e consideradas retrocompatíveis:  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações   # Tratamento de erros  A API Pix retorna códigos de status HTTP para indicar sucesso ou falhas das requisições.  Códigos `2xx` indicam sucesso. Códigos `4xx` indicam falhas causadas pelas informações enviadas pelo cliente ou pelo estado atual das entidades. Códigos `5xx` indicam problemas no serviço no lado da API Pix.  As respostas de erro incluem no corpo detalhes do erro seguindo o _schema_ da [RFC 7807](https://tools.ietf.org/html/rfc7807).  O campo `type` identifica o tipo de erro e na API Pix segue o padrão:  `https://pix.bcb.gov.br/api/v2/error/<TipoErro>`  O padrão acima listado, referente ao campo `type`, não consiste, necessariamente, em uma URL que apresentará uma página web válida, ou um endpoint válido, embora possa, futuramente, ser exatamente o caso. O objetivo primário é apenas e tão somente identificar o tipo de erro.  Abaixo estão listados os tipos de erro e possíveis violações da API Pix.  ## Gerais  Esta seção reúne erros que poderiam ser retornados por quaisquer endpoints listados na API Pix.  ### `RequisicaoInvalida`    * __Significado__: Requisição inválida.   * __HTTP Status Code__: [400 Bad Request](https://tools.ietf.org/html/rfc7231#section-6.5.1).  ### `AcessoNegado`    * __Significado__: Requisição de participante autenticado que viola alguma regra de autorização.   * __HTTP Status Code__: [403 Forbidden](https://tools.ietf.org/html/rfc7231#section-6.5.3).  ### `NaoEncontrado`    * __Significado__: Entidade não encontrada.   * __HTTP Status Code__: [404 Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4).  ### `PermanentementeRemovido`    * __Significado__: Indica que a entidade existia, mas foi permanentemente removida.   * __HTTP Status Code__: [410 Gone](https://tools.ietf.org/html/rfc7231#section-6.5.9).  ### `ErroInternoDoServidor`    * __Significado__: Condição inesperada ao processar requisição.   * __HTTP Status Code__: [500 Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1).  ### `ServicoIndisponivel`    * __Significado__: Serviço não está disponível no momento. Serviço solicitado pode estar em manutenção ou fora da janela de funcionamento.   * __HTTP Status Code__: [503 Service Unavailable](https://tools.ietf.org/html/rfc7231#section-6.6.4).  ### `IndisponibilidadePorTempoEsgotado`    * __Significado__: Indica que o serviço demorou além do esperado para retornar.   * __HTTP Status Code__: [504 Gateway Timeout](https://tools.ietf.org/html/rfc7231#section-6.6.5).    ## Tag  CobPayload   Esta seção reúne erros retornados pelos endpoints organizados sob a tag `CobPayload`. Estes erros indicam problemas na tentativa de recuperação, via _location_, do Payload JSON que representa a cobrança.  ### `CobPayloadNaoEncontrado`  * __Significado__: a cobrança em questão não foi encontrada para a location requisitada. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4) ou [410](https://tools.ietf.org/html/rfc7231#section-6.5.9). * __endpoints__: `GET /{pixUrlAccessToken}`, `GET /cobv/{pixUrlAccessToken}`.  Se a presente location exibia uma cobrança, mas não a exibirá mais de maneira permanentemente, pode-se aplicar o HTTP status code [410](https://tools.ietf.org/html/rfc7231#section-6.5.9). Se a presente location não está exibindo nenhuma cobrança, pode-se utilizar o HTTP status code [404](https://tools.ietf.org/html/rfc7231#section-6.5.4).  Uma cobrança pode estar \"expirada\" (`calendario.expiracao`), \"vencida\", \"Concluida\", entre outros estados em que não poderia ser efetivamente paga. Nesses casos, é uma liberalidade do PSP recebedor retornar o presente código de erro ou optar por servir o payload de qualquer maneira, objetivando fornecer uma informação adicional ao usuário pagador final a respeito da cobrança.  ### `CobPayloadOperacaoInvalida`  * __Significado__: a cobrança existe, mas a requisição é inválida. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cobv/{pixUrlAccessToken}`.  __Violações__:   - `codMun` não respeita o schema.   - `codMun` não é um código válido segundo a __[tabela de municípios do IBGE](https://www.ibge.gov.br/explica/codigos-dos-municipios.php)__.   - `DPP` não respeita o schema.   - `DPP` anterior ao momento presente.   - `DPP` superior à validade da cobrança em função dos parâmetros `calendario.dataDeVencimento`   e `calendario.validadeAposVencimento`. Exemplo: `dataDeVencimento` => 2020-12-25,   `validadeAposVencimento` => 10, `DPP` => 2021-01-05. Neste exemplo, o parâmetro `DPP` é   inválido considerando o contexto apresentado porque é uma data em que a cobrança   não poderá ser paga. A cobrança, neste exemplo, não será considerada válida   a partir da data 2021-01-05.  ## Tag Cob  Esta seção reúne erros retornados pelos endpoints organizados sob a tag `Cob`. Esses erros indicam problemas no gerenciamento de uma cobrança para pagamento imediato.  ### `CobNaoEncontrado`  * __Significado__: Cobrança não encontrada para o txid informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /cob/{txid}`.  ### `CobOperacaoInvalida`  * __Significado__: a requisição que busca alterar ou criar uma cobrança para pagamento imediato não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[POST|PUT|PATCH] /cob/{txid}`.  __Violações__ para os endpoints `PUT|PATCH /cob/{txid}`:   - O campo cob.calendario.expiracao é igual ou menor que zero.   - O campo cob.valor.original não respeita o _schema_.   - O campo cob.valor.original é zero.   - O objeto cob.devedor não respeita o _schema_.   - O campo cob.chave não respeita o _schema_.   - O campo cob.chave corresponde a uma conta que não pertence a este usuário recebedor.   - O campo solicitacaoPagador não respeita o _schema_.   - O objeto infoAdicionais não respeita o _schema.   - O location referenciado por loc.id inexiste.   - O location referenciado por loc.id já está sendo utilizado por outra cobrança.   - O location referenciado por cob.loc.id apresenta tipo \"cobv\" (deveria ser \"cob\").  __Violações__ específicas para o endpoint `PUT /cob/{txid}`:   - A cobrança já existe, não está no status ATIVA, e a presente requisição busca alterá-la.  __Violações__ específicas para o endpoint `PATCH /cob/{txid}`:   - A cobrança não está ATIVA, e a presente requisição busca alterá-la.   - A cobrança está ATIVA, e a presente requisição propõe alterar   seu status para _REMOVIDA_PELO_USUARIO_RECEBEDOR_ juntamente com outras alterações   (não faz sentido remover uma cobrança ao mesmo tempo em que se realizam   alterações que não serão aproveitadas).   - o campo cob.status não respeita o _schema_.  ### `CobConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de cobranças para pagamento imediato não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cob` e `GET /cob/{txid}`.  __Violações__ específicas para o endpoint `GET /cob`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  __Violações__ específicas para o endpoint `GET /cob/{txid}`:   - o parâmetro `revisao` corresponde a uma revisão inexistente para a cobrança   apontada pelo parâmetro `txid`.  ## Tag CobV  Esta seção reúne erros retornados pelos endpoints organizados sob a tag `CobV`. Esses erros indicam problemas no gerenciamento de uma cobrança com vencimento.  ### `CobVNaoEncontrada`  * __Significado__: Cobrança com vencimento não encontrada para o txid informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /cobv/{txid}`.  ### `CobVOperacaoInvalida`  * __Significado__: a requisição que busca alterar ou criar uma cobrança com vencimento não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[PUT|PATCH] /cobv/{txid}`.  __Violações__ para os endpoints `PUT|PATCH /cobv/{txid}`:   - Este `txid` está associado a um lote e no referido lote, o status desta cobrança está atribuído como   \"EM_PROCESSAMENTO\" ou \"NEGADA\".   - O campo `cobv.calendario.dataDeVencimento` é anterior à data de criação da cobrança.   - O campo `cobv.calendario.validadeAposVencimento` é menor do que zero.   - O objeto `cobv.devedor` não respeita o schema.   - O objeto `cobv.devedor` não respeita o _schema_.   - O campo `cobv.chave` não respeita o _schema_.   - O campo `cobv.chave` corresponde a uma conta que não pertence a este usuário recebedor.   - O campo `solicitacaoPagador` não respeita o _schema_.   - O objeto `infoAdicionais` não respeita o _schema.   - O location referenciado por `cobv.loc.id` inexiste.   - O location referenciado por `cobv.loc.id` já está sendo utilizado por outra cobrança.   - O location referenciado por `cobv.loc.id` apresenta tipo \"cob\" (deveria ser \"cobv\").   - O campo `cobv.valor.original` não respeita o _schema_.   - O campo `cobv.valor.original` apresenta o valor `zero`.   - O objeto `cobv.valor.multa` não respeita o _schema_.   - O objeto `cobv.valor.juros` não respeita o _schema_.   - O objeto `cobv.valor.abatimento` não respeita o _schema_.   - O objeto `cobv.valor.desconto` não respeita o _schema_.   - O objeto `cobv.valor.abatimento` representa um valor maior ou igual ao valor da   cobrança original ou maior ou igual a 100%.   - O objeto `cobv.valor.desconto` apresenta algum elemento de desconto que representa um valor maior ou   igual ao valor da cobrança original ou maior ou igual a 100%.   - O objeto `cobv.valor.desconto` apresenta algum elemento cuja data seja posterior à data de vencimento   representada por `calendario.dataDeVencimento`.   - O objeto `cobv.valor.desconto` apresenta modalidade no valor `1` ou `2`,   porém `cobv.valor.desconto.valorPerc` encontra-se preenchido   - O objeto `cobv.valor.desconto` apresenta modalidade no valor `1` ou `2`, porém   o array `cobv.valor.desconto.descontoDataFixa` está vazio ou nulo.   - O objeto `cobv.valor.desconto` apresenta modalidade nos valores de `3` a `6`, porém   o elemento `cobv.valor.desconto.valorPerc` não está preenchido.   - O objeto `cobv.valor.desconto` apresenta modalidade nos valores de `3` a `6`, porém   o elemento `cobv.valor.desconto.descontoDataFixa` está preenchido ou não nulo.    __Violações__ específicas para o endpoint `PUT /cobv/{txid}`:   - A cobrança já existe, não está ATIVA, e a presente requisição busca alterá-la  __Violações__ específicas para o endpoint `PATCH /cobv/{txid}`:   - A cobrança não está ATIVA, e a presente requisição busca alterá-la   - A cobrança está ATIVA, e a presente requisição propõe alterar   seu status para _REMOVIDA_PELO_USUARIO_RECEBEDOR_ juntamente com outras alterações   (não faz sentido remover uma cobrança ao mesmo tempo em que se realizam   alterações que não serão aproveitadas).   - o campo cob.status não respeita o _schema_.  ### `CobVConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de cobranças com vencimento não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /cobv` e `GET /cobv/{txid}`.  __Violações__ específicas para o endpoint `GET /cobv`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  __Violações__ específicas para o endpoint `GET /cobv/{txid}`:   - o parâmetro `revisao` corresponde a uma revisão inexistente para a cobrança   apontada pelo parâmetro `txid`.  ## Tag LoteCobV Esta seção reúne erros referentes a endpoints que tratam do gerenciamento de lotes de cobrança.  ### `LoteCobVNaoEncontrado` * __Significado__: Lote não encontrado para o `id` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /lotecobv/{id}`.  ### `LoteCobVOperacaoInvalida` * __Significado__: a requisição que busca alterar ou criar um lote de cobranças com vencimento não respeita o schema ou está semanticamente errada. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `[PUT|PATCH] /lotecobv/{id}`.  __Violações__ para os endpoints `PUT|PATCH /lotecobv/{id}`:   - O campo loteCobV.descricao não respeita o schema.   - O objeto loteCobV.cobsV não respeita o schema.  __Violações__ para o endpoint `PUT /lotecobv/{id}`:   - a presente requisição tenta criar um conjunto de cobranças dentre as quais pelo menos   uma cobrança já encontra-se criada.   - a presente requisição busca alterar um lote já existente, entretanto contém um array de   solicitações de alteração de cobranças que não referencia exatamente as mesmas cobranças   referenciadas pela requisição original que criou o lote.   Uma vez criado um lote, não se pode remover ou adicionar solicitações de   criação ou alteração de cobranças a este lote.  __Violações__ para o endpoint `PATCH /lotecobv/{id}`:   - a presente requisição busca alterar um lote já existente e contém, no `array`   de cobranças representado por `cobsv`, uma cobrança não existente no array de cobranças   atribuído pela requisição original que criou o lote.   Uma vez criado um lote, não se pode remover ou adicionar cobranças a este lote.  __Violações__ para os endpoints `GET /lotecobv/{id}`:   - __observação__: para cada elemento do array `cobsv`, retornado por este endpoint, caso a requisição de criação de cobrança esteja em   status \"NEGADA\", o atributo `problema` deste elemento deve ser preenchido respeitando   o [schema](https://tools.ietf.org/html/rfc7807) referenciado pela API Pix.   - o preenchimento do atributo `problema`, conforme descrito acima, segue o mesmo regramento dos   erros especificados para os endpoints `[PUT/PATCH /cobv/{txid}]`, de maneira a possibilitar, ao   usuário recebedor, entender qual foi a violação cometida ao se tentar criar   a cobrança referenciada por este elemento do array `cobsv`.  ### `LoteCobVConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de lotes de cobrança com vencimento não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /lotecobv` e `GET /lotecobv/{id}`.  __Violações__ específicas para o endpoint `GET /lotecobv`:   - algum dos parâmetros informados para a consulta não respeitam o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ## Tag PayloadLocation Esta seção reúne erros referentes a endpoints que tratam do gerenciamento de _locations_.  ### `PayloadLocationNaoEncontrado` * __Significado__: _Location_ não encontrada para o `id` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `[GET|PATCH] /loc/{id}`, `DELETE /loc/{id}/txid`.  ### `PayloadLocationOperacaoInvalida`  * __Significado__: a presente requisição busca criar uma location sem respeitar o schema estabelecido. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `POST /loc`.  __Violações__ para o endpoint `POST /loc`:   - o campo tipoCob não respeita o _schema_.  ### `PayloadLocationConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de _locations_ não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /loc` e `GET /loc/{id}`.  __Violações__ específicas para o endpoint `GET /loc`:   - algum dos parâmetros informados para a consulta não respeitam o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ## Tag Pix  Reúne erros em endpoints de gestão de Pix recebidos e solicitação de devoluções.  ### `PixNaoEncontrado`  * __Significado__: pix não encontrada para o `e2eid` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /pix/{e2eid}`  ### `PixDevolucaoNaoEncontrada`  * __Significado__: devolução representada por {id} não encontrada para o `e2eid` informado. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /pix/{e2eid}/devolucao/{id}`  ### `PixConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de pix recebidos não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /pix`.  __Violações__ específicas para o endpoint `GET /pix`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - ambos os parâmetros `cpf` e `cnpj` estão preenchidos.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.  ### `PixDevolucaoInvalida`  * __Significado__: a presente requisição de devolução não respeita o schema ou não faz sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `PUT /pix/{e2eid}/devolucao/{id}`.  __Violações__ específicas para o endpoint `PUT /pix/{e2eid}/devolucao/{id}`:   - O campo devolucao.valor não respeita o schema   - A presente requisição de devolução, em conjunto com as demais prévias devoluções,   se aplicável, excederia o valor do pix originário.   - A presente requisição de devolução apresenta um `{id}` já utilizado por outra requisição de   devolução para o `{e2eid}` em questão.   - A presente requisição de devolução viola a janela de tempo permitida para solicitações de devoluções   de um pix (hoje estabelecida como 90 dias desde a data de liquidação original do pix).  ## Tag Webhook Reúne erros dos endpoints que tratam do gerenciamente dos Webhooks da API Pix.  ### `WebhookOperacaoInvalida` * __Significado__: a presente requisição busca criar um webhook sem respeitar o schema ou, ainda, apresenta semântica inválida. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `PUT /webhook/{chave}`.  __Violações__ para o endpoint `PUT /webhook/{chave}`:   - o parâmetro {chave} não corresponde a uma chave DICT válida.   - o parâmetro {chave} não corresponde a uma chave DICT pertencente a este usuário recebedor.   - Campo webhook.webhookUrl não respeita o schema.  ### `WebhookNaoEncontrado`  * __Significado__: o webhook denotado por {chave} não encontra-se estabelecido. * __HTTP Status Code__: [404](https://tools.ietf.org/html/rfc7231#section-6.5.4). * __endpoints__: `GET /webhook/{chave}`,  `DELETE /webhook/{chave}`  ### `WebhookConsultaInvalida`  * __Significado__: os parâmetros de consulta à lista de webhooks ativados não respeitam o schema ou não fazem sentido semanticamente. * __HTTP Status Code__: [400](https://tools.ietf.org/html/rfc7231#section-6.5.1). * __endpoints__: `GET /webhook`.  __Violações__ específicas para o endpoint `GET /webhook`:   - algum dos parâmetros informados para a consulta não respeita o _schema_.   - o _timestamp_ representado pelo parâmetro `fim` é anterior ao timestamp   representado pelo parâmetro `inicio`.   - o parâmetro `paginacao.paginaAtual` é negativo.   - o parâmetro `paginacao.itensPorPagina` é negativo.

  For more information, please visit [https://www.bcb.gov.br/estabilidadefinanceira/pix](https://www.bcb.gov.br/estabilidadefinanceira/pix)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.pedrocavalero.pix</groupId>
  <artifactId>bacen-pix-client</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.pedrocavalero.pix:bacen-pix-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/bacen-pix-client-0.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.pedrocavalero.pix.client.invoker.*;
import com.pedrocavalero.pix.client.invoker.auth.*;
import com.pedrocavalero.pix.client.model.*;
import com.pedrocavalero.pix.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CobApi apiInstance = new CobApi();
        OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
        OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
        String cpf = "cpf_example"; // String | 
        String cnpj = "cnpj_example"; // String | 
        Boolean locationPresente = true; // Boolean | 
        String status = "status_example"; // String | 
        Integer paginacaoPaginaAtual = 0; // Integer | 
        Integer paginacaoItensPorPagina = 100; // Integer | 
        try {
            CobsConsultadas result = apiInstance.cobGet(inicio, fim, cpf, cnpj, locationPresente, status, paginacaoPaginaAtual, paginacaoItensPorPagina);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CobApi#cobGet");
            e.printStackTrace();
        }
    }
}
import com.pedrocavalero.pix.client.invoker.*;
import com.pedrocavalero.pix.client.invoker.auth.*;
import com.pedrocavalero.pix.client.model.*;
import com.pedrocavalero.pix.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CobApi apiInstance = new CobApi();
        CobSolicitada body = new CobSolicitada(); // CobSolicitada | Dados para geração da cobrança imediata.
        try {
            CobGerada result = apiInstance.cobPost(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CobApi#cobPost");
            e.printStackTrace();
        }
    }
}
import com.pedrocavalero.pix.client.invoker.*;
import com.pedrocavalero.pix.client.invoker.auth.*;
import com.pedrocavalero.pix.client.model.*;
import com.pedrocavalero.pix.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CobApi apiInstance = new CobApi();
        String txid = "txid_example"; // String | 
        Integer revisao = 56; // Integer | 
        try {
            CobCompleta result = apiInstance.cobTxidGet(txid, revisao);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CobApi#cobTxidGet");
            e.printStackTrace();
        }
    }
}
import com.pedrocavalero.pix.client.invoker.*;
import com.pedrocavalero.pix.client.invoker.auth.*;
import com.pedrocavalero.pix.client.model.*;
import com.pedrocavalero.pix.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CobApi apiInstance = new CobApi();
        CobRevisada body = new CobRevisada(); // CobRevisada | Dados para geração da cobrança.
        String txid = "txid_example"; // String | 
        try {
            CobGerada result = apiInstance.cobTxidPatch(body, txid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CobApi#cobTxidPatch");
            e.printStackTrace();
        }
    }
}
import com.pedrocavalero.pix.client.invoker.*;
import com.pedrocavalero.pix.client.invoker.auth.*;
import com.pedrocavalero.pix.client.model.*;
import com.pedrocavalero.pix.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        CobApi apiInstance = new CobApi();
        CobSolicitada body = new CobSolicitada(); // CobSolicitada | Dados para geração da cobrança imediata.
        String txid = "txid_example"; // String | 
        try {
            CobGerada result = apiInstance.cobTxidPut(body, txid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CobApi#cobTxidPut");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://pix.example.com/api/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CobApi* | [**cobGet**](docs/CobApi.md#cobGet) | **GET** /cob | Consultar lista de cobranças imediatas.
*CobApi* | [**cobPost**](docs/CobApi.md#cobPost) | **POST** /cob | Criar cobrança imediata.
*CobApi* | [**cobTxidGet**](docs/CobApi.md#cobTxidGet) | **GET** /cob/{txid} | Consultar cobrança imediata.
*CobApi* | [**cobTxidPatch**](docs/CobApi.md#cobTxidPatch) | **PATCH** /cob/{txid} | Revisar cobrança imediata.
*CobApi* | [**cobTxidPut**](docs/CobApi.md#cobTxidPut) | **PUT** /cob/{txid} | Criar cobrança imediata.
*CobPayloadApi* | [**cobvPixUrlAccessTokenGet**](docs/CobPayloadApi.md#cobvPixUrlAccessTokenGet) | **GET** /cobv/{pixUrlAccessToken} | Recuperar o payload JSON que representa a cobrança com vencimento.
*CobPayloadApi* | [**pixUrlAccessTokenGet**](docs/CobPayloadApi.md#pixUrlAccessTokenGet) | **GET** /{pixUrlAccessToken} | Recuperar o payload JSON que representa a cobrança imediata.
*CobVApi* | [**cobvGet**](docs/CobVApi.md#cobvGet) | **GET** /cobv | Consultar lista de cobranças com vencimento.
*CobVApi* | [**cobvTxidGet**](docs/CobVApi.md#cobvTxidGet) | **GET** /cobv/{txid} | Consultar cobrança com vencimento.
*CobVApi* | [**cobvTxidPatch**](docs/CobVApi.md#cobvTxidPatch) | **PATCH** /cobv/{txid} | Revisar cobrança com vencimento.
*CobVApi* | [**cobvTxidPut**](docs/CobVApi.md#cobvTxidPut) | **PUT** /cobv/{txid} | Criar cobrança com vencimento.
*LoteCobVApi* | [**lotecobvGet**](docs/LoteCobVApi.md#lotecobvGet) | **GET** /lotecobv | Consultar lotes de cobranças com vencimento.
*LoteCobVApi* | [**lotecobvIdGet**](docs/LoteCobVApi.md#lotecobvIdGet) | **GET** /lotecobv/{id} | Consultar um lote específico de cobranças com vencimento.
*LoteCobVApi* | [**lotecobvIdPatch**](docs/LoteCobVApi.md#lotecobvIdPatch) | **PATCH** /lotecobv/{id} | Utilizado para revisar cobranças específicas dentro de um lote de cobranças com vencimento.
*LoteCobVApi* | [**lotecobvIdPut**](docs/LoteCobVApi.md#lotecobvIdPut) | **PUT** /lotecobv/{id} | Criar/Alterar lote de cobranças com vencimento.
*PayloadLocationApi* | [**locGet**](docs/PayloadLocationApi.md#locGet) | **GET** /loc | Consultar locations cadastradas.
*PayloadLocationApi* | [**locIdGet**](docs/PayloadLocationApi.md#locIdGet) | **GET** /loc/{id} | Recuperar location do payload.
*PayloadLocationApi* | [**locIdTxidDelete**](docs/PayloadLocationApi.md#locIdTxidDelete) | **DELETE** /loc/{id}/txid | Desvincular uma cobrança de uma location.
*PayloadLocationApi* | [**locPost**](docs/PayloadLocationApi.md#locPost) | **POST** /loc | Criar location do payload.
*PixApi* | [**pixE2eidDevolucaoIdGet**](docs/PixApi.md#pixE2eidDevolucaoIdGet) | **GET** /pix/{e2eid}/devolucao/{id} | Consultar devolução.
*PixApi* | [**pixE2eidDevolucaoIdPut**](docs/PixApi.md#pixE2eidDevolucaoIdPut) | **PUT** /pix/{e2eid}/devolucao/{id} | Solicitar devolução.
*PixApi* | [**pixE2eidGet**](docs/PixApi.md#pixE2eidGet) | **GET** /pix/{e2eid} | Consultar Pix.
*PixApi* | [**pixGet**](docs/PixApi.md#pixGet) | **GET** /pix | Consultar Pix recebidos.
*WebhookApi* | [**webhookChaveDelete**](docs/WebhookApi.md#webhookChaveDelete) | **DELETE** /webhook/{chave} | Cancelar o webhook Pix.
*WebhookApi* | [**webhookChaveGet**](docs/WebhookApi.md#webhookChaveGet) | **GET** /webhook/{chave} | Exibir informações acerca do Webhook Pix.
*WebhookApi* | [**webhookChavePut**](docs/WebhookApi.md#webhookChavePut) | **PUT** /webhook/{chave} | Configurar o Webhook Pix.
*WebhookApi* | [**webhookGet**](docs/WebhookApi.md#webhookGet) | **GET** /webhook | Consultar webhooks cadastrados.

## Documentation for Models

 - [AbatimentoAplicado](docs/AbatimentoAplicado.md)
 - [AllOfCobVValorDesconto](docs/AllOfCobVValorDesconto.md)
 - [AllOfCobsConsultadasCobsItems](docs/AllOfCobsConsultadasCobsItems.md)
 - [AllOfCobsVConsultadasCobsItems](docs/AllOfCobsVConsultadasCobsItems.md)
 - [AllOfDadosDevedorDevedor](docs/AllOfDadosDevedorDevedor.md)
 - [AllOfDadosRecebedorRecebedor](docs/AllOfDadosRecebedorRecebedor.md)
 - [AllOfLotesCobVConsultadosLotesItems](docs/AllOfLotesCobVConsultadosLotesItems.md)
 - [AllOfParametrosConsultaPixTxid](docs/AllOfParametrosConsultaPixTxid.md)
 - [AllOfPayloadLocationConsultadasLocItems](docs/AllOfPayloadLocationConsultadasLocItems.md)
 - [AllOfPixConsultadosPixItems](docs/AllOfPixConsultadosPixItems.md)
 - [AllOfPixTxid](docs/AllOfPixTxid.md)
 - [AllOfWebhooksConsultadosWebhooksItems](docs/AllOfWebhooksConsultadosWebhooksItems.md)
 - [CobApresentacao](docs/CobApresentacao.md)
 - [CobBase](docs/CobBase.md)
 - [CobBaseInfoAdicionais](docs/CobBaseInfoAdicionais.md)
 - [CobCompleta](docs/CobCompleta.md)
 - [CobCriacao](docs/CobCriacao.md)
 - [CobDataDeVencimento](docs/CobDataDeVencimento.md)
 - [CobExpiracao](docs/CobExpiracao.md)
 - [CobGerada](docs/CobGerada.md)
 - [CobPayload](docs/CobPayload.md)
 - [CobPayloadValor](docs/CobPayloadValor.md)
 - [CobRevisada](docs/CobRevisada.md)
 - [CobSolicitada](docs/CobSolicitada.md)
 - [CobVCompleta](docs/CobVCompleta.md)
 - [CobVGerada](docs/CobVGerada.md)
 - [CobVPayload](docs/CobVPayload.md)
 - [CobVPayloadValor](docs/CobVPayloadValor.md)
 - [CobVRevisada](docs/CobVRevisada.md)
 - [CobVSolicitada](docs/CobVSolicitada.md)
 - [CobVValor](docs/CobVValor.md)
 - [CobValor](docs/CobValor.md)
 - [CobsConsultadas](docs/CobsConsultadas.md)
 - [CobsVConsultadas](docs/CobsVConsultadas.md)
 - [DadosComplementaresPessoa](docs/DadosComplementaresPessoa.md)
 - [DadosDevedor](docs/DadosDevedor.md)
 - [DadosRecebedor](docs/DadosRecebedor.md)
 - [Devolucao](docs/Devolucao.md)
 - [DevolucaoHorario](docs/DevolucaoHorario.md)
 - [DevolucaoSolicitada](docs/DevolucaoSolicitada.md)
 - [JuroAplicado](docs/JuroAplicado.md)
 - [LoteCobVConsultado](docs/LoteCobVConsultado.md)
 - [LoteCobVConsultadoCobsv](docs/LoteCobVConsultadoCobsv.md)
 - [LoteCobVGerado](docs/LoteCobVGerado.md)
 - [LotesCobVConsultados](docs/LotesCobVConsultados.md)
 - [MultaAplicada](docs/MultaAplicada.md)
 - [Paginacao](docs/Paginacao.md)
 - [ParametrosConsultaCob](docs/ParametrosConsultaCob.md)
 - [ParametrosConsultaLote](docs/ParametrosConsultaLote.md)
 - [ParametrosConsultaPayloadLocation](docs/ParametrosConsultaPayloadLocation.md)
 - [ParametrosConsultaPix](docs/ParametrosConsultaPix.md)
 - [ParametrosConsultaWebhooks](docs/ParametrosConsultaWebhooks.md)
 - [PayloadLocation](docs/PayloadLocation.md)
 - [PayloadLocationCob](docs/PayloadLocationCob.md)
 - [PayloadLocationCompleta](docs/PayloadLocationCompleta.md)
 - [PayloadLocationConsultadas](docs/PayloadLocationConsultadas.md)
 - [PayloadLocationSolicitada](docs/PayloadLocationSolicitada.md)
 - [PessoaFisica](docs/PessoaFisica.md)
 - [PessoaJuridica](docs/PessoaJuridica.md)
 - [Pix](docs/Pix.md)
 - [PixConsultados](docs/PixConsultados.md)
 - [Problema](docs/Problema.md)
 - [Txid](docs/Txid.md)
 - [Violacao](docs/Violacao.md)
 - [WebhookCompleto](docs/WebhookCompleto.md)
 - [WebhookSolicitado](docs/WebhookSolicitado.md)
 - [WebhooksConsultados](docs/WebhooksConsultados.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - cob.write: Permissão para alteração de cobranças imediatas
  - cob.read: Permissão para consulta de cobranças imediatas
  - cobv.write: Permissão para alteração de cobranças com vencimento
  - cobv.read: Permissão para consulta de cobranças com vencimento
  - lotecobv.write: Permissão para alteração de lotes de cobranças com vencimento
  - lotecobv.read: Permissão para consulta de lotes de cobranças com vencimento
  - pix.write: Permissão para alteração de Pix
  - pix.read: Permissão para consulta de Pix
  - webhook.read: Permissão para consulta do webhook
  - webhook.write: Permissão para alteração do webhook
  - payloadlocation.write: Permissão para alteração de payloads
  - payloadlocation.read: Permissão para consulta de payloads


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

suporte.pix@bcb.gov.br
