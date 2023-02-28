Algoritmo "Gabarito"

Var
   N, M, i, j, certa, total: inteiro
   nome: vetor[1..3] de caractere
   gabarito: vetor[1..5] de caractere
   resposta: vetor[1..5] de caractere

Inicio
      N <- 3            // Quantidade de Alunos
      M <- 5            // Quantidade de Questões
// Gabarito
      para i de 1 ate M faca
         escreva(" Digite a",i, "ª questão do gabarito: ", gabarito[i])
         leia(gabarito[i])
      fimpara
      escreval("-----------------------------------------")
      
// Nome e as Respostas e Calculo
      para i de 1 ate N faca
         certa <- 0
         escreva(" Digite o",i, "ª o nome do candidato: " )
         leia(nome[i])
         para j de 1 ate 5 faca
            escreva(" Digite a ",j, "ª questão marcada: ")
            leia(resposta[j])
            se resposta[j] = gabarito[i] entao
               certa <- certa + 1
            fimse
         fimpara
         total <- total + certa
         escreval()
         escreval(" O candidato ",nome[i]," fez ",certa," pontos")
         escreva()
         escreval("-----------------------------------------")
      fimpara
      escreval(" A Media da Turma é: ", total/3:2:2)


Fimalgoritmo



