Algoritmo "NumPerfeito"

Var
    num, i, j, resto :inteiro


Inicio

    para i <- 1 ate 4 faca
      escreva(" ")
      escreva("   Digite um n?mero: ")
      leia(num)
      resto <- 0
      para j de 1 ate num-1 faca
        se (num % j = 0) entao
           resto <- resto + j
        fimse
      fimpara
      se (resto = num) entao
         escreval("Numero ? Perfeito")
         escreval()
      senao
         escreval("Numero N?o ? Perfeito")
         escreval()
      fimse
    fimpara

Fimalgoritmo