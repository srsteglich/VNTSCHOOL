Algoritmo "Fiboancci"

Var
   num1, num2, num3, conta, fio: inteiro

funcao fio (val1, val2: inteiro) :inteiro

inicio

      enquanto conta < 10 faca
         num3 <- val1 + val2
         val1 <- val2
         val2 <- num3
         conta <- conta + 1
         escreva( num3, " ")
      fimenquanto

fimfuncao

Inicio

      num1 <- -1
      num2 <- 1
      conta <- 0
      escreval("----------------------------------")
      escreval("A 10 Sequencia de Fibonacci: ")
      fio <- fio (num1,num2)

Fimalgoritmo