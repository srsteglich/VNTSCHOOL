Algoritmo "ParImpar"

Var
   num: real


Inicio
      escreva("Digite um numero: ")
      leia(num)
      se (num < 0) entao
         escreva("O numero ",num, ", n?o n?mero ? POSITIVO")
      senao
         se (num %2 =0) entao
            escreva("O numero ",num, " ? PAR")
         senao
            escreva("O numero ",num, " ? IMPAR")
         fimse
      fimse

Fimalgoritmo