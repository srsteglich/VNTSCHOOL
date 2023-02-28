Algoritmo "ParMatriz"

Var
   n: vetor[1..3,1..3] de real
   l, c: inteiro
   //sup, inf, diag, : inteiro

Inicio
   para l de 1 ate 3 faca
     para c de 1 ate 3 faca
        escreva(" Digite um valor para Matriz de",l," -",c," para : ")
        leia(n[l,c])
     fimpara
   fimpara
   escreval()

// Matriz Completa
   escreval("   Matriz Completa ")
   escreval("---------------------------------------------")
   para l de 1 ate 3 faca
     para c de 1 ate 3 faca
        escreva(n[l,c])
     fimpara
     escreval("")
   fimpara
   escreval("")

// Acha Pares
   escreval("   Matriz Pares ")
   escreval("---------------------------------------------")
   para l de 1 ate 3 faca
     para c de 1 ate 3 faca
        se (n[l,c] % 2 = 0) entao
           escreva(n[l,c])
        senao
           escreva("   ")
        fimse
     fimpara
     escreval("")
   fimpara
   escreval("")

// Acha Pares e Posições
   escreval("   Posições Pares ")
   escreval("---------------------------------------------")
   para l de 1 ate 3 faca
     para c de 1 ate 3 faca
        se (n[l,c] % 2 = 0) entao
           escreva(" Linha ", l," e Coluna ",c)
        fimse
     fimpara
     escreval("")
   fimpara
   escreval("")




Fimalgoritmo