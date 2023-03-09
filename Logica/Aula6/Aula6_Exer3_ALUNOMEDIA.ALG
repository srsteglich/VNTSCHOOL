Algoritmo "AlunoMedia"

Var
   nome: vetor[1..5] de caractere
   nota1, nota2: vetor[1..5] de real

   i : inteiro
   totMedia, medTurma, media: real

Inicio
      para i de 1 ate 5 faca
           escreva(" Digite nome do Aluno: ")
           leia(nome[i])
           escreva(" Digite 1ª nota: ")
           leia(nota1[i])
           escreva(" Digite 2ª nota: ")
           leia(nota2[i])
           media <- (nota1[i] + nota2[i]) / 2
           totMedia <- totMedia + media
           //escreval(" teste    Aluno: ",nome[i], " a sua Media: ",media[1])
      fimpara
      escreval("_______________________________________")
      escreval()
      medTurma <- totMedia / 5
      escreval(" Média da Turma: ",medTurma)
      escreval("_______________________________________")
      escreval()
      escreval(" Alunos com acima da Turma")
      escreval("_______________________________________")
      
      para i de 1 ate 5 faca
            media <- (nota1[i] + nota2[i]) / 2
           se medTurma < media entao
             escreval(" Aluno: ",nome[i], " a sua Media: ",media)
           fimse
      fimpara
      escreval("_______________________________________")

Fimalgoritmo