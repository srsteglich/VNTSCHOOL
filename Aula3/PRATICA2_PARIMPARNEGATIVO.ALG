Algoritmo "ParImpar"

Var
   num: real


Inicio
      escreva("Digite um numero: ")
      leia(num)
      se (num < 0) entao
         escreva("O numero ",num, ", não número é POSITIVO")
      senao
         se (num %2 =0) entao
            escreva("O numero ",num, " é PAR")
         senao
            escreva("O numero ",num, " é IMPAR")
         fimse
      fimse

Fimalgoritmo