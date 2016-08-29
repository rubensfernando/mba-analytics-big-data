# Provedores e Serviços – Cloud Computing

Fernando Frota Redigolo

## Apostila com os exercicios
http://bigdata-fia.s3-website-us-east-1.amazonaws.com


## Exercicios de cloud computing - parte prática 1

É possui criar VMs usando linha de comando, ou programacao em Python, atraves da api da aws

#### Autoscaling para EC2

Cria regras para aumentar ou diminuir a quantidade de instancias EC2 de acordo com:
- metricas do cloudwatch (demandas imprevistas)
- dia/hora (demandas periódicas)

#### load balancing (ELB)
Distribui trafego entre nos EC2 em uma ou multiplas instancias Zonas de Disponibilidade
 é utilizado em excesso de tráfego ou nós indisponiveis
 
 #### amazon CloudFormation
 
 é servico de alocacao/configuracao automatizada de multiplos servicos na nuvem
 o usuario definea ´receita de bolo´ de quais servicos devem ser alocados e como devem ser alocados/configurados
 os recursos agrupados em Stacks
 atualizacao  dos templates sao refletidas em atualizacoes nos recursos
 a montagem dos recursos podem ser feitos atraves de um editor gráfico ou edição 
