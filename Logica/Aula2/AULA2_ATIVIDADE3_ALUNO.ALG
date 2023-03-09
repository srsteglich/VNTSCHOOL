Algoritmo "Aula2Atividade3Aluno"

Var
 n1, n2, n3, n4, media : real
 idade: inteiro
 nome: caractere

Inicio
      escreval("------------------------------")
      escreva ("Qual seu nome? ")
      leia(nome)
      escreva ("Qual sua idade? ")
      leia(idade)
      escreval("------------------------------")
      escreva ("Qual a 1 nota? ")
      leia(n1)
      escreva ("Qual a 2 nota? ")
      leia(n2)
      escreva ("Qual a 3 nota? ")
      leia(n3)
      escreva ("Qual a 4 nota? ")
      leia(n4)

      media <- (n1 + n2 + n3 + n4) /4
      
      escreval("------------------------------")
      escreval("Nome do aluno ", nome, " a tua idade ", idade, " anos")
      escreval("------------------------------")
      escreval("A 1ª nota: ",n1:3:2)
      escreval("A 2ª nota: ",n2:3:2)
      escreval("A 3ª nota: ",n3:3:2)
      escreval("A 4ª nota: ",n4:3:2)
      escreval("A média foi ", media:3:2)
      escreval("------------------------------")
      
Fimalgoritmo