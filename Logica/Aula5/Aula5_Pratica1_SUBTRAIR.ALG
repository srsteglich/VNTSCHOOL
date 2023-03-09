Algoritmo "Subtrair"

Var
   num1, num2, menos, resp: inteiro

procedimento menos (num1, num2: inteiro)

inicio
      escreval("-------Esse é dentro do 'menos'-----------------")
      resp <- (num1 - num2)
      escreval("-------------  ja calculou----------------")
fimprocedimento

Inicio
      escreval("---------Inicio do programa---------------")
      escreva("Digite um numero: ")
      leia(num1)
      escreva("Digite outro numero: ")
      leia(num2)
      escreval("----------------------------------")
      menos(num1, num2)
      escreval("---------Esse já foi lá no 'menos'---------------")
      escreva(resp)
Fimalgoritmo