Algoritmo "Contagem"

Var
     nInc, nFin: inteiro


Inicio
      escreva("Digite um numero: ")
      leia(nInc)
      escreva("Digite outro numero: ")
      leia(nFin)
      
      se (nInc > nFin) entao
           // Ordem Decrescente
           escreval("--------Ordem Decrescente------------")
           enquanto (nInc >= nFin) faca
              escreva(nInc, " - ")
              nInc <- nInc - 1
           fimenquanto
      senao
           // Ordem Crescente
           escreval("--------Ordem Crescente------------")
           enquanto (nInc <= nFin) faca
              escreva(nInc, " - ")
              nInc <- nInc + 1
           fimenquanto
      fimse
Fimalgoritmo