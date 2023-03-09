Algoritmo "TrianguloMatriz"

Var
   n: vetor[1..4,1..4] de real
   l, c: inteiro
   //sup, inf, diag, : inteiro

Inicio
   para l de 1 ate 4 faca
     para c de 1 ate 4 faca
        escreva(" Digite um valor para Matriz de",l," -",c," para : ")
        leia(n[l,c])
     fimpara
   fimpara
   escreval()

//Diagonal Principal
   escreval("   Diagonal Principal ")
   escreval("---------------------------------------------")
   para l de 1 ate 4 faca
     para c de 1 ate 4 faca
       se l = c entao
          escreva(n[l,c])
       senao
          escreva("   ")
       fimse
     fimpara
     escreval("")
   fimpara
   escreval("")

//Triangulo Superior
   escreval("   Triangulo Superior ")
   escreval("---------------------------------------------")
   para l de 1 ate 4 faca
     para c de 1 ate 4 faca
      se l < c entao        // juntar com diagonal --> se l <= c entao
          escreva(n[l,c])
       senao
          escreva("   ")
       fimse
     fimpara
     escreval("")
   fimpara
   escreval("")

//Triangulo Inferior
   escreval("   Triangulo Inferior ")
   escreval("---------------------------------------------")
   para l de 1 ate 4 faca
     para c de 1 ate 4 faca
       se l > c entao     // juntar com diagonal --> se l >= c entao
          escreva(n[l,c])
       senao
          escreva("   ")
       fimse
     fimpara
     escreval("")
   fimpara
   escreval("")

// Matriz Completa
   escreval("   Matriz Completa ")
   escreval("---------------------------------------------")
   para l de 1 ate 4 faca
     para c de 1 ate 4 faca
          escreva(n[l,c])
     fimpara
     escreval("")
   fimpara
   escreval("")

   escreval("")

Fimalgoritmo