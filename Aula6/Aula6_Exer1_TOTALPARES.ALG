Algoritmo "TotalPares"

Var
   n: vetor[1..7] de Inteiro
   i, totPar: inteiro

Inicio
      para i de 1 ate 7 faca
         escreva(" Digite o ", i,"º valor: ")
         leia(n[i])
      fimpara
      // limpatela
      escreval("_______________________________________")
      escreval()
      para i <- 1 ate 7 faca
        se (n[i] % 2 = 0) entao
           totPar <- totPar + 1
           escreval(" Valor ", n[i], " na posição ", i, " é PAR!")
        senao
           escreval(" Valor ", n[i], " na posição ", i, " é IMPAR!")
        fimse
      fimpara
      escreval()
      escreval(" O valor total de nº pares é: ", totPar)
Fimalgoritmo