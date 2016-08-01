---
title: Introdução ao Hadoop e HDFS
date: 2016-06-03
category: Introdução ao Big Data
tags: big data, hadoop, hdfs
---

Apresentar as caracteristas e vantagens do arcabouço Hadoop, junto com a arquitetura e funcionamento do sistema de arquivos da Hadoop

> Novas tecnologias capazes de oferecer **escalabilidade , disponibilidade , flexibilidade e desempenho** para o processamento de grande volume de dados

## História do Hadoop
- Baseado no web crawler Apache Nutch
	- É um projeto open source
	- Tinha muitas tarefas para impelemtar
	- Tinha estabilidade limitada a 4 máquinas
	- Criado po Doug Cutting e Mike Cafarella
- Em 2003 e 2004 o Google dispnibiliza dois papers
	- [The Google File System](http://static.googleusercontent.com/media/research.google.com/pt-BR//archive/gfs-sosp2003.pdf)
		- 
	- [MapReduce: Simplified Data Processing on Large Clusters](http://static.googleusercontent.com/media/research.google.com/pt-BR//archive/mapreduce-osdi04.pdf)

Yahoo contrata Doug Cutting 
Implementa sistema distribuido do nutch
Nutch  passa a ser outro projeto da apache, com foco que em crawler 
Em 2006,o novo projeto e chamado de hadoop 
Em 2009, Yahoo executa 100 terabytes de dados em 3 mil nos
As empresas do Vale do sicilio são os primeiros a usar o hadoop 
É podem útil ado em diferentes áreas
- telecomunicações 
- agricultura 
- entretenimento 
- bioinformatica 
- varejo
- manufatura 



## Characteristics do Hadoop
- Aracabauço de software **open source** (baixo custo) que permite a execução de aplicações utilizando milhares de máquinas
- oferece recurso de armazenamento, gerenciamento e processamento distribuído (Sistema Operacional para BigData)
- Projetado para processamento em lote de grandes conjuntos de dados
- Um dos pioneiros da geração de tecnologias de Big Data
- existem diferentes distribuições hadoop 
 - cloudera 
 - Hadoop 
 - hortonworks 
 - amazon Web services 
 - mapr 
 - datastax

Porque as empresas estão escolhendo o hadoop 
- redução de custos (e open source) 
- flexibilidade: e possível inserir qualqye fonte de dados, e não receber um formato específico 
- É possível escalar quantas máquinas forem necessárias 
- É possível fazer novas e diferentes análises 
- ecossistema de soluções, com o tempo nas soluções foram adicionadas ao sistema hadoop (imagem da evolução)

O hadoop possui dois componentes principais 
- Hdfs
- MapReduce 


## HDFS
Oque é 
Hadoop Distributed File System
Sistema de arquivos distribuído
Executado em um sistema de arquivos nativos
Otimizado para processamento de grande volume de dados (alta taxa de transferência) 
Abstrai questões de armazenamento distribuído dos dados
Escalável e tolerante a falhas 
Na abordagem tradicional 
- os dados são transferidos para o local de processamento 
- o problema acontece quando se tenta mover base de dados grandes, com 500gb,1tb,2tb, etc...
- gasta-se muito tempo para transferir os dados em entre os locai

No hdfs
As tarefas são alocadas para onde os dados estão armazenados
E retornam apenas o resultado da tarefa 
"write once, read many"

Os processos
1. NameNode gerência o namespace do sistema de arquivos do Hadoop 
2. DataNode Armazena os blocos de dados em um no
3. SecondaryNameNone oferece tarefas de ponto de verificação e manutenção do NameNode 

Uma máquina hadoop possui 
- processos hadoop 
- JVM (Java virtual machine) 
- Linux 
- CPU, Memória, Disco

Um rack hadoop possui várias máquina com a configuração como acima 

No hadoop os arquivos são divididos em blocos de 64mb (tamanho default, pode ser alterado) 

Os blocos dão replicados para tolerância a falhas (3 réplicas default) 

Para manipulação de arquivos no hdfs e possível por
- comandos fs no shell 
- hadoop fs -ls
- hadoop fs -mkdir 
- hadoop fs -put
- hadoop fs -get
- java api 
- class filesystem 
- Ecossistema hadoop 
- Sqoop 
- Flume 
- Hue 

Configurando o hadoop 
Possui três modos de execução 
1. Local (Standalone) 
Executado como um único processo Java 
Recomendado para depuração de código 
2. Pseudo-distribuido
Todos os complementos hadoop são executados em uma máquina 
Cada componente e executado em um processo Java separado 
3. Completamente distribuído 
Cluster hadoop utilizando múltiplas máquinas 

Comandos do Hadoop no terminal 

Sudo jps 
Verificar os processos ativos 


hadoop fs -ls
Lista os arquivos armazenados 
hadoop fs -mkdir 
Cria uma pasta no hdfs
hadoop fs -put
Envia os arquivos para hdfs
hadoop fs -get
Baixa os arquivos do hdfs 
Hadoop fs - cat input/compras.txt | we -l 
Conta o número de linhas no arquivo 

Hadoop fs - cat input/compras.txt
Verifica o conteúdo de arquivos no hdfs 



