Algoritmo "Cambio"

Var
   reall, euro: real

Inicio
   escreva("Qual valor do Real? R$ ")
   leia(reall)
   //     1 Euro = 5,58 real --> 16/02
   euro <- reall / 5.58
   escreval("----------------------------------------------")
   escreval("Deu : ",euro:8:2 , " EUR.")
Fimalgoritmo