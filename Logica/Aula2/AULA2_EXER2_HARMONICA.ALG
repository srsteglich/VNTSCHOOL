Algoritmo "Harmonica"

Var
   nota1, nota2, nota3, medhar : real
   nome: caractere

Inicio
   escreva("Digite o teu nome ")
   leia(nome)
   escreva("Digite a 1? nota ")
   leia(nota1)
   escreva("Digite a 2? nota ")
   leia(nota2)
   escreva("Digite a 3? nota ")
   leia(nota3)
   medhar <- 3/ (1/nota1 + 1/nota2 + 1/nota3)
   escreval("------------------------------------")
   escreval("A m?dia harm?nica ? ", medhar:4:2)
   escreval("------------------------------------")
Fimalgoritmo