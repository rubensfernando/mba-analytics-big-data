# @Assets é o dataframe das carteiras
minvariance <- function(assets, mu = 0.005) {
  # Precisamos calcular os retornos
  return <- log(tail(assets, -1) / head(assets, -1))
  # Calculo da covariancia
  # o numero de ativos deve ser o ncol
  # No fim calcula a média de cada coluna
  A <- rbind(cov(return), rep(1, ncol(assets)), colMeans(return))
  
  A <- cbind(A, rbind(t(tail(A, 2)), matrix(0, 2, 2)))
  b <- c(rep(0, ncol(assets)), 1, mu)
  solve(A, b)
  # O retorno são as locações
  # Quanto o valor deve ser comprado ou vendido  
}

minvariance()

IT <- read.csv2('../Desktop/04-08-2017 - HELLINTON/Dados para as aulas/Equities.csv')
str(IT)


# Remove a coluna de data; deve ter somente preço das acoes
assets <- IT[,-1]

minvariance(assets = assets)

frontier <- function(assets) { 
  return <- log(tail(assets, -1) / head(assets, -1)) 
  Q <- cov(return) 
  n <- ncol(assets) 
  r <- colMeans(return) 
  Q1 <- rbind(Q, rep(1, n), r) 
  Q1 <- cbind(Q1, rbind(t(tail(Q1, 2)), matrix(0, 2, 2))) 
  rbase <- seq(min(r), max(r), length = 100) 
  s <- sapply(rbase, function(x) { 
    y <- head(solve(Q1, c(rep(0, n), 1, x)), n) 
    y %*% Q %*% y
    }) 
  plot(s, rbase, xlab = 'Variance', ylab = 'Return')
}
frontier(assets = assets)
