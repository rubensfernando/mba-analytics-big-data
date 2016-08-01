---
title: Introdução ao Big Data
date: 2016-05-30
category: Introdução ao Big Data
tags: big data,
---

Segundo a Cisco serão 153 milhões de dispositivos conectados em 2020

> “Big data faz referência ao grande volume, variedade e velocidade de dados que demandam formas inovadoras e rentáveis de processamento da informação para melhorar a percepção tomada de decisão " Gartner 2012

## Os 6vs de Big data 
1. Volume de dados 
2. Variedade - 80% dos dados disponíveis são não-estruturados
3. Velocidade - com o tempo o valor do dados e perdido
4. Veracidade 
5. Valor 
6. Vulnerabilidade 

## Tecnologia do big data

**Escalabilidade vertical**
- É o aumento de recursos computacionais em uma única máquina 
- Os problemas são
	- Custo alto 
	- Desempenho duvidosos 
	- Disponibilidade reduzida 

**Escalabilidade horizontal**
- E o aumento de máquinas no cluster 
- Os problemas são 
	- Adaptação e tecnologias tradicionais a esse ambiente 
	- Desenvolvimento e manutenção complexa

Com isso a necessidade de... 
"novas tecnologias que oferecem **escalabilidade, flexibilidade e desempenho** para manipulação de grande volume de dados"

### Inovação em armazenamento 
Criação de banco de dados que não utilização o SQL, xxx, denominados de NoSQL (Not Only SQL) 

As características do NoSQL 
- não é banco de dados relacional
- e cluster-friendly 
- não possui esquemas 
- e passível o escalonamento horizontal 
- possui interface simples de consultas 

> “Conjunto de conceitos que permite o processamento rápido e eficiente de conjuntos de dados com foco em desempenho, confiabilidade e agilidade”. Making sensing of NoSQL

#### Tipos de bancos NoSQL 
- Chave valor 
	- Consulta e feita apenas pela chave 
	- Difícil consultar pelo valor 
	- exemplo de BD: DynamoDB, Redis, voldemont l
- orientado a documentos 
	- informações relacionadas a cada collection
	- possui flexibilidade de Campos 
	- leitura e bem mais rápida 
	- possui consulta por valor 
	- exemplo: mongodb, elastic search, Couch DB
- orientado a colunas
	- exemplo :hbase, Cassandra 
- orientado a grafos
	- e importante é como é o relacionamento 
	- exemplo Neo4j 

Inovação no processamento 
- Hadoop 
	- Pioneiro 
	- Mais utilizado

- Spark 
	- E a evolução do MapReduce 

Estudo de caso da Globo.com usando Hadoop
**Desafio:** é capturar as interações de milhões de usuários fazem no sites ger recomendações personalizada da Globo.com em instantes
**Solução** Usar cluster com Hadoop, HBAse, Kafka e Spark
Cluster: 10 nós totalizando 1 TB de RAM e 500 TB de HD
Fonte: https://www.infoq.com/br/presentations/construindo-uma-plataforma-com-hadoop-e-elasticsearch

### Inovação na colaboração 

**Informação completa **
Quando a informação chega a na empresa os dados são distribuídos em silos (ou setores da empresa) o valor dos dados se perdem, porque não vemos o todo 

**Data lake**
Repositório para armazenar todos os dados
Mantém no formato original 

Soluções possíveis com Big Data
> “melhor percepção e tomada de decisão”

### Oportunidades 
#### Big data Analytics
- Análise Descritiva
	- “O que aconteceu?”
	- Foca em sumarizar os fatos ocorridos (passado)
	- Permite de compreender como a organização está sendo operada
	- Baseado na métrica de
		- Visualização de tendências
		- Descoberta de padrões
	- 80%  das análise de negócios são descritivas
- Análise diagnóstica
	- “Por que aconteceu?”
	- Foco em determinar o motivo de um evento ter ocorrido
	- Demonstra variações de desempenho positivas e negativas
	- Use de outros métodos estatísticos
		- Análise de correlação
		- Análise de variância
		- Testes de hipóteses
- Análise preditiva
	- “O que acontecerá?”
	- Foco em predições de eventos futuros
	- Extrai padrões encontrados em dados históricos
	- Utilizado para diferentes aplicações
		- Detecção de fraude
		- Gerenciamento de risco
		- Fidelização de clientes
	- Requer uso de diversos métodos e ferramentas
		- Análise estatísticas
		- Técnicas de simulação
		- Mineração de dados
		- Aprendizado de máquina
	- Exemplo
		- Análise descritiva: Relatório climático
		- Análise preditiva: Previsão do tempo
- Análise prescritiva
	- “Como fazer acontecer?”
	- Foco em prever ações futuras e possíveis consequências
	- Sugere ações baseadas no conhecimento extraído dos dados
	- Envolve regras de negócios,conhecimentos matemático,mineração de dados
	- Apenas **3% das empresas** utilizam análise prescritiva, segun doa Gartner
	- Exemplo
		- Manufatura inteligente
		- Carro autonomo do Google
- Estudos de casos
	- Target
		- Detecção BIG DATA de mudanças ocorridas na vida das pessoas, como a gravidez
		- Dados históricos + Mineração de dados + Aprendizado de máquina = Descoberta de padrões
	- Pirelli
		- Máquinas da linha de produção medem centenas de BIG DATA parâmetros no processo de tomada de pneus a cada segundo oferecendo uma manufatura inteligente
		- Mais de 4.000 sensores são capturados para o gerenciamento de eficiência de frota

Big Data Analytics pode oferecer informações valiosas, porém é necessário uma análise criteriosa das informações...
Video sobre clique em propaganda

#### Serviços orientados a dados
- Web sites
	- Analise da experiencia do usuario
	- Personalização de conteúdo
- Geolocalização 
	- recomendação de serviços
- compras na web
	- recomendação de produtos
	- Segmentação de clientes
- Email e mensagens
	- publicidade personalizada
- redes sociais
	- analise de sentimento
	- analise de influencia

Esse tipo de dados pode ser aplicado, por exemplo em:
- transporte urbano
- gerenciamento de resíduos
- cuidados da saúde
- segurança pública
- desenvolvimento econômico
- agricultura de precisão

#### Monetização de dados
Transformar ativos de informação BIG DATA em dinheiro, direta ou indiretamente, por meio de troca, comercialização ou venda direta

#### Ferramentas para análise de dados
Processamento distribuido dos dados
Processamento em tempo real
Algoritimos de aprendizado de máquina
Construção de modelos

#### Serviços de visualização de dados
- Nosso formato visual é processado 60 mil vezes mais rápido que o formato de texto
- Exibição gráfica de informações para duas finalidades: construção de sentido (também chamada de análise de dados) e comunicação
- Ajuda:
	- tomada de decisão aperfeiçoada 
	- melhorai na colaboração 
	- redução de tempo
	- monitoramento de atividades
	- melhoria na análise de dados
	- melhor experiencia do usuario


### Por onde começar?
Comece com uma pergunta!

Descubra o que voce deseja responder com os dados

1. qual é o objetivo do projeto?
2. Quais dados são necessários?
3. Quais são os obstáculos para chegar lá?
4. Quem são os principais interessados e quais são suas funções?

Um projeto de big data se faz uma equipe heterogênea
TI, BI, Analytics, Negócios, etc.