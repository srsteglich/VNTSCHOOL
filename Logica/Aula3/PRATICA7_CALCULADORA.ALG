Algoritmo "Calculadora"

Var
   num1, num2, gera, op : inteiro


Inicio
  escreval("------------------------------")
  escreval("    C A L C U L A D O R A     ")
  escreval("------------------------------")
  escreva(" Digite o 1? N?mero: ")
  leia(num1)
  escreva(" Digite o 2? N?mero: ")
  leia(num2)
  escreval("------------------------------")
  escreval("    Seleciona a opera??o      ")
  escreval("------------------------------")
  escreval(" [1] para Soma                ")
  escreval(" [2] para Subtra??o           ")
  escreval(" [3] para Multiplica??o       ")
  escreval(" [4] para Divis?o             ")
  escreval("------------------------------")
  leia(op)

  Escolha op
   Caso 1
        gera <- num1 + num2
        escreva("A Soma : ", num1, " + ", num2, " = " ,gera)
   Caso 2
        gera <- num1 - num2
         escreva("A Subtra??o : ", num1, " - ", num2, " = " ,gera)
   Caso 3
        gera <- num1 * num2
         escreva("A Multiplica??o : ", num1, " * ", num2, " = " ,gera)
   Caso 4
        gera <- num1 / num2
         escreva("A Divis?o : ", num1, " / ", num2, " = " ,gera)
   Fimescolha
        
Fimalgoritmo