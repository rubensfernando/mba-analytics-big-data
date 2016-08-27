# Provedores e Serviços – Cloud Computing

Fernando Frota Redigolo 


Provedores públicos de cloud

Segundo relatorio do gartner os principais provedores sao
microsoft
amazon
google

Outros
uol, embratel, vivo , tem limitações de portfolio


### principais provedores

#### Amazon Web Services
- E o primeiro do IaaS
- tem um grande portfolio de seruvis com grande integracao entre si
- lider de mercado
- grande parceiros oferecendo solucoes
- apis de desenvolvimento suportadas por ferramentas
- Possui data center no brasil (nem todos servicos)


#### Google Cloud Plataform
- Oferece forte de SaaS voltada a usuario final: Docs, Gmail, etc
- Foco em Big Data mais recente
- Billing por minuto

## Nuvem privada
O que e necessario

Infraestrutura fisica
 - Data center: Servidores, rede, refrigeração, etc

Infraestrutura lógica
- virtualizacao de recursos, como banco de dados, armazenamento, processamento, etc.
- Sistema de provicionamento, para gerir os recursos de maquinas

Alguns exemplos de provicionamento
- Proprietários
 - Microsoft Center
 - VMWare Cloud
- Open source
  - Cloud stack
  - Eucalyptu
  - OpenNebula
  - Open Stak

open stack
fundada pela rackspace e nasa
e possivel vc usa internamente e pode migrar para outras infraestrutura
casos de uso
- Walmart
- CERN
- Universidade Havard
- Decolar
- Mercado Livre

## Tipos de serviços: 

Qual é melhor para Big Data: IaaS, PaaS, ou SaaS?

Mais importante e entender o nivel de esfoco a ser gasto em cada servico

No AWS, a versao do Hadoop nao usa o HDFS, mas o servico de armazenamento deles. Entao e mais facil migrar de versao do Hadoop se precisar enviar os dados toda vez

### Pontos de questionamentos
#### Latencia
Qual o periodo de tempo requerido entre geracao e analise?

##### Baixa latencia (milisegundo a segundos)
necessidade a ococre dicade de um dado evento
exemplo: indicidentes de seguranca/fraudes, mercado de acoes, sistemas de controle industriais, etc

##### alta latencia (min a horas)
analise de dados historicos (perfil de compras, ocorrencias de eventos anuais), ciencias naturais da terra (biologia, fisica, etc)

- Alguns serviços são projetados para aplicações	de	baixa latência
– Alguns serviços são especificados em parâmetros	de	desempenho sustentado

#### Serverless design
Algumas solucoes é preciso definir o tamanjo de recuros que se deseja antes de usa-lo (Banco de Dados, VM)


No conceito de serverlesl design, vc nao defini um tamanho previo para o recurso, ele é automaticamente escalavel a medida em que e utilizavel

#### Armazenamento
- Tipos de armazenamento
- banco de dados relacional
- servidpo de arquivos
- armazemento de blocos (disco removiveis)
- banco de dados não relacional
- objetos (Amanzon S3)

como sera a importacao de dados na nuvem?
- Suportado diretamente pelos produtores de dados? Necessita de drivers?
- Alguns servico suportam suportam escrita direta, outros necessitam de dados em disco ou em outro serviço primeiro
- 
quanto tempo estes dados devem ser armazenados?
- durante o tempo gera um custo mensal para manter esses dados
- custo geralmente e baseado em gb/mes e nivel de redudancia
- 
### softwares frameworks 
- como e a integracao com outros servicos
- possui cusmotomizaoes para melhorar do provedor?
- possui integrações com ferramentas de terceiros?
- possui apis para integracao com aplicacoes proprias
- 

virtual machine é o alocaocao de maquinas virtuais

container: criar um espaco reservado (docker) dentro de uma vm

microsevicos (event driven): e a execucao de uma pequena peca de codigo. e cobrado pelo tempo de execucao e quantidade dados gerados
