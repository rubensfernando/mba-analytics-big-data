---
title: Introdução ao Spark - Spark Core
date: 2016-07-08
category: Introdução ao Big Data
tags: big data, hadoop, spark,yarn 
---

Três tipos de dados
- Não inteligente 
- É flexível
- exemplos:logo de acessos,dados de tweets; dados não estruturados
- Dados inteligentes
- Exemplo: 
- Dados muito inteligentes
-   Exemplo 


Os dados podem ser muitominteligentes, mas podem não ser flexíveis


O que faz sentido colocar os dados em Big data, ou em data warehouse?


Sistemas distribuídos : problemas 

Dados e o gargalo
Pegar o dado e levar para o processador se tornou um problema 
A quantidade de soma cresceu muito, mas a velocidade de acesso não acompanhou o crescimento 

A transferência de dados entre a memória e o processados e 40 vezes mais rápido do que a transferência entre disco e processador

O spark foi feito para trabalhar com a memória

CComparação de processamento entre mapreduce e spark 

Hdfs > (leitura do dado) mapreduce job > (escrita dos dados) Hdfs


Spark
Hdfs > leitura do dado spark job > escrita memória memória > (leitura de memória spark 

Use os dados em memória para uso temporário, depois escrever no hdfs para caso de a máquina falhar
Não usar o spark de usar como file system 

O que é o spark
- E uma engine rápida para processamento em larga escala em linguagem Scala 
- Começou com uma pesquisa na UC Berkeley 
- Em 2010 o código fonte e aberto, e em 2013 foi transferido para a apache foundation 
- Suporta R, Python, Java e Scala
- Databricks implementa as principais funções do spark



O que é a fundação Apache?

Por que uma empresa deseja colocar o código aberta
Melhoria do código
Adicionar features 
Principalmente aumentar a comunidade e ter funcionários para substituir

Vantagens do spark 
- programação em auto nível,focado na programação da lógica
- Computação em cluster
- Dados em memória 

Tipos de workload para o Spark
Suporta query interativa e processamento streaming 

Spark framework 
Spark core e 
Spark SQL usa uma forma do SQL mais simples; pode ser usado o Hive também; use mais para query interativas 
Spark streaming permite aplicações em real time
MLlib e machine learning
GraphX cria gráficos em grande escala 

E possível usar o Spark em 
Standalone 
No Yarn, gerência o mapreduce,e recursos 
Mesos gerência múltiplos clusters

Spark x hadoop mapreduce
Armazenamento in-memory até 100 vezes mais rápida
API de alto nível : permite desenvolvimento rápidos e fácil
Latência baixa: processamento em tempo real

E recomendado para grandes arquivos, 
Sugestão de ter arquivos de pelo menos no tamanho do bloco ou pelo menos um 1gb
Tentar juntar os dados por dia, por mês ou por anos

RDD e resilient distributed dataset 
- resilient se os dados em memória são perdidos, eles podem ser recriados 
- Distributed armazenamento em memória através do cluster
- Dataset são os dados iniciais podem vir de um arquivo ou criados em um programa
- 

Dois tipos de operação do RDD 
1. Transformação
- open ação que retornam um novo RDD, utilizando lazy evaluation 
2. Ação
- retorna um valor para o driver no storage 
- 


Níveis de persistência no rdd
Comando para salvar o dado na memória apenas
E arriscado manter uma o dado em apenas um no do sistema 

(tabela com níveis de persistência)

Spark she'll e um shell Repl (read,evaluate,print loop)
Tem versão em Scala ou Python 


Casos de uso do Spark
- ETL 
- Text mining Análise de texto e de sentimentos 
- criação de indice
- Criação de grafo e análise
- Reconhecimento de padrões 
- Filtro colaborativos
- Análise em tempo real


Estudo de casos
- Edmunds.com
Site para comparação de automóveis e compra nos EUA (tipo uma tabela fipe)
- sk telecom 
mudando total an infrastructure estrutura para big data (hadoop e Spark)
Substituíram  data warehouse para o shark

### spark em cluster
- O Spark pode rodar
- Localmente 
- Localmente em várias threads Worker
- -geralmente coloca 4gb de memória por Worker
- Num cluster 
- node  e um computador em cluster 
- Node master gerenciam a distribuição de trabalho Sara os workers

Por que rodar em cluster 
Em produção o Spark sempre roda em cluster 
Local e bom para desenvolvimento e testes

Spark drive
E o programa principal 
Fria o spark contexto configurando para o cluster 
Comunica com o custer manager para distribuição das agregas ao executores

Spark Standalone daemons 
Os daemons
Spark master
1. 1 carrega os dados pelo hdfs 
2. Executa uma query no Spark no spark driver 
3. O job chega ao Spark master (yarn) e requisita os dados no name node
4. O name node retorna as localização das três réplicas ao Master
5. O Master procurar a máquina com mais recursos disponíveis e envia os Jobs 

Cluster resources manager suportados 
Spark Standalone 
Hadoop yarn 
Apache Mesos 

Terminologia 
Application e a aplicação do Spark que pode rodar vários Jobs
Job será iniciado a partir de uma ação 
Estágio e co o juntos de tarefas executadas em a paralelo 
Entre stages acontece a fase de shuffle 
Task e uma atividade individual de trabalho enviada a um executor 

Spark gera uma das (grafo aciclico direcionado) das dependências
Dos rdds 
Operações narrow
Exemplo map, filter union 
Operações wide
Exemplo reducebykey,join, groupbykey 

Spark streaming 
E um processamento em realimentação que permite que as informações sejam processadas de uma vez

Micro-batching processa os eventos de um uma vez só em pequenos intervalos 

Ele surgiu para gerenciar prive analise em tempo real dos dados
E uma extensão do Spark core
Suporta Scala ou Java
Usando 









