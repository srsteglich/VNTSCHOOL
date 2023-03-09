Algoritmo "3Valores"

Var

   a, b, c: real


Inicio
      escreval("Digite valor do A: ")
      leia(a)
      escreval("Digite valor do B: ")
      leia(b)
      escreval("Digite valor do C: ")
      leia(c)

      se (a = b)  entao
         escreval("O valor A é igual o valor B")
      fimse

      se (a > b)  entao
         escreval("O valor A é maior que o valor B")
      fimse

      se (a >= b)  entao
         escreval("O valor A é maior ou igual o valor B")
      fimse

      se (c < b)  entao
         escreval("O valor C é menor o valor B")
      fimse

      se (c <> b)  entao
         escreval("O valor C é diferente que o valor B")
      fimse
Fimalgoritmo