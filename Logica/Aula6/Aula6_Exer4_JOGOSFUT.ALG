Algoritmo "Jogos"

Var
   nome: vetor[1..500] de caractere
   i, j, n: inteiro

Inicio
      escreva(" Quantos times? ")
      leia(n)


      para i de 1 ate n faca
           escreva(" Digite time: ")
           leia(nome[i])
      fimpara
      escreval("_______________________________________")
      escreval()
      para i de 1 ate n faca
         para j de 1 ate n faca
            se (nome[i] <> nome[j]) entao
               escreval(nome[i], "(  ) X (  ) ", nome[j])
            fimse
         fimpara
      fimpara
      escreval("_______________________________________")
      
Fimalgoritmo