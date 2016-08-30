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
 
 #### s3
 
 - Pedra fundamental dos servciso de armazenamento da AWS
 - Armazenamento ilimitado de objetos
 - Longa duração, diferentes níveis de redundância
 - Segurança: controle de acesso, criptografia
 - Versionamento
 - Possui compatibilidade em grande número de serviços da AWS
 - Principal mecanismo de entrada e saída de serviços
 - É poivel fazer o gerenciamento do ciclo de vida do objeto
 - - Quanto tempo manter o arquivo
 - quando copiar para o bkp
 - quando apagar o arquivo
 - 
 
 
 ## calculando custo no aws
 
 http://calculator.s3.amazonaws.com/index.html
 
 
 atualizacao  dos templates sao refletidas em atualizacoes nos recursos
 a montagem dos recursos podem ser feitos atraves de um editor gráfico ou edição 
