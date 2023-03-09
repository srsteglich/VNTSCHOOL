Algoritmo "Angulo"

Var
   angulo, s, t, c, rad: real


Inicio
      escreval("-----------------------------------")
      escreva(" Digite o angulo: ")
      leia(angulo)
      escreval("-----------------------------------")
      escreval()
      s <- Sen(grauprad(angulo))
      escreval(" Seno do angulo ", s, " grau")
      c <- Cos(grauprad(angulo))
      escreval(" Cosseno do angulo ", c, " grau")
      t <- Tan(grauprad(angulo))
      escreval(" Tangente do angulo ", t, " grau")
      escreval()
      escreval("-----------------------------------")
      rad <- grauprad(angulo)
      escreval (" Radiano do angulo ", rad:2:4," radianos")
      escreval("-----------------------------------")

Fimalgoritmo