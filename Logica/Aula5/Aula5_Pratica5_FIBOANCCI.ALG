Algoritmo "Fiboancci"

Var
   num1, num2, num3, conta, fio: inteiro

procedimento fio (num1, num2, conta: inteiro)

inicio
      enquanto conta < 10 faca
        num3 <- num1 + num2
        num1 <- num2
        num2 <- num3
        conta <- conta + 1
        escreva( num3, " - ")
      fimenquanto

fimprocedimento

Inicio
      num1 <- -1
      num2 <- 1
      conta <- 0
      escreval("----------------------------------")
      escreval("A 10 Sequencia de Fibonacci: ")
      fio(num1,num2,conta)

Fimalgoritmo