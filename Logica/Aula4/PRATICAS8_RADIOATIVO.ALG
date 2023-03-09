Algoritmo "Radioativo"

Var
     m, t: real


Inicio
      escreva("Digite a massa inicial: ")
      leia(m)

      enquanto (m >=0.5) faca
         m <- m /2     // perde metade da massa
         t <- t + 50   // cada 50 seg
      fimenquanto
      escreval("__________________________________________")
      escreval(" ")
      escreval("    Massa Final foi ", m, " gramas")
      escreval("    O Tempo gasto foi ", t, " segundos")

Fimalgoritmo