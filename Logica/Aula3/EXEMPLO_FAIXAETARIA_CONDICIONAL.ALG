Algoritmo "FaixaEtaria_Condicional"

Var
   idade: real
   nome: caractere

Inicio
   escreva("Qual ? o teu nome? ")
   leia(nome)
   escreva("Qual ? a tua idade? ")
   leia(idade)
   Escolha idade
   caso 5,6,7,8,9,10
       escreva("Nome: ",nome , "- Entao ? Infantil")
   caso 11,12,13,14,15
       escreva("Nome: ",nome , "- Entao ? Juvenil")
   caso 16,17,18,19,20
       escreva("Nome: ",nome , "- Entao ? Junior")
   caso 21,22,23,24,25
       escreva("Nome: ",nome , "- Entao ? Profissional")
   outrocaso
       escreva("Invalido")
   FimEscolha
Fimalgoritmo