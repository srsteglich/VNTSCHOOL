Algoritmo "ParImpar"

Var
   num, resto, eh: inteiro

procedimento resto (num: inteiro)

inicio
      escreval("------- Esse é dentro do 'vai'-----------------")
      escreval()
      eh <- num % 2
      escreval("------- Nº: ",num,"  Resto: ",eh," ------" )
      escreval()
fimprocedimento

Inicio
      escreval("---------Inicio do programa---------------")
      escreva("Digite um numero: ")
      leia(num)
      escreval("----------------------------------")
      escreval()
      resto(num)
      escreval("-------- Esse já foi lá no 'vai'---------------")
      escreval()
      se (eh = 0) entao
          escreval("O numero ",num, " é Par")
      senao
         escreval("O numero ",num, " é Impar")
      fimse
      
Fimalgoritmo