## Sistemas de recomendação

Utilização

- Recomendação de vídeos e conteúdo
- Recomendação de livros, e produtos
- Pessoas, empresas e profissões

Como obter os dados dos usuários e oferecer recomendações eficazes?

Em muitos casos a recomendação tem se tornado o core/produtos da empresa e trazendo a competividade

Para que é preciso sistemas de recomendação?
- devido a quantidade imensa de dados que são gerados é necessários direcionar a atenção do usuário
- fazer a seleção de conteúdo e

os benefícios
- Atrai a atenção dos usuários; Como deixar o usuário mais tempo no site?
- Melhora a aceitação de um novo serviço ou produto
- Melhora a percepção do que está sendo visualizado pelos usuários
- Guiar os usuários para serviços/produtos apropriados
- Permite desenvolver um feedback melhor para o usuário

o objetivo  e apresentar algum conteúdo de interesse e relevância para usuário

[Netflix spends $150 million on content recommendations every year](https://gigaom.com/2014/10/09/netflix-spends-150-million-on-content-recommendations-every-year/)

Problemas
- a indentificação do interesse do usuário, baseado na analise do histórico de consumo (itens comprados, textos lidos, etc.)

- o calculo da similaridade entre os itens s aserem recomendados, para que se consiga algo de interesse do usuário

escola regional de banco de dados

### Tipos
1 - Recomendação baseada em conteúdo
- Totalmente voltada para a analise de informações sobre os usuários
- Envolve a definição de perfis dos usuários e diversos característica dos elementos
- restritas a cada domínio especifico () pois muitas dependete de atributos que só existem em um cenário determinado

2 - Filtragem colaborativa
- voltado para analise do usuário considerando algum avaliação de itens feitas pelo usuário
- é baseado na similaridade de outras 'compra' de outros 
- cada item ou usuário tem uma vizinhança e formada por itens ou usuário similares, a partir da

2.1 - Baseada em usuários 
Consiste em descobrir a semelhança entre os diferentes usuário do sistema para se recomendar os itens bem avaliados por pessoas semelhantes
2.2 - Baseada em itens
Filtra os itens que o usuário avaliou melhor, não necessariamente é uma nota atribuidada, mas a preferencia e a repetição de conteúdo
- a mudança são menos constantes
2.3 - Hibrida


## E a recomendação no Mahout

As muitas classes do mahout vem do framework Taste

Não oferece suporte ao desenvolvimento de recomendação baseada em conteúdo
- baseada

Slop-One: Abordagem de recomendação de filtragem colaborativa rápida e simples, aplicável quando os usuários geraram classificações (rankings)

### Medidas de similaridades

#### Correlação de Pearson

Indica a rendendia das duas series de números aumentares ou diminuírem em conjunto. O intervalo é entre -1 e 1

#### Distancia euclidiana
#### Coeficiente de tanimoto
São coeficientes de contagem de razão entre o numero de elementos comuns entre dois usuários dividos divido pelo números de itens que ambos usuários têm preferência
