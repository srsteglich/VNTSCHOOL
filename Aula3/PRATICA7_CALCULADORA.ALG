Algoritmo "Calculadora"

Var
   num1, num2, gera, op : inteiro


Inicio
  escreval("------------------------------")
  escreval("    C A L C U L A D O R A     ")
  escreval("------------------------------")
  escreva(" Digite o 1ª Número: ")
  leia(num1)
  escreva(" Digite o 2ª Número: ")
  leia(num2)
  escreval("------------------------------")
  escreval("    Seleciona a operação      ")
  escreval("------------------------------")
  escreval(" [1] para Soma                ")
  escreval(" [2] para Subtração           ")
  escreval(" [3] para Multiplicação       ")
  escreval(" [4] para Divisão             ")
  escreval("------------------------------")
  leia(op)

  Escolha op
   Caso 1
        gera <- num1 + num2
        escreva("A Soma : ", num1, " + ", num2, " = " ,gera)
   Caso 2
        gera <- num1 - num2
         escreva("A Subtração : ", num1, " - ", num2, " = " ,gera)
   Caso 3
        gera <- num1 * num2
         escreva("A Multiplicação : ", num1, " * ", num2, " = " ,gera)
   Caso 4
        gera <- num1 / num2
         escreva("A Divisão : ", num1, " / ", num2, " = " ,gera)
   Fimescolha
        
Fimalgoritmo