Algoritmo "Aula2Atividade1Calculadora"

Var
   num1, num2  : inteiro
   soma, subt, mult, divi: real

Inicio
  escreval("-------------------------------------")
  escreva(" Digite o 1? N?mero: ")
  leia(num1)
  escreva(" Digite o 2? N?mero: ")
  leia(num2)
  escreval("-------------------------------------")

        soma <- num1 + num2
        subt <- num1 - num2
        mult <- num1 * num2
        divi <- num1 / num2
        
        escreval("A Soma : ", num1, " + ", num2, " = " ,soma:3:2)
        escreval("A Subtra??o : ", num1, " - ", num2, " = " ,subt:3:2)
        escreval("A Multiplica??o : ", num1, " * ", num2, " = " ,mult:3:2)
        escreval("A Divis?o : ", num1, " / ", num2, " = " ,divi:3:2)
        escreval("-------------------------------------")
   Fimescolha
        
Fimalgoritmo