Algoritmo "Trap?zio"

Var
   trap, bs, bi, h: real

Inicio
   escreva("Qual a Altura ")
   leia(h)
   escreva("Qual a Base Superior ")
   leia(bs)
   escreva("Qual a Base Inferior ")
   leia(bi)

   trap <- (bs+bi) /2 *h
   escreval("----------------------------------------------")
   escreval("A area do Trap?zio ? : ",trap:3:2)
Fimalgoritmo