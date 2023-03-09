Algoritmo "NomeC"

Var
   nome: vetor[1..10] de caractere
   i : inteiro
   str1, str2: caractere

Inicio

      para i de 1 ate 10 faca
           escreva(" Digite Nome: ")
           leia(nome[i])
      fimpara
      escreval("_______________________________________")
      escreval()
      escreval("O nome inicial da letra C: ")
      escreval("_______________________________________")
      escreval()
      para i de 1 ate 10 faca
           str1 <- maiusc(nome[i])
           str2 <- copia(str1,1,1)
//           escreval(str1 ," - ",str2 )
           se (str2 = "C" ) entao
               escreval("  ", str1)    //nome[i])
           fimse
      fimpara
      se (str2 <> "C") entao
            escreval(" Não tem nenhuma letra inicial C " )
      fimse
      escreval("_______________________________________")
      
Fimalgoritmo