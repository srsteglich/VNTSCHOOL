Algoritmo "SomaMatriz"

Var
   n: vetor[1..3,1..3] de real
   i, j: inteiro
   somaTot, somaL3, somaC2, somaDiag: real

Inicio
      somaL3 <- 0
      somaC2 <- 0
      somaDiag <- 0
      para i de 1 ate 3 faca
        para j de 1 ate 3 faca
           escreva(" Digite um valor para Matriz de",i," -",j," para : ")
           leia(n[i,j])
           se i = 3 entao
              somaL3 <- somaL3 + n[i,j]
           fimse
           se j = 2 entao
              somaC2 <- somaC2 + n[i,j]
           fimse
           se i = j entao
              somaDiag <- somaDiag + n[i,j]
           fimse
           somaTot <- somaTot +n[i,j]
        fimpara
      fimpara

      escreval("_______________________________________")
      escreval()
      escreval(" A Soma da Linha 3: ", somaL3)
      escreval(" A Soma da Coluna 2: ", somaC2)
      escreval(" A Soma da Diagonal: ", somaDiag)
      escreval()
      escreval(" O Total da Matriz é: ", somaTot)
Fimalgoritmo