Algoritmo "FaixaEtaria_Condicional"

Var
   anonasc, anohj: inteiro
   idade: real
   nome: caractere

Inicio
   escreva("Qual ? o teu nome? ")
   leia(nome)
   escreva("Que ano nasceu? ")
   leia(anonasc)
   escreva("Esse ano ?? ")
   leia(anohj)
   idade <- anohj - anonasc
   escreval("----------------------------------------------")
   escreval("Nome: ",nome , " a tua idade ?",idade ," anos.")
Fimalgoritmo