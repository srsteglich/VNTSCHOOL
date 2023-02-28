Algoritmo "MaiMenValor"

Var
    i,men, mai: inteiro
    valProd: vetor[0..4] de inteiro

Inicio
      para i de 0 ate 4 faca
           escreva("valor do Produto:")
           leia(valProd[i])
           se valProd[i] > valProd[mai] entao
             mai <- i
           fimse
           se valProd[i] < valProd[men] entao
             men <- i
           fimse
      fimpara
      escreval("Prod MAIOR é: ",valProd[mai])
      escreval("Prod MENOR é: ",valProd[men])
Fimalgoritmo