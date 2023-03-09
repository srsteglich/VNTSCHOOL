Algoritmo "MaiorNota"

Var
   nome: vetor[1..4] de caractere
   nota: vetor[1..4] de real
   maior: vetor[1..4] de real
   i, n : inteiro

Inicio
   //  Pedro, Maria = 10;
   //  Joao = 9;
   //  Sofia = 8;

   para i de 1 ate 4 faca
        escreva("Digite o nome: ")
        leia(nome[i])
        escreva("Ditige a nota: ")
        leia(nota[i])
   fimpara

   para i de 1 ate 4 faca
        se ( nota[i] >= maior[i] ) entao
           escreval(i, " Maior: " ,maior[i], "  -  Nota: ",nota[i] )
           maior[i] <- nota[i]
           escreval(i, " MaiorL2: " ,maior[i], "  -  Notal2: ",nota[i] )
        fimse
   fimpara

   para i de 1 ate 4 faca
        escreval(" Nome: " ,nome[i], " - Nota: " , maior[i])
   fimpara


Fimalgoritmo