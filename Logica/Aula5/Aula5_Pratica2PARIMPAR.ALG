Algoritmo "ParImpar"

Var
   num, resto, eh: inteiro

procedimento resto (num: inteiro)

inicio
      escreval("------- Esse ? dentro do 'vai'-----------------")
      escreval()
      eh <- num % 2
      escreval("------- N?: ",num,"  Resto: ",eh," ------" )
      escreval()
fimprocedimento

Inicio
      escreval("---------Inicio do programa---------------")
      escreva("Digite um numero: ")
      leia(num)
      escreval("----------------------------------")
      escreval()
      resto(num)
      escreval("-------- Esse j? foi l? no 'vai'---------------")
      escreval()
      se (eh = 0) entao
          escreval("O numero ",num, " ? Par")
      senao
         escreval("O numero ",num, " ? Impar")
      fimse
      
Fimalgoritmo