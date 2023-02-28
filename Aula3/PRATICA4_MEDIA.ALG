Algoritmo "Media"

Var
   nota1, nota2, nota3, media : real


Inicio
   escreva("Digite a 1ª nota ")
   leia(nota1)
   escreva("Digite a 2ª nota ")
   leia(nota2)
   escreva("Digite a 3ª nota ")
   leia(nota3)
   media <- (nota1 + nota2 + nota3) / 3
   escreval("------------------------------------")
   se (media >= 7) entao
      escreval("Aporvado, a tua media foi ", media:2:2)
   senao
      se (media <= 5) entao
         escreval("Reporvado, a tua media foi ", media:2:2)
      senao
         escreval("Recuperação, a tua media foi ", media:2:2)
      fimse
   fimse
   escreval("------------------------------------")
Fimalgoritmo