Algoritmo "FaixaEtaria_Condicional"

Var
   anonasc, anohj: inteiro
   idade: real
   nome: caractere

Inicio
   escreva("Qual é o teu nome? ")
   leia(nome)
   escreva("Que ano nasceu? ")
   leia(anonasc)
   escreva("Esse ano é? ")
   leia(anohj)
   idade <- anohj - anonasc
   escreval("----------------------------------------------")
   escreval("Nome: ",nome , " a tua idade é",idade ," anos.")
Fimalgoritmo